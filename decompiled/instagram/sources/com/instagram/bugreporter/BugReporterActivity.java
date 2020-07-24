package com.instagram.bugreporter;

import android.os.Build;
import android.os.Bundle;
import com.facebook.C0003R;
import com.instagram.base.activity.BaseFragmentActivity;
import p000X.AnonymousClass0J1;
import p000X.C06080Nr;
import p000X.C06590Pq;
import p000X.C156506mL;
import p000X.C156646mb;
import p000X.C52362Om;

public class BugReporterActivity extends BaseFragmentActivity {
    public C06590Pq A00;

    public final C06590Pq A0L() {
        return this.A00;
    }

    public final void A0V(Bundle bundle) {
        this.A00 = AnonymousClass0J1.A00(getIntent().getExtras());
        if (A05().A0L(C0003R.C0005id.layout_container_main) == null) {
            String string = getIntent().getExtras().getString("IgSessionManager.SESSION_TOKEN_KEY");
            Bundle bundle2 = new Bundle();
            bundle2.putString("IgSessionManager.SESSION_TOKEN_KEY", string);
            bundle2.putParcelable("BugReportComposerFragment.ARGUMENT_BUGREPORT", (BugReport) getIntent().getParcelableExtra("BugReporterActivity.INTENT_EXTRA_BUGREPORT"));
            bundle2.putParcelable("BugReportComposerFragment.ARGUMENT_VIEWMODEL", (BugReportComposerViewModel) getIntent().getParcelableExtra("BugReporterActivity.INTENT_EXTRA_VIEWMODEL"));
            C156506mL r2 = new C156506mL();
            r2.setArguments(bundle2);
            C52362Om r1 = new C52362Om(this, this.A00);
            r1.A02 = r2;
            r1.A08 = false;
            r1.A02();
        }
        if (C06080Nr.A09(getApplicationContext()) && Build.VERSION.SDK_INT >= 20) {
            findViewById(C0003R.C0005id.layout_container_parent).setOnApplyWindowInsetsListener(new C156646mb(this));
        }
    }
}
