package p000X;

import android.media.AudioRecord;
import android.os.Handler;
import java.util.HashMap;

/* renamed from: X.DKW */
public final class DKW implements Runnable {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ DKX A01;
    public final /* synthetic */ C88443sQ A02;

    public DKW(DKX dkx, C88443sQ r2, Handler handler) {
        this.A01 = dkx;
        this.A02 = r2;
        this.A00 = handler;
    }

    public final void run() {
        DKX dkx = this.A01;
        C88443sQ r3 = this.A02;
        Handler handler = this.A00;
        if (dkx.A07 != Constants.ZERO) {
            HashMap hashMap = new HashMap(1);
            hashMap.put("mState", DKU.A00(dkx.A07));
            DKO.A01(r3, handler, new IllegalStateException("Must only call prepare() on a stopped AudioRecorder."), hashMap);
            return;
        }
        C30048DOc dOc = dkx.A04;
        if (!dOc.A00) {
            try {
                AudioRecord audioRecord = new AudioRecord(dOc.A05, dOc.A04, dOc.A03, 2, dkx.A01);
                dkx.A02 = audioRecord;
                if (audioRecord.getState() == 0) {
                    throw new IllegalStateException("Could not prepare audio recording");
                }
            } catch (Exception e) {
                HashMap hashMap2 = new HashMap(1);
                hashMap2.put("mSystemAudioBufferSize", String.valueOf(dkx.A01));
                hashMap2.put("getAudioSource", String.valueOf(dkx.A04.A05));
                DKO.A01(r3, handler, e, hashMap2);
                return;
            }
        }
        dkx.A07 = Constants.ONE;
        DKO.A00(r3, handler);
    }
}
