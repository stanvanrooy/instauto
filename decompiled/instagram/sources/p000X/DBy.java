package p000X;

import java.nio.ByteBuffer;

/* renamed from: X.DBy */
public final class DBy {
    public int A00;
    public int A01;
    public final ByteBuffer A02;

    public final int A02() {
        int i = 0;
        while (A01() == 0) {
            i++;
        }
        if (i > 0) {
            return A03(i) + ((1 << i) - 1);
        }
        return 0;
    }

    public final int A03(int i) {
        boolean z = false;
        if (i < 32) {
            z = true;
        }
        AnonymousClass0a4.A09(z);
        if (this.A01 == -1) {
            return -1;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 << 1) | A01();
        }
        return i2;
    }

    public static int A00(DBy dBy) {
        byte b;
        int i = dBy.A01;
        boolean z = false;
        if (dBy.A02.position() < dBy.A02.limit()) {
            z = true;
        }
        if (z) {
            b = dBy.A02.get() & 255;
        } else {
            b = -1;
        }
        dBy.A01 = b;
        dBy.A00 = 0;
        return i;
    }

    public final int A01() {
        int i = this.A01;
        if (i == -1) {
            return -1;
        }
        int i2 = this.A00;
        int i3 = (i >> (7 - i2)) & 1;
        int i4 = i2 + 1;
        this.A00 = i4;
        if (i4 == 8) {
            A00(this);
        }
        return i3;
    }

    public DBy(ByteBuffer byteBuffer) {
        this.A02 = byteBuffer;
        byteBuffer.mark();
        A00(this);
    }
}
