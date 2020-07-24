package p000X;

import java.nio.ByteBuffer;

/* renamed from: X.DDH */
public final class DDH extends C29877DEm implements C29868DEd {
    public final void ABR(ByteBuffer byteBuffer, int i) {
        int i2;
        String str;
        int A00 = DD7.A00(byteBuffer, i, 0);
        if (A00 != 0) {
            i2 = A00 + byteBuffer.getInt(A00);
        } else {
            i2 = 0;
        }
        if (i2 != 0) {
            str = DD7.A02(byteBuffer, i2);
        } else {
            str = null;
        }
        if (str != null) {
            int A002 = DD7.A00(byteBuffer, i, 1);
            if (A002 != 0) {
                byteBuffer.getFloat(A002);
            }
            int A003 = DD7.A00(byteBuffer, i, 2);
            if (A003 != 0) {
                byteBuffer.getFloat(A003);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("name cannot be null");
    }
}
