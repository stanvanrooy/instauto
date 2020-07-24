package p000X;

/* renamed from: X.CBS */
public final class CBS extends C17920r1 {
    public final /* synthetic */ C28070Cau A00;

    public CBS(C28070Cau cau) {
        this.A00 = cau;
    }

    public final void onFinish() {
        int A03 = AnonymousClass0Z0.A03(361145707);
        super.onFinish();
        this.A00.A01 = null;
        AnonymousClass0Z0.A0A(1240684711, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0Z0.A03(280155319);
        super.onStart();
        C12600h4 A002 = C12600h4.A00();
        C12600h4.A02(A002, AnonymousClass0C5.$const$string(159));
        AnonymousClass0h8 r1 = A002.A00;
        if (r1 != null) {
            r1.A07 = true;
        }
        AnonymousClass0Z0.A0A(-1307845356, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = AnonymousClass0Z0.A03(2037209644);
        int A032 = AnonymousClass0Z0.A03(-86321752);
        super.onSuccessInBackground((C28661Mp) obj);
        C12600h4.A02(C12600h4.A00(), "FEED_REQUEST_END");
        AnonymousClass0Z0.A0A(-40548943, A032);
        AnonymousClass0Z0.A0A(-1121899967, A03);
    }
}
