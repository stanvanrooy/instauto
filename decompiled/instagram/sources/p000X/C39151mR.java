package p000X;

import android.view.View;

/* renamed from: X.1mR  reason: invalid class name and case insensitive filesystem */
public final class C39151mR implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C32351b1 A01;
    public final /* synthetic */ AnonymousClass1VN A02;
    public final /* synthetic */ AnonymousClass1NJ A03;
    public final /* synthetic */ C36841ih A04;
    public final /* synthetic */ boolean A05;

    public C39151mR(AnonymousClass1VN r1, boolean z, AnonymousClass1NJ r3, C36841ih r4, int i, C32351b1 r6) {
        this.A02 = r1;
        this.A05 = z;
        this.A03 = r3;
        this.A04 = r4;
        this.A00 = i;
        this.A01 = r6;
    }

    public final void onClick(View view) {
        int A052 = AnonymousClass0Z0.A05(-1798180452);
        if (this.A05) {
            this.A02.A00.B5o(this.A03);
        } else {
            this.A02.A00.AxG(this.A03, this.A04, this.A00, this.A01);
        }
        AnonymousClass0Z0.A0C(-1352389913, A052);
    }
}
