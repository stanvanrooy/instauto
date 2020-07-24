package p000X;

/* renamed from: X.0Eq  reason: invalid class name and case insensitive filesystem */
public final class C04610Eq implements Runnable {
    public final /* synthetic */ AnonymousClass0Bb A00;
    public final /* synthetic */ C09080aa A01;

    public C04610Eq(C09080aa r1, AnonymousClass0Bb r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public final void run() {
        AnonymousClass0aY r2 = AnonymousClass0aY.A05;
        if (r2 == null) {
            AnonymousClass0Bb r22 = this.A00;
            AnonymousClass0DB.A0K("lacrima", "Soft error detector missing: %s %s", r22.A01, r22.A02);
            return;
        }
        AnonymousClass0Bb r1 = this.A00;
        r2.A00(r1.A01, r1.A02, (long) r1.A00, r1.A03, r1.A04, this.A01.A01);
    }
}
