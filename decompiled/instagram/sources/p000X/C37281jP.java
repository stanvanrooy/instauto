package p000X;

/* renamed from: X.1jP  reason: invalid class name and case insensitive filesystem */
public final class C37281jP implements Runnable {
    public final /* synthetic */ C33161cT A00;
    public final /* synthetic */ Object A01;

    public C37281jP(C33161cT r1, Object obj) {
        this.A00 = r1;
        this.A01 = obj;
    }

    public final void run() {
        C33161cT r2 = this.A00;
        Object obj = this.A01;
        if (r2.A01.get()) {
            r2.A01(obj);
        } else {
            r2.A02(obj);
        }
        r2.A03 = Constants.A0C;
    }
}
