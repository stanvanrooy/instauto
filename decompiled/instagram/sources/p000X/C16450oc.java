package p000X;

/* renamed from: X.0oc  reason: invalid class name and case insensitive filesystem */
public final class C16450oc implements C14250k8 {
    public final AnonymousClass0k1 A00;
    public final C14250k8 A01;
    public final C16470oe A02 = new C16470oe(this);

    public final C26211Cc startRequest(AnonymousClass1C4 r7, C256019m r8, AnonymousClass1CB r9) {
        AnonymousClass0k1 r0;
        C15920nk r1;
        C26141Bv r02 = r7.A02;
        if (r02 != null) {
            long contentLength = r02.getContentLength();
            if (contentLength > 20480) {
                String path = r7.A04.getPath();
                if (path.equals("/api/v1/upload/photo/")) {
                    r0 = this.A00;
                    r1 = C15920nk.Image;
                } else if (path.contains("/rupload_igvideo/")) {
                    r0 = this.A00;
                    r1 = C15920nk.Video;
                }
                r0.A00(r1, r8.A00(), 0, contentLength);
            }
        }
        r9.A04(this.A02);
        return this.A01.startRequest(r7, r8, r9);
    }

    public C16450oc(AnonymousClass0k1 r2, C14250k8 r3) {
        this.A00 = r2;
        this.A01 = r3;
    }
}
