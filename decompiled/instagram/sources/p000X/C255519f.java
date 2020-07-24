package p000X;

/* renamed from: X.19f  reason: invalid class name and case insensitive filesystem */
public final class C255519f {
    public static int A00;
    public static boolean A01;

    public static void A00(C06590Pq r2, boolean z, long j) {
        C90703wM r22 = new C90703wM(AnonymousClass0QT.A00(r2, (AnonymousClass0RN) null).A02("emoji_support_font_download"));
        r22.A06("emoji_infra", Integer.valueOf(A00));
        r22.A04("font_download_success", Boolean.valueOf(z));
        if (z) {
            r22.A07("result_time", Long.valueOf(j));
        }
        r22.A01();
    }
}
