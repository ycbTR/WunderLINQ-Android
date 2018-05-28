package com.blackboxembedded.WunderLINQ;

/**
 * Created by keithconger on 7/22/17.
 */

import com.blackboxembedded.WunderLINQ.OTAFirmwareUpdate.UUIDDatabase;

import java.util.HashMap;
import java.util.UUID;

/**
 * This class includes a small subset of standard GATT attributes for demonstration purposes.
 */
public class GattAttributes {
    private static HashMap<String, String> attributes = new HashMap();

    private static HashMap<UUID, String> attributesUUID = new HashMap<UUID, String>();

    /**
     * WunderLINQ Characteristic
     */
    public static final String MOTORCYCLE_SERVICE = "02997340-015f-11e5-8c2b-0002a5d5c51b";
    public static final String LIN_MESSAGE_CHARACTERISTIC = "00000003-0000-1000-8000-00805f9b34fb";
    public static final String DFU_CHARACTERISTIC = "00000005-0010-0080-0000-805f9b34fb00";

    /**
     * OTA Characteristic
     */
    public static final String OTA_UPDATE_SERVICE = "00060000-f8ce-11e4-abf4-0002a5d5c51b";
    public static final String OTA_UPDATE_CHARACTERISTIC = "00060001-f8ce-11e4-abf4-0002a5d5c51b";

    /**
     * Descriptor UUID's
     */
    public static final String CHARACTERISTIC_EXTENDED_PROPERTIES = "00002900-0000-1000-8000-00805f9b34fb";
    public static final String CHARACTERISTIC_USER_DESCRIPTION = "00002901-0000-1000-8000-00805f9b34fb";
    public static final String CLIENT_CHARACTERISTIC_CONFIG = "00002902-0000-1000-8000-00805f9b34fb";
    public static final String SERVER_CHARACTERISTIC_CONFIGURATION = "00002903-0000-1000-8000-00805f9b34fb";
    public static final String CHARACTERISTIC_PRESENTATION_FORMAT = "00002904-0000-1000-8000-00805f9b34fb";
    public static final String REPORT_REFERENCE = "00002908-0000-1000-8000-00805f9b34fb";

    /**
     * Device information characteristics
     */
    public static final String SYSTEM_ID = "00002a23-0000-1000-8000-00805f9b34fb";
    public static final String MODEL_NUMBER_STRING = "00002a24-0000-1000-8000-00805f9b34fb";
    public static final String SERIAL_NUMBER_STRING = "00002a25-0000-1000-8000-00805f9b34fb";
    public static final String FIRMWARE_REVISION_STRING = "00002a26-0000-1000-8000-00805f9b34fb";
    public static final String HARDWARE_REVISION_STRING = "00002a27-0000-1000-8000-00805f9b34fb";
    public static final String SOFTWARE_REVISION_STRING = "00002a28-0000-1000-8000-00805f9b34fb";
    public static final String MANUFACTURER_NAME_STRING = "00002a29-0000-1000-8000-00805f9b34fb";
    public static final String PNP_ID = "00002a50-0000-1000-8000-00805f9b34fb";
    public static final String IEEE = "00002a2a-0000-1000-8000-00805f9b34fb";
    public static final String DEVICE_INFORMATION_SERVICE = "0000180a-0000-1000-8000-00805f9b34fb";

    static {
        // Services
        attributes.put(MOTORCYCLE_SERVICE, "Motorcycle Service");
        // Characteristics
        attributes.put(LIN_MESSAGE_CHARACTERISTIC, "LIN Message");
    }
    static {
        //OTA Characteristics
        attributesUUID.put(UUIDDatabase.UUID_OTA_UPDATE_SERVICE, "Bootloader Service");
        attributesUUID.put(UUIDDatabase.UUID_OTA_UPDATE_CHARACTERISTIC, "Bootloader Data Characteristic");

        // Descriptors
        attributesUUID.put(UUIDDatabase.UUID_CHARACTERISTIC_EXTENDED_PROPERTIES, "Characteristic Extended Properties");
        attributesUUID.put(UUIDDatabase.UUID_CHARACTERISTIC_USER_DESCRIPTION, "Characteristic User Description");
        attributesUUID.put(UUIDDatabase.UUID_CLIENT_CHARACTERISTIC_CONFIG, "Client Characteristic Configuration");
        attributesUUID.put(UUIDDatabase.UUID_SERVER_CHARACTERISTIC_CONFIGURATION, "Server Characteristic Configuration");
        attributesUUID.put(UUIDDatabase.UUID_CHARACTERISTIC_PRESENTATION_FORMAT, "Characteristic Presentation Format");
        attributesUUID.put(UUIDDatabase.UUID_REPORT_REFERENCE, "Report Reference");

        // Device Information Characteristics
        attributesUUID.put(UUIDDatabase.UUID_SYSTEM_ID, "System ID");
        attributesUUID.put(UUIDDatabase.UUID_MODEL_NUMBER_STRING, "Model Number String");
        attributesUUID.put(UUIDDatabase.UUID_SERIAL_NUMBER_STRING, "Serial Number String");
        attributesUUID.put(UUIDDatabase.UUID_FIRMWARE_REVISION_STRING, "Firmware Revision String");
        attributesUUID.put(UUIDDatabase.UUID_HARDWARE_REVISION_STRING, "Hardware Revision String");
        attributesUUID.put(UUIDDatabase.UUID_SOFTWARE_REVISION_STRING, "Software Revision String");
        attributesUUID.put(UUIDDatabase.UUID_MANUFACTURE_NAME_STRING, "Manufacturer Name String");
        attributesUUID.put(UUIDDatabase.UUID_PNP_ID, "PnP ID");
        attributesUUID.put(UUIDDatabase.UUID_IEEE,
                "IEEE 11073-20601 Regulatory Certification Data List");
    }
    public static String lookup(String uuid, String defaultName) {
        String name = attributes.get(uuid);
        return name == null ? defaultName : name;
    }
    public static String lookupUUID(UUID uuid, String defaultName) {
        String name = attributesUUID.get(uuid);
        return name == null ? defaultName : name;
    }
}