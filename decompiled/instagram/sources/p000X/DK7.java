package p000X;

import android.os.Handler;
import com.facebook.cameracore.audiograph.AudioCallback;

/* renamed from: X.DK7 */
public final class DK7 implements AudioCallback {
    public final /* synthetic */ C88453sR A00;

    public DK7(C88453sR r1) {
        this.A00 = r1;
    }

    public final void onAudioInput(byte[] bArr, long j) {
        DK8 dk8 = this.A00.A0H;
        if (dk8 != null) {
            int i = (int) j;
            Handler handler = dk8.A00.A07;
            if (handler != null) {
                AnonymousClass0ZA.A0E(handler, new DK6(dk8, bArr, i), 1812546612);
            }
        }
    }
}
