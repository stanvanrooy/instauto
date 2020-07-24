package p000X;

import android.os.Handler;
import android.os.Looper;
import com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioPlatformComponentHost;
import com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioRenderCallback;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.DKB */
public final class DKB extends AudioRenderCallback implements DKa {
    public long A00 = 0;
    public final Handler A01;
    public final C30048DOc A02;
    public volatile boolean A03 = false;
    public final /* synthetic */ DKD A04;

    public DKB(DKD dkd, C30048DOc dOc, Handler handler) {
        this.A04 = dkd;
        this.A02 = dOc;
        this.A01 = handler;
    }

    private void A00(byte[] bArr, int i) {
        if (!this.A03) {
            DOZ doz = this.A04.A00;
            if (doz != null) {
                doz.A00(bArr, i, this.A00);
            }
            this.A00 += ((((long) i) / ((long) 2)) * 1000000) / ((long) this.A02.A04);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        if (r1 == false) goto L_0x0036;
     */
    public final void AzA(byte[] bArr, int i) {
        AudioPlatformComponentHost AGL;
        boolean z;
        if (this.A03) {
            return;
        }
        if (Looper.myLooper() == this.A01.getLooper()) {
            DK9 dk9 = (DK9) this.A04.A04.get();
            boolean z2 = false;
            if (!(dk9 == null || (AGL = dk9.AGL()) == null)) {
                Boolean bool = (Boolean) this.A04.A05.get(AGL);
                if (bool != null) {
                    boolean booleanValue = bool.booleanValue();
                    z = true;
                }
                z = false;
                if (z || DKD.A00(this.A04)) {
                    AGL.setRenderCallback(this);
                    z2 = AGL.onInputDataAvailable(bArr, this.A02.A04, i);
                }
            }
            if (!z2) {
                A00(bArr, i);
                return;
            }
            return;
        }
        throw new IllegalStateException("onDataAvailable() must be invoked on the same thread as the other methods. Looper: " + Looper.myLooper() + " Expected: " + this.A01.getLooper());
    }

    public final void onSamplesReady(byte[] bArr, int i) {
        int i2;
        if (!this.A03 && Looper.myLooper() == this.A01.getLooper()) {
            int length = this.A04.A01.length;
            if (i > length) {
                ByteBuffer byteBuffer = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.nativeOrder()).limit(i);
                while (byteBuffer.position() < i) {
                    if (i - byteBuffer.position() < length) {
                        i2 = i - byteBuffer.position();
                    } else {
                        i2 = length;
                    }
                    byteBuffer.get(this.A04.A01, 0, i2);
                    A00(this.A04.A01, i2);
                }
                return;
            }
            A00(bArr, i);
        }
    }
}
