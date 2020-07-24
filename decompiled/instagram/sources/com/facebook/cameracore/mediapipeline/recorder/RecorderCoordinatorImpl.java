package com.facebook.cameracore.mediapipeline.recorder;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Surface;
import com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioPlatformComponentHost;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import p000X.AXJ;
import p000X.AnonymousClass0CW;
import p000X.AnonymousClass0ZA;
import p000X.C29983DKk;
import p000X.C30046DOa;
import p000X.C30048DOc;
import p000X.C30049DOd;
import p000X.C30050DOe;
import p000X.C30052DOh;
import p000X.C30053DOi;
import p000X.C30073DPd;
import p000X.C30074DPe;
import p000X.C30082DPm;
import p000X.C30085DPp;
import p000X.C30091DPv;
import p000X.C30094DPy;
import p000X.C72273En;
import p000X.C79233d3;
import p000X.C88443sQ;
import p000X.DK9;
import p000X.DKC;
import p000X.DKK;
import p000X.DKL;
import p000X.DKN;
import p000X.DKO;
import p000X.DKT;
import p000X.DKW;
import p000X.DKX;
import p000X.DNG;
import p000X.DP1;
import p000X.DP9;
import p000X.DPB;
import p000X.DPL;
import p000X.DPN;
import p000X.DPS;
import p000X.DPU;
import p000X.DQ5;
import p000X.DQ6;
import p000X.DQ7;

public final class RecorderCoordinatorImpl {
    public static final C88443sQ A0O = new C30091DPv();
    public static final DKT A0P = new C30094DPy();
    public Handler A00;
    public Handler A01;
    public HandlerThread A02;
    public HandlerThread A03;
    public Surface A04;
    public DKX A05;
    public C79233d3 A06;
    public DPU A07;
    public AXJ A08;
    public C30053DOi A09;
    public DKC A0A;
    public C30085DPp A0B;
    public DPL A0C;
    public byte[] A0D;
    public List A0E;
    public boolean A0F;
    public final Handler A0G;
    public final C30082DPm A0H;
    public final WeakReference A0I;
    public final WeakReference A0J;
    public final WeakHashMap A0K = new WeakHashMap();
    public final C72273En A0L;
    public final DQ7 A0M;
    public volatile boolean A0N;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0034, code lost:
        return false;
     */
    public static synchronized boolean A09(RecorderCoordinatorImpl recorderCoordinatorImpl) {
        AudioPlatformComponentHost AGL;
        synchronized (recorderCoordinatorImpl) {
            DK9 dk9 = (DK9) recorderCoordinatorImpl.A0I.get();
            if (!(dk9 == null || (AGL = dk9.AGL()) == null)) {
                Boolean bool = (Boolean) recorderCoordinatorImpl.A0K.get(AGL);
                if (recorderCoordinatorImpl.A05 != null && (bool == null || !bool.booleanValue())) {
                    AGL.startRecording(false);
                    recorderCoordinatorImpl.A0K.put(AGL, Boolean.TRUE);
                    return true;
                }
            }
        }
    }

    public static void A00(RecorderCoordinatorImpl recorderCoordinatorImpl) {
        DKX dkx = recorderCoordinatorImpl.A05;
        if (dkx != null) {
            dkx.A01(A0O, recorderCoordinatorImpl.A0G);
            recorderCoordinatorImpl.A05 = null;
        }
        C30053DOi dOi = recorderCoordinatorImpl.A09;
        if (dOi != null) {
            dOi.A01(A0P, recorderCoordinatorImpl.A0G);
            recorderCoordinatorImpl.A09 = null;
        }
        DKC dkc = recorderCoordinatorImpl.A0A;
        if (dkc != null) {
            dkc.A04 = true;
            recorderCoordinatorImpl.A0A = null;
        }
        A02(recorderCoordinatorImpl);
        A03(recorderCoordinatorImpl);
        recorderCoordinatorImpl.A0F = false;
        recorderCoordinatorImpl.A0E.clear();
        recorderCoordinatorImpl.A0K.clear();
        recorderCoordinatorImpl.A0B = null;
        recorderCoordinatorImpl.A07 = DPU.STOPPED;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x000f */
    public static void A02(RecorderCoordinatorImpl recorderCoordinatorImpl) {
        HandlerThread handlerThread = recorderCoordinatorImpl.A02;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            recorderCoordinatorImpl.A02.join();
            try {
                Thread.currentThread().interrupt();
                recorderCoordinatorImpl.A02 = null;
                recorderCoordinatorImpl.A00 = null;
            } catch (Throwable th) {
                recorderCoordinatorImpl.A02 = null;
                recorderCoordinatorImpl.A00 = null;
                throw th;
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:2|3|4|5|6|10|11) */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        r2.A03 = null;
        r2.A01 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x000e */
    public static void A03(RecorderCoordinatorImpl recorderCoordinatorImpl) {
        HandlerThread handlerThread = recorderCoordinatorImpl.A03;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            recorderCoordinatorImpl.A03.join();
            Thread.currentThread().interrupt();
            recorderCoordinatorImpl.A03 = null;
            recorderCoordinatorImpl.A01 = null;
        }
    }

    public static void A04(RecorderCoordinatorImpl recorderCoordinatorImpl, C30073DPd dPd) {
        recorderCoordinatorImpl.A0H.A00.A08.A05(8);
        recorderCoordinatorImpl.A0H.A00.A08.A05(12);
        recorderCoordinatorImpl.A0H.A00("stop_recording_video_failed", dPd, "high");
        C30085DPp dPp = recorderCoordinatorImpl.A0B;
        if (dPp != null) {
            dPp.Auo(dPd);
            recorderCoordinatorImpl.A0B = null;
        }
        A00(recorderCoordinatorImpl);
    }

    public static void A05(RecorderCoordinatorImpl recorderCoordinatorImpl, DPL dpl, C30048DOc dOc, DKT dkt, boolean z) {
        String str;
        DPU dpu = recorderCoordinatorImpl.A07;
        int i = 1;
        if (dpu != DPU.STOPPED && dpu != DPU.PREPARED) {
            dkt.B2m(new IllegalStateException(String.format((Locale) null, "prepareRecordingVideo can't be called in %s state", new Object[]{dpu.toString()})));
        } else if (recorderCoordinatorImpl.A0N) {
            Handler handler = recorderCoordinatorImpl.A0G;
            CancellationException cancellationException = new CancellationException("Stop Recording Video requested. Aborting prepare.");
            recorderCoordinatorImpl.A07 = DPU.STOPPED;
            DKO.A03(dkt, handler, cancellationException);
        } else {
            HashMap hashMap = new HashMap(1);
            DPL dpl2 = dpl;
            if (recorderCoordinatorImpl.A07 != DPU.PREPARED || !dpl.equals(recorderCoordinatorImpl.A0C)) {
                str = "false";
            } else {
                str = "true";
            }
            hashMap.put("recording_prepare_with_same_config", str);
            A08(recorderCoordinatorImpl, "prepare_recording_video_started", hashMap);
            DPU dpu2 = recorderCoordinatorImpl.A07;
            DPU dpu3 = DPU.PREPARED;
            if (dpu2 != dpu3 || !dpl.equals(recorderCoordinatorImpl.A0C)) {
                if (dpu2 == dpu3) {
                    DKX dkx = recorderCoordinatorImpl.A05;
                    if (dkx != null) {
                        dkx.A01(A0O, recorderCoordinatorImpl.A0G);
                        recorderCoordinatorImpl.A05 = null;
                    }
                    C30053DOi dOi = recorderCoordinatorImpl.A09;
                    if (dOi != null) {
                        dOi.A01(A0P, recorderCoordinatorImpl.A0G);
                        recorderCoordinatorImpl.A09 = null;
                    }
                    DKC dkc = recorderCoordinatorImpl.A0A;
                    if (dkc != null) {
                        dkc.A04 = true;
                        recorderCoordinatorImpl.A0A = null;
                    }
                    A02(recorderCoordinatorImpl);
                    A03(recorderCoordinatorImpl);
                    recorderCoordinatorImpl.A07 = DPU.STOPPED;
                }
                recorderCoordinatorImpl.A0C = dpl;
                recorderCoordinatorImpl.A07 = DPU.PREPARE_STARTED;
                recorderCoordinatorImpl.A02 = new HandlerThread("AudioRecordingThread");
                recorderCoordinatorImpl.A03 = new HandlerThread("VideoRecordingThread");
                recorderCoordinatorImpl.A02.start();
                recorderCoordinatorImpl.A03.start();
                recorderCoordinatorImpl.A00 = new Handler(recorderCoordinatorImpl.A02.getLooper());
                recorderCoordinatorImpl.A01 = new Handler(recorderCoordinatorImpl.A03.getLooper());
                if (dOc == null) {
                    C30049DOd dOd = new C30049DOd();
                    C72273En r1 = recorderCoordinatorImpl.A0L;
                    if (!(r1 == null || r1.A01 == null)) {
                        i = 10;
                    }
                    dOd.A00 = i;
                    if (r1.A00.Bnk()) {
                        dOd.A04 = 5;
                    }
                    dOc = new C30048DOc(dOd);
                }
                recorderCoordinatorImpl.A0H.A00.A08.A07(11);
                if (recorderCoordinatorImpl.A06 == null) {
                    recorderCoordinatorImpl.A06 = new C79233d3(dpl.A03, dpl.A02);
                }
                DKC dkc2 = recorderCoordinatorImpl.A0A;
                if (dkc2 != null) {
                    dkc2.A04 = true;
                }
                Handler handler2 = recorderCoordinatorImpl.A00;
                DKC dkc3 = new DKC(recorderCoordinatorImpl, dOc, handler2);
                recorderCoordinatorImpl.A0A = dkc3;
                DKX dkx2 = new DKX(dOc, handler2, dkc3);
                recorderCoordinatorImpl.A05 = dkx2;
                int length = recorderCoordinatorImpl.A0D.length;
                int i2 = dkx2.A00;
                if (length < i2) {
                    recorderCoordinatorImpl.A0D = new byte[i2];
                }
                C30050DOe dOe = new C30050DOe();
                boolean z2 = dOc.A00;
                dOe.A00 = i2;
                dOe.A03 = dOc.A04;
                C30053DOi dOi2 = new C30053DOi(new C30046DOa(dOe), dpl2, recorderCoordinatorImpl.A00, recorderCoordinatorImpl.A01, recorderCoordinatorImpl.A0H, z2);
                recorderCoordinatorImpl.A09 = dOi2;
                recorderCoordinatorImpl.A0A.A00 = dOi2;
                DQ6 dq6 = new DQ6(2);
                DKX dkx3 = recorderCoordinatorImpl.A05;
                DP1 dp1 = new DP1(recorderCoordinatorImpl, dq6, dkt, z);
                Handler handler3 = recorderCoordinatorImpl.A0G;
                DKX.A00(dkx3, handler3);
                AnonymousClass0ZA.A0E(dkx3.A03, new DKW(dkx3, dp1, handler3), 518865392);
                C30053DOi dOi3 = recorderCoordinatorImpl.A09;
                DPN dpn = new DPN(recorderCoordinatorImpl, dq6, dkt, z);
                Handler handler4 = recorderCoordinatorImpl.A0G;
                if (dOi3.A03 == null && dOi3.A06 == null) {
                    DQ6 dq62 = new DQ6(2);
                    DKK dkk = new DKK(dOi3.A0D, dOi3.A0C, dOi3.A09);
                    dOi3.A03 = dkk;
                    DPS dps = new DPS(dOi3, dq62, dpn, handler4);
                    Handler handler5 = dOi3.A0A;
                    dkk.A00 = new MediaCodec.BufferInfo();
                    AnonymousClass0ZA.A0E(dkk.A03, new DKL(dkk, dps, handler5), -32756760);
                    C29983DKk dKk = new C29983DKk(dOi3.A0E, dOi3.A0F, dOi3.A0B, dOi3.A01);
                    dOi3.A06 = dKk;
                    dKk.BXp(new DPB(dOi3, dq62, dpn, handler4), dOi3.A0A);
                    return;
                }
                DKO.A03(dpn, handler4, new IllegalStateException("Cannot call prepare() again until stopping"));
                return;
            }
            Handler handler6 = recorderCoordinatorImpl.A0G;
            recorderCoordinatorImpl.A07 = dpu3;
            DKO.A02(dkt, handler6);
            if (z) {
                A01(recorderCoordinatorImpl);
                return;
            }
            return;
        }
        A00(recorderCoordinatorImpl);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        if (r2 == p000X.DPU.A03) goto L_0x002c;
     */
    public static void A06(RecorderCoordinatorImpl recorderCoordinatorImpl, File file, C30085DPp dPp) {
        boolean z;
        DPU dpu = recorderCoordinatorImpl.A07;
        if (dpu == DPU.RECORDING) {
            A00(recorderCoordinatorImpl);
            throw new IllegalStateException("Recording video has already started");
        } else if (dpu == DPU.PREPARED) {
            recorderCoordinatorImpl.A07 = DPU.RECORDING_STARTED;
            recorderCoordinatorImpl.A0H.A00.A08.A07(2);
            A08(recorderCoordinatorImpl, "start_recording_video_started", (Map) null);
            recorderCoordinatorImpl.A0B = dPp;
            synchronized (recorderCoordinatorImpl) {
                DPU dpu2 = recorderCoordinatorImpl.A07;
                if (dpu2 != DPU.RECORDING_STARTED) {
                    z = false;
                }
                z = true;
                if (z) {
                    A09(recorderCoordinatorImpl);
                }
            }
            C30053DOi dOi = recorderCoordinatorImpl.A09;
            if (dOi == null) {
                DKO.A03(new C30074DPe(recorderCoordinatorImpl), recorderCoordinatorImpl.A0G, new NullPointerException("AvRecorder is null"));
                return;
            }
            DP9 dp9 = new DP9(recorderCoordinatorImpl);
            C30052DOh dOh = new C30052DOh(recorderCoordinatorImpl);
            Handler handler = recorderCoordinatorImpl.A0G;
            if (dOi.A03 == null || dOi.A06 == null) {
                DKO.A03(dp9, handler, new IllegalStateException("Cannot call start() before prepare"));
            } else if (dOi.A0H) {
                DKO.A03(dp9, handler, new IllegalStateException("Cannot call start() again after encoding has started"));
            } else {
                dOi.A08 = file;
                dOi.A04 = dOh;
                dOi.A02 = handler;
                DKK dkk = dOi.A03;
                AnonymousClass0ZA.A0E(dkk.A03, new DKN(dkk, new DNG(dOi, dp9, handler), dOi.A0A), -1422286839);
            }
        } else {
            A00(recorderCoordinatorImpl);
            throw new IllegalStateException("prepare must be called before start. Current state: " + recorderCoordinatorImpl.A07);
        }
    }

    public static void A08(RecorderCoordinatorImpl recorderCoordinatorImpl, String str, Map map) {
        recorderCoordinatorImpl.A0H.A00.A08.A0J(str, map);
    }

    public RecorderCoordinatorImpl(C30082DPm dPm, DQ5 dq5, DK9 dk9, Handler handler, C72273En r9, DQ7 dq7) {
        boolean z = true;
        AnonymousClass0CW.A07(dPm != null, "Null logger passed in");
        AnonymousClass0CW.A07(dq5 == null ? false : z, "Null output provider passsed in");
        this.A0H = dPm;
        this.A0J = new WeakReference(dq5);
        this.A0G = handler;
        this.A07 = DPU.STOPPED;
        this.A0L = r9;
        this.A0M = dq7;
        this.A0I = new WeakReference(dk9);
        this.A0D = new byte[4096];
        this.A0E = new LinkedList();
        this.A0F = false;
    }

    public static void A01(RecorderCoordinatorImpl recorderCoordinatorImpl) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            recorderCoordinatorImpl.A0F = false;
            recorderCoordinatorImpl.A0K.clear();
            if (!recorderCoordinatorImpl.A0E.isEmpty()) {
                recorderCoordinatorImpl.A0F = true;
                ((Runnable) recorderCoordinatorImpl.A0E.remove(0)).run();
                return;
            }
            return;
        }
        throw new IllegalStateException("RecorderCoordinatorImpl methods must be called on the UI thread");
    }

    public static void A07(RecorderCoordinatorImpl recorderCoordinatorImpl, Runnable runnable) {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            throw new IllegalStateException("RecorderCoordinatorImpl methods must be called on the UI thread");
        } else if (recorderCoordinatorImpl.A0F) {
            recorderCoordinatorImpl.A0E.add(runnable);
        } else {
            recorderCoordinatorImpl.A0F = true;
            runnable.run();
        }
    }
}
