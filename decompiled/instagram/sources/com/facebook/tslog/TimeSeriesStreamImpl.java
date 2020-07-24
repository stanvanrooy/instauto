package com.facebook.tslog;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000X.Constants;
import p000X.AnonymousClass0Y1;
import p000X.C23740AaP;

public class TimeSeriesStreamImpl {
    public final long A00;

    public static native void nativeAdd(long j, int i, int i2);

    public static native void nativeAvg(long j, int i, int i2);

    public static native void nativeAvgMax(long j, int i, int i2, int i3);

    public static native void nativeDispose(long j);

    public static native boolean nativeFlush(long j);

    public static native long nativeInit(long j, String str, String[] strArr, String[] strArr2);

    public static native boolean nativeIsStarted(long j);

    public static native void nativeMax(long j, int i, int i2);

    public static native void nativeSet(long j, int i, int i2);

    public static native void nativeStart(long j);

    public static native void nativeStop(long j);

    static {
        AnonymousClass0Y1.A08("tslog-jni");
    }

    public TimeSeriesStreamImpl(TimeSeriesLog timeSeriesLog, String str, List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            C23740AaP aaP = (C23740AaP) it.next();
            aaP.A01 = this;
            if (aaP.A02 == Constants.ONE) {
                aaP.A00 = i2;
                arrayList.add(aaP.A03);
                i2++;
            } else {
                aaP.A00 = i;
                arrayList2.add(aaP.A03);
                i++;
            }
        }
        this.A00 = nativeInit(timeSeriesLog.A00, str, (String[]) arrayList2.toArray(new String[arrayList2.size()]), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }
}
