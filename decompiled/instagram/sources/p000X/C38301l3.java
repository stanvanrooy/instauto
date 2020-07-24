package p000X;

import android.view.View;

/* renamed from: X.1l3  reason: invalid class name and case insensitive filesystem */
public abstract class C38301l3 implements View.OnClickListener {
    public boolean A00;
    public final C06590Pq A01;

    public C33071cK A00() {
        return null;
    }

    public abstract void A01(View view);

    public C38301l3(C06590Pq r1, boolean z) {
        this.A01 = r1;
        this.A00 = z;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(1813543926);
        if (this.A00) {
            C32991cC A002 = C32991cC.A00(this.A01);
            C33071cK A003 = A00();
            if (A003 != null) {
                A002.A00 = C33031cG.TAP;
                A002.A03(view, A003);
            } else {
                C32991cC A004 = C32991cC.A00(this.A01);
                A004.A00 = C33031cG.TAP;
                A004.A03(view, (C33071cK) null);
            }
        }
        A01(view);
        AnonymousClass0Z0.A0C(1514888217, A05);
    }
}
