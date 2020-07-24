package com.facebook.video.heroplayer.client;

import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.video.heroplayer.ipc.HeroServicePlayerListener;
import com.facebook.video.heroplayer.ipc.LiveState;
import com.facebook.video.heroplayer.ipc.ParcelableFormat;
import com.facebook.video.heroplayer.ipc.ServicePlayerState;
import java.lang.ref.WeakReference;
import java.util.List;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass2J3;
import p000X.C29634D2r;
import p000X.C42071rS;
import p000X.C45791yV;
import p000X.C45811yX;
import p000X.C50052Es;

public final class HeroPlayer$HeroServicePlayerListenerImpl extends HeroServicePlayerListener.Stub {
    public final WeakReference A00;

    public HeroPlayer$HeroServicePlayerListenerImpl(C45791yV r3) {
        int A03 = AnonymousClass0Z0.A03(1538213256);
        this.A00 = new WeakReference(r3);
        AnonymousClass0Z0.A0A(2007819227, A03);
    }

    public final void Atp(ServicePlayerState servicePlayerState, LiveState liveState, boolean z) {
        int A03 = AnonymousClass0Z0.A03(428357811);
        C45791yV r7 = (C45791yV) this.A00.get();
        if (r7 != null) {
            C45791yV.A02(r7, servicePlayerState, false);
            boolean z2 = false;
            C45791yV.A03(r7, "onBufferingStarted", new Object[0]);
            if (SystemClock.elapsedRealtime() - r7.A0M < ((long) 500)) {
                z2 = true;
            }
            r7.A09.BOS(servicePlayerState, liveState, z, z2);
        }
        AnonymousClass0Z0.A0A(-815613604, A03);
    }

    public final void Atr(ServicePlayerState servicePlayerState, boolean z) {
        int A03 = AnonymousClass0Z0.A03(1543033675);
        C45791yV r0 = (C45791yV) this.A00.get();
        if (r0 != null) {
            C45791yV.A02(r0, servicePlayerState, z);
        }
        AnonymousClass0Z0.A0A(1171042110, A03);
    }

    public final void Aug(ServicePlayerState servicePlayerState, String str) {
        int A03 = AnonymousClass0Z0.A03(56912113);
        BEZ(servicePlayerState);
        C45791yV r4 = (C45791yV) this.A00.get();
        if (r4 != null) {
            long A002 = servicePlayerState.A00();
            C45791yV.A03(r4, "onCancelled", new Object[0]);
            r4.A09.BUk(A002, str);
            r4.A09();
            C45811yX.A02(r4.A07);
        }
        AnonymousClass0Z0.A0A(-246422243, A03);
    }

    public final void Axn(ServicePlayerState servicePlayerState, boolean z) {
        int A03 = AnonymousClass0Z0.A03(-2098675800);
        C45791yV r6 = (C45791yV) this.A00.get();
        if (r6 != null) {
            ServicePlayerState servicePlayerState2 = servicePlayerState;
            C45791yV.A02(r6, servicePlayerState2, false);
            long A002 = servicePlayerState2.A00();
            String str = servicePlayerState2.A0H;
            int i = servicePlayerState2.A00;
            int i2 = servicePlayerState2.A03;
            C45791yV.A03(r6, "onCompletion", new Object[0]);
            AnonymousClass2J3 A08 = r6.A08();
            r6.A09.BUn(A002, A08.A03, A08.A00, A08.A01, A08.A02, C50052Es.A00(str), z, i, i2);
        }
        AnonymousClass0Z0.A0A(-367625539, A03);
    }

    public final void Ayv(List list) {
        int A03 = AnonymousClass0Z0.A03(-1789479185);
        C45791yV r2 = (C45791yV) this.A00.get();
        if (r2 != null) {
            C45791yV.A03(r2, "onCues", new Object[0]);
            r2.A09.Ayv(list);
        }
        AnonymousClass0Z0.A0A(998790273, A03);
    }

    public final void AzH(String str, boolean z, long j) {
        int A03 = AnonymousClass0Z0.A03(-319340447);
        C45791yV r4 = (C45791yV) this.A00.get();
        if (r4 != null) {
            C45791yV.A03(r4, "onDecoderInitialized name: %s, isVideo %s, duration: %d", str, Boolean.valueOf(z), Long.valueOf(j));
            r4.A09.AzH(str, z, j);
        }
        AnonymousClass0Z0.A0A(799982153, A03);
    }

    public final void AzI(int i, int i2, int i3, int i4) {
        int A03 = AnonymousClass0Z0.A03(1180343711);
        C45791yV r4 = (C45791yV) this.A00.get();
        if (r4 != null) {
            C45791yV.A03(r4, "onDecoderPerfReport avgDecodeTimeMsPerFrame: %d, width %d, height: %d, bitrate %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            r4.A09.AzI(i, i2, i3, i4);
        }
        AnonymousClass0Z0.A0A(276630363, A03);
    }

    public final void B0w(ParcelableFormat parcelableFormat, String str, List list) {
        String str2;
        int A03 = AnonymousClass0Z0.A03(236034535);
        C45791yV r3 = (C45791yV) this.A00.get();
        if (r3 != null) {
            long A07 = r3.A07();
            ParcelableFormat parcelableFormat2 = parcelableFormat;
            if (parcelableFormat != null) {
                C45791yV.A03(r3, "onDownStreamFormatChanged Format: %s, bitrate: %d kbps, w: %d, h: %d", parcelableFormat.A0D, Integer.valueOf(parcelableFormat.A03 / 1000), Integer.valueOf(parcelableFormat.A05), Integer.valueOf(parcelableFormat.A04));
            }
            List list2 = list;
            if (list != null) {
                str2 = TextUtils.join(", ", list);
            } else {
                str2 = "<none>";
            }
            C45791yV.A03(r3, "onDownStreamFormatChanged customQualities: %s", str2);
            r3.A09.B0v(parcelableFormat2, A07, str, list2);
        }
        AnonymousClass0Z0.A0A(199848880, A03);
    }

    public final void B1b() {
        int A03 = AnonymousClass0Z0.A03(-1062430938);
        C45791yV r2 = (C45791yV) this.A00.get();
        if (r2 != null) {
            C45791yV.A03(r2, "onDrawnToSurface", new Object[0]);
            r2.A09.B1b();
        }
        AnonymousClass0Z0.A0A(-2128545266, A03);
    }

    public final void B2l(String str, String str2, String str3, String str4) {
        C29634D2r d2r;
        C42071rS r10;
        int A03 = AnonymousClass0Z0.A03(-804917848);
        C45791yV r3 = (C45791yV) this.A00.get();
        if (r3 != null) {
            try {
                d2r = C29634D2r.valueOf(str3);
            } catch (IllegalArgumentException | NullPointerException unused) {
                d2r = C29634D2r.UNKNOWN;
            }
            try {
                r10 = C42071rS.valueOf(str4);
            } catch (IllegalArgumentException | NullPointerException unused2) {
                r10 = C42071rS.UNKNOWN;
            }
            C45791yV.A03(r3, "onError", new Object[0]);
            String str5 = str;
            String str6 = str2;
            if ("DISMISS".equals(str5)) {
                C45791yV.A01(r3, r3.A04.obtainMessage(17, new String[]{str, str2}));
            } else {
                ServicePlayerState servicePlayerState = (ServicePlayerState) r3.A0F.get();
                r3.A09.BEU(str5, str6, d2r, r10, 0, 0, 0, 0, servicePlayerState.A00, servicePlayerState.A03, ((LiveState) r3.A0E.get()).A08);
            }
            r3.A09();
            C45811yX.A02(r3.A07);
        }
        AnonymousClass0Z0.A0A(-1331189410, A03);
    }

    public final void B9K(LiveState liveState) {
        int A03 = AnonymousClass0Z0.A03(1787234390);
        C45791yV r0 = (C45791yV) this.A00.get();
        if (r0 != null) {
            C45811yX r7 = r0.A07;
            synchronized (r7.A0A.A0E) {
                if (((LiveState) r7.A0A.A0E.get()).A07 <= liveState.A07) {
                    r7.A0A.A0E.set(liveState);
                }
            }
        }
        AnonymousClass0Z0.A0A(-1193348076, A03);
    }

    public final void BCp(byte[] bArr, long j) {
        int A03 = AnonymousClass0Z0.A03(-2036307981);
        C45791yV r2 = (C45791yV) this.A00.get();
        if (r2 != null) {
            C45791yV.A03(r2, "onNewAudioData", new Object[0]);
            r2.A09.BCp(bArr, j);
        }
        AnonymousClass0Z0.A0A(-1720965767, A03);
    }

    public final void BE3(ServicePlayerState servicePlayerState, long j, String str) {
        int A03 = AnonymousClass0Z0.A03(245886291);
        C45791yV r4 = (C45791yV) this.A00.get();
        if (r4 != null) {
            ServicePlayerState servicePlayerState2 = servicePlayerState;
            C45791yV.A02(r4, servicePlayerState2, false);
            long A002 = servicePlayerState2.A00();
            String str2 = servicePlayerState2.A0H;
            int i = servicePlayerState2.A00;
            int i2 = servicePlayerState2.A03;
            C45791yV.A03(r4, "onPaused", new Object[0]);
            AnonymousClass2J3 A08 = r4.A08();
            r4.A09.BV1(A002, A08.A03, A08.A00, A08.A01, A08.A02, C50052Es.A00(str2), j, str, i, i2);
            r4.A09();
            C45811yX.A02(r4.A07);
        }
        AnonymousClass0Z0.A0A(2057040380, A03);
    }

    public final void BEZ(ServicePlayerState servicePlayerState) {
        int A03 = AnonymousClass0Z0.A03(497005886);
        C45791yV r1 = (C45791yV) this.A00.get();
        if (r1 != null) {
            C45791yV.A02(r1, servicePlayerState, false);
        }
        AnonymousClass0Z0.A0A(-1130543083, A03);
    }

    public final void BFI(ServicePlayerState servicePlayerState, String str) {
        int A03 = AnonymousClass0Z0.A03(1831287595);
        C45791yV r4 = (C45791yV) this.A00.get();
        if (r4 != null) {
            C45791yV.A02(r4, servicePlayerState, false);
            long A002 = servicePlayerState.A00();
            C45791yV.A03(r4, "onPrepared", new Object[0]);
            r4.A09.BFH(A002, str);
            r4.A09();
            C45811yX.A02(r4.A07);
        }
        AnonymousClass0Z0.A0A(-924147032, A03);
    }

    public final void BI9(boolean z) {
        String str;
        int A03 = AnonymousClass0Z0.A03(1096561834);
        C45791yV r3 = (C45791yV) this.A00.get();
        if (r3 != null && r3.A0C()) {
            Object[] objArr = new Object[1];
            if (z) {
                str = "evicted";
            } else {
                str = "released";
            }
            objArr[0] = str;
            C45791yV.A03(r3, "Service player was %s", objArr);
            C45791yV.A01(r3, r3.A04.obtainMessage(12, Boolean.valueOf(z)));
        }
        AnonymousClass0Z0.A0A(-611015134, A03);
    }

    public final void BLr(long j, ServicePlayerState servicePlayerState) {
        int A03 = AnonymousClass0Z0.A03(-711015995);
        C45791yV r2 = (C45791yV) this.A00.get();
        if (r2 != null) {
            C45791yV.A02(r2, servicePlayerState, false);
            C45791yV.A03(r2, "onSeeking", new Object[0]);
            r2.A09.BLq(j);
        }
        AnonymousClass0Z0.A0A(875374821, A03);
    }

    public final void BOA(int i) {
        int A03 = AnonymousClass0Z0.A03(-1312437304);
        C45791yV r3 = (C45791yV) this.A00.get();
        if (r3 != null) {
            C45791yV.A03(r3, "onSpatialAudioBufferUnderrun: %s", Integer.valueOf(i));
            r3.A09.BOA(i);
        }
        AnonymousClass0Z0.A0A(1497659176, A03);
    }

    public final void BOl(ServicePlayerState servicePlayerState, boolean z, boolean z2, String str, String str2) {
        int A03 = AnonymousClass0Z0.A03(794950758);
        C45791yV r2 = (C45791yV) this.A00.get();
        if (r2 != null) {
            C45791yV.A02(r2, servicePlayerState, false);
            C45791yV.A03(r2, "onStartedPlaying", new Object[0]);
            r2.A09.BVW(servicePlayerState, (LiveState) r2.A0E.get(), z, z2, str, str2);
            r2.A09();
            C45811yX.A02(r2.A07);
        }
        AnonymousClass0Z0.A0A(-569569632, A03);
    }

    public final void BRd(List list) {
        int A03 = AnonymousClass0Z0.A03(-1259377739);
        C45791yV r2 = (C45791yV) this.A00.get();
        if (r2 != null) {
            C45791yV.A03(r2, "onWarn", new Object[0]);
            r2.A09.BRd(list);
        }
        AnonymousClass0Z0.A0A(848435255, A03);
    }

    public final void BVO(int i, int i2) {
        int A03 = AnonymousClass0Z0.A03(-1263187823);
        C45791yV r3 = (C45791yV) this.A00.get();
        if (r3 != null) {
            C45791yV.A03(r3, "onVideoSizeChanged: w=%d, h=%d", Integer.valueOf(i), Integer.valueOf(i2));
            r3.A09.BVO(i, i2);
        }
        AnonymousClass0Z0.A0A(-391371686, A03);
    }

    public final void BWE(String str, String str2) {
        int A03 = AnonymousClass0Z0.A03(-187981357);
        C45791yV r2 = (C45791yV) this.A00.get();
        if (r2 != null) {
            C45791yV.A03(r2, "onWarn", new Object[0]);
            r2.A09.BuA(AnonymousClass000.A0J("HeroPlayer", "_", str), str2);
        }
        AnonymousClass0Z0.A0A(-554733765, A03);
    }
}
