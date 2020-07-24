package p000X;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.A8Z */
public final class A8Z implements A8o, A5P {
    public int A00;
    public int A01;
    public long A02 = Long.MIN_VALUE;
    public A8o A03;
    public boolean A04;
    public final AnonymousClass2D9 A05;
    public final A9A A06;
    public final C23167AAv A07;
    public final A9S A08;
    public final A8M A09;
    public final List A0A;

    public final A8o AI3(int i) {
        A8o a8o = this.A03;
        if (a8o != null) {
            return a8o.AI3(i);
        }
        return (A8o) this.A0A.get(i);
    }

    public final int AIB() {
        A8o a8o = this.A03;
        if (a8o != null) {
            return a8o.AIB();
        }
        return this.A0A.size();
    }

    public final int AMs() {
        if (this.A04) {
            return this.A00;
        }
        return View.MeasureSpec.makeMeasureSpec((int) this.A09.getLayoutHeight(), C25913Bc3.MAX_SIGNED_POWER_OF_TWO);
    }

    public final Object AOn() {
        A8o a8o = this.A03;
        if (a8o != null) {
            return a8o.AOn();
        }
        return this.A09;
    }

    public final int ARS() {
        A8o a8o = this.A03;
        if (a8o != null) {
            return a8o.ARS();
        }
        return A8Y.A00(this.A09.getLayoutPadding(C23126A8e.BOTTOM));
    }

    public final int ART() {
        A8o a8o = this.A03;
        if (a8o != null) {
            return a8o.ART();
        }
        return A8Y.A00(this.A09.getLayoutPadding(C23126A8e.LEFT));
    }

    public final int ARU() {
        A8o a8o = this.A03;
        if (a8o != null) {
            return a8o.ARU();
        }
        return A8Y.A00(this.A09.getLayoutPadding(C23126A8e.RIGHT));
    }

    public final int ARV() {
        A8o a8o = this.A03;
        if (a8o != null) {
            return a8o.ARV();
        }
        return A8Y.A00(this.A09.getLayoutPadding(C23126A8e.TOP));
    }

    public final C23167AAv AU8() {
        A8o a8o = this.A03;
        if (a8o != null) {
            return a8o.AU8();
        }
        return this.A07;
    }

    public final int Aak() {
        if (this.A04) {
            return this.A01;
        }
        return View.MeasureSpec.makeMeasureSpec((int) this.A09.getLayoutWidth(), C25913Bc3.MAX_SIGNED_POWER_OF_TWO);
    }

    public final int Aau(int i) {
        A8o a8o = this.A03;
        if (a8o != null) {
            return a8o.Aau(i);
        }
        return (int) this.A09.getChildAt(i).getLayoutX();
    }

    public final int Aay(int i) {
        A8o a8o = this.A03;
        if (a8o != null) {
            return a8o.Aay(i);
        }
        return (int) this.A09.getChildAt(i).getLayoutY();
    }

    public final int getHeight() {
        A8o a8o = this.A03;
        if (a8o == null) {
            return (int) this.A09.getLayoutHeight();
        }
        int height = a8o.getHeight();
        A8M a8m = this.A09;
        return height + A8Y.A00(a8m.getLayoutPadding(C23126A8e.TOP)) + A8Y.A00(a8m.getLayoutPadding(C23126A8e.BOTTOM));
    }

    public final int getWidth() {
        A8o a8o = this.A03;
        if (a8o == null) {
            return (int) this.A09.getLayoutWidth();
        }
        int width = a8o.getWidth();
        A8M a8m = this.A09;
        return width + A8Y.A00(a8m.getLayoutPadding(C23126A8e.LEFT)) + A8Y.A00(a8m.getLayoutPadding(C23126A8e.RIGHT));
    }

    public A8Z(A9A a9a, AnonymousClass2D9 r4, A8M a8m, A9S a9s, C23167AAv aAv) {
        this.A05 = r4;
        this.A07 = aAv;
        this.A09 = a8m;
        this.A06 = a9a;
        this.A0A = new ArrayList();
        this.A04 = false;
        this.A08 = a9s;
    }

    public final long Ap5(A8M a8m, float f, C230049z6 r7, float f2, C230049z6 r9) {
        int A012 = A8Y.A01(f, r7);
        int A013 = A8Y.A01(f2, r9);
        A9S a9s = this.A08;
        A8o A022 = a9s.A00.A02(this.A06, A012, A013);
        this.A03 = A022;
        long A002 = A0c.A00((float) A022.getWidth(), (float) A022.getHeight());
        this.A02 = A002;
        return A002;
    }
}
