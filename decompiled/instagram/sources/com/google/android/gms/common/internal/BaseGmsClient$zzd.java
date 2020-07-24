package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.internal.IGmsCallbacks;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0ZA;
import p000X.AnonymousClass0a2;
import p000X.BJA;
import p000X.BJE;

public final class BaseGmsClient$zzd extends IGmsCallbacks.zza {
    public BJA A00;
    public final int A01;

    public BaseGmsClient$zzd(BJA bja, int i) {
        int A03 = AnonymousClass0Z0.A03(1770814044);
        this.A00 = bja;
        this.A01 = i;
        AnonymousClass0Z0.A0A(-1574920041, A03);
    }

    public final void BEu(int i, IBinder iBinder, Bundle bundle) {
        int A03 = AnonymousClass0Z0.A03(1632537550);
        AnonymousClass0a2.A03(this.A00, "onPostInitComplete can be called only once per call to getRemoteService");
        BJA bja = this.A00;
        int i2 = this.A01;
        Handler handler = bja.A0F;
        AnonymousClass0ZA.A0D(handler, handler.obtainMessage(1, i2, -1, new BJE(bja, i, iBinder, bundle)));
        this.A00 = null;
        AnonymousClass0Z0.A0A(2052967241, A03);
    }

    public final void BvD(int i, Bundle bundle) {
        int A03 = AnonymousClass0Z0.A03(1853664039);
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        AnonymousClass0Z0.A0A(423024549, A03);
    }

    public final void BvE(int i, IBinder iBinder, zzb zzb) {
        int A03 = AnonymousClass0Z0.A03(1589787195);
        AnonymousClass0a2.A03(this.A00, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        AnonymousClass0a2.A02(zzb);
        this.A00.A0Q = zzb;
        BEu(i, iBinder, zzb.A00);
        AnonymousClass0Z0.A0A(-389939480, A03);
    }
}
