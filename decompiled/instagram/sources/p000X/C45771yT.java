package p000X;

import android.os.RemoteException;
import android.os.SystemClock;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.video.heroplayer.ipc.HeroPlayerServiceApi;
import com.facebook.video.heroplayer.ipc.LiveState;
import com.facebook.video.heroplayer.ipc.ParcelableCue;
import com.facebook.video.heroplayer.ipc.ParcelableFormat;
import com.facebook.video.heroplayer.ipc.ServicePlayerState;
import com.facebook.video.heroplayer.ipc.VideoSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

/* renamed from: X.1yT  reason: invalid class name and case insensitive filesystem */
public final class C45771yT implements C45781yU {
    public boolean A00;
    public final WeakReference A01;

    public final void BOA(int i) {
    }

    public final void BRd(List list) {
    }

    public final void BVN() {
    }

    public final void Ayv(List list) {
        C45731yP r3 = (C45731yP) this.A01.get();
        if (r3 != null && r3.A04 != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((ParcelableCue) it.next()).A00);
            }
            r3.A04.Ayu(r3, arrayList);
        }
    }

    public final void AzH(String str, boolean z, long j) {
        C45731yP r2 = (C45731yP) this.A01.get();
        if (r2 != null) {
            if (z) {
                C45761yS r1 = r2.A0J;
                r1.A02 = str;
                r1.A00 = (int) j;
            } else {
                r2.A0J.A01 = str;
            }
            C29070CrN crN = r2.A0A;
            if (crN != null && z) {
                crN.setDecoderName(str);
            }
        }
    }

    public final void AzI(int i, int i2, int i3, int i4) {
        C45731yP r1 = (C45731yP) this.A01.get();
        if (r1 != null) {
            String str = r1.A0G().A02;
            C45571y9 r0 = r1.A09;
            if (r0 != null) {
                r0.AzJ(i, i2, i3, i4, str);
            }
        }
    }

    public final void B0v(ParcelableFormat parcelableFormat, long j, String str, List list) {
        String str2;
        C45731yP r2 = (C45731yP) this.A01.get();
        if (r2 != null) {
            Object[] objArr = new Object[5];
            objArr[0] = r2.A0I();
            VideoSource videoSource = r2.A06;
            if (videoSource != null) {
                str2 = videoSource.A0D;
            } else {
                str2 = "";
            }
            objArr[1] = str2;
            objArr[2] = Integer.valueOf(parcelableFormat.A03 / 1000);
            objArr[3] = Integer.valueOf(parcelableFormat.A05);
            objArr[4] = Integer.valueOf(parcelableFormat.A04);
            C45731yP.A04(r2, "REPRESENTATION_ENDED: playerid [%s] for vid %s: next format bitrate: %d kbps, w: %d, h: %d", objArr);
            r2.A04 = parcelableFormat;
            if (r2.A05 != null) {
                C45731yP.A02(r2, parcelableFormat, list);
            }
        }
    }

    public final void B1b() {
        C45731yP r0 = (C45731yP) this.A01.get();
    }

    public final void BCp(byte[] bArr, long j) {
        C80173ek r0;
        C86263ok r02;
        C45731yP r03 = (C45731yP) this.A01.get();
        if (r03 != null && (r0 = r03.A01) != null && (r02 = r0.A01) != null) {
            r02.A04.add(new C108014l5(bArr, j));
        }
    }

    public final void BEU(String str, String str2, C29634D2r d2r, C42071rS r14, long j, int i, int i2, long j2, int i3, int i4, boolean z) {
        String str3;
        C45731yP r2 = (C45731yP) this.A01.get();
        if ("LOCAL_SOCKET_NO_CONNECTION".equals(str)) {
            AnonymousClass0QD.A01("local_socket_no_connection", AnonymousClass000.A0G(str2, ", address in use: ", C40121o7.A00().A05.hashCode()));
            if (!this.A00 && r2 != null) {
                C40121o7 A002 = C40121o7.A00();
                synchronized (A002) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime - A002.A04 >= 3000) {
                        A002.A04 = elapsedRealtime;
                        A002.A07 = false;
                        A002.A05 = UUID.randomUUID().toString();
                    }
                }
                C39701nL.A02();
                try {
                    C39731nP r3 = C39731nP.A0W;
                    String str4 = C40121o7.A00().A05;
                    HeroPlayerServiceApi heroPlayerServiceApi = r3.A0K;
                    if (heroPlayerServiceApi != null) {
                        heroPlayerServiceApi.Bju(str4);
                    }
                } catch (RemoteException unused) {
                }
                this.A00 = true;
            }
        }
        if (r2 != null) {
            VideoSource videoSource = r2.A06;
            if (!(videoSource == null || (str3 = videoSource.A0D) == null)) {
                C40541op r6 = r2.A08.A03;
                String d2r2 = d2r.toString();
                if (r6.A03.A00()) {
                    int hashCode = str3.hashCode();
                    r6.A01.markerStart(28180483, hashCode);
                    HashMap hashMap = new HashMap();
                    hashMap.put("state", C24682Ark.A00(Constants.A05));
                    hashMap.put("time_ms", Long.toString(SystemClock.elapsedRealtime()));
                    hashMap.put(TraceFieldType.VideoId, str3);
                    hashMap.put("player_id", "0");
                    if (d2r2 != null) {
                        hashMap.put(TraceFieldType.ErrorDomain, d2r2);
                    }
                    if (str != null) {
                        hashMap.put(TraceFieldType.ErrorCode, str);
                    }
                    if (str2 != null) {
                        hashMap.put("error_details", str2);
                    }
                    C40441of.A00(28180483, hashCode, hashMap);
                    r6.A01.markerEnd(28180483, hashCode, 2);
                }
            }
            VideoSource videoSource2 = r2.A06;
            C45561y8 r0 = r2.A07;
            if (r0 != null) {
                r0.B2f(r2, str, str2);
            }
            C29070CrN crN = r2.A0A;
            if (crN != null) {
                crN.setErrorOrWarningCause(str, str2);
            }
            C40581ot r32 = r2.A07;
            if (r32 != null) {
                int A08 = r2.A08();
                Integer num = r2.A0B;
                String str5 = str2;
                C06270Ok A003 = C06270Ok.A00();
                if (str2 == null) {
                    str5 = "unknown";
                }
                A003.A09("reason", str5);
                A003.A09("event_severity", "ERROR");
                r32.A01("live_video_error", A08, videoSource2, num, A003);
            }
            if (((Boolean) AnonymousClass0L6.A02(r2.A0I, AnonymousClass0L7.VIDEO_EXOPLAYER_2, "is_exo2_enabled", true, (AnonymousClass04H) null)).booleanValue() && str2 != null && Pattern.matches("length=\\d; index=\\d", str2)) {
                AnonymousClass0QD.A01("IgHeroPlayer", "ArrayIndexOutOfBoundsException");
            }
        }
    }

    public final void BFH(long j, String str) {
        C45731yP r2 = (C45731yP) this.A01.get();
        if (r2 != null) {
            if (!r2.A0D) {
                C45641yG r0 = r2.A0A;
                if (r0 != null) {
                    r0.BFK(r2, j);
                }
                C29070CrN crN = r2.A0A;
                if (crN != null) {
                    crN.A03(Constants.ZERO);
                }
            }
            r2.A0D = true;
        }
    }

    public final void BFL() {
        C45651yH r0;
        C45731yP r1 = (C45731yP) this.A01.get();
        if (r1 != null && (r0 = r1.A0B) != null) {
            r0.BFM(r1);
        }
    }

    public final void BLq(long j) {
        C57662eZ r0;
        C45731yP r1 = (C45731yP) this.A01.get();
        if (r1 != null && (r0 = r1.A0C) != null) {
            r0.BLs(r1, j);
        }
    }

    public final void BOS(ServicePlayerState servicePlayerState, LiveState liveState, boolean z, boolean z2) {
        String str;
        C45731yP r3 = (C45731yP) this.A01.get();
        if (r3 != null) {
            Object[] objArr = new Object[2];
            objArr[0] = r3.A0I();
            VideoSource videoSource = r3.A06;
            if (videoSource != null) {
                str = videoSource.A0D;
            } else {
                str = "";
            }
            objArr[1] = str;
            C45731yP.A04(r3, "START_BUFFERING: playerId %s for vid %s", objArr);
            C45551y7 r0 = r3.A02;
            if (r0 != null) {
                r0.Atq(r3);
            }
            C40581ot r4 = r3.A07;
            if (r4 != null) {
                r4.A01("live_video_start_buffering", r3.A08(), r3.A06, r3.A0B, (C06270Ok) null);
            }
            C29070CrN crN = r3.A0A;
            if (crN != null) {
                crN.A04(Constants.ONE);
            }
        }
    }

    public final void BP8(long j, boolean z, boolean z2) {
        String str;
        C45731yP r2 = (C45731yP) this.A01.get();
        if (r2 != null) {
            int i = (int) j;
            Object[] objArr = new Object[3];
            objArr[0] = r2.A0I();
            VideoSource videoSource = r2.A06;
            if (videoSource != null) {
                str = videoSource.A0D;
            } else {
                str = "";
            }
            objArr[1] = str;
            objArr[2] = Integer.valueOf(i);
            C45731yP.A04(r2, "STOP_BUFFERING: playerId %s for vid %s for time: %d", objArr);
            C45551y7 r0 = r2.A02;
            if (r0 != null) {
                r0.Ato(r2, i);
            }
            C40581ot r3 = r2.A07;
            if (r3 != null) {
                r3.A01("live_video_end_buffering", r2.A08(), r2.A06, r2.A0B, (C06270Ok) null);
            }
            C29070CrN crN = r2.A0A;
            if (crN != null) {
                crN.A03(Constants.ONE);
            }
        }
    }

    public final void BUk(long j, String str) {
        String str2;
        C45731yP r3 = (C45731yP) this.A01.get();
        if (r3 != null) {
            Object[] objArr = new Object[2];
            objArr[0] = r3.A0I();
            VideoSource videoSource = r3.A06;
            if (videoSource != null) {
                str2 = videoSource.A0D;
            } else {
                str2 = "";
            }
            objArr[1] = str2;
            C45731yP.A04(r3, "CANCELLED: playerid %s for vid %s", objArr);
            C40581ot r2 = r3.A07;
            if (r2 != null) {
                r2.A01("live_video_cancelled", r3.A08(), r3.A06, r3.A0B, (C06270Ok) null);
            }
        }
    }

    public final void BUn(long j, long j2, int i, int i2, long j3, Integer num, boolean z, int i3, int i4) {
        String str;
        String str2;
        Integer num2;
        C45731yP r2 = (C45731yP) this.A01.get();
        if (r2 != null) {
            if (r2.A0c()) {
                C45631yF r0 = r2.A08;
                if (r0 != null) {
                    r0.BAK(r2);
                }
            } else {
                int i5 = (int) j2;
                Object[] objArr = new Object[4];
                objArr[0] = r2.A0I();
                VideoSource videoSource = r2.A06;
                if (videoSource != null) {
                    str = videoSource.A0D;
                } else {
                    str = "";
                }
                objArr[1] = str;
                int i6 = i;
                objArr[2] = Integer.valueOf(i);
                objArr[3] = Integer.valueOf(i5);
                C45731yP.A04(r2, "COMPLETED: playerid %s for vid %s, stallCount: %d, stallTime: %s", objArr);
                C45591yB r02 = r2.A03;
                if (r02 != null) {
                    r02.Axp(r2);
                }
                C40581ot r3 = r2.A07;
                if (r3 != null) {
                    r3.A00(r2.A08(), r2.A06, r2.A0B, i6, i5);
                }
            }
            VideoSource videoSource2 = r2.A06;
            if (videoSource2 != null && (str2 = videoSource2.A0D) != null) {
                switch (videoSource2.A06.ordinal()) {
                    case 0:
                        num2 = Constants.ONE;
                        break;
                    case 1:
                        num2 = Constants.A0C;
                        break;
                    default:
                        num2 = Constants.A0N;
                        break;
                }
                C40541op r5 = r2.A08.A03;
                boolean A012 = r2.A06.A01();
                C54382Xb r1 = new C54382Xb(Constants.A0Y, str2, r2.A0I(), (int) j);
                r1.A04 = num2;
                r1.A00 = Boolean.valueOf(A012);
                C40541op.A00(r5, r1);
                C40541op.A01(r5, new C54392Xc(r1));
                r5.A00 = null;
            }
        }
    }

    public final void BV1(long j, long j2, int i, int i2, long j3, Integer num, long j4, String str, int i3, int i4) {
        String str2;
        C06270Ok r9;
        C45731yP r3 = (C45731yP) this.A01.get();
        if (r3 != null) {
            int i5 = (int) j2;
            Object[] objArr = new Object[4];
            objArr[0] = r3.A0I();
            VideoSource videoSource = r3.A06;
            if (videoSource != null) {
                str2 = videoSource.A0D;
            } else {
                str2 = "";
            }
            objArr[1] = str2;
            Integer valueOf = Integer.valueOf(i);
            objArr[2] = valueOf;
            Integer valueOf2 = Integer.valueOf(i5);
            objArr[3] = valueOf2;
            C45731yP.A04(r3, "PAUSED: playerid %s for vid %s, stallCount: %d, stallTime: %d", objArr);
            C40581ot r4 = r3.A07;
            if (r4 != null) {
                int A08 = r3.A08();
                VideoSource videoSource2 = r3.A06;
                Integer num2 = r3.A0B;
                if (i > 0) {
                    r9 = C06270Ok.A00();
                    r9.A07("stall_count", valueOf);
                    r9.A07("stall_time", valueOf2);
                } else {
                    r9 = null;
                }
                r4.A01("live_video_paused", A08, videoSource2, num2, r9);
            }
        }
    }

    public final void BVK(String str) {
        String str2;
        C45731yP r3 = (C45731yP) this.A01.get();
        if (r3 != null) {
            Object[] objArr = new Object[2];
            objArr[0] = r3.A0I();
            VideoSource videoSource = r3.A06;
            if (videoSource != null) {
                str2 = videoSource.A0D;
            } else {
                str2 = "";
            }
            objArr[1] = str2;
            C45731yP.A04(r3, "REQUESTED_PLAYING: playerId %s may start stall for vid %s", objArr);
            C40581ot r2 = r3.A07;
            if (r2 != null) {
                r2.A01("live_video_requested_playing", r3.A08(), r3.A06, r3.A0B, (C06270Ok) null);
            }
        }
    }

    public final void BVO(int i, int i2) {
        C45731yP r1 = (C45731yP) this.A01.get();
        if (r1 != null) {
            r1.A02 = i;
            r1.A01 = i2;
            C45661yI r0 = r1.A0E;
            if (r0 != null) {
                r0.BVR(r1, i, i2);
            }
        }
    }

    public final void BVW(ServicePlayerState servicePlayerState, LiveState liveState, boolean z, boolean z2, String str, String str2) {
        String str3;
        C45731yP r2 = (C45731yP) this.A01.get();
        if (r2 != null) {
            C45731yP.A02(r2, r2.A04, (List) null);
            Object[] objArr = new Object[6];
            objArr[0] = r2.A0I();
            VideoSource videoSource = r2.A06;
            if (videoSource != null) {
                str3 = videoSource.A0D;
            } else {
                str3 = "";
            }
            objArr[1] = str3;
            objArr[2] = Integer.valueOf((int) r2.A0H.A07());
            objArr[3] = Integer.valueOf(r2.A0A() / 1000);
            objArr[4] = Integer.valueOf(r2.A02);
            objArr[5] = Integer.valueOf(r2.A01);
            C45731yP.A04(r2, "STARTED PLAYING: playerId %s start playing for vid %s , position: %d, bitrate: %d kbps, w: %d, h: %d", objArr);
            C40581ot r1 = r2.A07;
            if (r1 != null) {
                r1.A01("live_video_started_playing", r2.A08(), r2.A06, r2.A0B, (C06270Ok) null);
            }
        }
    }

    public final void BW9(boolean z, boolean z2) {
        C45731yP r0 = (C45731yP) this.A01.get();
        if (r0 != null) {
            C45751yR r6 = r0.A0K;
            synchronized (r6) {
                if (!z) {
                    if (r6.A00 > 0) {
                        r6.A01 += SystemClock.elapsedRealtime() - r6.A00;
                    }
                    r6.A00 = -1;
                } else if (r6.A00 < 0) {
                    r6.A00 = SystemClock.elapsedRealtime();
                }
            }
        }
    }

    public final void BuA(String str, String str2) {
        C45731yP r0 = (C45731yP) this.A01.get();
        if (r0 != null) {
            C45731yP.A03(r0, str, str2);
        }
    }

    public C45771yT(C45731yP r2) {
        this.A01 = new WeakReference(r2);
    }
}
