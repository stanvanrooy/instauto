package p000X;

import android.os.Looper;
import com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioRenderCallback;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.DK5 */
public final class DK5 extends AudioRenderCallback {
    public final /* synthetic */ DK4 A00;

    public DK5(DK4 dk4) {
        this.A00 = dk4;
    }

    public final void onSamplesReady(byte[] bArr, int i) {
        int i2;
        if (this.A00.A07 == null || Looper.myLooper() == this.A00.A07.getLooper()) {
            DK4 dk4 = this.A00;
            int length = dk4.A05.length;
            if (i > length) {
                ByteBuffer byteBuffer = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.nativeOrder()).limit(i);
                while (byteBuffer.position() < i) {
                    if (i - byteBuffer.position() < length) {
                        i2 = i - byteBuffer.position();
                    } else {
                        i2 = length;
                    }
                    byteBuffer.get(this.A00.A05, 0, i2);
                    DK4 dk42 = this.A00;
                    dk42.A01(dk42.A05, i2);
                }
                return;
            }
            dk4.A01(bArr, i);
        }
    }
}
