package p000X;

/* renamed from: X.0e2  reason: invalid class name and case insensitive filesystem */
public enum C10890e2 implements C07580Tq {
    CountSuccessfulConnection("sc", r2),
    CountConnectAttempt("ca", r2),
    ConnectingMs("ce", r2),
    LastConnectFailureReason("fr", r14),
    LastDisconnectReason("dr", r14);
    
    public final Class A00;
    public final String A01;

    public final String AOP() {
        return this.A01;
    }

    public final Class AZs() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    C10890e2(String str, Class cls) {
        this.A01 = str;
        this.A00 = cls;
    }
}
