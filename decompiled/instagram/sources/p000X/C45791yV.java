package p000X;

import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.video.heroplayer.client.HeroClientResultReceiver;
import com.facebook.video.heroplayer.client.HeroPlayer$3;
import com.facebook.video.heroplayer.client.HeroPlayer$HeroServicePlayerListenerImpl;
import com.facebook.video.heroplayer.ipc.DeviceOrientationFrame;
import com.facebook.video.heroplayer.ipc.HeroServicePlayerListener;
import com.facebook.video.heroplayer.ipc.LiveState;
import com.facebook.video.heroplayer.ipc.ServicePlayerState;
import com.facebook.video.heroplayer.ipc.SpatialAudioFocusParams;
import com.facebook.video.heroplayer.ipc.VideoPlayRequest;
import com.facebook.video.heroplayer.ipc.VideoProtocolProps;
import com.facebook.video.heroplayer.ipc.VideoSource;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.1yV  reason: invalid class name and case insensitive filesystem */
public final class C45791yV implements Handler.Callback {
    public static final Set A0Q = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
    public static final Set A0R = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
    public static final AtomicInteger A0S = new AtomicInteger();
    public static final AtomicLong A0T = new AtomicLong(0);
    public long A00 = -1;
    public String A01;
    public boolean A02 = false;
    public boolean A03;
    public final Handler A04;
    public final C45841yf A05;
    public final C45801yW A06;
    public final C45811yX A07 = new C45811yX(this);
    public final C39851nf A08 = new C45821ya(this);
    public final C45831ye A09;
    public final HeroServicePlayerListener A0A;
    public final HeroPlayerSetting A0B;
    public final Object A0C = new Object();
    public final List A0D = new LinkedList();
    public final AtomicReference A0E = new AtomicReference(LiveState.A09);
    public final AtomicReference A0F = new AtomicReference(new ServicePlayerState());
    public final long[] A0G = {0, 0};
    public volatile float A0H = 1.0f;
    public volatile float A0I;
    public volatile long A0J = 0;
    public volatile long A0K;
    public volatile long A0L;
    public volatile long A0M;
    public volatile String A0N;
    public volatile boolean A0O;
    public volatile boolean A0P;

    public static void A04(C45791yV r14, Throwable th, C29634D2r d2r, C42071rS r17, String str, String str2) {
        String str3 = str2;
        A05(r14, th, str3, new Object[0]);
        ServicePlayerState servicePlayerState = (ServicePlayerState) r14.A0F.get();
        C29634D2r d2r2 = d2r;
        String str4 = str;
        r14.A09.BEU(str4, str3, d2r2, r17, 0, 0, 0, 0, servicePlayerState.A00, servicePlayerState.A03, ((LiveState) r14.A0E.get()).A08);
    }

    public final void A0B(Runnable runnable) {
        Object heroPlayer$3;
        A03(this, "releaseSurface", new Object[0]);
        if (this.A0B.A1A) {
            heroPlayer$3 = new HeroClientResultReceiver(runnable);
        } else {
            heroPlayer$3 = new HeroPlayer$3(this, runnable);
        }
        A01(this, this.A04.obtainMessage(7, heroPlayer$3));
    }

    public C45791yV(C45781yU r8, HeroPlayerSetting heroPlayerSetting) {
        HandlerThread handlerThread = new HandlerThread("HeroPlayerInternalThread", -2);
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        Handler handler = new Handler(Looper.getMainLooper());
        C45801yW r3 = new C45801yW();
        A03(this, "Create HeroPlayer", new Object[0]);
        this.A0B = heroPlayerSetting;
        this.A02 |= heroPlayerSetting.A0t;
        this.A0A = new HeroPlayer$HeroServicePlayerListenerImpl(this);
        this.A09 = new C45831ye(handler, r8);
        this.A04 = new Handler(looper, this);
        C39731nP.A0W.A0B.add(this.A08);
        A0Q.add(this);
        this.A05 = new C45841yf();
        this.A06 = r3;
    }

    public static void A01(C45791yV r0, Message message) {
        AnonymousClass0ZA.A0D(r0.A04, message);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0076, code lost:
        if (r0.isValid() == false) goto L_0x0078;
     */
    public static void A02(C45791yV r14, ServicePlayerState servicePlayerState, boolean z) {
        boolean z2;
        C45811yX.A04(r14.A07, servicePlayerState);
        long j = servicePlayerState.A09;
        if (j > 0 && servicePlayerState.A0A >= j) {
            long A002 = servicePlayerState.A00();
            long j2 = servicePlayerState.A09;
            long j3 = servicePlayerState.A0A;
            boolean z3 = !servicePlayerState.A0E;
            long j4 = j3 - j2;
            A03(r14, "onBufferingStopped, %dms", Long.valueOf(j4));
            if (j3 > ((long) 20) + j2) {
                synchronized (r14.A0D) {
                    r14.A0D.add(new Pair(Long.valueOf(j2), Long.valueOf(j3)));
                    if (r14.A00 == -1) {
                        r14.A00 = A002;
                    }
                }
            }
            r14.A09.BP8(j4, z, z3);
        }
        boolean z4 = r14.A03;
        boolean z5 = servicePlayerState.A0F;
        if (z4 != z5) {
            r14.A03 = z5;
            Surface surface = r14.A07.A09;
            if (surface != null) {
                z2 = true;
            }
            z2 = false;
            A03(r14, "onVisualPlayStateChanged", new Object[0]);
            r14.A09.BW9(z5, z2);
        }
    }

    public static void A03(C45791yV r3, String str, Object... objArr) {
        if (r3.A02) {
            C40431oe.A03("HeroPlayer", r3.hashCode() + ", playerId[" + r3.A0J + "]: " + str, objArr);
        }
    }

    public static void A05(C45791yV r3, Throwable th, String str, Object... objArr) {
        if (r3.A02) {
            C40431oe.A05("HeroPlayer", th, r3.hashCode() + ", playerId[" + r3.A0J + "]: " + str + ", message = " + th.getMessage(), objArr);
        }
    }

    public final AnonymousClass2J3 A08() {
        long j;
        int i;
        int i2;
        long j2;
        synchronized (this.A0D) {
            j = 0;
            i = 0;
            i2 = 0;
            for (Pair pair : this.A0D) {
                Object obj = pair.second;
                long longValue = ((Long) obj).longValue();
                Object obj2 = pair.first;
                long longValue2 = ((Long) obj2).longValue();
                if (longValue <= longValue2 || longValue2 <= 0 || longValue <= 0) {
                    A05(this, new IllegalStateException("Start stall time is greater or equal to end stall time"), "stallStartMs = %d, stallEndMs = %d", obj2, obj);
                } else {
                    long j3 = longValue - longValue2;
                    j += j3;
                    i++;
                    if (j3 > 200) {
                        i2++;
                    }
                }
            }
            this.A0D.clear();
            j2 = this.A00;
            this.A00 = -1;
        }
        return new AnonymousClass2J3(j, i, i2, j2);
    }

    public final void A09() {
        if (this != null) {
            hashCode();
        }
    }

    public final boolean A0C() {
        if (this.A0J != 0) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v7, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v8, resolved type: boolean} */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        if (r2.A0E == false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0049, code lost:
        if (r2 == false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x04c9, code lost:
        A03(r3, r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x04cc, code lost:
        return true;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x03a2  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0097 A[Catch:{ RemoteException -> 0x00a3 }] */
    public final boolean handleMessage(Message message) {
        C45791yV r3;
        Object[] objArr;
        String str;
        C45811yX r5;
        C45791yV r32;
        String str2;
        Object[] objArr2;
        C45791yV r4;
        String str3;
        Object[] objArr3;
        Surface surface;
        Surface surface2;
        C45791yV r33;
        Object[] objArr4;
        String str4;
        int i;
        C45831ye r2;
        long A002;
        long j;
        long j2;
        boolean z;
        boolean z2;
        Message message2 = message;
        boolean z3 = false;
        switch (message2.what) {
            case 1:
                C45811yX r52 = this.A07;
                VideoPlayRequest videoPlayRequest = (VideoPlayRequest) message2.obj;
                A03(r52.A0A, "prepareInternal, playRequest: %s, url: %s", videoPlayRequest.A05.A06.toString(), videoPlayRequest.A05.A03);
                VideoPlayRequest videoPlayRequest2 = r52.A06;
                if (videoPlayRequest2 != null && videoPlayRequest.A05.equals(videoPlayRequest2.A05)) {
                    A03(r52.A0A, "prepareInternal, unchanged video source, skip preparing", new Object[0]);
                    break;
                } else {
                    C45811yX.A03(r52);
                    r52.A06 = videoPlayRequest;
                    r52.A07 = true;
                    try {
                        C45811yX.A01(r52);
                    } catch (RemoteException e) {
                        A05(r52.A0A, e, "Error occurs while ensureAndRecoverServicePlayer in prepare", new Object[0]);
                    }
                    C45791yV r34 = r52.A0A;
                    A03(r34, "onPreparing", new Object[0]);
                    A0S.incrementAndGet();
                    r34.A09.BFL();
                    r52.A0A.A09();
                    C45811yX.A02(r52);
                    break;
                }
                break;
            case 2:
                C45811yX r6 = this.A07;
                long longValue = ((Long) message2.obj).longValue();
                if (r6.A07) {
                    try {
                        C45811yX.A01(r6);
                    } catch (RemoteException e2) {
                        A05(r6.A0A, e2, "Error occurs while ensureAndRecoverServicePlayer in play", new Object[0]);
                    }
                }
                C45791yV r42 = r6.A0A;
                C45811yX r1 = r42.A07;
                if (r1 != null) {
                    VideoPlayRequest videoPlayRequest3 = r1.A06;
                    if (videoPlayRequest3 != null) {
                        z = true;
                        break;
                    }
                    z = false;
                    if (videoPlayRequest3 != null) {
                        VideoSource videoSource = videoPlayRequest3.A05;
                        if (videoSource.A02()) {
                            VideoProtocolProps videoProtocolProps = videoSource.A04;
                            if (videoProtocolProps != null) {
                                boolean z4 = videoProtocolProps.A01;
                                z2 = true;
                                break;
                            }
                            z2 = false;
                            if (z2 && z) {
                                r42.A01 = UUID.randomUUID().toString();
                            }
                        }
                    }
                }
                r42.A09.BVK(r42.A01);
                boolean z5 = true;
                r6.A08 = true;
                try {
                    if (!r6.A0A.A0C()) {
                        A03(r6.A0A, "Before play(), service player was evicted. Recover now", new Object[0]);
                    } else {
                        if (!C45811yX.A00(r6).BXG(r6.A0A.A0J, longValue, r6.A0A.A01)) {
                            A03(r6.A0A, "When play(), service player is noticed to be evicted earlier. Recover now", new Object[0]);
                            C45811yX.A05(r6, true);
                        }
                        if (!z5) {
                            C45811yX.A01(r6);
                        }
                        r6.A0A.A09();
                        C45811yX.A02(r6);
                        return true;
                    }
                    z5 = false;
                    if (!z5) {
                    }
                    r6.A0A.A09();
                    C45811yX.A02(r6);
                    return true;
                } catch (RemoteException e3) {
                    e = e3;
                    r3 = r6.A0A;
                    objArr = new Object[0];
                    str = "Error occurs while sending play request";
                    A05(r3, e, str, objArr);
                    return true;
                }
            case 3:
                r5 = this.A07;
                r5.A08 = false;
                try {
                    if (!r5.A0A.A0C()) {
                        A03(r5.A0A, "Before pause(), service player was evicted. Lazy recover at next play()", new Object[0]);
                    } else if (!C45811yX.A00(r5).BWv(r5.A0A.A0J, false)) {
                        A03(r5.A0A, "When pause(), service player is noticed to be evicted earlier. Lazy recover at next play()", new Object[0]);
                        C45811yX.A05(r5, true);
                    }
                    r5.A0A.A09();
                    C45811yX.A02(r5);
                    return true;
                } catch (RemoteException e4) {
                    e = e4;
                    r3 = r5.A0A;
                    objArr = new Object[0];
                    str = "Error occurs while pausing the video";
                    A05(r3, e, str, objArr);
                    return true;
                }
            case 4:
                long[] jArr = (long[]) message2.obj;
                C45811yX r62 = this.A07;
                int i2 = (int) jArr[0];
                long j3 = jArr[1];
                if (1 == jArr[2]) {
                    z3 = true;
                }
                r62.A01 = i2;
                try {
                    if (!r62.A0A.A0C()) {
                        A03(r62.A0A, "Before seekTo(), service player was evicted. Lazy recover at next play()", new Object[0]);
                        r62.A0A.A0L = 0;
                    } else if (!C45811yX.A00(r62).Bew(r62.A0A.A0J, (long) r62.A01, j3, z3)) {
                        A03(r62.A0A, "When seekTo(), service player is noticed to be evicted earlier. Lazy recover at next play()", new Object[0]);
                        C45811yX.A05(r62, true);
                    }
                    r62.A0A.A09();
                    C45811yX.A02(r62);
                    return true;
                } catch (RemoteException e5) {
                    e = e5;
                    r62.A0A.A0L = 0;
                    r3 = r62.A0A;
                    objArr = new Object[0];
                    str = "Error occurs while seeking the video";
                    A05(r3, e, str, objArr);
                    return true;
                }
            case 5:
                C45811yX r63 = this.A07;
                float floatValue = ((Float) ((Object[]) message2.obj)[0]).floatValue();
                if (floatValue < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER || floatValue > 1.0f) {
                    A03(r63.A0A, "Trying to set volume with invalid value", new Object[0]);
                }
                r63.A0A.A0I = Math.max(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, Math.min(1.0f, floatValue));
                try {
                    if (!r63.A0A.A0C()) {
                        A03(r63.A0A, "Before setVolume(), service player was evicted. Lazy recover at next play()", new Object[0]);
                    } else if (!C45811yX.A00(r63).Blu(r63.A0A.A0J, r63.A0A.A0I)) {
                        A03(r63.A0A, "When setVolume(), service player is noticed to be evicted earlier. Lazy recover at next play()", new Object[0]);
                        C45811yX.A05(r63, true);
                    }
                    r63.A0A.A09();
                    C45811yX.A02(r63);
                    return true;
                } catch (RemoteException e6) {
                    e = e6;
                    r3 = r63.A0A;
                    objArr = new Object[0];
                    str = "Error occurs while setting volume";
                    A05(r3, e, str, objArr);
                    return true;
                }
            case 6:
                C45811yX r53 = this.A07;
                Surface surface3 = (Surface) message2.obj;
                r53.A09 = surface3;
                if (surface3 != null && surface3 == r53.A04) {
                    r33 = r53.A0A;
                    objArr4 = new Object[]{surface3};
                    str4 = "surface already sent, skipping send again: %s";
                    break;
                } else {
                    try {
                        if (!r53.A0A.A0C()) {
                            A03(r53.A0A, "Before setSurface(), service player was evicted. Lazy recover at next play()", new Object[0]);
                        } else if (!C45811yX.A00(r53).Bkx(r53.A0A.A0J, r53.A09)) {
                            A03(r53.A0A, "When setSurface(), service player is noticed to be evicted earlier. Lazy recover at next play()", new Object[0]);
                            C45811yX.A05(r53, true);
                        } else {
                            r53.A04 = r53.A09;
                        }
                        r53.A0A.A09();
                        C45811yX.A02(r53);
                        AnonymousClass0DE.A00(surface3);
                        return true;
                    } catch (RemoteException e7) {
                        e = e7;
                        r3 = r53.A0A;
                        objArr = new Object[0];
                        str = "Error occurs while setting surface";
                        A05(r3, e, str, objArr);
                        return true;
                    }
                }
                break;
            case 7:
                ResultReceiver resultReceiver = (ResultReceiver) message2.obj;
                C45811yX r8 = this.A07;
                try {
                    r8.A09 = null;
                    if (!r8.A0A.A0C()) {
                        A03(r8.A0A, "Before releaseSurface(), service player was evicted. Lazy recover at next play()", new Object[0]);
                    } else if (C45811yX.A00(r8).BaW(r8.A0A.A0J, resultReceiver)) {
                        A03(r8.A0A, "Surface release request already sent, let it complete", new Object[0]);
                        try {
                            r8.A04 = null;
                            resultReceiver = null;
                        } catch (RemoteException e8) {
                            e = e8;
                            resultReceiver = null;
                            try {
                                A05(r8.A0A, e, "Error occurs while releasing surface", new Object[0]);
                                if (resultReceiver != null) {
                                }
                                return true;
                            } catch (Throwable th) {
                                th = th;
                                if (resultReceiver != null) {
                                    resultReceiver.send(1, (Bundle) null);
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            resultReceiver = null;
                            if (resultReceiver != null) {
                            }
                            throw th;
                        }
                    } else {
                        A03(r8.A0A, "When releaseSurface(), service player is noticed to be evicted earlier. Lazy recover at next play()", new Object[0]);
                        C45811yX.A05(r8, true);
                    }
                    r8.A0A.A09();
                    C45811yX.A02(r8);
                } catch (RemoteException e9) {
                    e = e9;
                    A05(r8.A0A, e, "Error occurs while releasing surface", new Object[0]);
                    if (resultReceiver != null) {
                    }
                    return true;
                }
                if (resultReceiver != null) {
                    resultReceiver.send(1, (Bundle) null);
                    return true;
                }
            case 8:
                C45811yX r54 = this.A07;
                C39731nP.A0W.A0B.remove(r54.A0A.A08);
                try {
                    if (!r54.A0A.A0C()) {
                        A03(r54.A0A, "Before release(), service player was evicted. Skip releasing", new Object[0]);
                    } else {
                        C45811yX.A00(r54).BaF(r54.A0A.A0J, false);
                    }
                    r54.A0A.A09();
                    C45811yX.A02(r54);
                } catch (RemoteException e10) {
                    A05(r54.A0A, e10, "Error occurs while release player", new Object[0]);
                } catch (Throwable th3) {
                    C45811yX.A03(r54);
                    r54.A0A.A0I = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                    r54.A0A.A0J = 0;
                    long[] jArr2 = r54.A0A.A0G;
                    jArr2[1] = 0;
                    jArr2[0] = 0;
                    throw th3;
                }
                C45811yX.A03(r54);
                r54.A0A.A0I = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                r54.A0A.A0J = 0;
                C45791yV r43 = r54.A0A;
                long[] jArr3 = r43.A0G;
                jArr3[1] = 0;
                jArr3[0] = 0;
                if ("HeroPlayerInternalThread".equals(r43.A04.getLooper().getThread().getName())) {
                    r54.A0A.A04.getLooper().quit();
                    return true;
                }
                break;
            case 9:
                C45811yX r55 = this.A07;
                try {
                    C45811yX.A01(r55);
                    C45791yV r35 = r55.A0A;
                    A03(r35, "onVideoServiceConnected", new Object[0]);
                    r35.A09.BVN();
                    r55.A0A.A09();
                    C45811yX.A02(r55);
                    return true;
                } catch (RemoteException e11) {
                    e = e11;
                    r3 = r55.A0A;
                    objArr = new Object[0];
                    str = "Error occurs in handleServiceConnected";
                    A05(r3, e, str, objArr);
                    return true;
                }
            case 10:
                C45811yX r7 = this.A07;
                r7.A05 = null;
                r7.A04 = null;
                r7.A02 = r7.A0A.A06();
                VideoPlayRequest videoPlayRequest4 = r7.A06;
                if (videoPlayRequest4 == null || !videoPlayRequest4.A00()) {
                    j = 0;
                } else {
                    j = r7.A0A.A07();
                }
                r7.A03 = j;
                ServicePlayerState servicePlayerState = (ServicePlayerState) r7.A0A.A0F.get();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j4 = servicePlayerState.A04;
                if (!servicePlayerState.A0E || servicePlayerState.A0D) {
                    j2 = 0;
                } else {
                    j2 = elapsedRealtime - servicePlayerState.A0B;
                }
                servicePlayerState.A04 = j4 + j2;
                servicePlayerState.A08 += j2;
                servicePlayerState.A0D = true;
                servicePlayerState.A0B = elapsedRealtime;
                synchronized (r7.A0A.A0C) {
                    try {
                        r7.A0A.A0C.notifyAll();
                    } catch (Throwable th4) {
                        while (true) {
                            th = th4;
                            break;
                        }
                    }
                }
                r7.A0A.A09();
                C45811yX.A02(r7);
                return true;
            case C120125Dh.VIEW_TYPE_BANNER /*11*/:
                C45811yX.A04(this.A07, (ServicePlayerState) message2.obj);
                return true;
            case C120125Dh.VIEW_TYPE_SPINNER /*12*/:
                C45811yX.A05(this.A07, ((Boolean) message2.obj).booleanValue());
                return true;
            case C120125Dh.VIEW_TYPE_BADGE /*13*/:
                C45811yX r56 = this.A07;
                String str5 = (String) message2.obj;
                try {
                    if (!r56.A0A.A0C()) {
                        A03(r56.A0A, "Before setCustomQuality(), service player was evicted. Skip setting custom quality", new Object[0]);
                        return true;
                    }
                    C45811yX.A00(r56).Bgy(r56.A0A.A0J, str5);
                    return true;
                } catch (RemoteException e12) {
                    e = e12;
                    r3 = r56.A0A;
                    objArr = new Object[0];
                    str = "Error occurs while setting custom quality";
                    A05(r3, e, str, objArr);
                    return true;
                }
            case C120125Dh.VIEW_TYPE_LINK /*14*/:
                C45811yX r57 = this.A07;
                try {
                    if (!r57.A0A.A0C()) {
                        A03(r57.A0A, "Before reset(), service player was evicted. Lazy recover at next play()", new Object[0]);
                    } else if (!C45811yX.A00(r57).Bda(r57.A0A.A0J)) {
                        A03(r57.A0A, "When reset(), service player is noticed to be evicted earlier. Lazy recover at next play()", new Object[0]);
                        C45811yX.A05(r57, true);
                    }
                    r57.A0A.A09();
                    C45811yX.A02(r57);
                } catch (RemoteException e13) {
                    A05(r57.A0A, e13, "Error occurs while pausing the video", new Object[0]);
                } catch (Throwable th5) {
                    C45811yX.A03(r57);
                    throw th5;
                }
                C45811yX.A03(r57);
                return true;
            case 15:
                C45811yX r58 = this.A07;
                DeviceOrientationFrame deviceOrientationFrame = (DeviceOrientationFrame) message2.obj;
                try {
                    if (!r58.A0A.A0C()) {
                        A03(r58.A0A, "Before setDeviceOrientationFrame(), service player was evicted. Skip setting device orientation frame", new Object[0]);
                        return true;
                    }
                    C45811yX.A00(r58).BhA(r58.A0A.A0J, deviceOrientationFrame);
                    return true;
                } catch (RemoteException e14) {
                    e = e14;
                    r3 = r58.A0A;
                    objArr = new Object[0];
                    str = "Error occurs while setting device orientation frame";
                    A05(r3, e, str, objArr);
                    return true;
                }
            case 16:
                C45811yX r59 = this.A07;
                SpatialAudioFocusParams spatialAudioFocusParams = (SpatialAudioFocusParams) message2.obj;
                try {
                    if (!r59.A0A.A0C()) {
                        A03(r59.A0A, "Before setSpatialAudioFocus(), service player was evicted. Skip setting spatial audio focus", new Object[0]);
                        return true;
                    }
                    C45811yX.A00(r59).Bkd(r59.A0A.A0J, spatialAudioFocusParams);
                    return true;
                } catch (RemoteException e15) {
                    e = e15;
                    r3 = r59.A0A;
                    objArr = new Object[0];
                    str = "Error occurs while setting spatial audio focus";
                    A05(r3, e, str, objArr);
                    return true;
                }
            case C120125Dh.VIEW_TYPE_CUSTOM_ITEM /*17*/:
                String[] strArr = (String[]) message2.obj;
                C45811yX r36 = this.A07;
                String str6 = strArr[0];
                String str7 = strArr[1];
                VideoPlayRequest videoPlayRequest5 = r36.A06;
                if (videoPlayRequest5 == null || !videoPlayRequest5.A00()) {
                    ServicePlayerState servicePlayerState2 = (ServicePlayerState) r36.A0A.A0F.get();
                    C45791yV r12 = r36.A0A;
                    C45831ye r37 = r12.A09;
                    C29634D2r d2r = C29634D2r.NETWORK_SOURCE;
                    C42071rS r72 = C42071rS.RESPONSE_CODE_410;
                    if (servicePlayerState2 != null) {
                        z3 = servicePlayerState2.A00;
                    }
                    if (servicePlayerState2 != null) {
                        i = servicePlayerState2.A03;
                    } else {
                        i = 0;
                    }
                    r37.BEU(str6, str7, d2r, r72, 0, 0, 0, 0, z3, i, ((LiveState) r12.A0E.get()).A08);
                    return true;
                }
                A03(r36.A0A, "force live video to complete upon 410 dismiss error", new Object[0]);
                if (r36.A08) {
                    AnonymousClass2J3 A082 = r36.A0A.A08();
                    ServicePlayerState servicePlayerState3 = (ServicePlayerState) r36.A0A.A0F.get();
                    if (servicePlayerState3 == null) {
                        r33 = r36.A0A;
                        objArr4 = new Object[0];
                        str4 = "Force Video To End terminated early";
                        break;
                    } else {
                        if (!servicePlayerState3.A0E) {
                            C45791yV r22 = r36.A0A;
                            r22.A09.BVW(servicePlayerState3, (LiveState) r22.A0E.get(), false, false, D46.A00(Constants.ZERO), (String) null);
                            r2 = r36.A0A.A09;
                            A002 = 0;
                        } else {
                            r2 = r36.A0A.A09;
                            A002 = servicePlayerState3.A00();
                        }
                        r2.BUn(A002, A082.A03, A082.A00, A082.A01, A082.A02, Constants.A0C, false, servicePlayerState3.A00, servicePlayerState3.A03);
                        return true;
                    }
                }
                break;
            case 18:
                C45811yX r64 = this.A07;
                r64.A00 = message2.arg1;
                try {
                    if (!r64.A0A.A0C()) {
                        A03(r64.A0A, "Before setRelativePosition(), service player was evicted. Lazy recover at next play()", new Object[0]);
                        return true;
                    } else if (!C45811yX.A00(r64).Bk7(r64.A0A.A0J, (long) r64.A00)) {
                        A03(r64.A0A, "When setRelativePosition(), service player is noticed to be evicted earlier. Lazy recover at next play()", new Object[0]);
                        C45811yX.A05(r64, true);
                        return true;
                    }
                } catch (RemoteException e16) {
                    e = e16;
                    r3 = r64.A0A;
                    objArr = new Object[0];
                    str = "Error occurs while setting relative position of the video";
                    A05(r3, e, str, objArr);
                    return true;
                }
                break;
            case 19:
                C45811yX r510 = this.A07;
                boolean booleanValue = ((Boolean) message2.obj).booleanValue();
                r510.A0A.A0O = booleanValue;
                try {
                    if (!r510.A0A.A0C()) {
                        A03(r510.A0A, "Before setLooping(), service player was evicted. Lazy recover at next play()", new Object[0]);
                        return true;
                    } else if (!C45811yX.A00(r510).Bil(r510.A0A.A0J, booleanValue)) {
                        A03(r510.A0A, "When setLooping(), service player is noticed to be evicted earlier. Lazy recover at next play()", new Object[0]);
                        C45811yX.A05(r510, true);
                        return true;
                    }
                } catch (RemoteException e17) {
                    e = e17;
                    r3 = r510.A0A;
                    objArr = new Object[0];
                    str = "Error occurs while setting looping";
                    A05(r3, e, str, objArr);
                    return true;
                }
                break;
            case C120125Dh.VIEW_TYPE_BRANDING /*21*/:
                C45811yX r511 = this.A07;
                C45931yr r65 = (C45931yr) message2.obj;
                C45791yV r73 = r511.A0A;
                Object[] objArr5 = new Object[2];
                objArr5[0] = Long.valueOf(r65.A00);
                C40691p4 r13 = r65.A01;
                if (r13 != null) {
                    surface = r13.A00;
                } else {
                    surface = null;
                }
                objArr5[1] = surface;
                A03(r73, "switchToWarmupPlayer: player id: %d, surface: %s", objArr5);
                VideoPlayRequest videoPlayRequest6 = r511.A06;
                if (videoPlayRequest6 == null || !r65.A02.equals(videoPlayRequest6.A05.A0D)) {
                    try {
                        if (r511.A0A.A0C()) {
                            C45811yX.A00(r511).BaF(r511.A0A.A0J, true);
                        }
                    } catch (RemoteException e18) {
                        A05(r511.A0A, e18, "Error occurs while release player", new Object[0]);
                    }
                    r511.A0A.A0J = r65.A00;
                    C45791yV r44 = r511.A0A;
                    long[] jArr4 = r44.A0G;
                    jArr4[1] = jArr4[0];
                    jArr4[0] = r44.A0J;
                    C40691p4 r14 = r65.A01;
                    if (r14 != null) {
                        surface2 = r14.A00;
                    } else {
                        surface2 = null;
                    }
                    if (surface2 != null) {
                        r511.A09 = surface2;
                        r511.A04 = surface2;
                        return true;
                    }
                } else {
                    throw new IllegalStateException("switchToWarmupPlayer is called after setVideoPlaybackParams");
                }
                break;
            case C120125Dh.NUM_VIEW_TYPES /*22*/:
                C45811yX r512 = this.A07;
                boolean booleanValue2 = ((Boolean) message2.obj).booleanValue();
                int i3 = 1;
                A03(r512.A0A, "liveLatencyMode: %d", Integer.valueOf(booleanValue2));
                try {
                    if (C45811yX.A00(r512).Bif(r512.A0A.A0J, booleanValue2)) {
                        r4 = r512.A0A;
                        str3 = "setLiveLatencyMode successfully to : %d";
                        objArr3 = new Object[1];
                        if (!booleanValue2) {
                            i3 = 0;
                        }
                        objArr3[0] = Integer.valueOf(i3);
                    } else {
                        r4 = r512.A0A;
                        str3 = "Fail to setLiveLatencyMode to : %d";
                        objArr3 = new Object[1];
                        if (!booleanValue2) {
                            i3 = 0;
                        }
                        objArr3[0] = Integer.valueOf(i3);
                    }
                    A03(r4, str3, objArr3);
                    return true;
                } catch (RemoteException e19) {
                    e = e19;
                    r3 = r512.A0A;
                    objArr = new Object[0];
                    str = "Error occurs while setting liveLatencyMode the video";
                    A05(r3, e, str, objArr);
                    return true;
                }
            case 23:
                C45811yX r513 = this.A07;
                int intValue = ((Integer) message2.obj).intValue();
                C45791yV r38 = r513.A0A;
                Object valueOf = Integer.valueOf(intValue);
                A03(r38, "setAudioUsage: %d", valueOf);
                try {
                    if (!r513.A0A.A0C()) {
                        A03(r513.A0A, "player must be valid before updating the audioUsage", new Object[0]);
                        return true;
                    }
                    if (!C45811yX.A00(r513).Bg5(r513.A0A.A0J, intValue)) {
                        r32 = r513.A0A;
                        str2 = "failed to setAudioUsage to : %d";
                        objArr2 = new Object[]{valueOf};
                    } else {
                        r32 = r513.A0A;
                        str2 = "setAudioUsage successfully to : %d";
                        objArr2 = new Object[]{valueOf};
                    }
                    A03(r32, str2, objArr2);
                    return true;
                } catch (RemoteException e20) {
                    e = e20;
                    r3 = r513.A0A;
                    objArr = new Object[0];
                    str = "error occurred while setting audio usage";
                    A05(r3, e, str, objArr);
                    return true;
                }
            case 24:
                r5 = this.A07;
                A03(r5.A0A, "Force Video To End triggered", new Object[0]);
                if (!r5.A0A.A0C()) {
                    A03(r5.A0A, "Before pause(), service player was evicted. Lazy recover at next play()", new Object[0]);
                    return true;
                } else if (!C45811yX.A00(r5).BWv(r5.A0A.A0J, true)) {
                    A03(r5.A0A, "When pause(), service player is noticed to be evicted earlier. Lazy recover at next play()", new Object[0]);
                    C45811yX.A05(r5, true);
                    return true;
                }
                break;
            case 25:
                C45811yX r66 = this.A07;
                int intValue2 = ((Integer) message2.obj).intValue();
                A03(r66.A0A, "Pre Seek To", new Object[0]);
                try {
                    if (!r66.A0A.A0C()) {
                        A03(r66.A0A, "Before preSeekTo(), service player was evicted. Lazy recover at next play()", new Object[0]);
                        return true;
                    } else if (!C45811yX.A00(r66).BXb(r66.A0A.A0J, (long) intValue2)) {
                        A03(r66.A0A, "When preSeekTo(), service player is noticed to be evicted earlier. Lazy recover at next play()", new Object[0]);
                        C45811yX.A05(r66, true);
                        return true;
                    }
                } catch (RemoteException e21) {
                    e = e21;
                    r3 = r66.A0A;
                    objArr = new Object[0];
                    str = "Error occurs while pausing the video";
                    A05(r3, e, str, objArr);
                    return true;
                }
                break;
            case OdexSchemeArtXdex.OREO_SDK_INT /*26*/:
                C45811yX r514 = this.A07;
                float floatValue2 = ((Float) message2.obj).floatValue();
                if (floatValue2 < 0.25f || floatValue2 > 4.0f) {
                    A03(r514.A0A, "Trying to set playback speed with invalid value", new Object[0]);
                }
                r514.A0A.A0H = Math.max(0.25f, Math.min(4.0f, floatValue2));
                try {
                    if (!r514.A0A.A0C()) {
                        A03(r514.A0A, "Before setPlaybackSpeed(), service player was evicted. Lazy recover at next play()", new Object[0]);
                        return true;
                    } else if (!C45811yX.A00(r514).BjX(r514.A0A.A0J, r514.A0A.A0H)) {
                        A03(r514.A0A, "When setPlaybackSpeed(), service player is noticed to be evicted earlier. Lazy recover at next play()", new Object[0]);
                        C45811yX.A05(r514, true);
                        return true;
                    }
                } catch (RemoteException e22) {
                    e = e22;
                    r3 = r514.A0A;
                    objArr = new Object[0];
                    str = "Error occurs while setting playback speed";
                    A05(r3, e, str, objArr);
                    return true;
                }
                break;
            case 27:
                C45811yX r39 = this.A07;
                String str8 = (String) message2.obj;
                VideoPlayRequest videoPlayRequest7 = r39.A06;
                if (videoPlayRequest7 != null) {
                    videoPlayRequest7.A07 = str8;
                    return true;
                }
                break;
            case 28:
                C45811yX r515 = this.A07;
                try {
                    if (!r515.A0A.A0C()) {
                        A03(r515.A0A, "Before retry(), service player was evicted. Lazy recover at next play()", new Object[0]);
                        return true;
                    }
                    C45811yX.A00(r515).Be5(r515.A0A.A0J);
                    return true;
                } catch (RemoteException e23) {
                    e = e23;
                    r3 = r515.A0A;
                    objArr = new Object[0];
                    str = "Error occurs while retrying the same video playback";
                    A05(r3, e, str, objArr);
                    return true;
                }
            default:
                return false;
        }
    }

    private long A00() {
        if (!A0C()) {
            return 0;
        }
        ServicePlayerState servicePlayerState = (ServicePlayerState) this.A0F.get();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!servicePlayerState.A0E || servicePlayerState.A0D) {
            return 0;
        }
        return elapsedRealtime - servicePlayerState.A0B;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001c, code lost:
        if ((android.os.SystemClock.elapsedRealtime() - r6.A0M) > ((long) r6.A0B.A0H)) goto L_0x001e;
     */
    public final long A06() {
        boolean z;
        if (!A0C()) {
            return 0;
        }
        if (this.A0P) {
            z = true;
        }
        z = false;
        if (z) {
            return this.A0K;
        }
        return ((ServicePlayerState) this.A0F.get()).A04 + A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        if (r1 == false) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001c, code lost:
        if ((android.os.SystemClock.elapsedRealtime() - r6.A0M) > ((long) r6.A0B.A0H)) goto L_0x001e;
     */
    public final long A07() {
        boolean z;
        boolean z2;
        if (!A0C()) {
            return 0;
        }
        if (this.A0P) {
            z = true;
        }
        z = false;
        if (z) {
            VideoPlayRequest videoPlayRequest = this.A07.A06;
            if (videoPlayRequest != null) {
                boolean A002 = videoPlayRequest.A00();
                z2 = true;
            }
            z2 = false;
            if (!z2) {
                return this.A0K;
            }
        }
        return ((ServicePlayerState) this.A0F.get()).A00() + A00();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:2|3|4|5|6|7|8) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0018 */
    public final void A0A() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (this.A0C) {
            A0B(new C56942dJ(this));
            this.A0C.wait((long) CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS);
            Thread.currentThread().interrupt();
        }
        A03(this, "releaseSurface time: %d", Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
    }
}
