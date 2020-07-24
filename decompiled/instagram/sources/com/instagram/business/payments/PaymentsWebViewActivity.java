package com.instagram.business.payments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.facebook.C0003R;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;
import com.instagram.simplewebview.SimpleWebViewConfig;
import p000X.AnonymousClass000;
import p000X.Constants;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0C5;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0L6;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0ZA;
import p000X.AnonymousClass1BH;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1H6;
import p000X.AnonymousClass1HD;
import p000X.AnonymousClass1HM;
import p000X.AnonymousClass1L8;
import p000X.AnonymousClass2OA;
import p000X.AnonymousClass2xx;
import p000X.AnonymousClass5F9;
import p000X.BY5;
import p000X.C019000b;
import p000X.C06590Pq;
import p000X.C112564sq;
import p000X.C12800hP;
import p000X.C14100jl;
import p000X.C15300mf;
import p000X.C155576ke;
import p000X.C155586kf;
import p000X.C155596kg;
import p000X.C155606kh;
import p000X.C155616ki;
import p000X.C155626kj;
import p000X.C155636kk;
import p000X.C155646kl;
import p000X.C155656km;
import p000X.C155666kn;
import p000X.C155686kp;
import p000X.C15890nh;
import p000X.C16170o9;
import p000X.C17850qu;
import p000X.C227439qV;
import p000X.C227479qZ;
import p000X.C26771Ff;
import p000X.C28351Lj;
import p000X.C53742Uc;
import p000X.C67852xw;
import p000X.C696433b;

public class PaymentsWebViewActivity extends BaseFragmentActivity implements AnonymousClass1HM, C227479qZ {
    public WebView A00;
    public AnonymousClass0C1 A01;
    public SimpleWebViewConfig A02;
    public View.OnClickListener A03;
    public View.OnClickListener A04;
    public C227439qV A05;
    public Integer A06;
    public Integer A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;

    public static Intent A01(Context context, AnonymousClass0C1 r4, String str, String str2, boolean z, String str3, boolean z2) {
        Intent intent = new Intent(context, PaymentsWebViewActivity.class);
        C53742Uc r0 = new C53742Uc(str);
        r0.A03 = str2;
        r0.A07 = true;
        r0.A09 = z;
        r0.A01 = str3;
        r0.A04 = true;
        intent.putExtra(AnonymousClass0C5.$const$string(1), r0.A00());
        intent.putExtra("PaymentsWebViewActivity.ExtraIsIGBA", z2);
        intent.putExtra("IgSessionManager.SESSION_TOKEN_KEY", r4.getToken());
        intent.setFlags(536870912);
        return intent;
    }

    public final void configureActionBar(AnonymousClass1EX r6) {
        int i;
        int i2;
        int i3;
        int i4;
        r6.Bo6(true);
        AnonymousClass2xx A002 = C67852xw.A00(Constants.ZERO);
        r6.setTitle(this.A02.A03);
        Integer num = this.A06;
        if (num != null) {
            int intValue = num.intValue();
            if (1 != intValue) {
                i3 = C0003R.C0004drawable.instagram_arrow_back_24;
            } else {
                i3 = C0003R.C0004drawable.instagram_x_outline_24;
            }
            A002.A03 = i3;
            if (1 - intValue != 0) {
                i4 = C0003R.string.back;
            } else {
                i4 = C0003R.string.cancel;
            }
            A002.A02 = i4;
        }
        A002.A0B = this.A03;
        Integer num2 = this.A07;
        if (num2 != null) {
            int intValue2 = num2.intValue();
            if (1 != intValue2) {
                i = C0003R.C0004drawable.nav_arrow_next;
            } else {
                i = C0003R.C0004drawable.check;
            }
            A002.A01 = i;
            if (1 - intValue2 != 0) {
                i2 = C0003R.string.next;
            } else {
                i2 = C0003R.string.done;
            }
            A002.A00 = i2;
            A002.A08 = C26771Ff.A00(C019000b.A00(this, C0003R.color.blue_5));
        }
        r6.Bo2(this.A0A, this.A04);
        r6.BmE(A002.A00());
        r6.ACu(true ^ this.A09);
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public static void A04(PaymentsWebViewActivity paymentsWebViewActivity, Bundle bundle) {
        C227439qV r0 = new C227439qV();
        paymentsWebViewActivity.A05 = r0;
        r0.setArguments(bundle);
        AnonymousClass1H6 A0Q = paymentsWebViewActivity.A05().A0Q();
        A0Q.A02(C0003R.C0005id.layout_container_main, paymentsWebViewActivity.A05);
        A0Q.A09();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0078, code lost:
        if ("access_token=null".equals(r5.A02.A01) != false) goto L_0x007a;
     */
    public final void A0V(Bundle bundle) {
        boolean z;
        if (((Boolean) AnonymousClass0L6.A02(this.A01, AnonymousClass0L7.MOTION, "animation_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            overridePendingTransition(C0003R.anim.fragment_slide_left_enter, C0003R.anim.fragment_slide_left_exit);
        }
        if (A05().A0L(C0003R.C0005id.layout_container_main) instanceof C227439qV) {
            return;
        }
        if (this.A08) {
            AnonymousClass1L8 A002 = AnonymousClass1L8.A00(this);
            AnonymousClass0C1 r0 = this.A01;
            C155596kg r3 = new C155596kg(this);
            C15890nh r2 = new C15890nh(r0);
            r2.A09 = Constants.ONE;
            r2.A0C = "ads/promote/promotion_payment_prevalidation/";
            r2.A06(C155586kf.class, false);
            C17850qu A032 = r2.A03();
            A032.A00 = new C155576ke(r3);
            C28351Lj.A00(this, A002, A032);
            return;
        }
        SimpleWebViewConfig simpleWebViewConfig = this.A02;
        if (simpleWebViewConfig != null && !TextUtils.isEmpty(simpleWebViewConfig.A01)) {
            z = true;
        }
        z = false;
        if (z || C12800hP.A0J(this.A01)) {
            A04(this, getIntent().getExtras());
        } else {
            C12800hP.A06(this.A01, this, C696433b.READ_ONLY);
        }
    }

    public final void onBackPressed() {
        View.OnClickListener onClickListener = this.A03;
        if (onClickListener != null) {
            onClickListener.onClick(this.A00);
            return;
        }
        super.onBackPressed();
        if (C16170o9.A00()) {
            AnonymousClass0ZA.A09(new Handler(), new C155606kh(this), 500, -347590494);
        }
    }

    public final C06590Pq A0L() {
        return this.A01;
    }

    public final void A0R() {
        AnonymousClass1HD A0L = A05().A0L(C0003R.C0005id.layout_container_main);
        if (A0L instanceof AnonymousClass1HM) {
            AFO().A0F((AnonymousClass1HM) A0L);
        } else {
            AFO().A0F(this);
        }
    }

    public final void Ayn(WebView webView) {
        this.A00 = webView;
    }

    public final boolean Bn9(WebView webView, Uri uri) {
        Integer num;
        Integer num2;
        if ("instagram".equals(uri.getScheme())) {
            if ("alert".equals(uri.getHost())) {
                String queryParameter = uri.getQueryParameter(DialogModule.KEY_TITLE);
                String queryParameter2 = uri.getQueryParameter(DialogModule.KEY_MESSAGE);
                String queryParameter3 = uri.getQueryParameter("cancelButtonTitle");
                String queryParameter4 = uri.getQueryParameter("otherButtonTitle");
                String queryParameter5 = uri.getQueryParameter("otherButton2Title");
                String queryParameter6 = uri.getQueryParameter("onCancelButton");
                String queryParameter7 = uri.getQueryParameter("onOtherButton");
                String queryParameter8 = uri.getQueryParameter("onOtherButton2");
                if (!TextUtils.isEmpty(queryParameter3) || !TextUtils.isEmpty(queryParameter4) || !TextUtils.isEmpty(queryParameter5)) {
                    AnonymousClass2OA r1 = new AnonymousClass2OA(this);
                    if (!TextUtils.isEmpty(queryParameter)) {
                        r1.A03 = queryParameter;
                    }
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        r1.A0M(queryParameter2);
                    }
                    if (!TextUtils.isEmpty(queryParameter3)) {
                        r1.A0O(queryParameter3, new C155616ki(this, queryParameter6, webView));
                    }
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        r1.A0P(queryParameter4, new C155626kj(this, queryParameter7, webView));
                    }
                    if (!TextUtils.isEmpty(queryParameter5)) {
                        r1.A0N(queryParameter5, new C155636kk(this, queryParameter8, webView));
                    }
                    r1.A03().show();
                    return true;
                } else if (TextUtils.isEmpty(queryParameter2)) {
                    C112564sq.A02(this, (String) null, queryParameter);
                    return true;
                } else {
                    C112564sq.A02(this, queryParameter, queryParameter2);
                    return true;
                }
            } else if ("close_container".equals(uri.getHost())) {
                finish();
            } else if ("update_header".equals(uri.getHost())) {
                String queryParameter9 = uri.getQueryParameter(DialogModule.KEY_TITLE);
                if (queryParameter9 != null) {
                    C53742Uc r12 = new C53742Uc(this.A02);
                    r12.A03 = queryParameter9;
                    this.A02 = r12.A00();
                }
                String queryParameter10 = uri.getQueryParameter("leftButton");
                String queryParameter11 = uri.getQueryParameter("onLeftButtonClick");
                if (queryParameter10 != null && !"null".equals(queryParameter10)) {
                    try {
                        if (queryParameter10.equals("BACK")) {
                            num2 = Constants.ZERO;
                        } else if (queryParameter10.equals("CLOSE")) {
                            num2 = Constants.ONE;
                        } else {
                            throw new IllegalArgumentException(queryParameter10);
                        }
                        this.A06 = num2;
                    } catch (IllegalArgumentException unused) {
                        AnonymousClass0QD.A02("wrong_button", AnonymousClass000.A0E(queryParameter10, " is not a valid spec for left button"));
                    }
                }
                if (!"true".equals(uri.getQueryParameter("isRootScreen"))) {
                    this.A03 = new C155656km(this, webView, queryParameter11);
                } else {
                    this.A03 = null;
                }
                String queryParameter12 = uri.getQueryParameter("rightButton");
                String queryParameter13 = uri.getQueryParameter("onRightButtonClick");
                this.A0A = false;
                if (queryParameter12 != null && !"null".equals(queryParameter12)) {
                    try {
                        if (queryParameter12.equals("NEXT")) {
                            num = Constants.ZERO;
                        } else if (queryParameter12.equals("DONE")) {
                            num = Constants.ONE;
                        } else {
                            throw new IllegalArgumentException(queryParameter12);
                        }
                    } catch (IllegalArgumentException unused2) {
                        num = Constants.ONE;
                    }
                    this.A07 = num;
                    this.A0A = true;
                }
                this.A04 = new C155666kn(this, webView, queryParameter13);
                this.A09 = !"true".equals(uri.getQueryParameter("isRightButtonActive"));
                configureActionBar(AFO());
                return true;
            } else if ("loading".equals(uri.getHost())) {
                if ("true".equals(uri.getQueryParameter("isLoading"))) {
                    this.A05.A01.setVisibility(0);
                    return false;
                } else if ("false".equals(uri.getQueryParameter("isLoading"))) {
                    this.A05.A01.setVisibility(8);
                    return false;
                }
            } else if ("open_in_native_browser".equals(uri.getHost())) {
                AnonymousClass1BH.A0H(Uri.parse(uri.getQueryParameter(IgReactNavigatorModule.URL)), this);
                return false;
            } else if ("payments".equals(uri.getHost())) {
                BY5.A00(this, 7193, this.A01);
                return false;
            } else if ("dismiss_keyboard".equals(uri.getHost())) {
                this.A00.postDelayed(new C155646kl(this), 1500);
                return false;
            }
        } else if (uri.getQueryParameter("hash") == null) {
            webView.loadUrl(uri.buildUpon().appendQueryParameter("locale", C15300mf.A00()).build().toString());
            return true;
        }
        return false;
    }

    public final void finish() {
        super.finish();
        if (((Boolean) AnonymousClass0L6.A02(this.A01, AnonymousClass0L7.MOTION, "animation_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            overridePendingTransition(C0003R.anim.fragment_slide_right_enter, C0003R.anim.fragment_slide_right_exit);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 64206) {
            if (i2 == -1) {
                Bundle extras = getIntent().getExtras();
                SimpleWebViewConfig simpleWebViewConfig = this.A02;
                if ("access_token=null".equals(simpleWebViewConfig.A01)) {
                    C53742Uc r2 = new C53742Uc(simpleWebViewConfig);
                    r2.A01 = AnonymousClass000.A0E("access_token=", C14100jl.A00(this.A01));
                    SimpleWebViewConfig A002 = r2.A00();
                    this.A02 = A002;
                    extras.putParcelable(AnonymousClass0C5.$const$string(1), A002);
                }
                A04(this, extras);
                return;
            }
            AnonymousClass5F9.A00(this, C0003R.string.login_to_continue);
            finish();
        } else if (i == 7193) {
            this.A00.evaluateJavascript("var MInstagramBoostPostNavigationActions =require('MInstagramBoostPostNavigationActions');setTimeout(MInstagramBoostPostNavigationActions.refresh, 1000);", new C155686kp());
        }
    }

    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        int A002 = AnonymousClass0Z0.A00(-79978990);
        this.A01 = AnonymousClass0J1.A06(getIntent().getExtras());
        if (bundle == null) {
            parcelable = getIntent().getParcelableExtra(AnonymousClass0C5.$const$string(1));
        } else {
            parcelable = bundle.getParcelable("PaymentsWebViewActivity.SimpleWebViewConfig");
        }
        this.A02 = (SimpleWebViewConfig) parcelable;
        this.A08 = getIntent().getBooleanExtra("PaymentsWebViewActivity.ExtraIsIGBA", false);
        super.onCreate(bundle);
        AnonymousClass0Z0.A07(-1130416, A002);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("PaymentsWebViewActivity.SimpleWebViewConfig", this.A02);
    }
}
