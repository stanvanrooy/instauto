package p000X;

/* renamed from: X.BY7 */
public final class BY7 extends C17920r1 {
    public final /* synthetic */ COS A00;
    public final /* synthetic */ BY6 A01;
    public final /* synthetic */ C13300iJ A02;

    public BY7(BY6 by6, C13300iJ r2, COS cos) {
        this.A01 = by6;
        this.A02 = r2;
        this.A00 = cos;
    }

    public final void onFail(C43791v5 r6) {
        Throwable th;
        int A03 = AnonymousClass0Z0.A03(-181516596);
        BY8 by8 = this.A01.A01;
        if (r6.A02()) {
            th = r6.A01;
        } else {
            th = null;
        }
        by8.B3q(th, this.A02, this.A00);
        AnonymousClass0Z0.A0A(2036503489, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0Z0.A03(-1688568407);
        int A032 = AnonymousClass0Z0.A03(-1536127868);
        this.A01.A01.BPg(this.A02, this.A00);
        AnonymousClass0Z0.A0A(189345514, A032);
        AnonymousClass0Z0.A0A(577458655, A03);
    }
}
