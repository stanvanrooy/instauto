package p000X;

import java.nio.ByteBuffer;

/* renamed from: X.DBx */
public final class DBx {
    public byte A00;
    public int A01;
    public final ByteBuffer A02;

    public final void A03(int i) {
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= 15) {
                break;
            }
            int i5 = (1 << i3) + i4;
            if (i < i5) {
                i2 = i3;
                break;
            } else {
                i3++;
                i4 = i5;
            }
        }
        A04(i2, 0);
        A01(1);
        A04(i2, (long) (i - i4));
    }

    public final void A04(int i, long j) {
        for (int i2 = 0; i2 < i; i2++) {
            A01((int) ((j >> ((i - i2) - 1)) & 1));
        }
    }

    public final void A00() {
        if (this.A01 != 0) {
            this.A02.put(this.A00);
            this.A01 = 0;
            this.A00 = 0;
        }
    }

    public final void A01(int i) {
        byte b = this.A00;
        int i2 = this.A01;
        this.A00 = (byte) (((i & 1) << (7 - i2)) | b);
        int i3 = i2 + 1;
        this.A01 = i3;
        if (i3 == 8) {
            A00();
        }
    }

    public final void A02(int i) {
        if (this.A01 > 0) {
            A00();
        }
        this.A02.put(C2100493y.A00((long) i));
    }

    public DBx(int i) {
        this.A02 = ByteBuffer.allocateDirect(i);
    }

    public final void A05(ByteBuffer byteBuffer) {
        A00();
        ByteBuffer duplicate = byteBuffer.duplicate();
        while (duplicate.position() < duplicate.limit()) {
            A02(duplicate.get() & 255);
        }
    }
}
