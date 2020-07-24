package p000X;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.facebook.common.jobscheduler.compat.GcmTaskServiceCompat;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.internal.zad;
import com.google.android.gms.signin.internal.zaf;
import com.google.android.gms.signin.internal.zah;
import com.google.android.gms.signin.internal.zaj;

/* renamed from: X.BIV */
public final class BIV extends BJ9 implements BH3 {
    public Integer A00;
    public final Bundle A01;
    public final C25387BHd A02;
    public final boolean A03;

    /* JADX WARNING: Illegal instructions before constructor call */
    public BIV(Context context, Looper looper, C25387BHd bHd, C25437BKa bKa, BEH beh) {
        super(context, looper, 44, r7, bKa, beh);
        C25387BHd bHd2 = bHd;
        BKw bKw = bHd.A01;
        Integer num = bHd.A00;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", (Parcelable) null);
        if (num != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
        }
        if (bKw != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", (String) null);
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", (String) null);
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        }
        this.A03 = true;
        this.A02 = bHd;
        this.A01 = bundle;
        this.A00 = bHd.A00;
    }

    public final int AQI() {
        return 12451000;
    }

    public final void Bur(zad zad) {
        AnonymousClass0a2.A03(zad, "Expecting a valid ISignInCallbacks");
        try {
            Account account = new Account("<<default account>>", GcmTaskServiceCompat.GOOGLE_PREFIX);
            GoogleSignInAccount googleSignInAccount = null;
            if ("<<default account>>".equals(account.name)) {
                googleSignInAccount = C229369xj.A00(this.A0E).A05();
            }
            ((zaf) A04()).Bus(new zah(1, new ResolveAccountRequest(2, account, this.A00.intValue(), googleSignInAccount)), zad);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                zad.Buv(new zaj(1, new ConnectionResult(8, (PendingIntent) null), (ResolveAccountResponse) null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    public final void connect() {
        A9X(new BJJ(this));
    }

    public final boolean BdW() {
        return this.A03;
    }

    public final void Bup(IAccountAccessor iAccountAccessor, boolean z) {
        try {
            ((zaf) A04()).Bun(iAccountAccessor, this.A00.intValue(), z);
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    public final void Buy() {
        try {
            ((zaf) A04()).Bv4(this.A00.intValue());
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }
}
