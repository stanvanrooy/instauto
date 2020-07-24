package com.instagram.simplewebview;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.C0003R;
import com.instagram.base.activity.BaseFragmentActivity;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1BH;
import p000X.AnonymousClass1H6;
import p000X.C06590Pq;
import p000X.C15330mi;
import p000X.C227439qV;

public class SimpleWebViewActivity extends BaseFragmentActivity {
    public C06590Pq A00;
    public boolean A01;

    public static Intent A01(Context context, C06590Pq r4, SimpleWebViewConfig simpleWebViewConfig) {
        Intent intent = new Intent(context, SimpleWebViewActivity.class);
        intent.putExtra("SimpleWebViewFragment.SIMPLE_WEB_VIEW_CONFIG", simpleWebViewConfig);
        intent.putExtra("IgSessionManager.SESSION_TOKEN_KEY", r4.getToken());
        return intent;
    }

    public final C06590Pq A0L() {
        return this.A00;
    }

    public static void A04(Context context, C06590Pq r2, SimpleWebViewConfig simpleWebViewConfig) {
        AnonymousClass1BH.A03(A01(context, r2, simpleWebViewConfig), context);
    }

    public final void A0V(Bundle bundle) {
        if (A05().A0L(C0003R.C0005id.layout_container_main) == null) {
            C227439qV r2 = new C227439qV();
            r2.setArguments(getIntent().getExtras());
            AnonymousClass1H6 A0Q = A05().A0Q();
            A0Q.A02(C0003R.C0005id.layout_container_main, r2);
            A0Q.A09();
        }
    }

    public final void finish() {
        super.finish();
        if (this.A01) {
            overridePendingTransition(C0003R.anim.fragment_slide_right_enter, C0003R.anim.fragment_slide_right_exit);
        }
    }

    public final void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0Z0.A00(1551431989);
        C15330mi.A01(this);
        super.onCreate(bundle);
        this.A00 = AnonymousClass0J1.A00(getIntent().getExtras());
        boolean z = ((SimpleWebViewConfig) getIntent().getParcelableExtra("SimpleWebViewFragment.SIMPLE_WEB_VIEW_CONFIG")).A0B;
        this.A01 = z;
        if (z) {
            overridePendingTransition(C0003R.anim.fragment_slide_left_enter, C0003R.anim.fragment_slide_left_exit);
        }
        AnonymousClass0Z0.A07(-953617384, A002);
    }
}
