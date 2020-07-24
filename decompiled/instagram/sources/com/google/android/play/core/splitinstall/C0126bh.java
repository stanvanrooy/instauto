package com.google.android.play.core.splitinstall;

import android.os.Bundle;
import com.facebook.proxygen.TraceFieldType;
import com.google.android.play.core.internal.C0117bm;
import java.util.List;
import p000X.AnonymousClass0Z0;
import p000X.B6O;
import p000X.BEj;
import p000X.BFG;
import p000X.BFb;

/* renamed from: com.google.android.play.core.splitinstall.bh */
public class C0126bh extends C0117bm {
    public final BFG A00;
    public final /* synthetic */ BEj A01;

    public C0126bh(BEj bEj, BFG bfg) {
        this.A01 = bEj;
        int A03 = AnonymousClass0Z0.A03(1294813077);
        this.A00 = bfg;
        AnonymousClass0Z0.A0A(-924638153, A03);
    }

    public void A2A(int i, Bundle bundle) {
        int A03 = AnonymousClass0Z0.A03(7268043);
        this.A01.A00.A01();
        BEj.A02.A02("onCancelInstall(%d)", Integer.valueOf(i));
        AnonymousClass0Z0.A0A(-171237298, A03);
    }

    public final void A2B(Bundle bundle) {
        int A03 = AnonymousClass0Z0.A03(344452147);
        this.A01.A00.A01();
        BEj.A02.A02("onCompleteInstallForAppUpdate", new Object[0]);
        AnonymousClass0Z0.A0A(-418727140, A03);
    }

    public final void A2F(List list) {
        int A03 = AnonymousClass0Z0.A03(425611532);
        this.A01.A00.A01();
        BEj.A02.A02("onGetSessionStates", new Object[0]);
        AnonymousClass0Z0.A0A(1224021586, A03);
    }

    public void A6D(int i, Bundle bundle) {
        int A03 = AnonymousClass0Z0.A03(510756902);
        this.A01.A00.A01();
        BEj.A02.A02("onCompleteInstall(%d)", Integer.valueOf(i));
        AnonymousClass0Z0.A0A(-1499403229, A03);
    }

    public void A6E(Bundle bundle) {
        int A03 = AnonymousClass0Z0.A03(-2033472376);
        this.A01.A00.A01();
        BEj.A02.A02("onDeferredInstall", new Object[0]);
        AnonymousClass0Z0.A0A(1270069353, A03);
    }

    public final void A7E(int i, Bundle bundle) {
        int A03 = AnonymousClass0Z0.A03(-1797082194);
        this.A01.A00.A01();
        BEj.A02.A02("onGetSession(%d)", Integer.valueOf(i));
        AnonymousClass0Z0.A0A(-1391755722, A03);
    }

    public final void A7F(Bundle bundle) {
        int A03 = AnonymousClass0Z0.A03(1671947761);
        this.A01.A00.A01();
        BEj.A02.A02("onDeferredLanguageInstall", new Object[0]);
        AnonymousClass0Z0.A0A(58815113, A03);
    }

    public void ABM(int i, Bundle bundle) {
        int A03 = AnonymousClass0Z0.A03(-1155996955);
        this.A01.A00.A01();
        BEj.A02.A02("onStartInstall(%d)", Integer.valueOf(i));
        AnonymousClass0Z0.A0A(2119940834, A03);
    }

    public final void ABN(Bundle bundle) {
        int A03 = AnonymousClass0Z0.A03(1506987836);
        this.A01.A00.A01();
        BEj.A02.A02("onDeferredLanguageUninstall", new Object[0]);
        AnonymousClass0Z0.A0A(-752741811, A03);
    }

    public void ACk(Bundle bundle) {
        int A03 = AnonymousClass0Z0.A03(941233693);
        this.A01.A00.A01();
        BEj.A02.A02("onDeferredUninstall", new Object[0]);
        AnonymousClass0Z0.A0A(-867388135, A03);
    }

    public final void ADv(Bundle bundle) {
        int A03 = AnonymousClass0Z0.A03(-548772248);
        this.A01.A00.A01();
        BEj.A02.A02("onGetSplitsForAppUpdate", new Object[0]);
        AnonymousClass0Z0.A0A(697836100, A03);
    }

    public final void AEo(Bundle bundle) {
        int A03 = AnonymousClass0Z0.A03(1264910591);
        this.A01.A00.A01();
        int i = bundle.getInt(TraceFieldType.ErrorCode);
        B6O.A01(BEj.A02, 6, "onError(%d)", new Object[]{Integer.valueOf(i)});
        this.A00.A00(new BFb(i));
        AnonymousClass0Z0.A0A(-2140603995, A03);
    }
}
