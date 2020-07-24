package com.facebook.react.modules.debug;

import com.facebook.fbreact.specs.NativeDevSettingsSpec;
import com.facebook.react.module.annotations.ReactModule;
import p000X.A44;
import p000X.A49;
import p000X.C228039ra;
import p000X.C228089rf;

@ReactModule(name = "DevSettings")
public class DevSettingsModule extends NativeDevSettingsSpec {
    public static final String NAME = "DevSettings";
    public final C228089rf mDevSupportManager;

    public void addListener(String str) {
    }

    public String getName() {
        return NAME;
    }

    public void onFastRefresh() {
    }

    public void removeListeners(double d) {
    }

    public void setIsShakeToShowDevMenuEnabled(boolean z) {
    }

    public void reload() {
        if (this.mDevSupportManager.AKB()) {
            C228039ra.A01(new A49(this));
        }
    }

    public DevSettingsModule(A44 a44, C228089rf r2) {
        super(a44);
        this.mDevSupportManager = r2;
    }

    public void toggleElementInspector() {
    }

    public void addMenuItem(String str) {
    }

    public void reloadWithReason(String str) {
        reload();
    }

    public void setHotLoadingEnabled(boolean z) {
    }

    public void setIsDebuggingRemotely(boolean z) {
    }

    public void setProfilingEnabled(boolean z) {
    }
}
