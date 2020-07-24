package p000X;

import android.view.View;

/* renamed from: X.1mQ  reason: invalid class name and case insensitive filesystem */
public final class C39141mQ implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass1VN A01;
    public final /* synthetic */ AnonymousClass1NJ A02;
    public final /* synthetic */ C36841ih A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    public C39141mQ(AnonymousClass1VN r1, boolean z, AnonymousClass1NJ r3, C36841ih r4, int i, String str) {
        this.A01 = r1;
        this.A05 = z;
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = i;
        this.A04 = str;
    }

    public final void onClick(View view) {
        int A052 = AnonymousClass0Z0.A05(1832447155);
        if (this.A05) {
            this.A01.A00.B5o(this.A02);
        } else {
            this.A01.A00.B92(this.A02, this.A03, this.A00, this.A04, view);
        }
        AnonymousClass0Z0.A0C(-1219756105, A052);
    }
}
