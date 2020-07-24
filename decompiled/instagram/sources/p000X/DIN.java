package p000X;

import java.nio.ByteBuffer;

/* renamed from: X.DIN */
public final class DIN extends DIS {
    public int[] A00;
    public int[] A01;

    public final void BYp(ByteBuffer byteBuffer) {
        int[] iArr = this.A00;
        D6U.A01(iArr);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer A04 = A04(((limit - position) / this.A00.A00) * this.A06.A00);
        while (position < limit) {
            for (int i : iArr) {
                A04.putShort(byteBuffer.getShort((i << 1) + position));
            }
            position += this.A00.A00;
        }
        byteBuffer.position(limit);
        A04.flip();
    }
}
