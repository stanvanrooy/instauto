package p000X;

import android.view.View;

/* renamed from: X.1mU  reason: invalid class name and case insensitive filesystem */
public final class C39181mU implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass1VN A01;
    public final /* synthetic */ AnonymousClass1NJ A02;
    public final /* synthetic */ C36841ih A03;
    public final /* synthetic */ boolean A04;

    public C39181mU(AnonymousClass1VN r1, boolean z, AnonymousClass1NJ r3, C36841ih r4, int i) {
        this.A01 = r1;
        this.A04 = z;
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = i;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(478352221);
        if (this.A04) {
            this.A01.A00.B5o(this.A02);
        } else {
            AnonymousClass1U1 r3 = this.A01.A00;
            r3.BKm(this.A02, this.A03, this.A00, r3);
        }
        AnonymousClass0Z0.A0C(304535789, A05);
    }
}
