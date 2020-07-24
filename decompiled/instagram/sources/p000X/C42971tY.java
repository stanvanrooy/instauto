package p000X;

/* renamed from: X.1tY  reason: invalid class name and case insensitive filesystem */
public final class C42971tY implements C06570Po {
    public C13740j9 A00;
    public final AnonymousClass0C1 A01;

    public static C13740j9 A00(C42971tY r3) {
        if (r3.A00 == null) {
            r3.A00 = C13740j9.A00(AnonymousClass000.A0J(r3.A01.A04(), "_", "video_view"));
        }
        return r3.A00;
    }

    public final void onUserSessionWillEnd(boolean z) {
        C13740j9 r0 = this.A00;
        if (r0 != null) {
            r0.A08();
        }
    }

    public C42971tY(AnonymousClass0C1 r1) {
        this.A01 = r1;
    }
}
