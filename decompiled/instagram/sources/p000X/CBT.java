package p000X;

/* renamed from: X.CBT */
public final class CBT extends C17920r1 {
    public final /* synthetic */ C28070Cau A00;

    public CBT(C28070Cau cau) {
        this.A00 = cau;
    }

    public final void onFinish() {
        int A03 = AnonymousClass0Z0.A03(-1174688310);
        super.onFinish();
        this.A00.A00 = null;
        AnonymousClass0Z0.A0A(-1484261329, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0Z0.A03(1425409629);
        super.onStart();
        C12600h4 A002 = C12600h4.A00();
        C12600h4.A02(A002, "STORIES_REQUEST_START");
        AnonymousClass0h8 r1 = A002.A00;
        if (r1 != null) {
            r1.A08 = true;
        }
        AnonymousClass0Z0.A0A(381058070, A03);
    }

    public final void onSuccessInBackground(Object obj) {
        int A03 = AnonymousClass0Z0.A03(-1481038311);
        C12600h4.A02(C12600h4.A00(), "STORIES_REQUEST_END");
        AnonymousClass0Z0.A0A(1277385213, A03);
    }
}
