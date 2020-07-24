package p000X;

import com.facebook.react.uimanager.BaseViewManager;
import java.nio.ByteBuffer;

/* renamed from: X.DEB */
public final class DEB extends DEK implements C29868DEd {
    public final void ABR(ByteBuffer byteBuffer, int i) {
        float f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        int A00 = DD7.A00(byteBuffer, i, 0);
        if (A00 != 0) {
            f = byteBuffer.getFloat(A00);
        }
        this.A00 = f;
        float f2 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        int A002 = DD7.A00(byteBuffer, i, 1);
        if (A002 != 0) {
            f2 = byteBuffer.getFloat(A002);
        }
        this.A01 = f2;
    }
}
