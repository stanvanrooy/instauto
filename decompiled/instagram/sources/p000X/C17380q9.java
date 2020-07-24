package p000X;

/* renamed from: X.0q9  reason: invalid class name and case insensitive filesystem */
public final class C17380q9 implements C17140pk {
    public final C17850qu A6w(AnonymousClass0C1 r7, C17090pf r8) {
        C17360q7 r82 = (C17360q7) r8;
        String str = r82.A02;
        String str2 = r82.A01;
        int i = r82.A00;
        C15890nh r2 = new C15890nh(r7);
        r2.A09 = Constants.ONE;
        r2.A0C = C06360Ot.formatString("media/%s/%s/story_group_poll_vote/", str, str2);
        r2.A09("vote", String.valueOf(i));
        r2.A06(C121025Gy.class, false);
        return r2.A03();
    }
}
