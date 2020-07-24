package p000X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.HintRequest;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.BIF */
public final class BIF implements C138425vF {
    public final BHH AC0(BIG big) {
        AnonymousClass0a2.A03(big, "client must not be null");
        return big.A09(new BIR(big));
    }

    public final PendingIntent AN2(BIG big, HintRequest hintRequest) {
        AnonymousClass0a2.A03(big, "client must not be null");
        AnonymousClass0a2.A03(hintRequest, "request must not be null");
        big.A06(BIL.A03);
        Context A03 = big.A03();
        AnonymousClass0a2.A03(A03, "context must not be null");
        AnonymousClass0a2.A03(hintRequest, "request must not be null");
        Intent putExtra = new Intent("com.google.android.gms.auth.api.credentials.PICKER").putExtra("claimedCallingPackage", (String) null);
        Parcel obtain = Parcel.obtain();
        hintRequest.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        putExtra.putExtra("com.google.android.gms.credentials.HintRequest", marshall);
        return PendingIntent.getActivity(A03, CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS, putExtra, 134217728);
    }

    public final BHH BdC(BIG big, CredentialRequest credentialRequest) {
        AnonymousClass0a2.A03(big, "client must not be null");
        AnonymousClass0a2.A03(credentialRequest, "request must not be null");
        return big.A08(new BID(big, credentialRequest));
    }

    public final BHH BeO(BIG big, Credential credential) {
        AnonymousClass0a2.A03(big, "client must not be null");
        AnonymousClass0a2.A03(credential, "credential must not be null");
        return big.A09(new BIE(big, credential));
    }
}
