package p000X;

/* renamed from: X.0nP  reason: invalid class name and case insensitive filesystem */
public final class C15710nP implements C15690nN {
    public static C15710nP A02;
    public C05950Nc A00 = new C05950Nc();
    public C05950Nc A01 = new C05950Nc();

    public final void At3(double d, long j, long j2) {
    }

    public final void BcF(double d) {
    }

    public static synchronized C15710nP A00() {
        C15710nP r0;
        synchronized (C15710nP.class) {
            if (A02 == null) {
                A02 = new C15710nP();
            }
            r0 = A02;
        }
        return r0;
    }

    public final void At2(double d, long j, long j2) {
        this.A00.A00(d);
    }
}
