package p000X;

/* renamed from: X.1xU  reason: invalid class name and case insensitive filesystem */
public final class C45221xU extends C12380ge {
    public final int AGu() {
        return 10;
    }

    public C45221xU() {
        super(5000);
    }

    public final void A03() {
        AnonymousClass0OQ A00 = AnonymousClass0OQ.A00();
        synchronized (A00.A01) {
            A00.A00 = false;
            A00.A01.notifyAll();
        }
    }

    public final boolean A04() {
        AnonymousClass0OQ A00 = AnonymousClass0OQ.A00();
        synchronized (A00.A01) {
            A00.A00 = true;
        }
        return true;
    }
}
