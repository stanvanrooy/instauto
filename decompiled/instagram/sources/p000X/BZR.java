package p000X;

import com.facebook.common.dextricks.DexStore;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: X.BZR */
public final class BZR extends OutputStream {
    public static final byte[] A04 = new byte[0];
    public int A00;
    public byte[] A01;
    public int A02;
    public final LinkedList A03 = new LinkedList();

    public final void A01() {
        this.A02 = 0;
        this.A00 = 0;
        if (!this.A03.isEmpty()) {
            this.A03.clear();
        }
    }

    public final void close() {
    }

    public final void flush() {
    }

    public static void A00(BZR bzr) {
        int i = bzr.A02;
        byte[] bArr = bzr.A01;
        int length = i + bArr.length;
        bzr.A02 = length;
        int max = Math.max(length >> 1, 1000);
        if (max > 262144) {
            max = DexStore.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED;
        }
        bzr.A03.add(bArr);
        bzr.A01 = new byte[max];
        bzr.A00 = 0;
    }

    public final void A02(int i) {
        if (this.A00 >= this.A01.length) {
            A00(this);
        }
        byte[] bArr = this.A01;
        int i2 = this.A00;
        this.A00 = i2 + 1;
        bArr[i2] = (byte) i;
    }

    public final void A03(int i) {
        int i2 = this.A00;
        int i3 = i2 + 2;
        byte[] bArr = this.A01;
        if (i3 < bArr.length) {
            int i4 = i2 + 1;
            this.A00 = i4;
            bArr[i2] = (byte) (i >> 16);
            int i5 = i4 + 1;
            this.A00 = i5;
            bArr[i4] = (byte) (i >> 8);
            this.A00 = i5 + 1;
            bArr[i5] = (byte) i;
            return;
        }
        A02(i >> 16);
        A02(i >> 8);
        A02(i);
    }

    public final void A04(int i) {
        int i2 = this.A00;
        int i3 = i2 + 1;
        byte[] bArr = this.A01;
        if (i3 < bArr.length) {
            this.A00 = i3;
            bArr[i2] = (byte) (i >> 8);
            this.A00 = i3 + 1;
            bArr[i3] = (byte) i;
            return;
        }
        A02(i >> 8);
        A02(i);
    }

    public final byte[] A05() {
        int i = this.A02 + this.A00;
        if (i == 0) {
            return A04;
        }
        byte[] bArr = new byte[i];
        Iterator it = this.A03.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i2, length);
            i2 += length;
        }
        System.arraycopy(this.A01, 0, bArr, i2, this.A00);
        int i3 = i2 + this.A00;
        if (i3 == i) {
            if (!this.A03.isEmpty()) {
                A01();
            }
            return bArr;
        }
        throw new RuntimeException(AnonymousClass000.A08("Internal error: total len assumed to be ", i, ", copied ", i3, " bytes"));
    }

    public BZR(int i) {
        this.A01 = new byte[i];
    }

    public final void write(int i) {
        A02(i);
    }

    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public final void write(byte[] bArr, int i, int i2) {
        while (true) {
            byte[] bArr2 = this.A01;
            int length = bArr2.length;
            int i3 = this.A00;
            int min = Math.min(length - i3, i2);
            if (min > 0) {
                System.arraycopy(bArr, i, bArr2, i3, min);
                i += min;
                this.A00 += min;
                i2 -= min;
            }
            if (i2 > 0) {
                A00(this);
            } else {
                return;
            }
        }
    }
}
