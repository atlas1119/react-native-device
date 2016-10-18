package com.java.DeviceUitl;

/**
 * Created by wsj on 16/10/18.
 */

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;

import java.util.HashMap;
import java.util.Map;

public class DeviceUtil extends ReactContextBaseJavaModule {

    String _OSVERSION = System.getProperty("os.version");
    String _DEVICE = android.os.Build.DEVICE;
    String _MODEL = android.os.Build.MODEL;

//    String _PRODUCT = android.os.Build.PRODUCT;
//    String _BRAND = android.os.Build.BRAND;
//    String _DISPLAY = android.os.Build.DISPLAY;
//    String _UNKNOWN = android.os.Build.UNKNOWN;
//    String _HARDWARE = android.os.Build.HARDWARE;
//    String _ID = android.os.Build.ID;
//    String _MANUFACTURER = android.os.Build.MANUFACTURER;
//    String _SERIAL = android.os.Build.SERIAL;
//    String _USER = android.os.Build.USER;
//    String _HOST = android.os.Build.HOST;


    public DeviceUtil(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "DeviceUtil";
    }

    @Override
    public Map<String, Object> getConstants() {
        final Map<String, Object> constants = new HashMap<>();
        constants.put("model", _MODEL);
        constants.put("name", _MODEL);
        constants.put("systemName", _DEVICE);
        constants.put("systemVersion", _OSVERSION);
        return constants;
    }

}