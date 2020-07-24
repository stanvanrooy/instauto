package p000X;

/* renamed from: X.BB1 */
public final class BB1 implements BBH {
    public final C06590Pq A00;

    public final void BOM(int i, BB0 bb0) {
        if (bb0.A03 == BAz.FACEBOOK_LITE) {
            AnonymousClass0P4 A002 = AnonymousClass0P4.A00("use_fb_lite_for_sso", C55982bj.A02);
            A002.A0G("sso_application", bb0.A04);
            boolean z = false;
            if (i > 0) {
                z = true;
            }
            A002.A0A("had_session", Boolean.valueOf(z));
            AnonymousClass0WN.A01(this.A00).BcG(A002);
        }
    }

    public BB1(C06590Pq r1) {
        this.A00 = r1;
    }
}
