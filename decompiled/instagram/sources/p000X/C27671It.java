package p000X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1It  reason: invalid class name and case insensitive filesystem */
public final class C27671It implements C06570Po {
    public final C27771Jd A00;
    public final C27771Jd A01;
    public final C27771Jd A02;
    public final Map A03 = new ConcurrentHashMap();
    public final C27691Iv A04;
    public final C27761Jc A05;
    public final AnonymousClass0C1 A06;

    public static C31561Yu A00(String str, AnonymousClass41U r20) {
        AnonymousClass44F r13;
        ArrayList arrayList = new ArrayList();
        for (DSs dSs : Collections.unmodifiableList(r20.A00)) {
            String str2 = dSs.A06;
            AnonymousClass44F[] values = AnonymousClass44F.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    r13 = AnonymousClass44F.NONE;
                    break;
                }
                r13 = values[i];
                if (r13.A00.equals(str2)) {
                    break;
                }
                i++;
            }
            String str3 = dSs.A03;
            String str4 = dSs.A05;
            String str5 = dSs.A04;
            int i2 = dSs.A00;
            boolean z = dSs.A07;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            arrayList.add(new AnonymousClass2KB(str3, str4, str5, i2, r13, z, timeUnit.toMillis(dSs.A02), timeUnit.toMillis(dSs.A01)));
        }
        return new C31561Yu(str, arrayList);
    }

    public static synchronized C27671It A01(AnonymousClass0C1 r2) {
        C27671It r0;
        Class<C27671It> cls = C27671It.class;
        synchronized (cls) {
            r0 = (C27671It) r2.AVA(cls, new C27681Iu(r2));
        }
        return r0;
    }

    public final C31561Yu A02(String str) {
        return (C31561Yu) this.A03.get(str);
    }

    public final void onUserSessionWillEnd(boolean z) {
        this.A03.clear();
        this.A04.A01();
    }

    public C27671It(AnonymousClass0C1 r4, C27691Iv r5, AnonymousClass1J1 r6, C27761Jc r7) {
        this.A06 = r4;
        this.A01 = C27771Jd.A00();
        this.A04 = r5;
        this.A05 = r7;
        this.A00 = C27771Jd.A00();
        C27771Jd A002 = C27771Jd.A00();
        this.A02 = A002;
        this.A04.A02(A002.A0G(r6), new C27901Jq(this));
    }
}
