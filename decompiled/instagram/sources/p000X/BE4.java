package p000X;

/* renamed from: X.BE4 */
public final class BE4 extends BU1 {
    public final Runnable A00;

    public final void run() {
        this.A00.run();
    }

    public BE4(long j, Runnable runnable) {
        super(j);
        this.A00 = runnable;
    }

    public final String toString() {
        return AnonymousClass000.A0E(super.toString(), this.A00.toString());
    }
}
