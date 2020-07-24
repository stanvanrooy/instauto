package p000X;

import android.graphics.BitmapFactory;
import java.nio.ByteBuffer;

/* renamed from: X.DD6 */
public final class DD6 extends C29023Cqb implements C29868DEd {
    public final void ABR(ByteBuffer byteBuffer, int i) {
        C29868DEd dEd;
        int i2;
        Class<DDQ> cls = DDQ.class;
        int A00 = DD7.A00(byteBuffer, i, 0);
        if (A00 != 0) {
            dEd = cls.newInstance();
            dEd.ABR(byteBuffer, A00);
        } else {
            dEd = null;
        }
        DDQ ddq = (DDQ) dEd;
        if (ddq != null) {
            this.A01 = ddq;
            byte[] A03 = DD7.A03(byteBuffer, i, 1);
            if (A03 != null) {
                this.A00 = BitmapFactory.decodeByteArray(A03, 0, A03.length);
                int A002 = DD7.A00(byteBuffer, i, 2);
                if (A002 != 0) {
                    i2 = A002 + byteBuffer.getInt(A002);
                } else {
                    i2 = 0;
                }
                if (i2 != 0) {
                    DD7.A02(byteBuffer, i2);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("bitmap content cannot be null");
        }
        throw new IllegalArgumentException("bitmap size cannot be null");
    }
}
