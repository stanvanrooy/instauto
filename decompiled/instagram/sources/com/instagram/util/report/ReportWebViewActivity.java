package com.instagram.util.report;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import com.facebook.C0003R;
import com.instagram.base.activity.BaseFragmentActivity;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass1H6;
import p000X.AnonymousClass9SN;
import p000X.C06590Pq;
import p000X.C214479Ml;

public class ReportWebViewActivity extends BaseFragmentActivity {
    public AnonymousClass0C1 A00;

    public static Intent A01(Context context, AnonymousClass0C1 r4, String str, Integer num, Integer num2) {
        String str2;
        String str3;
        Intent intent = new Intent(context, ReportWebViewActivity.class);
        intent.putExtra("IgSessionManager.SESSION_TOKEN_KEY", r4.getToken());
        intent.putExtra("extra_url", str);
        if (1 - num.intValue() != 0) {
            str2 = "REPORT";
        } else {
            str2 = "SUPPORT_INFO";
        }
        intent.putExtra("extra_page", str2);
        switch (num2.intValue()) {
            case 1:
                str3 = "PRODUCT";
                break;
            case 2:
                str3 = "DIRECT_CONVERSATION";
                break;
            default:
                str3 = "MEDIA";
                break;
        }
        intent.putExtra("extra_report_target", str3);
        return intent;
    }

    public final C06590Pq A0L() {
        return this.A00;
    }

    public final void A0V(Bundle bundle) {
        this.A00 = AnonymousClass0J1.A06(getIntent().getExtras());
        if (A05().A0L(C0003R.C0005id.layout_container_main) == null) {
            AnonymousClass9SN r2 = new AnonymousClass9SN();
            r2.setArguments(getIntent().getExtras());
            AnonymousClass1H6 A0Q = A05().A0Q();
            A0Q.A02(C0003R.C0005id.layout_container_main, r2);
            A0Q.A09();
        }
    }

    public final void onBackPressed() {
        AnonymousClass9SN r0 = (AnonymousClass9SN) A05().A0L(C0003R.C0005id.layout_container_main);
        WebView webView = r0.A01;
        boolean z = r0.A08;
        if (!webView.canGoBack() || !z) {
            C214479Ml A002 = C214479Ml.A00(this.A00);
            A002.A00 = null;
            A002.A01 = null;
            super.onBackPressed();
            return;
        }
        webView.goBack();
    }
}
