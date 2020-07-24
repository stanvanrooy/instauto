package p000X;

import com.facebook.react.uimanager.BaseViewManager;
import java.nio.ByteBuffer;

/* renamed from: X.DD9 */
public final class DD9 extends DDK implements C29869DEe {
    public final void ABR(ByteBuffer byteBuffer, int i) {
        int A00 = DD3.A00(byteBuffer, i, 0);
        if (A00 != 0) {
            byteBuffer.getInt(A00);
        }
        DDP ddp = (DDP) DD3.A02(byteBuffer, i, 1, DDP.class);
        if (ddp != null) {
            this.A03 = ddp;
            float f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            int A002 = DD3.A00(byteBuffer, i, 2);
            if (A002 != 0) {
                f = byteBuffer.getFloat(A002);
            }
            this.A01 = f;
            float f2 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            int A003 = DD3.A00(byteBuffer, i, 3);
            if (A003 != 0) {
                f2 = byteBuffer.getFloat(A003);
            }
            this.A00 = f2;
            C29846DDh dDh = (C29846DDh) DD3.A01(byteBuffer, i, 4, C29845DDg.class);
            if (dDh != null) {
                this.A02 = dDh;
                this.A04 = (C29877DEm[]) DD3.A08(byteBuffer, i, 5, DDI.class);
                return;
            }
            throw new IllegalArgumentException("root layer cannot be null");
        }
        throw new IllegalArgumentException("size cannot be null");
    }
}
