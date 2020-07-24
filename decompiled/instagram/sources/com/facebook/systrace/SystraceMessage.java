package com.facebook.systrace;

import p000X.C08730Yi;
import p000X.C08740Yj;
import p000X.C08750Yk;
import p000X.C08760Yl;
import p000X.C09550bb;
import p000X.C09580be;
import p000X.C09620bi;
import p000X.C09720bt;

public final class SystraceMessage {
    public static final C08750Yk A00 = new C09580be();
    public static final C08760Yl A01 = new C09720bt();
    public static final C08760Yl A02 = new C09620bi();
    public static final ThreadLocal A03 = new C08730Yi();

    public static C08750Yk A00(long j) {
        return A01(j, A02, "");
    }

    public static C08750Yk A02(long j, String str) {
        return A01(j, A01, str);
    }

    public static C08750Yk A01(long j, C08760Yl r8, String str) {
        if (!Systrace.A08(j)) {
            return A00;
        }
        C09550bb r5 = (C09550bb) A03.get();
        r5.A00 = j;
        r5.A02 = r8;
        r5.A03 = str;
        C08740Yj r4 = r5.A01;
        for (int i = 0; i < r4.A00; i++) {
            r4.A01[i] = null;
        }
        r4.A00 = 0;
        return r5;
    }
}
