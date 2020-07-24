package p000X;

import com.facebook.react.uimanager.BaseViewManager;
import java.nio.ByteBuffer;

/* renamed from: X.DIK */
public final class DIK extends DIS {
    public static final int A00 = Float.floatToIntBits(Float.NaN);

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r2 == 1073741824) goto L_0x000d;
     */
    public final void BYp(ByteBuffer byteBuffer) {
        boolean z;
        int i = this.A00.A02;
        if (i != Integer.MIN_VALUE) {
            z = false;
        }
        z = true;
        D6U.A03(z);
        boolean z2 = false;
        if (i == 1073741824) {
            z2 = true;
        }
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        if (!z2) {
            i2 = (i2 / 3) << 2;
        }
        ByteBuffer A04 = A04(i2);
        if (z2) {
            while (position < limit) {
                int floatToIntBits = Float.floatToIntBits((float) (((double) ((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24))) * 4.656612875245797E-10d));
                if (floatToIntBits == A00) {
                    floatToIntBits = Float.floatToIntBits(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                }
                A04.putInt(floatToIntBits);
                position += 4;
            }
        } else {
            while (position < limit) {
                int floatToIntBits2 = Float.floatToIntBits((float) (((double) (((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24))) * 4.656612875245797E-10d));
                if (floatToIntBits2 == A00) {
                    floatToIntBits2 = Float.floatToIntBits(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                }
                A04.putInt(floatToIntBits2);
                position += 3;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        A04.flip();
    }
}
