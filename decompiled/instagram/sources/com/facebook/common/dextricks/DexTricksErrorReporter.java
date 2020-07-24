package com.facebook.common.dextricks;

import android.os.Process;
import java.util.Random;
import p000X.AnonymousClass000;
import p000X.AnonymousClass016;
import p000X.AnonymousClass01Q;
import p000X.AnonymousClass0KM;
import p000X.C04410Dw;

public class DexTricksErrorReporter {
    public static final int DEFAULT_SOFT_ERROR_REPORTING_FREQUENCY = 1000;
    public static final Random RANDOM = new Random();

    public static boolean randomSamplingCoinflip() {
        return RANDOM.nextInt(1000) == 0;
    }

    public static void reportSampledSoftError(final String str, final String str2, Throwable th) {
        Mlog.m30e(th, "SOFT ERROR %s: %s", str, str2);
        if (randomSamplingCoinflip()) {
            final AnonymousClass0KM r3 = new AnonymousClass0KM(AnonymousClass000.A0J(str, " | ", str2), th);
            new Thread(new Runnable() {
                public void run() {
                    try {
                        Process.setThreadPriority(10);
                        String formatCategorySampling = DexTricksErrorReporter.formatCategorySampling(str);
                        AnonymousClass016 r3 = new AnonymousClass016();
                        r3.put("soft_error_category", formatCategorySampling);
                        r3.put("soft_error_message", str2);
                        r3.put("sample_rate", String.valueOf(1000));
                        C04410Dw.A0B(AnonymousClass01Q.A00, r3, r3, 1);
                    } catch (Throwable th) {
                        Mlog.m36w(th, "Unable to report soft error", new Object[0]);
                    }
                }
            }, "dexTrickError").start();
        }
    }

    public static /* synthetic */ boolean access$000() {
        return false;
    }

    public static String formatCategorySampling(String str) {
        return AnonymousClass000.A0H(str, " [freq=", 1000, "]");
    }

    public static boolean isInternalBuild() {
        return false;
    }
}
