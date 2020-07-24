package com.instagram.share.twitter;

import android.os.Bundle;
import android.webkit.WebView;
import com.facebook.C0003R;
import com.instagram.base.activity.IgFragmentActivity;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass2OA;
import p000X.C06590Pq;
import p000X.C15890nh;
import p000X.C17850qu;
import p000X.C23779Ab6;
import p000X.C23789AbI;
import p000X.C23790AbJ;
import p000X.C23792AbL;

public class TwitterOAuthActivity extends IgFragmentActivity {
    public static final Class A01 = TwitterOAuthActivity.class;
    public AnonymousClass0C1 A00;

    public static void A00(TwitterOAuthActivity twitterOAuthActivity) {
        AnonymousClass2OA r2 = new AnonymousClass2OA(twitterOAuthActivity);
        r2.A06(C0003R.string.unknown_error_occured);
        r2.A0A(C0003R.string.f118ok, new C23790AbJ(twitterOAuthActivity));
        r2.A03().show();
    }

    public final C06590Pq A0L() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0Z0.A00(-1036164287);
        super.onCreate(bundle);
        setContentView((int) C0003R.layout.share_webview);
        this.A00 = AnonymousClass0J1.A05();
        WebView webView = (WebView) findViewById(C0003R.C0005id.webView);
        webView.setWebViewClient(new C23792AbL(this));
        webView.getSettings().setJavaScriptEnabled(true);
        C15890nh r2 = new C15890nh(this.A00);
        r2.A09 = Constants.A0N;
        r2.A0C = "twitter/authorize/";
        r2.A06(C23779Ab6.class, false);
        C17850qu A03 = r2.A03();
        A03.A00 = new C23789AbI(this, webView);
        A0N(A03);
        AnonymousClass0Z0.A07(1891411681, A002);
    }
}
