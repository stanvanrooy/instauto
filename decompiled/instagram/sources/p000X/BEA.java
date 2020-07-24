package p000X;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiActivity;

/* renamed from: X.BEA */
public final class BEA implements Runnable {
    public final BEE A00;
    public final /* synthetic */ BE9 A01;

    public BEA(BE9 be9, BEE bee) {
        this.A01 = be9;
        this.A00 = bee;
    }

    public final void run() {
        if (this.A01.A03) {
            BEE bee = this.A00;
            ConnectionResult connectionResult = bee.A01;
            if (connectionResult.A01()) {
                BED bed = this.A01.A00;
                Activity AP1 = bed.AP1();
                PendingIntent pendingIntent = connectionResult.A01;
                int i = this.A00.A00;
                Intent intent = new Intent(AP1, GoogleApiActivity.class);
                intent.putExtra("pending_intent", pendingIntent);
                intent.putExtra("failing_client_id", i);
                intent.putExtra("notify_manager", false);
                bed.startActivityForResult(intent, 1);
                return;
            }
            BE9 be9 = this.A01;
            GoogleApiAvailability googleApiAvailability = be9.A01;
            int i2 = connectionResult.A00;
            if (googleApiAvailability.A05(i2)) {
                Activity AP12 = be9.A00.AP1();
                BE9 be92 = this.A01;
                BED bed2 = be92.A00;
                int i3 = connectionResult.A00;
                Dialog A002 = GoogleApiAvailability.A00(AP12, i3, new BEF(googleApiAvailability.A04(AP12, i3, "d"), bed2), be92);
                if (A002 != null) {
                    GoogleApiAvailability.A01(AP12, A002, "GooglePlayServicesErrorDialog", be92);
                }
            } else if (i2 == 18) {
                Activity AP13 = be9.A00.AP1();
                BE9 be93 = this.A01;
                ProgressBar progressBar = new ProgressBar(AP13, (AttributeSet) null, 16842874);
                progressBar.setIndeterminate(true);
                progressBar.setVisibility(0);
                AlertDialog.Builder builder = new AlertDialog.Builder(AP13);
                builder.setView(progressBar);
                builder.setMessage(C54172We.A01(AP13, 18));
                builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
                AlertDialog create = builder.create();
                GoogleApiAvailability.A01(AP13, create, "GooglePlayServicesUpdatingDialog", be93);
                BE9 be94 = this.A01;
                be94.A01.A06(be94.A00.AP1().getApplicationContext(), new BEC(this, create));
            } else {
                be9.A08(connectionResult, bee.A00);
            }
        }
    }
}
