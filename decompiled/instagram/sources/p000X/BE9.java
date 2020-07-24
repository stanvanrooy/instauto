package p000X;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.BE9 */
public abstract class BE9 extends LifecycleCallback implements DialogInterface.OnCancelListener {
    public final Handler A00 = new C54202Wh(Looper.getMainLooper());
    public final GoogleApiAvailability A01;
    public final AtomicReference A02 = new AtomicReference((Object) null);
    public volatile boolean A03;

    public void A07() {
        BE7 be7 = (BE7) this;
        for (int i = 0; i < be7.A00.size(); i++) {
            BE8 A002 = BE7.A00(be7, i);
            if (A002 != null) {
                A002.A02.A0A();
            }
        }
    }

    public void A08(ConnectionResult connectionResult, int i) {
        BE7 be7 = (BE7) this;
        Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if (i < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        BE8 be8 = (BE8) be7.A00.get(i);
        if (be8 != null) {
            BE8 be82 = (BE8) be7.A00.get(i);
            be7.A00.remove(i);
            if (be82 != null) {
                be82.A02.A0G(be82);
                be82.A02.A0B();
            }
            BEH beh = be8.A01;
            if (beh != null) {
                beh.Ay4(connectionResult);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BE9(BED bed) {
        super(bed);
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.A00;
        this.A01 = googleApiAvailability;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        int i;
        ConnectionResult connectionResult = new ConnectionResult(13, (PendingIntent) null);
        BEE bee = (BEE) this.A02.get();
        if (bee == null) {
            i = -1;
        } else {
            i = bee.A00;
        }
        A08(connectionResult, i);
        this.A02.set((Object) null);
        A07();
    }

    public final void A02(Bundle bundle) {
        BEE bee;
        super.A02(bundle);
        if (bundle != null) {
            AtomicReference atomicReference = this.A02;
            if (bundle.getBoolean("resolving_error", false)) {
                bee = new BEE(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1));
            } else {
                bee = null;
            }
            atomicReference.set(bee);
        }
    }

    public final void A03(Bundle bundle) {
        super.A03(bundle);
        BEE bee = (BEE) this.A02.get();
        if (bee != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", bee.A00);
            bundle.putInt("failed_status", bee.A01.A00);
            bundle.putParcelable("failed_resolution", bee.A01.A01);
        }
    }

    public void A05() {
        super.A05();
        this.A03 = true;
    }

    public void A06() {
        super.A06();
        this.A03 = false;
    }
}
