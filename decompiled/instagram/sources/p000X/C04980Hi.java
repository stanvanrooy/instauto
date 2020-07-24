package p000X;

/* renamed from: X.0Hi  reason: invalid class name and case insensitive filesystem */
public final class C04980Hi implements AnonymousClass0IT {
    public final Object get() {
        C06610Ps r5 = C06610Ps.NONE;
        AnonymousClass0I1 r4 = new AnonymousClass0I1("release_channel", AnonymousClass0L7.APP_RELEASE_CHANNEL, "PUBLIC", new String[]{"PUBLIC"});
        C05630Li.A02(r4);
        String string = C05630Li.A00.getString(C05630Li.A01(r4), (String) r4.A03);
        if ("ALPHA".equals(string)) {
            return C06610Ps.ALPHA;
        }
        if ("BETA".equals(string)) {
            return C06610Ps.BETA;
        }
        if ("PUBLIC".equals(string)) {
            return C06610Ps.PROD;
        }
        return r5;
    }
}
