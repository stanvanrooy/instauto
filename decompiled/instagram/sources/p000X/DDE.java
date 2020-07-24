package p000X;

import com.facebook.react.uimanager.BaseViewManager;
import java.nio.ByteBuffer;

/* renamed from: X.DDE */
public final class DDE extends DDD implements C29871DEg {
    public float A00;
    public float[] A01;

    public final void ABl(ByteBuffer byteBuffer, int i) {
        super.ABl(byteBuffer, i);
        float f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        int A012 = C29825DCj.A01(byteBuffer, i, 0);
        if (A012 != 0) {
            f = byteBuffer.getFloat(A012);
        }
        this.A00 = f;
        this.A01 = C29825DCj.A05(byteBuffer, i, 1);
    }
}
