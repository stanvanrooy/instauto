package com.facebook.react.modules.deviceinfo;

import android.content.Context;
import com.facebook.fbreact.specs.NativeDeviceInfoSpec;
import com.facebook.react.bridge.ReactSoftException;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.util.HashMap;
import java.util.Map;
import p000X.A0P;
import p000X.A44;
import p000X.A47;
import p000X.AnonymousClass0FY;
import p000X.AnonymousClass951;
import p000X.C23043A0y;

@ReactModule(name = "DeviceInfo")
public class DeviceInfoModule extends NativeDeviceInfoSpec implements A47 {
    public static final String NAME = "DeviceInfo";
    public float mFontScale;
    public C23043A0y mPreviousDisplayMetrics;
    public A44 mReactApplicationContext;

    public String getName() {
        return NAME;
    }

    public void invalidate() {
    }

    public void onHostDestroy() {
    }

    public void onHostPause() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        if (p000X.AnonymousClass951.A00 == null) goto L_0x0016;
     */
    public void emitUpdateDimensionsEvent() {
        boolean z;
        A44 a44 = this.mReactApplicationContext;
        if (a44 == null) {
            return;
        }
        if (a44.A0A()) {
            double d = (double) this.mFontScale;
            if (AnonymousClass951.A01 != null) {
                z = true;
            }
            z = false;
            AnonymousClass0FY.A03(z, "DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics");
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putMap("windowPhysicalPixels", AnonymousClass951.A00(AnonymousClass951.A01, d));
            writableNativeMap.putMap("screenPhysicalPixels", AnonymousClass951.A00(AnonymousClass951.A00, d));
            C23043A0y a0y = this.mPreviousDisplayMetrics;
            if (a0y == null) {
                this.mPreviousDisplayMetrics = writableNativeMap.copy();
            } else if (!writableNativeMap.equals(a0y)) {
                this.mPreviousDisplayMetrics = writableNativeMap.copy();
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.mReactApplicationContext.A01(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("didUpdateDimensions", writableNativeMap);
            }
        } else {
            ReactSoftException.logSoftException(NAME, new A0P("No active CatalystInstance, cannot emitUpdateDimensionsEvent"));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (p000X.AnonymousClass951.A00 == null) goto L_0x0011;
     */
    public Map getTypedExportedConstants() {
        boolean z;
        HashMap hashMap = new HashMap();
        double d = (double) this.mFontScale;
        if (AnonymousClass951.A01 != null) {
            z = true;
        }
        z = false;
        AnonymousClass0FY.A03(z, "DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("windowPhysicalPixels", AnonymousClass951.A01(AnonymousClass951.A01, d));
        hashMap2.put("screenPhysicalPixels", AnonymousClass951.A01(AnonymousClass951.A00, d));
        hashMap.put("Dimensions", hashMap2);
        return hashMap;
    }

    public void onHostResume() {
        A44 a44 = this.mReactApplicationContext;
        if (a44 != null) {
            float f = a44.getResources().getConfiguration().fontScale;
            if (this.mFontScale != f) {
                this.mFontScale = f;
                emitUpdateDimensionsEvent();
            }
        }
    }

    public DeviceInfoModule(A44 a44) {
        super(a44);
        AnonymousClass951.A02(a44);
        this.mFontScale = a44.getResources().getConfiguration().fontScale;
        this.mReactApplicationContext = a44;
        a44.A06(this);
    }

    public DeviceInfoModule(Context context) {
        super((A44) null);
        this.mReactApplicationContext = null;
        AnonymousClass951.A02(context);
        this.mFontScale = context.getResources().getConfiguration().fontScale;
    }
}
