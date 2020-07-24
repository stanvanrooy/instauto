package com.instagram.share.ameba;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import com.instagram.base.activity.IgFragmentActivity;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1L8;
import p000X.C06590Pq;
import p000X.C126875c9;
import p000X.C15890nh;
import p000X.C17850qu;
import p000X.C17860qv;
import p000X.C23796AbQ;
import p000X.C23797AbR;
import p000X.C23799AbT;
import p000X.C28351Lj;

public class AmebaAuthActivity extends IgFragmentActivity {
    public WebView A00;
    public AnonymousClass0C1 A01;

    public final C06590Pq A0L() {
        return this.A01;
    }

    public final void A0N(C17860qv r2) {
        C28351Lj.A00(this, AnonymousClass1L8.A00(this), r2);
    }

    public final void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0Z0.A00(356081213);
        super.onCreate(bundle);
        this.A01 = AnonymousClass0J1.A05();
        com.facebook.secure.webkit.WebView webView = new com.facebook.secure.webkit.WebView(this);
        this.A00 = webView;
        setContentView((View) webView);
        this.A00.getSettings().setJavaScriptEnabled(true);
        this.A00.setWebViewClient(new C23796AbQ(this));
        C126875c9 A003 = C126875c9.A00(this.A01);
        if (A003 != null) {
            String str = A003.A02;
            C15890nh r2 = new C15890nh(this.A01);
            r2.A09 = Constants.ONE;
            r2.A0C = "ameba/reauthenticate/";
            r2.A09("refresh_token", str);
            r2.A06(C23797AbR.class, false);
            r2.A0G = true;
            C17850qu A03 = r2.A03();
            A03.A00 = new C23799AbT(this);
            A0N(A03);
        } else {
            this.A00.clearHistory();
            this.A00.loadUrl("https://oauth.ameba.jp/authorize?response_type=code&client_id=4d0c1bbd6846e97622631d869d293f53baeb7b75afe27a2d31fa5794ae2e705a&display=smartphone&scope=w_ameba");
        }
        AnonymousClass0Z0.A07(1130497062, A002);
    }

    public final void onDestroy() {
        int A002 = AnonymousClass0Z0.A00(-1872890834);
        super.onDestroy();
        this.A00 = null;
        AnonymousClass0Z0.A07(2027107107, A002);
    }
}
