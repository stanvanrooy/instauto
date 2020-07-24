package p000X;

/* renamed from: X.BYH */
public final class BYH extends C17920r1 {
    public final /* synthetic */ BYK A00;
    public final /* synthetic */ Integer A01;

    public BYH(BYK byk, Integer num) {
        this.A00 = byk;
        this.A01 = num;
    }

    public final void onFail(C43791v5 r3) {
        int A03 = AnonymousClass0Z0.A03(-1420014549);
        super.onFail(r3);
        this.A00.A03.A00();
        AnonymousClass0Z0.A0A(322720814, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0Z0.A03(-463786764);
        int A032 = AnonymousClass0Z0.A03(632280955);
        C16180oA r1 = this.A00.A01;
        r1.A00.edit().putString("direct_message_reachability_one_to_one", BYM.A00(this.A01)).apply();
        AnonymousClass0Z0.A0A(-366281444, A032);
        AnonymousClass0Z0.A0A(561396026, A03);
    }
}
