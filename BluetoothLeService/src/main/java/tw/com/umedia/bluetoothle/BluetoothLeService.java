package tw.com.umedia.bluetoothle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import tw.com.umedia.bluetoothle.utils.BleLog;
import android.app.Service;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.widget.Toast;

public class BluetoothLeService extends Service {
	private final static String TAG = "BluetoothLeService";
		
	private List<BleDevice> mBleDevices = new ArrayList<BleDevice>();
	private List<BluetoothLeClient> mClients = new ArrayList<BluetoothLeClient>();
	private BluetoothAdapter mBluetoothAdapter;
	private BluetoothManager mBluetoothManager;
	private Handler mHandler;
	private BleScanCallback mCallback;
	private boolean mScanning = false;
	
	private static final long SCAN_PERIOD = 10000;
	
	private static final String SERVICECONNECTION_SCANDEVICE = "tw.com.umedia.bluetoothle.IBLESCANDEVICE"; 
	private static final String SERVICECONNECTION_GATTCLIENT = "tw.com.umedia.bluetoothle.IBLEGATTCLIENT"; 
	
 	@Override
	public void onCreate() {
		super.onCreate();
		mHandler = new Handler();
		mScanning = false;
	}

	@Override
	public void onStart(Intent intent, int startId) {
		super.onStart(intent, startId);
		BleLog.d(TAG, "onStart = " +  startId);
        // Use this check to determine whether BLE is supported on the device.  Then you can
        // selectively disable BLE-related features.
        if (!getPackageManager().hasSystemFeature(PackageManager.FEATURE_BLUETOOTH_LE)) {
            //Toast.makeText(this, R.string.ble_not_supported, Toast.LENGTH_SHORT).show();
            stopSelf();
            BleLog.d(TAG, "onStart  Stop!");
        }
		
        // Initializes a Bluetooth adapter.  For API level 18 and above, get a reference to
        // BluetoothAdapter through BluetoothManager.
        mBluetoothManager =  (BluetoothManager) getSystemService(Context.BLUETOOTH_SERVICE);
        mBluetoothAdapter = mBluetoothManager.getAdapter();

        // Checks if Bluetooth is supported on the device.
        if (mBluetoothAdapter == null) {
            //Toast.makeText(this, R.string.error_bluetooth_not_supported, Toast.LENGTH_SHORT).show();
            stopSelf();
            BleLog.d(TAG, "onStart  Stop!");
            return;
        }
        setBluetooth(true);
	}

	@Override
	public void onDestroy() {
		BleLog.d(TAG, "onDestroy");
		setBluetooth(false);
		super.onDestroy();
	}

	@Override
	public boolean onUnbind(Intent intent) {
		BleLog.d(TAG, "onUnbind");
		for(BluetoothLeClient client : mClients) {
			if(client.getAddress() != null) {
				client.disconnect();
			}
		}
		return super.onUnbind(intent);
	}

	@Override
	public IBinder onBind(Intent intent) {
		BleLog.d(TAG, "onBind");
		if(SERVICECONNECTION_SCANDEVICE.equals(intent.getAction())) {
			return mScanDevice;
		} else if(SERVICECONNECTION_GATTCLIENT.equals(intent.getAction())) {
			return mGattClient;
		}
		
		return null;
	}
	
	  public void ShowToastInIntentService(final String sText)  {  
		  final Context MyContext = this;
		  new Handler(Looper.getMainLooper()).post(new Runnable()  {  
			  @Override public void run() {  
				  Toast toast1 = Toast.makeText(MyContext, sText, Toast.LENGTH_LONG);
				  toast1.setDuration(1000);
				  toast1.show(); 
			  }
	     });
	  };
	
	private final IBleGattClient.Stub mGattClient = new  IBleGattClient.Stub() {
		private BleGattDataCallback mCallback;
		
		@Override
		public void registerCallback(BleGattDataCallback callback)
				throws RemoteException {
			// TODO Auto-generated method stub
			mCallback = callback;
		}

		@Override
		public void unregisterCallback() throws RemoteException {
			mCallback = null;			
		}

		@Override
		public boolean connect(String address) throws RemoteException {
			BluetoothLeClient client;
			scanLeDevice(false);
			client = new BluetoothLeClient(mDataCallback, address);
			if(client.initialize(getApplicationContext())) {
				if(client.connect(getApplicationContext(), address)) {
					mClients.add(client);					
					return true;
				}
			}
			return false;
		}

		@Override
		public boolean disconnect(String address) throws RemoteException {
			for(int i=0; i < mClients.size(); i++) {
				BluetoothLeClient client = mClients.get(i);
				if(client.getAddress().equals(address)) {
					client.disconnect();
					//client.close();
					mClients.remove(client);
					return true;
				}
			}
			return false;
		}
				
		
		private final BluetoothLeDataCallback mDataCallback = new BluetoothLeDataCallback() {

			@Override
			public void DataCallback(HashMap<String, Object> data, String address) {
				if(data == null) return;
				 Set<String> keys = data.keySet();
				for(String key : keys) {
					String value = data.get(key).toString();
					try {
						mCallback.DataCallback(key, value, address);
					} catch (RemoteException e) {
						ShowToastInIntentService("BluetoothLeService DataCallback Error! Stop BluetoothLeService!");
						stopSelf();
					}
				}
				return;
			}

			@Override
			public void ConnectStatus(boolean state, String address) {
				// TODO Auto-generated method stub
				try {
					mCallback.ConnectStatus(state, address);
				} catch (RemoteException e) {
					ShowToastInIntentService("BluetoothLeService ConnectStatus Error! Stop BluetoothLeService!");
					stopSelf();
				}
				return;
			}
			
		};
			
	};
	
	private final IBleScanDevice.Stub mScanDevice = new IBleScanDevice.Stub() {
		
		@Override
		public void BleScan(boolean enabled) throws RemoteException {
			BleLog.d(TAG, "IBleScanDevice BleScan " + enabled);
			enableAdapter();
			scanLeDevice(enabled);
		}
		
		@Override
		public void registerCallback(BleScanCallback callback)
				throws RemoteException {
			BleLog.d(TAG, "IBleScanDevice registerCallback ");
			mCallback = callback;
		}

		@Override
		public void unregisterCallback() throws RemoteException {
			BleLog.d(TAG, "IBleScanDevice unregisterCallback ");
			mCallback = null;			
		}

		private void enableAdapter() {
			BleLog.d(TAG, "IBleScanDevice enableAdapter ");
/*			
	        if ( !mBluetoothAdapter.isEnabled()) {
	            //Bluetooth is disabled
	            Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
	            startActivity(enableBtIntent);
	        }		
*/
			setBluetooth(true);
			return;
		}
	
	};
	
	private boolean setBluetooth(boolean enable) {
	    //BluetoothAdapter bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
	    boolean isEnabled = mBluetoothAdapter.isEnabled();
	    if (enable && !isEnabled) {
	        return mBluetoothAdapter.enable(); 
	    }
	    else if(!enable && isEnabled) {
	        return mBluetoothAdapter.disable();
	    }
	    // No need to change bluetooth state
	    return true;
	}
	
    // Device scan callback.
    private BluetoothAdapter.LeScanCallback mLeScanCallback =
            new BluetoothAdapter.LeScanCallback() {
    	
    	private void sendData(BleDevice device)  {
    		BleLog.d(TAG, "LeScanCallback sendData ");
    		if(mCallback != null) {
    			try {
					mCallback.getBleDeviceData(device.getDeviceName(), device.getMacAddress(), device.getRssi());
				} catch (RemoteException e) {
					Toast.makeText(getApplicationContext(), "BluetoothLeService ScanDevice getBleDeviceData() Callback Error! Stop BluetoothLeService!", 5);
					stopSelf();
				}
    		}
    	}

        @Override
        public void onLeScan(final BluetoothDevice device, int rssi, byte[] scanRecord) {
    		BleLog.d(TAG, "LeScanCallback onLeScan ");
        	for(BleDevice mDevice : mBleDevices) {
        		if(mDevice.getMacAddress().equals(device.getAddress())) {
        			mDevice.setRssi(rssi);
        			sendData(mDevice);
        			return;
        		}
        	}
        	BleDevice mBleDevice = new BleDevice(device.getName(), device.getAddress(), rssi);
        	mBleDevices.add(mBleDevice);
        	sendData(mBleDevice);
        	return;
        }
    };

	protected void scanLeDevice(boolean enabled) {
		BleLog.d(TAG, "IBleScanDevice scanLeDevice " + enabled);

        if (enabled) {
            // Stops scanning after a pre-defined scan period.
            mHandler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    mScanning = false;
                    mBluetoothAdapter.stopLeScan(mLeScanCallback);
                    try {
						((BleScanCallback) mCallback).scanStatus(false);
					} catch (RemoteException e) {
						ShowToastInIntentService("BluetoothLeService ScanDevice stopScan() Callback Error! Stop BluetoothLeService!");
						stopSelf();
					}
                }
            }, SCAN_PERIOD);

            mScanning = true;
            mBleDevices.clear();
            mBluetoothAdapter.startLeScan(mLeScanCallback);
            try {
					((BleScanCallback) mCallback).scanStatus(true);
				} catch (RemoteException e) {
					ShowToastInIntentService("BluetoothLeService ScanDevice stopScan() Callback Error! Stop BluetoothLeService!");
					stopSelf();
				}
        } else {
            mScanning = false;
            mBluetoothAdapter.stopLeScan(mLeScanCallback);
            try {
					((BleScanCallback) mCallback).scanStatus(false);
				} catch (RemoteException e) {
					ShowToastInIntentService("BluetoothLeService ScanDevice stopScan() Callback Error! Stop BluetoothLeService!");
					stopSelf();
				}
      }
	}

}
