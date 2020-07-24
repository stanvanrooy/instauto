package p000X;

/* renamed from: X.0pj  reason: invalid class name and case insensitive filesystem */
public final class C17130pj implements C17140pk {
    public final C17850qu A6w(AnonymousClass0C1 r5, C17090pf r6) {
        String str;
        C17080pe r62 = (C17080pe) r6;
        String str2 = r62.A00;
        if (r62.A01) {
            str = "media/story_chat_request/";
        } else {
            str = "media/story_chat_cancel_request/";
        }
        C15890nh r2 = new C15890nh(r5);
        r2.A09 = Constants.ONE;
        r2.A0C = str;
        r2.A09("story_chat_id", str2);
        r2.A06(C121005Gw.class, false);
        return r2.A03();
    }
}
