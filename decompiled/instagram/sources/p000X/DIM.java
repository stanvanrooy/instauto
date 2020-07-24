package p000X;

import java.nio.ByteBuffer;

/* renamed from: X.DIM */
public final class DIM extends DIS {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public boolean A05;
    public byte[] A06 = C25948Bd0.A05;

    public final ByteBuffer ARL() {
        int i;
        if (super.AfJ() && (i = this.A00) > 0) {
            ByteBuffer A042 = A04(i);
            A042.put(this.A06, 0, this.A00);
            A042.flip();
            this.A00 = 0;
        }
        return super.ARL();
    }

    public final boolean AfJ() {
        if (!super.AfJ() || this.A00 != 0) {
            return false;
        }
        return true;
    }

    public final void BYp(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i != 0) {
            int i2 = this.A01;
            int min = Math.min(i, i2);
            this.A04 += (long) (min / this.A00.A00);
            this.A01 = i2 - min;
            byteBuffer.position(position + min);
            if (this.A01 <= 0) {
                int i3 = i - min;
                int length = (this.A00 + i3) - this.A06.length;
                ByteBuffer A042 = A04(length);
                int max = Math.max(0, Math.min(length, this.A00));
                A042.put(this.A06, 0, max);
                int max2 = Math.max(0, Math.min(length - max, i3));
                byteBuffer.limit(byteBuffer.position() + max2);
                A042.put(byteBuffer);
                byteBuffer.limit(limit);
                int i4 = i3 - max2;
                int i5 = this.A00 - max;
                this.A00 = i5;
                byte[] bArr = this.A06;
                System.arraycopy(bArr, max, bArr, 0, i5);
                byteBuffer.get(this.A06, this.A00, i4);
                this.A00 += i4;
                A042.flip();
            }
        }
    }
}
