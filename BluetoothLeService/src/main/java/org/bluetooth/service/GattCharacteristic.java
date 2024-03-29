package org.bluetooth.service;

import java.util.HashMap;
import java.util.UUID;

import org.bluetooth.gatt.utils.GattUtils;

public class GattCharacteristic {
	public static final UUID ALERT_CATEGORY_ID = new UUID((0x2A43L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID ALERT_CATEGORY_ID_BIT_MASK = new UUID((0x2A42L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID ALERT_LEVEL = new UUID((0x2A06L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID ALERT_NOTIFICATION_CONTROL_POINT = new UUID((0x2A44L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID ALERT_STATUS = new UUID((0x2A3FL << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID APPEARANCE = new UUID((0x2A01L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID BATTERY_LEVEL = new UUID((0x2A19L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID BLOOD_PRESSURE_FEATURE = new UUID((0x2A49L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID BLOOD_PRESSURE_MEASUREMENT = new UUID((0x2A35L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID BODY_SENSOR_LOCATION = new UUID((0x2A38L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID BOOT_KEYOBARD_INPUT_REPORT = new UUID((0x2A22L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID BOOT_KEYOBARD_OUTPUT_REPORT = new UUID((0x2A32L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID BOOT_MOUSE_INPUT_REPORT = new UUID((0x2A33L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID CSC_FEATURE = new UUID((0x2A5CL << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID CSC_MEASUREMENT = new UUID((0x2A5BL << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID CURRENT_TIME = new UUID((0x2A2BL << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID CYCLING_POWER_CONTROL_POINT = new UUID((0x2A66L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID CYCLING_POWER_FEATURE = new UUID((0x2A65L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID CYCLING_POWER_MEASUREMENT = new UUID((0x2A63L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID CYCLING_POWER_VECTOR = new UUID((0x2A64L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID DATE_TIME = new UUID((0x2A08L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID DAY_DATE_TIME = new UUID((0x2A0AL << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID DAY_OF_WEEK = new UUID((0x2A09L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID DEVICE_NAME = new UUID((0x2A00L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID DST_OFFSET = new UUID((0x2A0DL << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID EXACT_TIME_256 = new UUID((0x2A0CL << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID FIRMWARE_REVISION_STRING = new UUID((0x2A26L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID GLUCOSE_FEATURE = new UUID((0x2A51L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID GLUCOSE_MEASUREMENT = new UUID((0x2A18L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID GLUCOSE_MEASUREMENT_CONTROL = new UUID((0x2A34L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID HARDWARE_REVISION_STRING = new UUID((0x2A27L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID HEART_RATE_CONTROL_POINT = new UUID((0x2A39L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID HEART_RATE_MEASUREMENT = new UUID((0x2A37L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID HID_CONTROL_POINT = new UUID((0x2A4CL << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID HID_INFORMATION = new UUID((0x2A4AL << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID IEEE11073_20601_REGULATORY_CERTIFICATION_DATA_LIST = new UUID((0x2A2AL << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID INTERMEDIATE_CUFF_PRESSURE = new UUID((0x2A36L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID INTERMEDIATE_TEMPERATURE = new UUID((0x2A1EL << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID LN_CONTROL_POINT = new UUID((0x2A6BL << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID LN_FEATURE = new UUID((0x2A6AL << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID LOCAL_TIME_INFORMATION = new UUID((0x2A0FL << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID LOCATION_AND_SPEED = new UUID((0x2A67L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID MANUFACTURER_NAME_STRING = new UUID((0x2A29L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID MEASUREMENT_INTERVAL = new UUID((0x2A21L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID MODEL_NUMBER_STRING = new UUID((0x2A24L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID NAVIGATION = new UUID((0x2A68L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID NEW_ALERT = new UUID((0x2A46L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID PERIPERAL_PREFFERED_CONNECTION_PARAMETERS = new UUID((0x2A04L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID PERIPHERAL_PRIVACY_FLAG = new UUID((0x2A02L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID PN_PID = new UUID((0x2A50L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID POSITION_QUALITY = new UUID((0x2A69L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID PROTOCOL_MODE = new UUID((0x2A4EL << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID RECONNECTION_ADDRESS = new UUID((0x2A03L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID RECORD_ACCESS_CONTROL_POINT = new UUID((0x2A52L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID REFERENCE_TIME_INFORMATION = new UUID((0x2A14L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID REPORT = new UUID((0x2A4DL << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID REPORT_MAP = new UUID((0x2A4BL << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID RINGER_CONTROL_POINT = new UUID((0x2A40L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID RINGER_SETTING = new UUID((0x2A41L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID RSC_FEATURE = new UUID((0x2A54L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID RSC_MEASUREMENT = new UUID((0x2A53L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID SC_CONTROL_POINT = new UUID((0x2A55L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID SCAN_INTERVAL_WINDOW = new UUID((0x2A4FL << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID SCAN_REFRESH = new UUID((0x2A31L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID SENSOR_LOCATION = new UUID((0x2A5DL << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID SERIAL_NUMBER_STRING = new UUID((0x2A25L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID SERVICE_CHANGED = new UUID((0x2A05L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID SOFTWARE_REVISION_STRING = new UUID((0x2A28L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID SUPPORTED_NEW_ALERT_CATEGORY = new UUID((0x2A47L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID SUPPORTED_UNREAD_ALERT_CATEGORY = new UUID((0x2A48L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID SYSTEM_ID = new UUID((0x2A23L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID TEMPERATURE_MEASUREMENT = new UUID((0x2A1CL << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID TEMPERATURE_TYPE = new UUID((0x2A1DL << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID TIME_ACCURACY = new UUID((0x2A12L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID TIME_SOURCE = new UUID((0x2A13L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID TIME_UPDATE_CONTROL_POINT = new UUID((0x2A16L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID TIME_UPDATE_STATE = new UUID((0x2A17L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID TIME_WITH_DST = new UUID((0x2A11L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID TIME_ZONE = new UUID((0x2A0EL << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID TX_POWER_LEVEL = new UUID((0x2A07L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID UNREAD_ALERT_STATUS = new UUID((0x2A45L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID AGGREGATE_INPUT = new UUID((0x2A5AL << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID ANALOG_INPUT = new UUID((0x2A58L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID ANALOG_OUTPUT = new UUID((0x2A59L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID DIGITAL_INPUT = new UUID((0x2A56L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID DIGITAL_OUTPUT = new UUID((0x2A57L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID EXACT_TIME_100 = new UUID((0x2A0BL << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID NETWORK_AVAILABILITY = new UUID((0x2A3EL << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID SCIENTIFIC_TEMPERATURE_IN_CELSIUS = new UUID((0x2A3CL << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID SECONDARY_TIME_ZONE = new UUID((0x2A10L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID STRING = new UUID((0x2A3DL << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID TEMPERATURE_IN_CELSIUS = new UUID((0x2A1FL << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID TEMPERATURE_IN_FAHRENHEIT = new UUID((0x2A20L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID TIME_BROADCAST = new UUID((0x2A15L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID BATTERY_LEVEL_STATE = new UUID((0x2A1BL << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID BATTERY_POWER_STATE = new UUID((0x2A1AL << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID PULSE_OXIMETRY_CONTINUOUS_MEASUREMENT = new UUID((0x2A5FL << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID PULSE_OXIMETRY_CONTROL_POINT = new UUID((0x2A62L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID PULSE_OXIMETRY_FEATURES = new UUID((0x2A61L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID PULSE_OXIMETRY_PULSATILE_EVENT = new UUID((0x2A60L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID PULSE_OXIMETRY_SPOT_CHECK_MEASUREMENT = new UUID((0x2A5EL << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID RECORD_ACCESS_CONTROL_POINT_TESTVERSION = new UUID((0x2A52L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID REMOVABLE = new UUID((0x2A3AL << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID SERVICE_REQUIRED = new UUID((0x2A3BL << 32) | 0x1000, GattUtils.leastSigBits);
	
	// UMHD-XXXX 
	public static final UUID UMEDIA_KEY_EVENT = new UUID((0xffe1L << 32) | 0x1000, GattUtils.leastSigBits);
	
	// 埃微  I5 運動手環
	public static final UUID I5_CONFIG = UUID.fromString("f000ff11-0451-4000-b000-000000000000");
	public static final UUID I5_DATA1 = UUID.fromString("f000ff01-0451-4000-b000-000000000000");
	public static final UUID I5_DATA2 = UUID.fromString("f000ff02-0451-4000-b000-000000000000");
	public static final UUID I5_DATA3 = UUID.fromString("f000ff03-0451-4000-b000-000000000000");
	public static final UUID I5_DATA4 = UUID.fromString("f000ff04-0451-4000-b000-000000000000");
	public static final UUID I5_DATA5 = UUID.fromString("f000ff05-0451-4000-b000-000000000000");
	public static final UUID I5_DATA6 = UUID.fromString("f000ff06-0451-4000-b000-000000000000");
	public static final UUID I5_DATA7 = UUID.fromString("f000ff07-0451-4000-b000-000000000000");
	public static final UUID I5_DATA8 = UUID.fromString("f000ff08-0451-4000-b000-000000000000");
	public static final UUID I5_DATA9 = UUID.fromString("f000ff09-0451-4000-b000-000000000000");
	
	// 天天手環
	public static final UUID M04L_CHARACTERISTIC1_1 = UUID.fromString("8082caa8-41a5-4021-91c6-56f9b954cc34");
	public static final UUID M04L_CHARACTERISTIC1_2 = UUID.fromString("724249f0-5ec3-4b5f-8804-42345af08651");
	public static final UUID M04L_CHARACTERISTIC1_3 = UUID.fromString("6c53db25-47a1-45fe-a022-7c92fb334fd4");
	public static final UUID M04L_CHARACTERISTIC1_4 = UUID.fromString("9d84b9a3-000c-49d8-9183-855b673fda31");
	public static final UUID M04L_CHARACTERISTIC1_5 = UUID.fromString("457871e8-d516-4ca1-9116-57d00b17b9cb2");
	public static final UUID M04L_CHARACTERISTIC1_6 = UUID.fromString("5f78df94-798c-46f5-990a-b3eb6a065c88");
	public static final UUID M04L_CHARACTERISTIC2_1 = new UUID((0x33f1L << 32) | 0x1000, GattUtils.leastSigBits);
	public static final UUID M04L_CHARACTERISTIC2_2 = new UUID((0x33f2L << 32) | 0x1000, GattUtils.leastSigBits);
	
	private static HashMap<UUID, String> attributes = new HashMap<UUID, String>();
	static {
		attributes.put(ALERT_CATEGORY_ID, "Alert Category ID");
		attributes.put(ALERT_CATEGORY_ID_BIT_MASK, "Alert Category ID Bit Mask");
		attributes.put(ALERT_LEVEL, "Alert Level");
		attributes.put(ALERT_NOTIFICATION_CONTROL_POINT, "Alert Notification Control Point");
		attributes.put(ALERT_STATUS, "Alert Status");
		attributes.put(APPEARANCE, "Appearance");
		attributes.put(BATTERY_LEVEL, "Battery Level");
		attributes.put(BLOOD_PRESSURE_FEATURE, "Blood Pressure Feature");
		attributes.put(BLOOD_PRESSURE_MEASUREMENT, "Blood Pressure Measurement");
		attributes.put(BODY_SENSOR_LOCATION, "Body Sensor Location");
		attributes.put(BOOT_KEYOBARD_INPUT_REPORT, "Boot Keyboard Input Report");
		attributes.put(BOOT_KEYOBARD_OUTPUT_REPORT, "Boot Keyboard Output Report");
		attributes.put(BOOT_MOUSE_INPUT_REPORT, "Boot Mouse Input Report");
		attributes.put(CSC_FEATURE, "CSC Feature");
		attributes.put(CSC_MEASUREMENT, "CSC Measurement");
		attributes.put(CURRENT_TIME, "Current Time");
		attributes.put(CYCLING_POWER_CONTROL_POINT, "Cycling Power Control Point");
		attributes.put(CYCLING_POWER_FEATURE, "Cycling Power Feature");
		attributes.put(CYCLING_POWER_MEASUREMENT, "Cycling Power Measurement");
		attributes.put(CYCLING_POWER_VECTOR, "Cycling Power Vector");
		attributes.put(DATE_TIME, "Date Time");
		attributes.put(DAY_DATE_TIME, "Day Date Time");
		attributes.put(DAY_OF_WEEK, "Day of Week");
		attributes.put(DEVICE_NAME, "Device Name");
		attributes.put(DST_OFFSET, "DST Offset");
		attributes.put(EXACT_TIME_256, "Exact Time 256");
		attributes.put(FIRMWARE_REVISION_STRING, "Firmware Revision String");
		attributes.put(GLUCOSE_FEATURE, "Glucose Feature");
		attributes.put(GLUCOSE_MEASUREMENT, "Glucose Measurement");
		attributes.put(GLUCOSE_MEASUREMENT_CONTROL, "Glucose Measurement Context");
		attributes.put(HARDWARE_REVISION_STRING, "Hardware Revision String");
		attributes.put(HEART_RATE_CONTROL_POINT, "Heart Rate Control Point");
		attributes.put(HEART_RATE_MEASUREMENT, "Heart Rate Measurement");
		attributes.put(HID_CONTROL_POINT, "HID Control Point");
		attributes.put(HID_INFORMATION, "HID Information");
		attributes.put(IEEE11073_20601_REGULATORY_CERTIFICATION_DATA_LIST, "IEEE 11073-20601 Regulatory Certification Data List");
		attributes.put(INTERMEDIATE_CUFF_PRESSURE, "Intermediate Cuff Pressure");
		attributes.put(INTERMEDIATE_TEMPERATURE, "Intermediate Temperature");
		attributes.put(LN_CONTROL_POINT, "LN Control Point");
		attributes.put(LN_FEATURE, "LN Feature");
		attributes.put(LOCAL_TIME_INFORMATION, "Local Time Information");
		attributes.put(LOCATION_AND_SPEED, "Location and Speed");
		attributes.put(MANUFACTURER_NAME_STRING, "Manufacturer Name String");
		attributes.put(MEASUREMENT_INTERVAL, "Measurement Interval");
		attributes.put(MODEL_NUMBER_STRING, "Model Number String");
		attributes.put(NAVIGATION, "Navigation");
		attributes.put(NEW_ALERT, "New Alert");
		attributes.put(PERIPERAL_PREFFERED_CONNECTION_PARAMETERS, "Peripheral Preferred Connection Parameters");
		attributes.put(PERIPHERAL_PRIVACY_FLAG, "Peripheral Privacy Flag");
		attributes.put(PN_PID, "PnP ID");
		attributes.put(POSITION_QUALITY, "Position Quality");
		attributes.put(PROTOCOL_MODE, "Protocol Mode");
		attributes.put(RECONNECTION_ADDRESS, "Reconnection Address");
		attributes.put(RECORD_ACCESS_CONTROL_POINT, "Record Access Control Point");
		attributes.put(REFERENCE_TIME_INFORMATION, "Reference Time Information");
		attributes.put(REPORT, "Report");
		attributes.put(REPORT_MAP, "Report Map");
		attributes.put(RINGER_CONTROL_POINT, "Ringer Control Point");
		attributes.put(RINGER_SETTING, "Ringer Setting");
		attributes.put(RSC_FEATURE, "RSC Feature");
		attributes.put(RSC_MEASUREMENT, "RSC Measurement");
		attributes.put(SC_CONTROL_POINT, "SC Control Point");
		attributes.put(SCAN_INTERVAL_WINDOW, "Scan Interval Window");
		attributes.put(SCAN_REFRESH, "Scan Refresh");
		attributes.put(SENSOR_LOCATION, "Sensor Location");
		attributes.put(SERIAL_NUMBER_STRING, "Serial Number String");
		attributes.put(SERVICE_CHANGED, "Service Changed");
		attributes.put(SOFTWARE_REVISION_STRING, "Software Revision String");
		attributes.put(SUPPORTED_NEW_ALERT_CATEGORY, "Supported New Alert Category");
		attributes.put(SUPPORTED_UNREAD_ALERT_CATEGORY, "Supported Unread Alert Category");
		attributes.put(SYSTEM_ID, "System ID");
		attributes.put(TEMPERATURE_MEASUREMENT, "Temperature Measurement");
		attributes.put(TEMPERATURE_TYPE, "Temperature Type");
		attributes.put(TIME_ACCURACY, "Time Accuracy");
		attributes.put(TIME_SOURCE, "Time Source");
		attributes.put(TIME_UPDATE_CONTROL_POINT, "Time Update Control Point");
		attributes.put(TIME_UPDATE_STATE, "Time Update State");
		attributes.put(TIME_WITH_DST, "Time with DST");
		attributes.put(TIME_ZONE, "Time Zone");
		attributes.put(TX_POWER_LEVEL, "Tx Power Level");
		attributes.put(UNREAD_ALERT_STATUS, "Unread Alert Status");
		attributes.put(AGGREGATE_INPUT, "Aggregate Input");
		attributes.put(ANALOG_INPUT, "Analog Input");
		attributes.put(ANALOG_OUTPUT, "Analog Output");
		attributes.put(DIGITAL_INPUT, "Digital Input");
		attributes.put(DIGITAL_OUTPUT, "Digital Output");
		attributes.put(EXACT_TIME_100, "Exact Time 100");
		attributes.put(NETWORK_AVAILABILITY, "Network Availability");
		attributes.put(SCIENTIFIC_TEMPERATURE_IN_CELSIUS, "Scientific Temperature in Celsius");
		attributes.put(SECONDARY_TIME_ZONE, "Secondary Time Zone");
		attributes.put(STRING, "String");
		attributes.put(TEMPERATURE_IN_CELSIUS, "Temperature in Celsius");
		attributes.put(TEMPERATURE_IN_FAHRENHEIT, "Temperature in Fahrenheit");
		attributes.put(TIME_BROADCAST, "Time Broadcast");
		attributes.put(BATTERY_LEVEL_STATE, "Battery Level State");
		attributes.put(BATTERY_POWER_STATE, "Battery Power State");
		attributes.put(PULSE_OXIMETRY_CONTINUOUS_MEASUREMENT, "Pulse Oximetry Continuous Measurement");
		attributes.put(PULSE_OXIMETRY_CONTROL_POINT, "Pulse Oximetry Control Point");
		attributes.put(PULSE_OXIMETRY_FEATURES, "Pulse Oximetry Features");
		attributes.put(PULSE_OXIMETRY_PULSATILE_EVENT, "Pulse Oximetry Pulsatile Event");
		attributes.put(PULSE_OXIMETRY_SPOT_CHECK_MEASUREMENT, "Pulse Oximetry Spot-Check Measurement");
		attributes.put(RECORD_ACCESS_CONTROL_POINT_TESTVERSION, "Record Access Control point (Test Version)");
		attributes.put(REMOVABLE, "Removable");
		attributes.put(SERVICE_REQUIRED, "Service Required");
		
		// UMHD-XXXX		
		attributes.put(UMEDIA_KEY_EVENT, "Umedia Key Event");
		
		//埃微 I5 運動手環
		attributes.put(I5_CONFIG, "I5 Configuration");
		attributes.put(I5_DATA1, "I5 Data 1");
		attributes.put(I5_DATA2, "I5 Data 2");
		attributes.put(I5_DATA3, "I5 Data 3");
		attributes.put(I5_DATA4, "I5 Data 4");
		attributes.put(I5_DATA5, "I5 Data 5");
		attributes.put(I5_DATA6, "I5 Data 6");
		attributes.put(I5_DATA7, "I5 Data 7");
		attributes.put(I5_DATA8, "I5 Data 8");
		attributes.put(I5_DATA9, "I5 Data 9");
		
		// 天天手環
		attributes.put(M04L_CHARACTERISTIC1_1, "M04_L Service 1 Characteristic 1");
		attributes.put(M04L_CHARACTERISTIC1_2, "M04_L Service 1 Characteristic 2");
		attributes.put(M04L_CHARACTERISTIC1_3, "M04_L Service 1 Characteristic 3");
		attributes.put(M04L_CHARACTERISTIC1_4, "M04_L Service 1 Characteristic 4");
		attributes.put(M04L_CHARACTERISTIC1_5, "M04_L Service 1 Characteristic 5");
		attributes.put(M04L_CHARACTERISTIC1_6, "M04_L Service 1 Characteristic 6");
		attributes.put(M04L_CHARACTERISTIC2_1, "M04_L Service 2 Characteristic 1");
		attributes.put(M04L_CHARACTERISTIC2_2, "M04_L Service 2 Characteristic 2");
		
    }

    public static String lookup(UUID uuid, String defaultName) {
        String name = attributes.get(uuid);
		return name == null ? defaultName : name;
	}
}