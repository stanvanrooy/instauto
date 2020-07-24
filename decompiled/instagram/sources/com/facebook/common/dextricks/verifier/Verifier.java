package com.facebook.common.dextricks.verifier;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import p000X.AnonymousClass0Y1;

public class Verifier {
    public static boolean sDisabledRuntimeVerification;
    public static final boolean sHasNativeCode;
    public static boolean sTriedDisableRuntimeVerification;

    public static native boolean disableRuntimeVerification_6_0_1();

    public static native boolean disableRuntimeVerification_7_0_0();

    public static native boolean disableRuntimeVerification_7_1_2();

    public static native boolean disableRuntimeVerification_8_0_0();

    public static native boolean disableRuntimeVerification_8_1_0();

    public static native boolean disableRuntimeVerification_9_0_0();

    public static synchronized void disableRuntimeVerification(Context context) {
        synchronized (Verifier.class) {
            if (!sTriedDisableRuntimeVerification && sHasNativeCode) {
                switch (Build.VERSION.SDK_INT) {
                    case 23:
                        sDisabledRuntimeVerification = disableRuntimeVerification_6_0_1();
                        break;
                    case 24:
                        sDisabledRuntimeVerification = disableRuntimeVerification_7_0_0();
                        break;
                    case 25:
                        sDisabledRuntimeVerification = disableRuntimeVerification_7_1_2();
                        break;
                    case OdexSchemeArtXdex.OREO_SDK_INT:
                        sDisabledRuntimeVerification = disableRuntimeVerification_8_0_0();
                        break;
                    case 27:
                        sDisabledRuntimeVerification = disableRuntimeVerification_8_1_0();
                        break;
                    case 28:
                        sDisabledRuntimeVerification = disableRuntimeVerification_9_0_0();
                        break;
                    default:
                        sDisabledRuntimeVerification = false;
                        sTriedDisableRuntimeVerification = false;
                        break;
                }
                sTriedDisableRuntimeVerification = true;
                if (sTriedDisableRuntimeVerification && !sDisabledRuntimeVerification) {
                    Log.w("Verifier", "Could not disable runtime verification");
                }
            }
        }
    }

    static {
        boolean z;
        try {
            AnonymousClass0Y1.A08("verifier");
            z = true;
        } catch (Throwable unused) {
            z = false;
        }
        sHasNativeCode = z;
    }
}
