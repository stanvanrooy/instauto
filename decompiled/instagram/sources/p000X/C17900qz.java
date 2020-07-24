package p000X;

/* renamed from: X.0qz  reason: invalid class name and case insensitive filesystem */
public final class C17900qz extends C17920r1 {
    public final /* synthetic */ C15630nH A00;

    public C17900qz(C15630nH r1) {
        this.A00 = r1;
    }

    public final void onStart() {
        int A03 = AnonymousClass0Z0.A03(1332922083);
        C12600h4 A002 = C12600h4.A00();
        C12600h4.A02(A002, "FEED_REQUEST_START");
        AnonymousClass0h8 r1 = A002.A00;
        if (r1 != null) {
            r1.A07 = true;
        }
        AnonymousClass0Z0.A0A(-1742674057, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = AnonymousClass0Z0.A03(-913388874);
        int A032 = AnonymousClass0Z0.A03(-96638809);
        C12600h4.A02(C12600h4.A00(), "FEED_REQUEST_END");
        AnonymousClass0Z0.A0A(-1424907064, A032);
        AnonymousClass0Z0.A0A(742809454, A03);
    }
}
