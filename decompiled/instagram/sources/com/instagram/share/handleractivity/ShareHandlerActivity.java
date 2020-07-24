package com.instagram.share.handleractivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.base.activity.IgActivity;
import com.instagram.nux.activity.SignedOutFragmentActivity;
import p000X.AnonymousClass0QA;
import p000X.AnonymousClass0QB;
import p000X.AnonymousClass0RN;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1BH;
import p000X.C11290ej;
import p000X.C12600h4;
import p000X.C12620h6;
import p000X.C140255z7;
import p000X.C193418Ps;
import p000X.C26581Eb;

public class ShareHandlerActivity extends IgActivity implements AnonymousClass0RN, AnonymousClass0QB {
    public final void Aqy(Activity activity) {
    }

    public final void Aqz(Activity activity) {
    }

    public final void Ar2(Activity activity) {
    }

    public final void Ar6(Activity activity) {
    }

    public final String getModuleName() {
        return C193418Ps.$const$string(149);
    }

    public final void Ar1(Activity activity) {
        if ((activity instanceof C140255z7) || (activity instanceof SignedOutFragmentActivity)) {
            finish();
        }
    }

    private void A00() {
        Intent intent = getIntent();
        int i = 0;
        if (!intent.getBooleanExtra("ShareHandlerActivity.IS_FROM_INSTAGRAM", false)) {
            i = 335544320;
        }
        Intent A02 = C11290ej.A00.A02(this, i);
        A02.putExtra("ShareHandlerActivity.EXTRA_SHARE_INTENT", intent);
        AnonymousClass1BH.A03(A02, this);
    }

    public final void onCreate(Bundle bundle) {
        int A00 = AnonymousClass0Z0.A00(-86065008);
        C12600h4.A00().A05(C12620h6.SHARE_TO_FEED);
        super.onCreate(bundle);
        if (bundle == null) {
            A00();
        }
        C26581Eb.A00(this, 1);
        AnonymousClass0QA.A00.A00(this);
        AnonymousClass0Z0.A07(1241075451, A00);
    }

    public final void onDestroy() {
        int A00 = AnonymousClass0Z0.A00(-512700111);
        super.onDestroy();
        AnonymousClass0QA.A00.A01(this);
        AnonymousClass0Z0.A07(-1777988965, A00);
    }

    public final void onNewIntent(Intent intent) {
        setIntent(intent);
        A00();
    }
}
