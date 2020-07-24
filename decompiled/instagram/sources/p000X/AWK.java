package p000X;

/* renamed from: X.AWK */
public final class AWK extends C17920r1 {
    public final /* synthetic */ C62322nS A00;
    public final /* synthetic */ AWN A01;

    public AWK(C62322nS r1, AWN awn) {
        this.A00 = r1;
        this.A01 = awn;
    }

    public final void onFail(C43791v5 r5) {
        int A03 = AnonymousClass0Z0.A03(1826333243);
        if (r5.A02()) {
            Throwable th = r5.A01;
            if (th instanceof Exception) {
                AWN.A01(this.A01, (Exception) th);
                AnonymousClass0Z0.A0A(249429179, A03);
            }
        }
        AWN.A01(this.A01, new RuntimeException("confirmVideoCallEvent api failure"));
        AnonymousClass0Z0.A0A(249429179, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0Z0.A03(-1498496380);
        int A032 = AnonymousClass0Z0.A03(1669449525);
        AWN.A00(this.A01);
        AnonymousClass0Z0.A0A(2034346165, A032);
        AnonymousClass0Z0.A0A(2122355304, A03);
    }
}
