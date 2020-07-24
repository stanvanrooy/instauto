package p000X;

/* renamed from: X.0Ma  reason: invalid class name and case insensitive filesystem */
public final class C05800Ma {
    public static C05810Mb parseFromJson(C13080hr r4) {
        String A0t;
        C05810Mb r3 = new C05810Mb();
        if (r4.A0g() != C13120hv.START_OBJECT) {
            r4.A0f();
            return null;
        }
        while (r4.A0p() != C13120hv.END_OBJECT) {
            String A0i = r4.A0i();
            r4.A0p();
            if ("media_id".equals(A0i)) {
                if (r4.A0g() == C13120hv.VALUE_NULL) {
                    A0t = null;
                } else {
                    A0t = r4.A0t();
                }
                r3.A03 = A0t;
            } else if ("version".equals(A0i)) {
                r3.A01 = r4.A0I();
            } else if ("media_pct".equals(A0i)) {
                r3.A00 = (float) r4.A0H();
            } else if ("time_info".equals(A0i)) {
                r3.A02 = AnonymousClass0ML.parseFromJson(r4);
            }
            r4.A0f();
        }
        return r3;
    }

    public static void A00(C13460iZ r5, C05810Mb r6) {
        r5.A0T();
        String str = r6.A03;
        if (str != null) {
            r5.A0H("media_id", str);
        }
        r5.A0F("version", r6.A01);
        r5.A0E("media_pct", r6.A00);
        if (r6.A02 != null) {
            r5.A0d("time_info");
            AnonymousClass0MM r4 = r6.A02;
            r5.A0T();
            r5.A0G("10", Math.max(r4.A05.A00(r4.A04.now()), r4.A00));
            r5.A0G("25", Math.max(r4.A06.A00(r4.A04.now()), r4.A01));
            r5.A0G("50", Math.max(r4.A07.A00(r4.A04.now()), r4.A02));
            r5.A0G("75", Math.max(r4.A08.A00(r4.A04.now()), r4.A03));
            r5.A0Q();
        }
        r5.A0Q();
    }
}
