package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.facebook.proxygen.TraceFieldType;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepName;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0ZA;
import p000X.BEG;
import p000X.C25368BGg;

@KeepName
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {
    public int A00 = 0;

    public final void onCancel(DialogInterface dialogInterface) {
        this.A00 = 0;
        setResult(0);
        finish();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.A00);
        super.onSaveInstanceState(bundle);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.A00 = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                C25368BGg A002 = C25368BGg.A00(this);
                if (i2 == -1) {
                    Handler handler = A002.A03;
                    AnonymousClass0ZA.A0D(handler, handler.obtainMessage(3));
                } else if (i2 == 0) {
                    ConnectionResult connectionResult = new ConnectionResult(13, (PendingIntent) null);
                    int intExtra = getIntent().getIntExtra("failing_client_id", -1);
                    if (!A002.A02(connectionResult, intExtra)) {
                        Handler handler2 = A002.A03;
                        AnonymousClass0ZA.A0D(handler2, handler2.obtainMessage(5, intExtra, 0, connectionResult));
                    }
                }
            }
        } else if (i == 2) {
            this.A00 = 0;
            setResult(i2, intent);
        }
        finish();
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = AnonymousClass0Z0.A00(717675665);
        super.onCreate(bundle);
        if (bundle != null) {
            this.A00 = bundle.getInt("resolution");
        }
        if (this.A00 != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                Log.e("GoogleApiActivity", "Activity started without extras");
                finish();
                i = 1910397801;
            } else {
                PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
                Integer num = (Integer) extras.get(TraceFieldType.ErrorCode);
                if (pendingIntent == null && num == null) {
                    Log.e("GoogleApiActivity", "Activity started without resolution");
                    finish();
                    i = 1256905274;
                } else if (pendingIntent != null) {
                    try {
                        startIntentSenderForResult(pendingIntent.getIntentSender(), 1, (Intent) null, 0, 0, 0);
                        this.A00 = 1;
                        i = -695541485;
                    } catch (IntentSender.SendIntentException e) {
                        Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e);
                        finish();
                        AnonymousClass0Z0.A07(-1185611661, A002);
                        return;
                    }
                } else {
                    GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.A00;
                    int intValue = num.intValue();
                    Dialog A003 = GoogleApiAvailability.A00(this, intValue, new BEG(googleApiAvailability.A04(this, intValue, "d"), this), this);
                    if (A003 != null) {
                        GoogleApiAvailability.A01(this, A003, "GooglePlayServicesErrorDialog", this);
                    }
                    this.A00 = 1;
                }
            }
            AnonymousClass0Z0.A07(i, A002);
        }
        i = 573847665;
        AnonymousClass0Z0.A07(i, A002);
    }
}
