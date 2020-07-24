package p000X;

import android.os.Handler;
import com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioPlatformComponentHost;
import com.facebook.common.dextricks.DexStore;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.DK4 */
public final class DK4 implements C30071DPb {
    public C88453sR A00;
    public boolean A01;
    public long A02;
    public final WeakReference A03;
    public final WeakHashMap A04 = new WeakHashMap();
    public final byte[] A05 = new byte[4096];
    public final DK8 A06 = new DK8(this);
    public volatile Handler A07;
    public volatile DOZ A08;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        return false;
     */
    public static synchronized boolean A00(DK4 dk4) {
        AudioPlatformComponentHost AGL;
        Boolean bool;
        synchronized (dk4) {
            DK9 dk9 = (DK9) dk4.A03.get();
            if (dk9 != null && (AGL = dk9.AGL()) != null && ((bool = (Boolean) dk4.A04.get(AGL)) == null || !bool.booleanValue())) {
                AGL.startRecording(false);
                dk4.A04.put(AGL, Boolean.TRUE);
                return true;
            }
        }
    }

    public final void BbK(DOZ doz, C88443sQ r6, Handler handler) {
        AudioPlatformComponentHost AGL;
        this.A08 = null;
        if (this.A01) {
            synchronized (this) {
                DK9 dk9 = (DK9) this.A03.get();
                if (!(dk9 == null || (AGL = dk9.AGL()) == null)) {
                    AGL.stopRecording();
                }
            }
        }
        C88453sR r3 = this.A00;
        if (!AnonymousClass0ZA.A0E(r3.A08, new DJl(r3, this.A06, r6, handler), 1445153436)) {
            C88453sR.A02(r6, handler, "removeOutput", "Failed to post message");
        }
    }

    public final void release() {
        this.A07 = null;
        this.A04.clear();
    }

    public final void A01(byte[] bArr, int i) {
        long j = this.A02;
        DOZ doz = this.A08;
        if (doz != null) {
            doz.A00(bArr, i, j);
        }
        this.A02 += (long) (((i >> 1) * DexStore.MS_IN_NS) / this.A00.A05());
    }

    public final void A3s(DOZ doz, C88443sQ r7, Handler handler) {
        this.A08 = doz;
        this.A02 = 0;
        if (this.A01) {
            A00(this);
        }
        C88453sR r3 = this.A00;
        if (!AnonymousClass0ZA.A0E(r3.A08, new C29973DJk(r3, this.A06, r7, handler), 1158398296)) {
            C88453sR.A02(r7, handler, "addOutput", "Failed to post message");
        }
    }

    public final Map AJu() {
        Map A002;
        C88453sR r3 = this.A00;
        synchronized (r3) {
            A002 = C29966DJd.A00(r3.A09, r3.A07, r3.A02);
        }
        return A002;
    }

    public final void BXo(C30048DOc dOc, Handler handler, C88443sQ r4, Handler handler2) {
        this.A07 = handler;
        this.A00.A08(r4, handler2);
    }

    public DK4(DK9 dk9, C88453sR r3, boolean z) {
        this.A03 = new WeakReference(dk9);
        this.A00 = r3;
        this.A01 = z;
    }
}
