package p000X;

import android.view.View;
import com.facebook.forker.Process;

/* renamed from: X.1Yi  reason: invalid class name and case insensitive filesystem */
public final class C31471Yi {
    public C31491Yk A00;
    public boolean A01;
    public int A02;
    public int A03;
    public boolean A04;

    public final void A00() {
        this.A03 = -1;
        this.A02 = Process.WAIT_RESULT_TIMEOUT;
        this.A04 = false;
        this.A01 = false;
    }

    public final void A01() {
        int A06;
        if (this.A04) {
            A06 = this.A00.A02();
        } else {
            A06 = this.A00.A06();
        }
        this.A02 = A06;
    }

    public final void A02(View view, int i) {
        int A07;
        if (this.A04) {
            int A08 = this.A00.A08(view);
            C31491Yk r2 = this.A00;
            if (Integer.MIN_VALUE == r2.A00) {
                A07 = 0;
            } else {
                A07 = r2.A07() - r2.A00;
            }
            this.A02 = A08 + A07;
        } else {
            this.A02 = this.A00.A0B(view);
        }
        this.A03 = i;
    }

    public final void A03(View view, int i) {
        int A07;
        C31491Yk r3 = this.A00;
        if (Integer.MIN_VALUE == r3.A00) {
            A07 = 0;
        } else {
            A07 = r3.A07() - r3.A00;
        }
        if (A07 >= 0) {
            A02(view, i);
            return;
        }
        this.A03 = i;
        if (this.A04) {
            int A022 = (this.A00.A02() - A07) - this.A00.A08(view);
            this.A02 = this.A00.A02() - A022;
            if (A022 > 0) {
                int A09 = this.A02 - this.A00.A09(view);
                int A06 = this.A00.A06();
                int min = A09 - (A06 + Math.min(this.A00.A0B(view) - A06, 0));
                if (min < 0) {
                    this.A02 += Math.min(A022, -min);
                    return;
                }
                return;
            }
            return;
        }
        int A0B = this.A00.A0B(view);
        int A062 = A0B - this.A00.A06();
        this.A02 = A0B;
        if (A062 > 0) {
            int A023 = (this.A00.A02() - Math.min(0, (this.A00.A02() - A07) - this.A00.A08(view))) - (A0B + this.A00.A09(view));
            if (A023 < 0) {
                this.A02 -= Math.min(A062, -A023);
            }
        }
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.A03 + ", mCoordinate=" + this.A02 + ", mLayoutFromEnd=" + this.A04 + ", mValid=" + this.A01 + '}';
    }

    public C31471Yi() {
        A00();
    }
}
