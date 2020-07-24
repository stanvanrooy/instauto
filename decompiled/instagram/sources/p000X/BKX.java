package p000X;

import android.app.PendingIntent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.internal.zaj;

/* renamed from: X.BKX */
public abstract class BKX {
    public final BJ0 A00;

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ad, code lost:
        if (r2.A01() != false) goto L_0x00af;
     */
    public void A00() {
        boolean z;
        if (this instanceof BIj) {
            BIj bIj = (BIj) this;
            C25406BIf bIf = bIj.A00;
            zaj zaj = bIj.A01;
            if (C25406BIf.A07(bIf, 0)) {
                ConnectionResult connectionResult = zaj.A00;
                if (connectionResult.A02()) {
                    ResolveAccountResponse resolveAccountResponse = zaj.A01;
                    ConnectionResult connectionResult2 = resolveAccountResponse.A00;
                    if (!connectionResult2.A02()) {
                        String valueOf = String.valueOf(connectionResult2);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 48);
                        sb.append("Sign-in succeeded with resolve account failure: ");
                        sb.append(valueOf);
                        Log.wtf("GoogleApiClientConnecting", sb.toString(), new Exception());
                        C25406BIf.A03(bIf, connectionResult2);
                        return;
                    }
                    bIf.A05 = true;
                    bIf.A00 = resolveAccountResponse.A00();
                    bIf.A06 = resolveAccountResponse.A01;
                    bIf.A07 = resolveAccountResponse.A02;
                    C25406BIf.A01(bIf);
                    return;
                }
                if (bIf.A03) {
                    z = true;
                }
                z = false;
                if (z) {
                    C25406BIf.A02(bIf);
                    C25406BIf.A01(bIf);
                    return;
                }
                C25406BIf.A03(bIf, connectionResult);
            }
        } else if (this instanceof BJZ) {
            ((BJZ) this).A00.BIm(new ConnectionResult(16, (PendingIntent) null));
        } else if (this instanceof C25419BJa) {
            C25419BJa bJa = (C25419BJa) this;
            C25406BIf.A03(bJa.A01.A01, bJa.A00);
        } else if (!(this instanceof BJM)) {
            ((BKB) this).A00.Ay8(1);
        } else {
            ((BJM) this).A00.A01.A08.Buu((Bundle) null);
        }
    }

    public BKX(BJ0 bj0) {
        this.A00 = bj0;
    }
}
