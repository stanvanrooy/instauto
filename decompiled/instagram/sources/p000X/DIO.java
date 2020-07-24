package p000X;

import java.nio.ByteBuffer;

/* renamed from: X.DIO */
public final class DIO extends DIS {
    public final void BYp(ByteBuffer byteBuffer) {
        int i;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        int i3 = this.A00.A02;
        if (i3 != Integer.MIN_VALUE) {
            if (i3 != 3) {
                if (i3 == 1073741824) {
                    i = i2 >> 1;
                }
                throw new IllegalStateException();
            }
            i = i2 << 1;
        } else {
            i2 /= 3;
            i = i2 << 1;
        }
        ByteBuffer A04 = A04(i);
        int i4 = this.A00.A02;
        if (i4 == Integer.MIN_VALUE) {
            while (position < limit) {
                A04.put(byteBuffer.get(position + 1));
                A04.put(byteBuffer.get(position + 2));
                position += 3;
            }
        } else if (i4 != 3) {
            if (i4 == 1073741824) {
                while (position < limit) {
                    A04.put(byteBuffer.get(position + 2));
                    A04.put(byteBuffer.get(position + 3));
                    position += 4;
                }
            }
            throw new IllegalStateException();
        } else {
            while (position < limit) {
                A04.put((byte) 0);
                A04.put((byte) ((byteBuffer.get(position) & 255) - 128));
                position++;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        A04.flip();
    }
}
