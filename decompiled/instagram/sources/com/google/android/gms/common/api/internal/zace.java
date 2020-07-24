package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.signin.internal.zac;
import java.util.Set;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a2;
import p000X.BEH;
import p000X.BH2;
import p000X.BH3;
import p000X.BJU;
import p000X.C25387BHd;
import p000X.C25426BJh;
import p000X.C25437BKa;

public final class zace extends zac implements C25437BKa, BEH {
    public static C25426BJh A07 = BJU.A00;
    public BH2 A00;
    public C25387BHd A01;
    public BH3 A02;
    public Set A03;
    public final Context A04;
    public final Handler A05;
    public final C25426BJh A06;

    public zace(Context context, Handler handler, C25387BHd bHd, C25426BJh bJh) {
        int A032 = AnonymousClass0Z0.A03(-1802057863);
        this.A04 = context;
        this.A05 = handler;
        AnonymousClass0a2.A03(bHd, "ClientSettings must not be null");
        this.A01 = bHd;
        this.A03 = bHd.A05;
        this.A06 = bJh;
        AnonymousClass0Z0.A0A(2071576428, A032);
    }

    public final void Ay0(Bundle bundle) {
        int A032 = AnonymousClass0Z0.A03(-785661063);
        this.A02.Bur(this);
        AnonymousClass0Z0.A0A(-183624019, A032);
    }

    public final void Ay4(ConnectionResult connectionResult) {
        int A032 = AnonymousClass0Z0.A03(-361301172);
        this.A00.Bv0(connectionResult);
        AnonymousClass0Z0.A0A(-1064644626, A032);
    }

    public final void Ay8(int i) {
        int A032 = AnonymousClass0Z0.A03(530654192);
        this.A02.AC7();
        AnonymousClass0Z0.A0A(-289436721, A032);
    }
}
