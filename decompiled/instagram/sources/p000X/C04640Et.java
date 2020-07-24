package p000X;

/* renamed from: X.0Et  reason: invalid class name and case insensitive filesystem */
public final class C04640Et implements Runnable {
    public final /* synthetic */ C09080aa A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ Throwable A03;

    public C04640Et(C09080aa r1, String str, String str2, Throwable th) {
        this.A00 = r1;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = th;
    }

    public final void run() {
        AnonymousClass0aY r1 = AnonymousClass0aY.A05;
        if (r1 == null) {
            AnonymousClass0DB.A0K("lacrima", "Soft error detector missing: %s %s", this.A01, this.A02);
            return;
        }
        String str = this.A01;
        String str2 = this.A02;
        r1.A00(str, str2, 1, new C29085Crc(str2, this.A03), false, this.A00.A01);
    }
}
