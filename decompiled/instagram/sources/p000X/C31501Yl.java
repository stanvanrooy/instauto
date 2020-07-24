package p000X;

import android.graphics.Rect;
import android.view.View;

/* renamed from: X.1Yl  reason: invalid class name and case insensitive filesystem */
public final class C31501Yl extends C31491Yk {
    public final int A01() {
        return this.A02.A06;
    }

    public final int A02() {
        C31391Ya r0 = this.A02;
        return r0.A06 - r0.A0Q();
    }

    public final int A03() {
        return this.A02.A0Q();
    }

    public final int A04() {
        return this.A02.A07;
    }

    public final int A05() {
        return this.A02.A04;
    }

    public final int A06() {
        return this.A02.A0P();
    }

    public final int A07() {
        C31391Ya r0 = this.A02;
        return (r0.A06 - r0.A0P()) - this.A02.A0Q();
    }

    public final int A0C(View view) {
        this.A02.A0k(view, this.A01);
        return this.A01.right;
    }

    public final int A0D(View view) {
        this.A02.A0k(view, this.A01);
        return this.A01.left;
    }

    public final void A0E(int i) {
        this.A02.A1I(i);
    }

    public final int A08(View view) {
        return this.A02.A0X(view) + ((AnonymousClass1ZN) view.getLayoutParams()).rightMargin;
    }

    public final int A09(View view) {
        AnonymousClass1ZN r3 = (AnonymousClass1ZN) view.getLayoutParams();
        Rect rect = ((AnonymousClass1ZN) view.getLayoutParams()).A03;
        return view.getMeasuredWidth() + rect.left + rect.right + r3.leftMargin + r3.rightMargin;
    }

    public final int A0A(View view) {
        AnonymousClass1ZN r2 = (AnonymousClass1ZN) view.getLayoutParams();
        return C31391Ya.A0F(view) + r2.topMargin + r2.bottomMargin;
    }

    public final int A0B(View view) {
        return this.A02.A0W(view) - ((AnonymousClass1ZN) view.getLayoutParams()).leftMargin;
    }

    public C31501Yl(C31391Ya r1) {
        super(r1);
    }
}
