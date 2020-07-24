package com.instagram.share.odnoklassniki;

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
import p000X.C127455d6;
import p000X.C15890nh;
import p000X.C17850qu;
import p000X.C23781Ab8;
import p000X.C23783AbA;
import p000X.C23784AbB;
import p000X.C23785AbD;
import p000X.C23786AbE;
import p000X.C23787AbF;

public class OdnoklassnikiAuthActivity extends IgFragmentActivity {
    public static final Class A03 = OdnoklassnikiAuthActivity.class;
    public WebView A00;
    public AnonymousClass0C1 A01;
    public C23784AbB A02;

    public static void A00(OdnoklassnikiAuthActivity odnoklassnikiAuthActivity) {
        AnonymousClass2OA r2 = new AnonymousClass2OA(odnoklassnikiAuthActivity);
        r2.A06(C0003R.string.unknown_error_occured);
        r2.A0A(C0003R.string.f118ok, new C23785AbD(odnoklassnikiAuthActivity));
        r2.A03().show();
    }

    public final C06590Pq A0L() {
        return this.A01;
    }

    public final void onCreate(Bundle bundle) {
        int A002 = AnonymousClass0Z0.A00(-113645172);
        super.onCreate(bundle);
        setContentView((int) C0003R.layout.share_webview);
        this.A01 = AnonymousClass0J1.A05();
        this.A00 = (WebView) findViewById(C0003R.C0005id.webView);
        C23784AbB abB = new C23784AbB(this);
        this.A02 = abB;
        this.A00.setWebViewClient(abB);
        this.A00.getSettings().setJavaScriptEnabled(true);
        C127455d6 A003 = C127455d6.A00(this.A01);
        if (A003 != null) {
            boolean z = false;
            if (System.currentTimeMillis() < A003.A01) {
                z = true;
            }
            if (z) {
                String str = A003.A03;
                C15890nh r2 = new C15890nh(this.A01);
                r2.A09 = Constants.ONE;
                r2.A0C = "odnoklassniki/reauthenticate/";
                r2.A06(C23787AbF.class, false);
                r2.A0G = true;
                r2.A09("refresh_token", str);
                C17850qu A032 = r2.A03();
                A032.A00 = new C23786AbE(this);
                A0N(A032);
                AnonymousClass0Z0.A07(-1911883361, A002);
            }
        }
        C15890nh r22 = new C15890nh(this.A01);
        r22.A09 = Constants.A0N;
        r22.A0C = "odnoklassniki/authorize/";
        r22.A06(C23781Ab8.class, false);
        C17850qu A033 = r22.A03();
        A033.A00 = new C23783AbA(this, this.A00, this.A02);
        A0N(A033);
        AnonymousClass0Z0.A07(-1911883361, A002);
    }
}
