package p000X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.0mI  reason: invalid class name and case insensitive filesystem */
public class C15080mI {
    public int A00;
    public ByteBuffer A01;

    public final int A00(int i) {
        int i2 = this.A00;
        int i3 = i2 - this.A01.getInt(i2);
        if (i < this.A01.getShort(i3)) {
            return this.A01.getShort(i3 + i);
        }
        return 0;
    }

    public final int A01(int i) {
        int i2 = i + this.A00;
        return this.A01.getInt(i2 + this.A01.getInt(i2));
    }

    public final String A02(int i) {
        int i2 = i + this.A01.getInt(i);
        if (this.A01.hasArray()) {
            return new String(this.A01.array(), this.A01.arrayOffset() + i2 + 4, this.A01.getInt(i2), AnonymousClass191.A0A);
        }
        ByteBuffer order = this.A01.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        int i3 = order.getInt(i2);
        byte[] bArr = new byte[i3];
        order.position(i2 + 4);
        order.get(bArr);
        return new String(bArr, 0, i3, AnonymousClass191.A0A);
    }
}
