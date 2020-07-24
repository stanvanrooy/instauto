package p000X;

import com.facebook.common.dextricks.DexStore;
import java.util.Arrays;

/* renamed from: X.D6Q */
public final class D6Q implements C29736D7a {
    public int A00 = 0;
    public D90[] A01 = new D90[100];
    public int A02;
    public int A03;
    public final int A04 = DexStore.LOAD_RESULT_PGO_ATTEMPTED;
    public final boolean A05 = true;
    public final D90[] A06 = new D90[1];

    public D6Q() {
        D6U.A02(true);
        D6U.A02(true);
    }

    public final synchronized int A00() {
        return this.A02 * this.A04;
    }

    public final synchronized void A01() {
        if (this.A05) {
            A02(0);
        }
    }

    public final synchronized void A02(int i) {
        boolean z = false;
        if (i < this.A03) {
            z = true;
        }
        this.A03 = i;
        if (z) {
            Brk();
        }
    }

    public final synchronized D90 A52() {
        D90 d90;
        this.A02++;
        int i = this.A00;
        if (i > 0) {
            D90[] d90Arr = this.A01;
            int i2 = i - 1;
            this.A00 = i2;
            d90 = d90Arr[i2];
            d90Arr[i2] = null;
        } else {
            d90 = new D90(new byte[this.A04]);
        }
        return d90;
    }

    public final synchronized void BaG(D90 d90) {
        D90[] d90Arr = this.A06;
        d90Arr[0] = d90;
        BaK(d90Arr);
    }

    public final synchronized void BaK(D90[] d90Arr) {
        boolean z;
        int i = this.A00;
        int i2 = i + r5;
        D90[] d90Arr2 = this.A01;
        int length = d90Arr2.length;
        if (i2 >= length) {
            this.A01 = (D90[]) Arrays.copyOf(d90Arr2, Math.max(length << 1, i2));
        }
        for (D90 d90 : d90Arr) {
            byte[] bArr = d90.A00;
            if (bArr != null) {
                z = false;
                if (bArr.length != this.A04) {
                    D6U.A02(z);
                    D90[] d90Arr3 = this.A01;
                    int i3 = this.A00;
                    this.A00 = i3 + 1;
                    d90Arr3[i3] = d90;
                }
            }
            z = true;
            D6U.A02(z);
            D90[] d90Arr32 = this.A01;
            int i32 = this.A00;
            this.A00 = i32 + 1;
            d90Arr32[i32] = d90;
        }
        this.A02 -= r5;
        notifyAll();
    }

    public final synchronized void Brk() {
        int i = this.A03;
        int i2 = this.A04;
        int max = Math.max(0, (((i + i2) - 1) / i2) - this.A02);
        int i3 = this.A00;
        if (max < i3) {
            Arrays.fill(this.A01, max, i3, (Object) null);
            this.A00 = max;
        }
    }

    public final int ANW() {
        return this.A04;
    }
}
