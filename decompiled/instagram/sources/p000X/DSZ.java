package p000X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.DSZ */
public final class DSZ implements BTH {
    public static final List A00 = Arrays.asList(new String[]{"MemTotal:", "MemFree:", "Cached:", "AnonPages:"});

    public final BTN AQG() {
        DSh dSh = new DSh();
        long[] jArr = new long[A00.size()];
        List list = A00;
        AnonymousClass0Cb.A02("/proc/meminfo", (String[]) list.toArray(new String[0]), jArr);
        dSh.A03 = jArr[list.indexOf("MemTotal:")];
        dSh.A02 = jArr[A00.indexOf("MemFree:")];
        dSh.A01 = jArr[A00.indexOf("Cached:")];
        dSh.A00 = jArr[A00.indexOf("AnonPages:")];
        return dSh;
    }
}
