package com.facebook.redex.dynamicanalysis;

import java.util.concurrent.atomic.AtomicInteger;
import p000X.AnonymousClass0CX;
import p000X.AnonymousClass0CY;
import p000X.AnonymousClass0DB;

public final class DynamicAnalysis {
    public static boolean A00 = true;
    public static int A01 = 0;
    public static int A02 = 0;
    public static String A03 = null;
    public static AtomicInteger A04 = new AtomicInteger(0);
    public static final DynamicAnalysis A05 = new DynamicAnalysis();
    public static final short[] sBasicBlockStats = new short[0];
    public static short[] sMethodStats = new short[0];
    public static short[][] sMethodStatsArray = new short[0][];
    public static int sNumStaticallyInstrumented = 0;
    public static int sTraceType = 1;

    public static void A00() {
        A00 = false;
        int i = sNumStaticallyInstrumented;
        if (i == 0) {
            AnonymousClass0DB.A0E("DYNA", "Tracing has been stopped: App has not been instrumented");
            return;
        }
        AnonymousClass0DB.A0K("DYNA", "Tracing has been stopped: %d methods (%d shards interleaved) were instrumented; approx. %d methods data were collected", Integer.valueOf(i), Integer.valueOf(sMethodStatsArray.length), Integer.valueOf(A04.get()));
    }

    public static void onMethodBeginBasicGated(int i) {
        if (A00) {
            short[] sArr = sMethodStats;
            sArr[i] = (short) (sArr[i] + 1);
            int i2 = i + 1;
            if (sArr[i2] == 0) {
                sArr[i2] = (short) A04.incrementAndGet();
            }
        }
    }

    public DynamicAnalysis() {
        if (!AnonymousClass0CX.A01.equals(AnonymousClass0CY.A00().A00)) {
            A00 = false;
            sNumStaticallyInstrumented = 0;
            int i = 0;
            while (true) {
                short[][] sArr = sMethodStatsArray;
                if (i < sArr.length) {
                    sArr[i] = new short[0];
                    i++;
                } else {
                    return;
                }
            }
        }
    }
}
