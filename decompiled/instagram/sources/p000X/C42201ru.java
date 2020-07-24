package p000X;

/* renamed from: X.1ru  reason: invalid class name and case insensitive filesystem */
public final class C42201ru implements C17860qv {
    public C16230oG A00;
    public final /* synthetic */ AnonymousClass1H0 A01;

    public final String getName() {
        return "LocationPlugin";
    }

    public final int getRunnableId() {
        return 600;
    }

    public final void onStart() {
    }

    public C42201ru(AnonymousClass1H0 r1) {
        this.A01 = r1;
    }

    public final void onFinish() {
        AnonymousClass1H0 r2 = this.A01;
        if (r2.A02) {
            this.A00.setupPlaceSignatureCollection(r2.A00);
        }
        AnonymousClass1H0 r22 = this.A01;
        if (r22.A01) {
            this.A00.setupForegroundCollection(r22.A00);
        }
    }

    public final void run() {
        this.A00 = C16230oG.A00;
    }
}
