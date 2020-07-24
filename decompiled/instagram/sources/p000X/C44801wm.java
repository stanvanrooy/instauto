package p000X;

/* renamed from: X.1wm  reason: invalid class name and case insensitive filesystem */
public final class C44801wm implements Runnable {
    public final /* synthetic */ C40961pX A00;
    public final /* synthetic */ boolean A01;

    public C44801wm(C40961pX r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public final void run() {
        C40961pX r0 = this.A00;
        r0.A06.remove(r0.A02);
        C40961pX r02 = this.A00;
        C31591Yx.A02(r02.A01, r02.A00, r02.A03, r02.A06, r02.A05);
        C40961pX r1 = this.A00;
        if (r1.A07) {
            r1.A01.A06(new C44811wn(this));
        }
    }
}
