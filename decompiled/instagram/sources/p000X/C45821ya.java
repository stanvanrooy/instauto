package p000X;

/* renamed from: X.1ya  reason: invalid class name and case insensitive filesystem */
public final class C45821ya implements C39851nf {
    public final /* synthetic */ C45791yV A00;

    public C45821ya(C45791yV r1) {
        this.A00 = r1;
    }

    public final void BMV(boolean z) {
        C45791yV r2 = this.A00;
        Boolean valueOf = Boolean.valueOf(z);
        C45791yV.A03(r2, "onServiceConnected, backgrounded: %b", valueOf);
        C45791yV r22 = this.A00;
        C45791yV.A01(r22, r22.A04.obtainMessage(9, valueOf));
    }

    public final void BMW() {
        C45791yV.A03(this.A00, "onServiceDisconnected", new Object[0]);
        C45791yV r2 = this.A00;
        C45791yV.A01(r2, r2.A04.obtainMessage(10));
    }
}
