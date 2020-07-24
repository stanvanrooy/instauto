package com.facebook.fbreact.i18n;

import android.content.Context;
import com.facebook.C0003R;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.CxxModuleWrapper;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.module.annotations.ReactModule;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p000X.A3L;
import p000X.AnonymousClass0CH;
import p000X.AnonymousClass0Y1;
import p000X.C139155x8;

@ReactModule(isCxxModule = true, name = "I18nAssets")
public class FbReactI18nAssetsModule extends CxxModuleWrapper implements C139155x8 {
    public static final String IS_TESTING = "IS_TESTING";
    public static final String NAME = "I18nAssets";

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0046 A[SYNTHETIC, Splitter:B:25:0x0046] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x004d A[SYNTHETIC, Splitter:B:31:0x004d] */
    public static ByteBuffer getAsset(Context context, int i) {
        InputStream inputStream;
        if (i == 0) {
            return null;
        }
        try {
            inputStream = context.getResources().openRawResource(i);
            try {
                int available = inputStream.available() + 1;
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(available);
                int i2 = available - 1;
                if (inputStream.read(allocateDirect.array(), allocateDirect.arrayOffset(), available) == i2) {
                    allocateDirect.put(i2, (byte) 0);
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                    return allocateDirect;
                }
                throw new RuntimeException("stream.available is incorrect and so are your assumptions");
            } catch (IOException e) {
                e = e;
                try {
                    AnonymousClass0CH.A0A("ReactNative", "Unable to process I18n asset", e);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
            }
        } catch (IOException e2) {
            e = e2;
            inputStream = null;
            AnonymousClass0CH.A0A("ReactNative", "Unable to process I18n asset", e);
            if (inputStream != null) {
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
            if (inputStream != null) {
            }
            throw th;
        }
    }

    public static native HybridData initHybrid(Context context, int i, int i2, int i3, int i4, int i5, String str, boolean z);

    public void invalidate() {
    }

    static {
        AnonymousClass0Y1.A08("fbreact-i18nassetsmodule");
    }

    public static HybridData initHybridWithLogging(Context context, int i, int i2, String str) {
        ReactMarker.logMarker(A3L.CREATE_I18N_ASSETS_MODULE_START);
        HybridData initHybrid = initHybrid(context, i, C0003R.raw.currency_format_config, C0003R.raw.date_format_config, C0003R.raw.number_format_config, i2, str, false);
        ReactMarker.logMarker(A3L.CREATE_I18N_ASSETS_MODULE_END);
        return initHybrid;
    }

    public static boolean shouldExportDebugConstants() {
        return false;
    }

    public FbReactI18nAssetsModule(Context context, int i) {
        this(context, 0, i);
    }

    public FbReactI18nAssetsModule(Context context, int i, int i2) {
        super(initHybridWithLogging(context, i, i2, ""));
    }

    public FbReactI18nAssetsModule(Context context, int i, int i2, String str) {
        super(initHybridWithLogging(context, i, i2, str));
    }
}
