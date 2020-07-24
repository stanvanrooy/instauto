package p000X;

import com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioPlatformComponentHost;

/* renamed from: X.DK6 */
public final class DK6 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ DK8 A01;
    public final /* synthetic */ byte[] A02;

    public DK6(DK8 dk8, byte[] bArr, int i) {
        this.A01 = dk8;
        this.A02 = bArr;
        this.A00 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
        if (r1 == false) goto L_0x002e;
     */
    public final void run() {
        AudioPlatformComponentHost AGL;
        boolean z;
        try {
            DK4 dk4 = this.A01.A00;
            if (dk4.A01) {
                byte[] bArr = this.A02;
                int i = this.A00;
                DK9 dk9 = (DK9) dk4.A03.get();
                boolean z2 = false;
                if (!(dk9 == null || (AGL = dk9.AGL()) == null)) {
                    Boolean bool = (Boolean) dk4.A04.get(AGL);
                    if (bool != null) {
                        boolean booleanValue = bool.booleanValue();
                        z = true;
                    }
                    z = false;
                    if (z || DK4.A00(dk4)) {
                        AGL.setRenderCallback(new DK5(dk4));
                        z2 = AGL.onInputDataAvailable(bArr, dk4.A00.A05(), i);
                    }
                }
                if (!z2) {
                    dk4.A01(bArr, i);
                    return;
                }
                return;
            }
            dk4.A01(this.A02, this.A00);
        } catch (Exception e) {
            DOZ doz = this.A01.A00.A08;
            if (doz != null) {
                doz.A00.A0B.A02("inprogress_recording_audio_failure", e, "low");
            }
        }
    }
}
