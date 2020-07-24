package p000X;

/* renamed from: X.1gL  reason: invalid class name and case insensitive filesystem */
public final class C35421gL implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C15730nR A01;
    public final /* synthetic */ String A02;

    public C35421gL(C15730nR r1, String str, long j) {
        this.A01 = r1;
        this.A02 = str;
        this.A00 = j;
    }

    public final void run() {
        AnonymousClass17R.A00().A01(this.A02.hashCode(), "DISK", this.A00);
    }
}
