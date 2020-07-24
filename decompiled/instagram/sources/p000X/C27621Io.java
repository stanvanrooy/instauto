package p000X;

/* renamed from: X.1Io  reason: invalid class name and case insensitive filesystem */
public final class C27621Io implements Runnable {
    public final /* synthetic */ C27581Ik A00;

    public C27621Io(C27581Ik r1) {
        this.A00 = r1;
    }

    public final void run() {
        C27581Ik r2 = this.A00;
        Integer num = r2.A00;
        if (num != Constants.ZERO && num != Constants.A0Y) {
            r2.A00 = Constants.A0u;
            r2.A0B("FIRST_MEDIA_LOAD_FAILED", "timeout");
            C27581Ik.A00(this.A00);
        }
    }
}
