package com.facebook.react;

import com.facebook.react.devsupport.LogBoxModule;
import com.facebook.react.modules.bundleloader.NativeDevSplitBundleLoaderModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.core.HeadlessJsTaskSupportModule;
import com.facebook.react.modules.core.TimingModule;
import com.facebook.react.modules.debug.DevSettingsModule;
import com.facebook.react.modules.debug.SourceCodeModule;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.facebook.react.modules.systeminfo.AndroidInfoModule;
import com.facebook.react.uimanager.UIManagerModule;
import java.util.HashMap;
import java.util.Map;
import p000X.A42;
import p000X.C23073A4r;

public class CoreModulesPackage$$ReactModuleInfoProvider implements C23073A4r {
    public final Map ATa() {
        HashMap hashMap = new HashMap();
        hashMap.put(AndroidInfoModule.NAME, new A42(AndroidInfoModule.NAME, "com.facebook.react.modules.systeminfo.AndroidInfoModule", false, false, true, false));
        hashMap.put(DeviceEventManagerModule.NAME, new A42(DeviceEventManagerModule.NAME, "com.facebook.react.modules.core.DeviceEventManagerModule", false, false, false, false));
        hashMap.put(DeviceInfoModule.NAME, new A42(DeviceInfoModule.NAME, "com.facebook.react.modules.deviceinfo.DeviceInfoModule", false, false, true, false));
        hashMap.put(DevSettingsModule.NAME, new A42(DevSettingsModule.NAME, "com.facebook.react.modules.debug.DevSettingsModule", false, false, false, false));
        hashMap.put("ExceptionsManager", new A42("ExceptionsManager", "com.facebook.react.modules.core.ExceptionsManagerModule", false, false, false, false));
        hashMap.put(LogBoxModule.NAME, new A42(LogBoxModule.NAME, "com.facebook.react.devsupport.LogBoxModule", false, false, false, false));
        hashMap.put(HeadlessJsTaskSupportModule.NAME, new A42(HeadlessJsTaskSupportModule.NAME, "com.facebook.react.modules.core.HeadlessJsTaskSupportModule", false, false, false, false));
        hashMap.put(SourceCodeModule.NAME, new A42(SourceCodeModule.NAME, "com.facebook.react.modules.debug.SourceCodeModule", false, false, true, false));
        hashMap.put(TimingModule.NAME, new A42(TimingModule.NAME, "com.facebook.react.modules.core.TimingModule", false, false, false, false));
        hashMap.put(UIManagerModule.NAME, new A42(UIManagerModule.NAME, "com.facebook.react.uimanager.UIManagerModule", false, false, true, false));
        hashMap.put(NativeDevSplitBundleLoaderModule.NAME, new A42(NativeDevSplitBundleLoaderModule.NAME, "com.facebook.react.modules.bundleloader.NativeDevSplitBundleLoaderModule", false, false, false, false));
        return hashMap;
    }
}
