package p000X;

import android.widget.Adapter;
import com.facebook.forker.Process;

/* renamed from: X.1Ql  reason: invalid class name and case insensitive filesystem */
public abstract class C29581Ql {
    public int A00 = Process.WAIT_RESULT_TIMEOUT;
    public int A01 = Integer.MAX_VALUE;
    public final int A02;

    public abstract void A03(Adapter adapter, int i);

    public static final Object A00(Adapter adapter, int i) {
        if (i < 0 || i >= adapter.getCount()) {
            return null;
        }
        return adapter.getItem(i);
    }

    public void A02(Adapter adapter, int i) {
        int i2;
        this.A00 = Process.WAIT_RESULT_TIMEOUT;
        boolean z = true;
        int i3 = 0;
        int i4 = 0;
        while (i3 < this.A02 && (i2 = i - i4) >= 0) {
            boolean z2 = true;
            if (A00(adapter, i2) == A00(adapter, i2 + 1)) {
                z2 = false;
            }
            if (z2) {
                i3++;
            }
            i4++;
        }
        int i5 = i - i4;
        for (int min = Math.min(i, this.A01) - 1; min >= i5; min--) {
            if (!z) {
                boolean z3 = true;
                if (A00(adapter, min) == A00(adapter, min + 1)) {
                    z3 = false;
                }
                if (!z3) {
                }
            }
            if (min >= 0 && min < adapter.getCount()) {
                A03(adapter, min);
            }
            z = false;
        }
        this.A01 = i5;
    }

    public C29581Ql(int i) {
        this.A02 = i;
    }

    public void A01(Adapter adapter, int i) {
        int i2;
        this.A01 = Integer.MAX_VALUE;
        boolean z = true;
        int i3 = 0;
        int i4 = 0;
        while (i3 < this.A02 && (i2 = i + i4) < adapter.getCount()) {
            boolean z2 = true;
            if (A00(adapter, i2) == A00(adapter, i2 - 1)) {
                z2 = false;
            }
            if (z2) {
                i3++;
            }
            i4++;
        }
        int i5 = i + i4;
        for (int max = Math.max(i, this.A00) + 1; max <= i5; max++) {
            if (!z) {
                boolean z3 = true;
                if (A00(adapter, max) == A00(adapter, max - 1)) {
                    z3 = false;
                }
                if (!z3) {
                }
            }
            if (max >= 0 && max < adapter.getCount()) {
                A03(adapter, max);
            }
            z = false;
        }
        this.A00 = i5;
    }
}
