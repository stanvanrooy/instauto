package p000X;

import java.nio.ByteBuffer;

/* renamed from: X.DIL */
public final class DIL extends DIS {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public boolean A05;
    public boolean A06;
    public byte[] A07;
    public byte[] A08;

    public DIL() {
        byte[] bArr = C25948Bd0.A05;
        this.A07 = bArr;
        this.A08 = bArr;
    }

    private int A00(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position() + 1; position < byteBuffer.limit(); position += 2) {
            if (Math.abs(byteBuffer.get(position)) > 4) {
                int i = this.A00;
                return i * (position / i);
            }
        }
        return byteBuffer.limit();
    }

    public static void A01(DIL dil, byte[] bArr, int i) {
        ByteBuffer A042 = dil.A04(i);
        A042.put(bArr, 0, i);
        A042.flip();
        if (i > 0) {
            dil.A06 = true;
        }
    }

    private void A02(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int remaining = byteBuffer.remaining();
        int i2 = this.A02;
        int min = Math.min(remaining, i2);
        int i3 = i2 - min;
        System.arraycopy(bArr, i - i3, this.A08, 0, i3);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.A08, i3, min);
    }

    public final void BYp(ByteBuffer byteBuffer) {
        int position;
        long j;
        long j2;
        while (byteBuffer.hasRemaining() && !this.A01.hasRemaining()) {
            int i = this.A03;
            if (i == 0) {
                int limit = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.A07.length));
                int limit2 = byteBuffer.limit() - 1;
                while (true) {
                    if (limit2 < byteBuffer.position()) {
                        position = byteBuffer.position();
                        break;
                    } else if (Math.abs(byteBuffer.get(limit2)) > 4) {
                        int i2 = this.A00;
                        position = ((limit2 / i2) * i2) + i2;
                        break;
                    } else {
                        limit2 -= 2;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.A03 = 1;
                } else {
                    byteBuffer.limit(position);
                    int remaining = byteBuffer.remaining();
                    ByteBuffer A042 = A04(remaining);
                    A042.put(byteBuffer);
                    A042.flip();
                    if (remaining > 0) {
                        this.A06 = true;
                    }
                }
                byteBuffer.limit(limit);
            } else if (i == 1) {
                int limit3 = byteBuffer.limit();
                int A002 = A00(byteBuffer);
                int position2 = A002 - byteBuffer.position();
                byte[] bArr = this.A07;
                int length = bArr.length;
                int i3 = this.A01;
                int i4 = length - i3;
                if (A002 >= limit3 || position2 >= i4) {
                    int min = Math.min(position2, i4);
                    byteBuffer.limit(byteBuffer.position() + min);
                    byteBuffer.get(this.A07, this.A01, min);
                    int i5 = this.A01 + min;
                    this.A01 = i5;
                    byte[] bArr2 = this.A07;
                    if (i5 == bArr2.length) {
                        if (this.A06) {
                            A01(this, bArr2, this.A02);
                            j = this.A04;
                            j2 = (long) ((this.A01 - (this.A02 << 1)) / this.A00);
                        } else {
                            j = this.A04;
                            j2 = (long) ((i5 - this.A02) / this.A00);
                        }
                        this.A04 = j + j2;
                        A02(byteBuffer, this.A07, this.A01);
                        this.A01 = 0;
                        this.A03 = 2;
                    }
                    byteBuffer.limit(limit3);
                } else {
                    A01(this, bArr, i3);
                    this.A01 = 0;
                    this.A03 = 0;
                }
            } else if (i == 2) {
                int limit4 = byteBuffer.limit();
                int A003 = A00(byteBuffer);
                byteBuffer.limit(A003);
                this.A04 += (long) (byteBuffer.remaining() / this.A00);
                A02(byteBuffer, this.A08, this.A02);
                if (A003 < limit4) {
                    A01(this, this.A08, this.A02);
                    this.A03 = 0;
                    byteBuffer.limit(limit4);
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }
}
