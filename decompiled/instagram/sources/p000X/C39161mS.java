package p000X;

import android.view.View;

/* renamed from: X.1mS  reason: invalid class name and case insensitive filesystem */
public final class C39161mS implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass1VN A01;
    public final /* synthetic */ AnonymousClass1NJ A02;
    public final /* synthetic */ C36841ih A03;
    public final /* synthetic */ boolean A04;

    public C39161mS(AnonymousClass1VN r1, AnonymousClass1NJ r2, C36841ih r3, int i, boolean z) {
        this.A01 = r1;
        this.A02 = r2;
        this.A03 = r3;
        this.A00 = i;
        this.A04 = z;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(2034179531);
        AnonymousClass1NJ r4 = this.A02;
        if (C36971iu.A01(r4)) {
            this.A01.A00.BBm(r4, this.A03, this.A00);
        } else if (C36971iu.A02(r4)) {
            this.A01.A00.BMQ(r4, this.A03, this.A00);
        } else if (this.A04) {
            this.A01.A00.B5o(r4);
        } else {
            this.A01.A00.BMo(r4, this.A03, this.A00);
        }
        AnonymousClass0Z0.A0C(1480436578, A05);
    }
}
