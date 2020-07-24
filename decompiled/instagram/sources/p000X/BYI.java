package p000X;

/* renamed from: X.BYI */
public final class BYI extends C17920r1 {
    public final /* synthetic */ BYK A00;
    public final /* synthetic */ Integer A01;

    public BYI(BYK byk, Integer num) {
        this.A00 = byk;
        this.A01 = num;
    }

    public final void onFail(C43791v5 r3) {
        int A03 = AnonymousClass0Z0.A03(1284580581);
        super.onFail(r3);
        this.A00.A03.A00();
        AnonymousClass0Z0.A0A(-1600918329, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0Z0.A03(574153114);
        int A032 = AnonymousClass0Z0.A03(-263279215);
        C16180oA r1 = this.A00.A01;
        r1.A00.edit().putString("direct_message_reachability_group_add", BYM.A00(this.A01)).apply();
        AnonymousClass0Z0.A0A(-1611792831, A032);
        AnonymousClass0Z0.A0A(880229344, A03);
    }
}
