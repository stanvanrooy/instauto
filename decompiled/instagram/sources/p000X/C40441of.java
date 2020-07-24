package p000X;

import android.os.Handler;
import android.os.Looper;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.1of  reason: invalid class name and case insensitive filesystem */
public final class C40441of {
    public static Map A09 = Collections.synchronizedMap(new HashMap());
    public final C40501ol A00;
    public final C40531oo A01;
    public final C40561or A02;
    public final C40541op A03;
    public final C40521on A04;
    public final AnonymousClass00B A05;
    public final C40451og A06;
    public final C40461oh A07;
    public final C40491ok A08;

    public static void A01(int i, Map map, long j) {
        Map map2 = A09;
        Integer valueOf = Integer.valueOf(i);
        C30690Dhe dhe = (C30690Dhe) map2.get(valueOf);
        if (dhe != null) {
            A02(map, dhe, j);
        }
        A09.remove(valueOf);
    }

    public static void A02(Map map, C30690Dhe dhe, long j) {
        boolean z;
        String str;
        long j2;
        int i;
        boolean z2;
        long j3;
        long j4 = j;
        C30690Dhe dhe2 = dhe;
        if (dhe != null) {
            synchronized (dhe2) {
                z = dhe.A04;
            }
            if (z) {
                str = "";
            } else {
                str = "before_started_playing_";
            }
            String A0E = AnonymousClass000.A0E(str, "stall_time");
            synchronized (dhe2) {
                j2 = dhe.A01;
            }
            Map map2 = map;
            map.put(A0E, Long.toString(j2));
            String A0E2 = AnonymousClass000.A0E(str, "stall_count");
            synchronized (dhe2) {
                i = dhe.A00;
            }
            map.put(A0E2, Integer.toString(i));
            String A0E3 = AnonymousClass000.A0E(str, "is_stalling");
            synchronized (dhe2) {
                z2 = dhe.A06;
            }
            map.put(A0E3, Boolean.toString(z2));
            if (dhe.A00() != null) {
                String A0E4 = AnonymousClass000.A0E(str, "first_stall");
                Locale locale = Locale.US;
                Object[] objArr = new Object[3];
                objArr[0] = Long.valueOf(dhe2.A00().A02);
                objArr[1] = Long.valueOf(dhe2.A00().A00);
                if (dhe2.A00().A01 > 0) {
                    j3 = dhe2.A00().A01;
                } else {
                    j3 = j4;
                }
                objArr[2] = Long.valueOf(j3);
                map2.put(A0E4, String.format(locale, "position=%d;start_time=%d;end_time=%d", objArr));
            }
            if (dhe2.A01() != null) {
                String A0E5 = AnonymousClass000.A0E(str, "last_stall");
                Locale locale2 = Locale.US;
                Object[] objArr2 = new Object[3];
                objArr2[0] = Long.valueOf(dhe2.A01().A02);
                objArr2[1] = Long.valueOf(dhe2.A01().A00);
                if (dhe2.A01().A01 > 0) {
                    j4 = dhe2.A01().A01;
                }
                objArr2[2] = Long.valueOf(j4);
                map2.put(A0E5, String.format(locale2, "position=%d;start_time=%d;end_time=%d", objArr2));
            }
        }
    }

    public static boolean A03(C40441of r1) {
        if (r1.A06.A00 || r1.A07.A00() || AnonymousClass1CU.A00() || r1.A06.A01) {
            return true;
        }
        return false;
    }

    public C40441of(AnonymousClass0C1 r5) {
        this.A06 = new C40451og(r5);
        C40461oh r1 = new C40461oh(new Handler(Looper.getMainLooper()), AnonymousClass00B.A01);
        this.A07 = r1;
        C40491ok r3 = new C40491ok(this.A06, r1, r5);
        this.A08 = r3;
        AnonymousClass00B r2 = AnonymousClass00B.A01;
        this.A05 = r2;
        this.A00 = new C40501ol(r2, r3);
        this.A04 = new C40521on(r2, r3);
        this.A01 = new C40531oo(r2, r3);
        this.A03 = new C40541op(r2, r3, this.A07);
        this.A02 = new C40561or(r2);
    }

    public static void A00(int i, int i2, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            AnonymousClass00B.A01.markerAnnotate(i, i2, (String) entry.getKey(), (String) entry.getValue());
        }
    }
}
