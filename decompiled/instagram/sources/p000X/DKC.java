package p000X;

import android.os.Handler;
import android.os.Looper;
import com.facebook.cameracore.mediapipeline.recorder.RecorderCoordinatorImpl;
import com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioPlatformComponentHost;
import com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioRenderCallback;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.DKC */
public final class DKC extends AudioRenderCallback implements DKa {
    public C30053DOi A00;
    public long A01;
    public final Handler A02;
    public final C30048DOc A03;
    public volatile boolean A04;
    public final /* synthetic */ RecorderCoordinatorImpl A05;

    public DKC(RecorderCoordinatorImpl recorderCoordinatorImpl, C30048DOc dOc, Handler handler) {
        this.A05 = recorderCoordinatorImpl;
        this.A03 = dOc;
        this.A02 = handler;
    }

    private void A00(byte[] bArr, int i) {
        if (!this.A04) {
            C30053DOi dOi = this.A00;
            long j = this.A01;
            DKK dkk = dOi.A03;
            if (dkk != null) {
                dkk.A03(bArr, i, j);
            }
            this.A01 += ((((long) i) / ((long) 2)) * 1000000) / ((long) this.A03.A04);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        if (r1 == false) goto L_0x0035;
     */
    public final void AzA(byte[] bArr, int i) {
        AudioPlatformComponentHost AGL;
        boolean z;
        if (this.A04) {
            return;
        }
        if (Looper.myLooper() == this.A02.getLooper()) {
            DK9 dk9 = (DK9) this.A05.A0I.get();
            if (!(dk9 == null || (AGL = dk9.AGL()) == null)) {
                Boolean bool = (Boolean) this.A05.A0K.get(AGL);
                if (bool != null) {
                    boolean booleanValue = bool.booleanValue();
                    z = true;
                }
                z = false;
                if (z || RecorderCoordinatorImpl.A09(this.A05)) {
                    AGL.setRenderCallback(this);
                    if (AGL.onInputDataAvailable(bArr, this.A03.A04, i)) {
                        return;
                    }
                }
            }
            A00(bArr, i);
            return;
        }
        throw new IllegalStateException("onDataAvailable() must be invoked on the same thread as the other methods. Looper: " + Looper.myLooper() + " Expected: " + this.A02.getLooper());
    }

    public final void onSamplesReady(byte[] bArr, int i) {
        int i2;
        if (!this.A04 && Looper.myLooper() == this.A02.getLooper()) {
            int length = this.A05.A0D.length;
            if (i > length) {
                ByteBuffer byteBuffer = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.nativeOrder()).limit(i);
                while (byteBuffer.position() < i) {
                    if (i - byteBuffer.position() < length) {
                        i2 = i - byteBuffer.position();
                    } else {
                        i2 = length;
                    }
                    byteBuffer.get(this.A05.A0D, 0, i2);
                    A00(this.A05.A0D, i2);
                }
                return;
            }
            A00(bArr, i);
        }
    }
}
