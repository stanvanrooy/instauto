package p000X;

import android.os.RemoteException;
import android.os.SystemClock;
import android.view.Surface;
import com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi;
import com.facebook.video.heroplayer.ipc.LiveState;
import com.facebook.video.heroplayer.ipc.ServicePlayerState;
import com.facebook.video.heroplayer.ipc.VideoPlayRequest;
import com.facebook.video.heroplayer.ipc.VideoSource;
import java.util.UUID;

/* renamed from: X.1yX  reason: invalid class name and case insensitive filesystem */
public final class C45811yX {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public Surface A04;
    public HeroPlayerServiceApi A05;
    public VideoPlayRequest A06;
    public boolean A07;
    public boolean A08;
    public volatile Surface A09;
    public final /* synthetic */ C45791yV A0A;

    public static void A03(C45811yX r4) {
        r4.A08 = false;
        r4.A01 = 0;
        r4.A00 = 0;
        r4.A06 = null;
        r4.A0A.A0H = 1.0f;
        r4.A02 = 0;
        r4.A03 = 0;
        r4.A0A.A0L = 0;
        r4.A0A.A0O = false;
        r4.A0A.A0F.set(new ServicePlayerState());
        r4.A0A.A0E.set(LiveState.A09);
        synchronized (r4.A0A.A0D) {
            r4.A0A.A0D.clear();
            r4.A0A.A00 = -1;
        }
    }

    public C45811yX(C45791yV r1) {
        this.A0A = r1;
    }

    public static HeroPlayerServiceApi A00(C45811yX r1) {
        HeroPlayerServiceApi heroPlayerServiceApi = r1.A05;
        if (heroPlayerServiceApi != null) {
            return heroPlayerServiceApi;
        }
        throw new RemoteException("No service api available");
    }

    public static void A01(C45811yX r11) {
        HeroPlayerServiceApi heroPlayerServiceApi = C39731nP.A0W.A0K;
        r11.A05 = heroPlayerServiceApi;
        if (heroPlayerServiceApi == null) {
            throw new RemoteException("Failed ensure service player, service not connected");
        }
        if (r11.A06 != null) {
            try {
                long Btk = heroPlayerServiceApi.Btk(r11.A0A.A0J, r11.A06, r11.A0A.A0A);
                if (Btk != r11.A0A.A0J) {
                    r11.A0A.A0N = null;
                }
                r11.A0A.A0J = Btk;
                C45791yV r5 = r11.A0A;
                long[] jArr = r5.A0G;
                jArr[1] = jArr[0];
                jArr[0] = r5.A0J;
            } catch (RemoteException | IllegalStateException | NullPointerException e) {
                C45791yV.A04(r11.A0A, e, C29634D2r.PLAYER_ERROR, C42071rS.DEAD_PLAYER_SERVICE, "PLAYERSERVICE_DEAD", "Error occurs while creating player");
                r11.A0A.A0J = 0;
                throw new RemoteException(AnonymousClass000.A0E("Failed ensure service player, ", e.getMessage()));
            }
        }
        if (r11.A09 != null && ((r11.A09 != r11.A04 || !r11.A0A.A0B.A1e) && r11.A05.Bkx(r11.A0A.A0J, r11.A09))) {
            r11.A04 = r11.A09;
        }
        VideoPlayRequest videoPlayRequest = r11.A06;
        if (videoPlayRequest != null) {
            if (r11.A02 > 0) {
                if (videoPlayRequest.A00()) {
                    r11.A05.Bk7(r11.A0A.A0J, r11.A03);
                } else {
                    long incrementAndGet = C45791yV.A0T.incrementAndGet();
                    if (r11.A05.Bew(r11.A0A.A0J, r11.A02, incrementAndGet, false)) {
                        r11.A0A.A0K = r11.A02;
                        r11.A0A.A0L = incrementAndGet;
                        r11.A0A.A0M = SystemClock.elapsedRealtime();
                    } else {
                        r11.A0A.A0L = 0;
                    }
                }
                r11.A02 = 0;
                r11.A03 = 0;
            } else {
                if (r11.A01 > 0) {
                    long incrementAndGet2 = C45791yV.A0T.incrementAndGet();
                    if (r11.A05.Bew(r11.A0A.A0J, (long) r11.A01, incrementAndGet2, false)) {
                        r11.A0A.A0K = (long) r11.A01;
                        r11.A0A.A0L = incrementAndGet2;
                        r11.A0A.A0M = SystemClock.elapsedRealtime();
                    } else {
                        r11.A0A.A0L = 0;
                    }
                }
                if (r11.A00 > 0) {
                    r11.A05.Bk7(r11.A0A.A0J, (long) r11.A00);
                }
            }
            C45791yV r1 = r11.A0A;
            if (r1.A01 != null) {
                r1.A01 = UUID.randomUUID().toString();
                C45791yV r0 = r11.A0A;
                r0.A09.BVK(r0.A01);
            }
            r11.A05.BXv(r11.A0A.A0J, r11.A06, r11.A08, r11.A0A.A0I, r11.A0A.A0O, r11.A0A.A01);
        }
        r11.A07 = false;
    }

    public static void A02(C45811yX r0) {
        String str;
        VideoSource videoSource;
        VideoPlayRequest videoPlayRequest = r0.A06;
        if (videoPlayRequest == null || (videoSource = videoPlayRequest.A05) == null) {
            str = null;
        } else {
            str = videoSource.A0D;
        }
        String.valueOf(str);
    }

    public static void A04(C45811yX r6, ServicePlayerState servicePlayerState) {
        synchronized (r6.A0A.A0F) {
            if (((ServicePlayerState) r6.A0A.A0F.get()).A0B <= servicePlayerState.A0B) {
                r6.A0A.A0F.set(servicePlayerState);
                if (servicePlayerState.A07 < r6.A0A.A0L) {
                    r6.A0A.A0P = true;
                } else if (servicePlayerState.A0E) {
                    r6.A0A.A0P = false;
                }
            }
        }
    }

    public static void A05(C45811yX r5, boolean z) {
        r5.A0A.A0L = 0;
        C45791yV r4 = r5.A0A;
        long[] jArr = r4.A0G;
        jArr[1] = 0;
        jArr[0] = 0;
        if (r4.A0C()) {
            r5.A0A.A0J = 0;
            r5.A04 = null;
            r5.A0A.A09();
            A02(r5);
        }
    }
}
