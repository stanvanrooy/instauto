package p000X;

import android.widget.Adapter;
import com.facebook.forker.Process;

/* renamed from: X.1Qk  reason: invalid class name and case insensitive filesystem */
public abstract class C29571Qk extends C29581Ql {
    public int A00 = Process.WAIT_RESULT_TIMEOUT;
    public int A01 = Integer.MAX_VALUE;
    public final int A02;

    public abstract boolean A04(Adapter adapter, int i);

    public final void A02(Adapter adapter, int i) {
        this.A00 = Process.WAIT_RESULT_TIMEOUT;
        int min = Math.min(i, this.A01);
        Object A002 = C29581Ql.A00(adapter, min);
        int i2 = i - 1;
        int i3 = 0;
        while (i3 < this.A02 && i2 >= 0) {
            if (i2 < adapter.getCount() && A04(adapter, i2) && A002 != C29581Ql.A00(adapter, i2)) {
                if (i2 < min) {
                    A03(adapter, i2);
                    A002 = C29581Ql.A00(adapter, i2);
                }
                this.A01 = i2;
                i3++;
            }
            i2--;
        }
    }

    public C29571Qk(int i) {
        super(i);
        this.A02 = i;
    }

    public final void A01(Adapter adapter, int i) {
        this.A01 = Integer.MAX_VALUE;
        int max = Math.max(i, this.A00);
        Object A002 = C29581Ql.A00(adapter, max);
        int i2 = i + 1;
        int i3 = 0;
        while (i3 < this.A02 && i2 < adapter.getCount()) {
            if (A04(adapter, i2) && A002 != C29581Ql.A00(adapter, i2)) {
                if (i2 > max) {
                    A03(adapter, i2);
                    A002 = adapter.getItem(i2);
                }
                this.A00 = i2;
                i3++;
            }
            i2++;
        }
    }
}
