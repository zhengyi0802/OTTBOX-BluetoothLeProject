package tw.com.umedia.bluetoothle.gattcharacteristic;

import java.util.HashMap;

import tw.com.umedia.bluetoothle.BluetoothLeCharacteristicKey;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;

public class HardwareRevision extends DeviceGattCharacteristic {

	private String str;
	
	public HardwareRevision(BluetoothGattService gattservice,
			BluetoothGattCharacteristic gattcharacteristic) {
		super(gattservice, gattcharacteristic);
		// TODO Auto-generated constructor stub
	}

	@Override
	public HashMap<String, Object> getData() {
		// TODO Auto-generated method stub
		HashMap<String, Object> data = new HashMap<String, Object>();
		str= mGattCharacteristic.getStringValue(0);
		data.put(BluetoothLeCharacteristicKey.KEY_HARDWARE_REVISION, str);
		return data;
	}

	public String getString() {
		return str;
	}
	
}
