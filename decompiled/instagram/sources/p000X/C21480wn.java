package p000X;

/* renamed from: X.0wn  reason: invalid class name and case insensitive filesystem */
public final class C21480wn implements C19490tZ {
    public static final C05110Id A01 = new C21490wo();
    public final AnonymousClass0C1 A00;

    public final /* bridge */ /* synthetic */ void BfK(C17090pf r8, C06270Ok r9, C73233Ja r10) {
        C21460wl r82 = (C21460wl) r8;
        AnonymousClass0C1 r6 = this.A00;
        String str = r82.AY6().A00;
        String str2 = r82.A03;
        int i = r82.A00;
        String str3 = r82.A02;
        C15890nh r2 = new C15890nh(r6);
        r2.A09 = Constants.ONE;
        r2.A0C = "direct_v2/threads/broadcast/poll_vote/";
        r2.A09("thread_id", str);
        r2.A09("item_id", str2);
        r2.A09("option_id", Integer.toString(i));
        r2.A09("client_context", str3);
        r2.A06(AnonymousClass1N4.class, false);
        r2.A0G = true;
        C17850qu A03 = r2.A03();
        A03.A00 = new C98104Ls(this.A00, r10);
        C12810hQ.A02(A03);
    }

    public C21480wn(AnonymousClass0C1 r1) {
        this.A00 = r1;
    }

    public final boolean AiL(C17090pf r2) {
        return true;
    }
}
