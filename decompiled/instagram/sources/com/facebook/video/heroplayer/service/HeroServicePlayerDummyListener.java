package com.facebook.video.heroplayer.service;

import android.os.IBinder;
import com.facebook.video.heroplayer.ipc.HeroServicePlayerListener;
import com.facebook.video.heroplayer.ipc.LiveState;
import com.facebook.video.heroplayer.ipc.ParcelableFormat;
import com.facebook.video.heroplayer.ipc.ServicePlayerState;
import java.util.List;
import p000X.AnonymousClass0Z0;
import p000X.C29648D3f;
import p000X.C29649D3h;
import p000X.C29650D3j;
import p000X.C29651D3k;
import p000X.C29652D3l;
import p000X.C29653D3m;
import p000X.D3i;

public class HeroServicePlayerDummyListener implements HeroServicePlayerListener {
    public void AzH(String str, boolean z, long j) {
        int A03;
        int i;
        if (!(this instanceof WarmUpPlayerListener)) {
            A03 = AnonymousClass0Z0.A03(-949244850);
            i = 1103248360;
        } else {
            WarmUpPlayerListener warmUpPlayerListener = (WarmUpPlayerListener) this;
            A03 = AnonymousClass0Z0.A03(-22700534);
            warmUpPlayerListener.A01.add(new D3i(warmUpPlayerListener, str, z, j));
            i = -1963949019;
        }
        AnonymousClass0Z0.A0A(i, A03);
    }

    public void B0w(ParcelableFormat parcelableFormat, String str, List list) {
        if (!(this instanceof WarmUpPlayerListener)) {
            AnonymousClass0Z0.A0A(-551814998, AnonymousClass0Z0.A03(-947090995));
            return;
        }
        WarmUpPlayerListener warmUpPlayerListener = (WarmUpPlayerListener) this;
        int A03 = AnonymousClass0Z0.A03(-915076602);
        warmUpPlayerListener.A01.add(new C29649D3h(warmUpPlayerListener, parcelableFormat, str, list));
        AnonymousClass0Z0.A0A(319919505, A03);
    }

    public void B1b() {
        if (!(this instanceof WarmUpPlayerListener)) {
            AnonymousClass0Z0.A0A(1518992340, AnonymousClass0Z0.A03(1461717127));
            return;
        }
        WarmUpPlayerListener warmUpPlayerListener = (WarmUpPlayerListener) this;
        int A03 = AnonymousClass0Z0.A03(1690801067);
        warmUpPlayerListener.A01.add(new C29653D3m(warmUpPlayerListener));
        AnonymousClass0Z0.A0A(1946019433, A03);
    }

    public void B2l(String str, String str2, String str3, String str4) {
        int A03;
        int i;
        if (!(this instanceof WarmUpPlayerListener)) {
            A03 = AnonymousClass0Z0.A03(-318825731);
            i = 1441523092;
        } else {
            WarmUpPlayerListener warmUpPlayerListener = (WarmUpPlayerListener) this;
            A03 = AnonymousClass0Z0.A03(-597296554);
            warmUpPlayerListener.A01.add(new C29650D3j(warmUpPlayerListener, str, str2, str3, str4));
            i = -1066536934;
        }
        AnonymousClass0Z0.A0A(i, A03);
    }

    public void BFI(ServicePlayerState servicePlayerState, String str) {
        if (!(this instanceof WarmUpPlayerListener)) {
            AnonymousClass0Z0.A0A(2142419787, AnonymousClass0Z0.A03(1157324541));
            return;
        }
        WarmUpPlayerListener warmUpPlayerListener = (WarmUpPlayerListener) this;
        int A03 = AnonymousClass0Z0.A03(1458087020);
        warmUpPlayerListener.A01.add(new C29648D3f(warmUpPlayerListener, servicePlayerState, str));
        AnonymousClass0Z0.A0A(1516911818, A03);
    }

    public void BVO(int i, int i2) {
        if (!(this instanceof WarmUpPlayerListener)) {
            AnonymousClass0Z0.A0A(547445514, AnonymousClass0Z0.A03(-420451986));
            return;
        }
        WarmUpPlayerListener warmUpPlayerListener = (WarmUpPlayerListener) this;
        int A03 = AnonymousClass0Z0.A03(2061510879);
        warmUpPlayerListener.A01.add(new C29652D3l(warmUpPlayerListener, i, i2));
        AnonymousClass0Z0.A0A(638579704, A03);
    }

    public void BWE(String str, String str2) {
        if (!(this instanceof WarmUpPlayerListener)) {
            AnonymousClass0Z0.A0A(-1309672000, AnonymousClass0Z0.A03(2102939457));
            return;
        }
        WarmUpPlayerListener warmUpPlayerListener = (WarmUpPlayerListener) this;
        int A03 = AnonymousClass0Z0.A03(-1746198234);
        warmUpPlayerListener.A01.add(new C29651D3k(warmUpPlayerListener, str, str2));
        AnonymousClass0Z0.A0A(-682014559, A03);
    }

    public HeroServicePlayerDummyListener() {
        AnonymousClass0Z0.A0A(645083473, AnonymousClass0Z0.A03(-1687775338));
    }

    public final void Atp(ServicePlayerState servicePlayerState, LiveState liveState, boolean z) {
        AnonymousClass0Z0.A0A(-1378560362, AnonymousClass0Z0.A03(-1949012497));
    }

    public final void Atr(ServicePlayerState servicePlayerState, boolean z) {
        AnonymousClass0Z0.A0A(-945741701, AnonymousClass0Z0.A03(-129169539));
    }

    public final void Aug(ServicePlayerState servicePlayerState, String str) {
        AnonymousClass0Z0.A0A(1635046447, AnonymousClass0Z0.A03(774617033));
    }

    public final void Axn(ServicePlayerState servicePlayerState, boolean z) {
        AnonymousClass0Z0.A0A(414135525, AnonymousClass0Z0.A03(842850546));
    }

    public final void Ayv(List list) {
        AnonymousClass0Z0.A0A(2126618726, AnonymousClass0Z0.A03(836222767));
    }

    public final void AzI(int i, int i2, int i3, int i4) {
        AnonymousClass0Z0.A0A(-1879746645, AnonymousClass0Z0.A03(-483186973));
    }

    public final void B9K(LiveState liveState) {
        AnonymousClass0Z0.A0A(-918889860, AnonymousClass0Z0.A03(1761450225));
    }

    public final void BCp(byte[] bArr, long j) {
        AnonymousClass0Z0.A0A(496451551, AnonymousClass0Z0.A03(1794340571));
    }

    public final void BE3(ServicePlayerState servicePlayerState, long j, String str) {
        AnonymousClass0Z0.A0A(-771948264, AnonymousClass0Z0.A03(-884970214));
    }

    public final void BEZ(ServicePlayerState servicePlayerState) {
        AnonymousClass0Z0.A0A(-1336147909, AnonymousClass0Z0.A03(-1899849365));
    }

    public final void BI9(boolean z) {
        AnonymousClass0Z0.A0A(-912859702, AnonymousClass0Z0.A03(912680736));
    }

    public final void BLr(long j, ServicePlayerState servicePlayerState) {
        AnonymousClass0Z0.A0A(1770769410, AnonymousClass0Z0.A03(-812544872));
    }

    public final void BOA(int i) {
        AnonymousClass0Z0.A0A(484996752, AnonymousClass0Z0.A03(1341768024));
    }

    public final void BOl(ServicePlayerState servicePlayerState, boolean z, boolean z2, String str, String str2) {
        AnonymousClass0Z0.A0A(-791357370, AnonymousClass0Z0.A03(-239311941));
    }

    public final void BRd(List list) {
        AnonymousClass0Z0.A0A(300512032, AnonymousClass0Z0.A03(-992091444));
    }

    public final IBinder asBinder() {
        AnonymousClass0Z0.A0A(879075891, AnonymousClass0Z0.A03(875841469));
        return null;
    }
}
