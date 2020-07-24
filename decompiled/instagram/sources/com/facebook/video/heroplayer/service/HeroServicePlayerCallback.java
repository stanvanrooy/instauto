package com.facebook.video.heroplayer.service;

import android.os.RemoteException;
import com.facebook.video.heroplayer.ipc.HeroServicePlayerListener;
import com.facebook.video.heroplayer.ipc.LiveState;
import com.facebook.video.heroplayer.ipc.ParcelableFormat;
import com.facebook.video.heroplayer.ipc.ServicePlayerState;
import java.util.List;
import p000X.AnonymousClass0Z0;
import p000X.C29624D2g;
import p000X.C29626D2j;

public final class HeroServicePlayerCallback extends HeroServicePlayerListener.Stub {
    public final C29626D2j A00;
    public volatile HeroServicePlayerListener A01;

    public HeroServicePlayerCallback(C29626D2j d2j, HeroServicePlayerListener heroServicePlayerListener) {
        int A03 = AnonymousClass0Z0.A03(-117765904);
        if (heroServicePlayerListener != null) {
            this.A00 = d2j;
            this.A01 = heroServicePlayerListener;
            AnonymousClass0Z0.A0A(-1857756399, A03);
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("HeroServicePlayerListener cannot be null");
        AnonymousClass0Z0.A0A(-1977037932, A03);
        throw illegalArgumentException;
    }

    public final void Atp(ServicePlayerState servicePlayerState, LiveState liveState, boolean z) {
        int A03 = AnonymousClass0Z0.A03(588533850);
        try {
            this.A01.Atp(servicePlayerState, liveState, z);
        } catch (RemoteException | IllegalStateException e) {
            C29624D2g.A01(this.A00, e, "Failed to send onBufferingStarted(isPlaying = %s) callback", Boolean.valueOf(servicePlayerState.A0E));
        }
        AnonymousClass0Z0.A0A(-1242973747, A03);
    }

    public final void Atr(ServicePlayerState servicePlayerState, boolean z) {
        int A03 = AnonymousClass0Z0.A03(442410504);
        try {
            this.A01.Atr(servicePlayerState, z);
        } catch (RemoteException | IllegalStateException e) {
            C29624D2g.A01(this.A00, e, "Failed to send onBufferingStopped(isPlaying = %s) callback", Boolean.valueOf(servicePlayerState.A0E));
        }
        AnonymousClass0Z0.A0A(1392072305, A03);
    }

    public final void Aug(ServicePlayerState servicePlayerState, String str) {
        int A03 = AnonymousClass0Z0.A03(-1341158878);
        try {
            this.A01.Aug(servicePlayerState, str);
        } catch (RemoteException | IllegalStateException e) {
            C29624D2g.A01(this.A00, e, "Failed send onCancelled() callback", new Object[0]);
        }
        AnonymousClass0Z0.A0A(-1346411902, A03);
    }

    public final void Axn(ServicePlayerState servicePlayerState, boolean z) {
        int A03 = AnonymousClass0Z0.A03(-49716315);
        try {
            this.A01.Axn(servicePlayerState, z);
        } catch (RemoteException | IllegalStateException e) {
            C29624D2g.A01(this.A00, e, "Failed to send onCompletion(isPlaying = %s) callback", Boolean.valueOf(servicePlayerState.A0E));
        }
        AnonymousClass0Z0.A0A(-246562711, A03);
    }

    public final void Ayv(List list) {
        int A03 = AnonymousClass0Z0.A03(-1689992518);
        try {
            this.A01.Ayv(list);
        } catch (RemoteException | IllegalStateException e) {
            C29624D2g.A01(this.A00, e, "Failed send onCues(list = %s) callback", list);
        }
        AnonymousClass0Z0.A0A(-1735509832, A03);
    }

    public final void AzH(String str, boolean z, long j) {
        int A03 = AnonymousClass0Z0.A03(-449249565);
        try {
            this.A01.AzH(str, z, j);
        } catch (RemoteException | IllegalStateException e) {
            C29624D2g.A01(this.A00, e, "Failed to send decoder initialized callback", new Object[0]);
        }
        AnonymousClass0Z0.A0A(1669447850, A03);
    }

    public final void AzI(int i, int i2, int i3, int i4) {
        int A03 = AnonymousClass0Z0.A03(-1687906495);
        try {
            this.A01.AzI(i, i2, i3, i4);
        } catch (RemoteException | IllegalStateException e) {
            C29624D2g.A01(this.A00, e, "Failed to send onDecoderPerfReport callback", new Object[0]);
        }
        AnonymousClass0Z0.A0A(1321092293, A03);
    }

    public final void B0w(ParcelableFormat parcelableFormat, String str, List list) {
        int A03 = AnonymousClass0Z0.A03(-723880463);
        try {
            this.A01.B0w(parcelableFormat, str, list);
        } catch (RemoteException | IllegalStateException e) {
            C29624D2g.A01(this.A00, e, "Failed send onDownstreamFormatChanged() callback", new Object[0]);
        }
        AnonymousClass0Z0.A0A(-1003137353, A03);
    }

    public final void B1b() {
        int A03 = AnonymousClass0Z0.A03(650704696);
        try {
            this.A01.B1b();
        } catch (RemoteException | IllegalStateException e) {
            C29624D2g.A01(this.A00, e, "Failed to send onDrawnToSurface callback", new Object[0]);
        }
        AnonymousClass0Z0.A0A(25752036, A03);
    }

    public final void B2l(String str, String str2, String str3, String str4) {
        int A03 = AnonymousClass0Z0.A03(1313887912);
        try {
            this.A01.B2l(str, str2, str3, str4);
        } catch (RemoteException | IllegalStateException e) {
            C29624D2g.A01(this.A00, e, "Failed to send onError(cause = %s) callback", str);
        }
        AnonymousClass0Z0.A0A(-1169188361, A03);
    }

    public final void B9K(LiveState liveState) {
        int A03 = AnonymousClass0Z0.A03(147732795);
        try {
            this.A01.B9K(liveState);
        } catch (RemoteException | IllegalStateException e) {
            C29624D2g.A01(this.A00, e, "Failed to send live state update", new Object[0]);
        }
        AnonymousClass0Z0.A0A(-1470310322, A03);
    }

    public final void BCp(byte[] bArr, long j) {
        int A03 = AnonymousClass0Z0.A03(425904536);
        try {
            this.A01.BCp(bArr, j);
        } catch (RemoteException | IllegalStateException e) {
            C29624D2g.A01(this.A00, e, "Failed to send onNewAudioData callback", new Object[0]);
        }
        AnonymousClass0Z0.A0A(-693678287, A03);
    }

    public final void BE3(ServicePlayerState servicePlayerState, long j, String str) {
        int A03 = AnonymousClass0Z0.A03(-875931325);
        try {
            this.A01.BE3(servicePlayerState, j, str);
        } catch (RemoteException | IllegalStateException e) {
            C29624D2g.A01(this.A00, e, "Failed to send onPaused(isPlaying = %s) callback", Boolean.valueOf(servicePlayerState.A0E));
        }
        AnonymousClass0Z0.A0A(-1096703920, A03);
    }

    public final void BEZ(ServicePlayerState servicePlayerState) {
        int A03 = AnonymousClass0Z0.A03(1779628021);
        try {
            this.A01.BEZ(servicePlayerState);
        } catch (RemoteException | IllegalStateException e) {
            C29624D2g.A01(this.A00, e, "Failed to send onPlayerStateUpdate(isPlaying = %s) callback", Boolean.valueOf(servicePlayerState.A0E));
        }
        AnonymousClass0Z0.A0A(-1083667345, A03);
    }

    public final void BFI(ServicePlayerState servicePlayerState, String str) {
        int A03 = AnonymousClass0Z0.A03(1798475970);
        try {
            this.A01.BFI(servicePlayerState, str);
        } catch (RemoteException | IllegalStateException e) {
            C29624D2g.A01(this.A00, e, "Failed to send onPrepared callback", new Object[0]);
        }
        AnonymousClass0Z0.A0A(1006287105, A03);
    }

    public final void BI9(boolean z) {
        int A03 = AnonymousClass0Z0.A03(17932924);
        try {
            this.A01.BI9(z);
        } catch (RemoteException | IllegalStateException e) {
            C29624D2g.A01(this.A00, e, "Failed to send onRelease(isEvicted = %s) callback", Boolean.valueOf(z));
        }
        AnonymousClass0Z0.A0A(992411661, A03);
    }

    public final void BLr(long j, ServicePlayerState servicePlayerState) {
        int A03 = AnonymousClass0Z0.A03(-804474279);
        try {
            this.A01.BLr(j, servicePlayerState);
        } catch (RemoteException | IllegalStateException e) {
            C29624D2g.A01(this.A00, e, "Failed to send onSeeking callback", new Object[0]);
        }
        AnonymousClass0Z0.A0A(-668507010, A03);
    }

    public final void BOA(int i) {
        int A03 = AnonymousClass0Z0.A03(-2034284100);
        try {
            this.A01.BOA(i);
        } catch (RemoteException | IllegalStateException e) {
            C29624D2g.A01(this.A00, e, "Failed send onSpatialAudioBufferUnderrun(count = %s) callback", Integer.valueOf(i));
        }
        AnonymousClass0Z0.A0A(1525898575, A03);
    }

    public final void BOl(ServicePlayerState servicePlayerState, boolean z, boolean z2, String str, String str2) {
        int A03 = AnonymousClass0Z0.A03(1532297759);
        try {
            this.A01.BOl(servicePlayerState, z, z2, str, str2);
        } catch (RemoteException | IllegalStateException e) {
            C29624D2g.A01(this.A00, e, "Failed to send onStartedPlaying(isPlaying = %s) callback", Boolean.valueOf(servicePlayerState.A0E));
        }
        AnonymousClass0Z0.A0A(-511495959, A03);
    }

    public final void BRd(List list) {
        int A03 = AnonymousClass0Z0.A03(-1104695663);
        try {
            this.A01.BRd(list);
        } catch (RemoteException | IllegalStateException e) {
            C29624D2g.A01(this.A00, e, "Failed to send gaps changed callback", new Object[0]);
        }
        AnonymousClass0Z0.A0A(1618968679, A03);
    }

    public final void BVO(int i, int i2) {
        int A03 = AnonymousClass0Z0.A03(1004818338);
        try {
            this.A01.BVO(i, i2);
        } catch (RemoteException | IllegalStateException e) {
            C29624D2g.A01(this.A00, e, "Failed to send onVideoSizeChanged(width = %d, height = %d) callback", Integer.valueOf(i), Integer.valueOf(i2));
        }
        AnonymousClass0Z0.A0A(1299814260, A03);
    }

    public final void BWE(String str, String str2) {
        int A03 = AnonymousClass0Z0.A03(-2118030277);
        try {
            this.A01.BWE(str, str2);
        } catch (RemoteException | IllegalStateException e) {
            C29624D2g.A01(this.A00, e, "Failed to send onWarn callback", new Object[0]);
        }
        AnonymousClass0Z0.A0A(1900205464, A03);
    }
}
