package com.facebook.react.modules.appearance;

import android.content.Context;
import com.facebook.fbreact.specs.NativeAppearanceSpec;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import p000X.A44;
import p000X.AnonymousClass916;
import p000X.C228259s1;
import p000X.C23041A0r;

@ReactModule(name = "Appearance")
public class AppearanceModule extends NativeAppearanceSpec {
    public static final String APPEARANCE_CHANGED_EVENT_NAME = "appearanceChanged";
    public static final String NAME = "Appearance";
    public String mColorScheme;
    public final AnonymousClass916 mOverrideColorScheme;

    public void addListener(String str) {
    }

    public String getName() {
        return NAME;
    }

    public void removeListeners(double d) {
    }

    private String colorSchemeForCurrentConfiguration(Context context) {
        AnonymousClass916 r0 = this.mOverrideColorScheme;
        if (r0 != null) {
            return r0.getScheme();
        }
        int i = context.getResources().getConfiguration().uiMode & 48;
        if (i == 16 || i != 32) {
            return "light";
        }
        return "dark";
    }

    public void emitAppearanceChanged(String str) {
        C228259s1 A03 = C23041A0r.A03();
        A03.putString("colorScheme", str);
        A44 reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContextIfActiveOrWarn.A01(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(APPEARANCE_CHANGED_EVENT_NAME, A03);
        }
    }

    public String getColorScheme() {
        String colorSchemeForCurrentConfiguration = colorSchemeForCurrentConfiguration(getReactApplicationContext());
        this.mColorScheme = colorSchemeForCurrentConfiguration;
        return colorSchemeForCurrentConfiguration;
    }

    public void onConfigurationChanged(Context context) {
        String colorSchemeForCurrentConfiguration = colorSchemeForCurrentConfiguration(context);
        if (!this.mColorScheme.equals(colorSchemeForCurrentConfiguration)) {
            this.mColorScheme = colorSchemeForCurrentConfiguration;
            emitAppearanceChanged(colorSchemeForCurrentConfiguration);
        }
    }

    public AppearanceModule(A44 a44) {
        this(a44, (AnonymousClass916) null);
    }

    public AppearanceModule(A44 a44, AnonymousClass916 r3) {
        super(a44);
        this.mColorScheme = "light";
        this.mOverrideColorScheme = r3;
        this.mColorScheme = colorSchemeForCurrentConfiguration(a44);
    }
}
