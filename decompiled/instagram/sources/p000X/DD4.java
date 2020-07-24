package p000X;

import android.graphics.BitmapFactory;
import java.nio.ByteBuffer;

/* renamed from: X.DD4 */
public final class DD4 extends C29023Cqb implements C29869DEe {
    public final void ABR(ByteBuffer byteBuffer, int i) {
        DDP ddp = (DDP) DD3.A02(byteBuffer, i, 0, DDP.class);
        if (ddp != null) {
            this.A01 = ddp;
            byte[] A05 = DD3.A05(byteBuffer, i, 1);
            if (A05 != null) {
                this.A00 = BitmapFactory.decodeByteArray(A05, 0, A05.length);
                DD3.A04(byteBuffer, i, 2);
                return;
            }
            throw new IllegalArgumentException("bitmap content cannot be null");
        }
        throw new IllegalArgumentException("bitmap size cannot be null");
    }
}
