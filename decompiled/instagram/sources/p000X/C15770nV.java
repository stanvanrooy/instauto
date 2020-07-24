package p000X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: X.0nV  reason: invalid class name and case insensitive filesystem */
public final class C15770nV extends C15790nX {
    public final void A01(Activity activity, C06590Pq r4, Bundle bundle, boolean z) {
        C26441Dh.A00(r4).A02(activity);
        Intent intent = new Intent();
        intent.setClassName(activity, "com.instagram.nux.activity.SignedOutFragmentActivity");
        intent.setFlags(67108864);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        AnonymousClass1BH.A03(intent, activity);
        if (z) {
            activity.finish();
        }
    }
}
