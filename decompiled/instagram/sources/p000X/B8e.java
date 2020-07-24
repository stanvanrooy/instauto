package p000X;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

/* renamed from: X.B8e */
public abstract class B8e extends BroadcastReceiver {
    public abstract C17570qS A00(Context context);

    public final void onReceive(Context context, Intent intent) {
        int i;
        boolean A00;
        int A01 = AnonymousClass0Z0.A01(-790395757);
        C17570qS A002 = A00(context);
        if (!"com.facebook.GET_PHONE_ID".equals(intent.getAction()) || A002 == null) {
            i = 593798351;
        } else {
            PendingIntent pendingIntent = (PendingIntent) getResultExtras(true).getParcelable(IgReactPurchaseExperienceBridgeModule.RN_AUTH_KEY);
            if (pendingIntent == null) {
                A00 = false;
            } else {
                A00 = B8c.A00(context, pendingIntent.getCreatorPackage());
            }
            if (A00) {
                Bundle bundle = new Bundle();
                bundle.putLong("timestamp", A002.A00);
                bundle.putString("origin", A002.A02);
                setResult(-1, A002.A01, bundle);
            }
            i = 1968525047;
        }
        AnonymousClass0Z0.A0E(intent, i, A01);
    }
}
