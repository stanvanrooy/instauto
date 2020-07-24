package p000X;

/* renamed from: X.0hD  reason: invalid class name and case insensitive filesystem */
public final class C12680hD extends C12690hE {
    public final /* synthetic */ C12600h4 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12680hD(C12600h4 r2) {
        super("endAppStartLoggerWhenTimeOut");
        this.A00 = r2;
    }

    public final boolean onQueueIdle() {
        C12600h4 r3 = this.A00;
        AnonymousClass0h8 r2 = r3.A00;
        if (r2 != null && r2.A02 == null) {
            r3.A04(C12600h4.A0B);
            return false;
        } else if (r2 != null) {
            return true;
        } else {
            return false;
        }
    }
}
