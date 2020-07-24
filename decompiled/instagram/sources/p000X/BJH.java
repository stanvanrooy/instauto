package p000X;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: X.BJH */
public abstract class BJH extends C25421BJc {
    public final int A00;
    public final Bundle A01;
    public final /* synthetic */ BJA A02;

    public void A02(ConnectionResult connectionResult) {
        BJA bja;
        if (!(this instanceof BJK)) {
            BJE bje = (BJE) this;
            C25442BKh bKh = bje.A01.A0H;
            if (bKh != null) {
                bKh.Ay4(connectionResult);
            }
            bja = bje.A01;
        } else {
            BJK bjk = (BJK) this;
            bjk.A00.A07.BIm(connectionResult);
            bja = bjk.A00;
        }
        bja.A01 = connectionResult.A00;
        bja.A05 = System.currentTimeMillis();
    }

    public boolean A03() {
        if (!(this instanceof BJK)) {
            BJE bje = (BJE) this;
            try {
                String interfaceDescriptor = bje.A00.getInterfaceDescriptor();
                BJA bja = bje.A01;
                String A06 = bja.A06();
                if (!A06.equals(interfaceDescriptor)) {
                    StringBuilder sb = new StringBuilder(String.valueOf(A06).length() + 34 + String.valueOf(interfaceDescriptor).length());
                    sb.append("service descriptor mismatch: ");
                    sb.append(A06);
                    sb.append(" vs. ");
                    sb.append(interfaceDescriptor);
                    Log.e("GmsClient", sb.toString());
                    return false;
                }
                IInterface A05 = bja.A05(bje.A00);
                if (A05 == null) {
                    return false;
                }
                if (!BJA.A01(bje.A01, 2, 4, A05) && !BJA.A01(bje.A01, 3, 4, A05)) {
                    return false;
                }
                BJA bja2 = bje.A01;
                bja2.A06 = null;
                Bundle AIf = bja2.AIf();
                C25438BKb bKb = bja2.A0G;
                if (bKb != null) {
                    bKb.Ay0(AIf);
                }
                return true;
            } catch (RemoteException unused) {
                Log.w("GmsClient", "service probably died");
                return false;
            }
        } else {
            ((BJK) this).A00.A07.BIm(ConnectionResult.A04);
            return true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BJH(BJA bja, int i, Bundle bundle) {
        super(bja, true);
        this.A02 = bja;
        this.A00 = i;
        this.A01 = bundle;
    }
}
