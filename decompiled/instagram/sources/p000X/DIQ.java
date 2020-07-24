package p000X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* renamed from: X.DIQ */
public final class DIQ implements DIV {
    public float A00 = 1.0f;
    public float A01 = 1.0f;
    public long A02;
    public long A03;
    public DIU A04;
    public DIU A05;
    public boolean A06;
    public DIU A07;
    public DIU A08;
    public DIR A09;
    public ByteBuffer A0A;
    public ByteBuffer A0B;
    public ShortBuffer A0C;
    public boolean A0D;

    public final DIU A9H(DIU diu) {
        if (diu.A02 == 2) {
            int i = diu.A03;
            this.A07 = diu;
            DIU diu2 = new DIU(i, diu.A01, 2);
            this.A08 = diu2;
            this.A06 = true;
            return diu2;
        }
        throw new DIZ(diu);
    }

    public final ByteBuffer ARL() {
        ByteBuffer byteBuffer = this.A0B;
        this.A0B = DIV.A00;
        return byteBuffer;
    }

    public final boolean Ae3() {
        int i = this.A08.A03;
        if (i == -1) {
            return false;
        }
        if (Math.abs(this.A01 - 1.0f) >= 0.01f || Math.abs(this.A00 - 1.0f) >= 0.01f || i != this.A07.A03) {
            return true;
        }
        return false;
    }

    public final boolean AfJ() {
        if (!this.A0D) {
            return false;
        }
        DIR dir = this.A09;
        if (dir == null || ((dir.A05 * dir.A0G) << 1) == 0) {
            return true;
        }
        return false;
    }

    public final void BYo() {
        int i;
        DIR dir = this.A09;
        if (dir != null) {
            int i2 = dir.A00;
            float f = dir.A0F;
            float f2 = dir.A0D;
            int i3 = dir.A05 + ((int) ((((((float) i2) / (f / f2)) + ((float) dir.A06)) / (dir.A0E * f2)) + 0.5f));
            short[] A042 = DIR.A04(dir, dir.A0A, i2, (dir.A0J << 1) + i2);
            dir.A0A = A042;
            int i4 = 0;
            while (true) {
                i = dir.A0J << 1;
                int i5 = dir.A0G;
                if (i4 >= i * i5) {
                    break;
                }
                A042[(i5 * i2) + i4] = 0;
                i4++;
            }
            dir.A00 += i;
            DIR.A01(dir);
            if (dir.A05 > i3) {
                dir.A05 = i3;
            }
            dir.A00 = 0;
            dir.A09 = 0;
            dir.A06 = 0;
        }
        this.A0D = true;
    }

    public final void BYp(ByteBuffer byteBuffer) {
        DIR dir = this.A09;
        D6U.A01(dir);
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.A02 += (long) remaining;
            int remaining2 = asShortBuffer.remaining();
            int i = dir.A0G;
            int i2 = remaining2 / i;
            short[] A042 = DIR.A04(dir, dir.A0A, dir.A00, i2);
            dir.A0A = A042;
            asShortBuffer.get(A042, dir.A00 * dir.A0G, ((i * i2) << 1) >> 1);
            dir.A00 += i2;
            DIR.A01(dir);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int i3 = (dir.A05 * dir.A0G) << 1;
        if (i3 > 0) {
            if (this.A0A.capacity() < i3) {
                ByteBuffer order = ByteBuffer.allocateDirect(i3).order(ByteOrder.nativeOrder());
                this.A0A = order;
                this.A0C = order.asShortBuffer();
            } else {
                this.A0A.clear();
                this.A0C.clear();
            }
            ShortBuffer shortBuffer = this.A0C;
            int remaining3 = shortBuffer.remaining();
            int i4 = dir.A0G;
            int min = Math.min(remaining3 / i4, dir.A05);
            shortBuffer.put(dir.A0B, 0, i4 * min);
            int i5 = dir.A05 - min;
            dir.A05 = i5;
            short[] sArr = dir.A0B;
            int i6 = dir.A0G;
            System.arraycopy(sArr, min * i6, sArr, 0, i5 * i6);
            this.A03 += (long) i3;
            this.A0A.limit(i3);
            this.A0B = this.A0A;
        }
    }

    public DIQ() {
        DIU diu = DIU.A04;
        this.A07 = diu;
        this.A08 = diu;
        this.A04 = diu;
        this.A05 = diu;
        ByteBuffer byteBuffer = DIV.A00;
        this.A0A = byteBuffer;
        this.A0C = byteBuffer.asShortBuffer();
        this.A0B = DIV.A00;
    }

    public final void flush() {
        if (Ae3()) {
            DIU diu = this.A07;
            this.A04 = diu;
            DIU diu2 = this.A08;
            this.A05 = diu2;
            if (this.A06) {
                this.A09 = new DIR(diu.A03, diu.A01, this.A01, this.A00, diu2.A03);
            } else {
                DIR dir = this.A09;
                if (dir != null) {
                    dir.A00 = 0;
                    dir.A05 = 0;
                    dir.A06 = 0;
                    dir.A04 = 0;
                    dir.A03 = 0;
                    dir.A09 = 0;
                    dir.A08 = 0;
                    dir.A07 = 0;
                    dir.A02 = 0;
                    dir.A01 = 0;
                }
            }
        }
        this.A0B = DIV.A00;
        this.A02 = 0;
        this.A03 = 0;
        this.A0D = false;
    }
}
