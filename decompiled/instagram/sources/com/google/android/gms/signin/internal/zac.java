package com.google.android.gms.signin.internal;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zaar;
import com.google.android.gms.common.api.internal.zace;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0ZA;
import p000X.BIj;
import p000X.C25372BGl;
import p000X.C25406BIf;

public class zac extends zae {
    public void Buv(zaj zaj) {
        int i;
        int i2;
        if (this instanceof zace) {
            zace zace = (zace) this;
            i = AnonymousClass0Z0.A03(-1293661972);
            AnonymousClass0ZA.A0E(zace.A05, new C25372BGl(zace, zaj), -739339280);
            i2 = 555017791;
        } else if (!(this instanceof zaar)) {
            AnonymousClass0Z0.A0A(1323796213, AnonymousClass0Z0.A03(-768680076));
            return;
        } else {
            i = AnonymousClass0Z0.A03(-1364049992);
            C25406BIf bIf = (C25406BIf) ((zaar) this).A00.get();
            if (bIf == null) {
                i2 = 1203933449;
            } else {
                bIf.A0E.A01(new BIj(bIf, bIf, zaj));
                i2 = 19786135;
            }
        }
        AnonymousClass0Z0.A0A(i2, i);
    }

    public zac() {
        AnonymousClass0Z0.A0A(-1966103298, AnonymousClass0Z0.A03(530411139));
    }

    public final void Bul(ConnectionResult connectionResult, zaa zaa) {
        AnonymousClass0Z0.A0A(-1642901486, AnonymousClass0Z0.A03(-354519974));
    }

    public final void Bum(Status status, GoogleSignInAccount googleSignInAccount) {
        AnonymousClass0Z0.A0A(192194646, AnonymousClass0Z0.A03(1111540251));
    }

    public final void Bv1(Status status) {
        AnonymousClass0Z0.A0A(-2108618159, AnonymousClass0Z0.A03(17206540));
    }

    public final void Bv2(Status status) {
        AnonymousClass0Z0.A0A(422508493, AnonymousClass0Z0.A03(1306120720));
    }
}
