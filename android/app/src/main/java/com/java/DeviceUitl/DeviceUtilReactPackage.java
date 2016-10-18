package com.java.DeviceUitl;

import android.view.ViewManager;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

import com.java.DeviceUitl.DeviceUtil;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;

/**
 * Created by wsj on 16/10/18.
 */
class DeviceUtilReactPackage implements ReactPackage {
    @Override
    public List<Class<? extends JavaScriptModule>> createJSModules() {
        return Collections.emptyList();
    }

    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        return Collections.emptyList();
    }


    @Override
    public List<NativeModule> createNativeModules(
        ReactApplicationContext reactContext) {
        List<NativeModule> modules = new ArrayList<>();

        modules.add(new DeviceUtil(reactContext));

        return modules;
    }
}
