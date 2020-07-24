package p000X;

/* renamed from: X.0o8  reason: invalid class name and case insensitive filesystem */
public final class C16160o8 {
    public static C15890nh A00(String str, AnonymousClass0C1 r5) {
        C15890nh r3 = new C15890nh(r5);
        r3.A09 = Constants.A0N;
        r3.A0E("media/%s/info/", str);
        r3.A06(AnonymousClass1N2.class, false);
        return r3;
    }

    public static C17850qu A01(Iterable iterable, AnonymousClass0C1 r4) {
        C15890nh r2 = new C15890nh(r4);
        r2.A09 = Constants.A0N;
        r2.A0C = "media/infos/";
        r2.A09("media_ids", C36681iR.A01(",").A03(iterable));
        r2.A06(AnonymousClass1N2.class, false);
        return r2.A03();
    }

    public static C17850qu A02(String str, AnonymousClass0C1 r5) {
        C15890nh r3 = new C15890nh(r5);
        r3.A09 = Constants.A0N;
        r3.A0E("media/%s/comment_info/", str);
        r3.A06(C146876Pn.class, false);
        return r3.A03();
    }

    public static void A04(C15890nh r1, String str) {
        if (str != null) {
            r1.A09("max_id", str);
        }
    }

    public static C17850qu A03(String str, AnonymousClass0C1 r1) {
        return A00(str, r1).A03();
    }
}
