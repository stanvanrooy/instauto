package p000X;

/* renamed from: X.A8p */
public final class A8p extends A9H {
    public final Object A00;
    public final /* synthetic */ A8K A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public A8p(A8K a8k, int i, Object obj) {
        super(a8k, i);
        this.A01 = a8k;
        this.A00 = obj;
    }

    public final void execute() {
        A83 a83 = this.A01.A0L;
        int i = this.A00;
        Object obj = this.A00;
        synchronized (a83) {
            C228039ra.A00();
            a83.A03(i).updateExtraData(a83.A02(i), obj);
        }
    }
}
