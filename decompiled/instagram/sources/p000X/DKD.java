package p000X;

import android.os.Handler;
import com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioPlatformComponentHost;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.DKD */
public final class DKD implements C30071DPb {
    public static final C88443sQ A07 = new DKH();
    public DOZ A00;
    public byte[] A01;
    public DKB A02;
    public DKX A03;
    public final WeakReference A04;
    public final WeakHashMap A05 = new WeakHashMap();
    public final Handler A06;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0034, code lost:
        return false;
     */
    public static synchronized boolean A00(DKD dkd) {
        AudioPlatformComponentHost AGL;
        synchronized (dkd) {
            DK9 dk9 = (DK9) dkd.A04.get();
            if (!(dk9 == null || (AGL = dk9.AGL()) == null)) {
                Boolean bool = (Boolean) dkd.A05.get(AGL);
                if (dkd.A03 != null && (bool == null || !bool.booleanValue())) {
                    AGL.startRecording(false);
                    dkd.A05.put(AGL, Boolean.TRUE);
                    return true;
                }
            }
        }
    }

    public final Map AJu() {
        return null;
    }

    public final void BbK(DOZ doz, C88443sQ r5, Handler handler) {
        AudioPlatformComponentHost AGL;
        synchronized (this) {
            DK9 dk9 = (DK9) this.A04.get();
            if (!(dk9 == null || (AGL = dk9.AGL()) == null)) {
                AGL.stopRecording();
            }
        }
        DKX dkx = this.A03;
        if (dkx != null) {
            dkx.A01(r5, handler);
        } else {
            DKO.A01(r5, handler, new DKI("mAudioRecorder is null while stopping"), (Map) null);
        }
        this.A00 = null;
    }

    public final void A3s(DOZ doz, C88443sQ r5, Handler handler) {
        this.A00 = doz;
        A00(this);
        DKX dkx = this.A03;
        if (dkx != null) {
            DKX.A00(dkx, handler);
            AnonymousClass0ZA.A0E(dkx.A03, new DKV(dkx, r5, handler), 2132382363);
            return;
        }
        DKO.A01(r5, handler, new DKI("mAudioRecorder is null while starting"), (Map) null);
    }

    public final void BXo(C30048DOc dOc, Handler handler, C88443sQ r7, Handler handler2) {
        DKB dkb = new DKB(this, dOc, handler);
        this.A02 = dkb;
        DKX dkx = new DKX(dOc, handler, dkb);
        this.A03 = dkx;
        int length = this.A01.length;
        int i = dkx.A00;
        if (length < i) {
            this.A01 = new byte[i];
        }
        DKX.A00(dkx, handler2);
        AnonymousClass0ZA.A0E(dkx.A03, new DKW(dkx, r7, handler2), 518865392);
    }

    public final void release() {
        DKB dkb = this.A02;
        if (dkb != null) {
            dkb.A03 = true;
            this.A02 = null;
        }
        DKX dkx = this.A03;
        if (dkx != null) {
            dkx.A01(A07, this.A06);
            this.A03 = null;
        }
        this.A05.clear();
    }

    public DKD(Handler handler, DK9 dk9) {
        this.A06 = handler;
        this.A01 = new byte[4096];
        this.A04 = new WeakReference(dk9);
    }
}
