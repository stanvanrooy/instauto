package p000X;

/* renamed from: X.1cq  reason: invalid class name and case insensitive filesystem */
public final class C33391cq extends AnonymousClass0O9 {
    public final /* synthetic */ C26591Ec A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33391cq(C26591Ec r4) {
        super(413, 4, false, false);
        this.A00 = r4;
    }

    public final void run() {
        synchronized (this.A00.A03) {
            for (C26621Ef A08 : this.A00.A03.values()) {
                A08.A08();
            }
        }
    }
}
