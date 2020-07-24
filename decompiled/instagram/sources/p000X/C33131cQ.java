package p000X;

/* renamed from: X.1cQ  reason: invalid class name and case insensitive filesystem */
public final class C33131cQ implements C25891Au {
    public final AnonymousClass1AQ A00;
    public final /* synthetic */ AnonymousClass1A9 A01;

    public C33131cQ(AnonymousClass1A9 r1, AnonymousClass1AQ r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public final void cancel() {
        this.A01.A00.remove(this.A00);
        this.A00.A00.remove(this);
    }
}
