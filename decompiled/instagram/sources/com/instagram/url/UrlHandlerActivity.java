package com.instagram.url;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.C0003R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;
import java.io.IOException;
import java.util.Set;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0DB;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0J5;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass0QT;
import p000X.AnonymousClass0RN;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1BA;
import p000X.AnonymousClass1BH;
import p000X.AnonymousClass2M7;
import p000X.AnonymousClass2MW;
import p000X.B5B;
import p000X.C05210Iq;
import p000X.C06590Pq;
import p000X.C11130eT;
import p000X.C11290ej;
import p000X.C11310el;
import p000X.C11320em;
import p000X.C11330en;
import p000X.C12600h4;
import p000X.C12620h6;
import p000X.C12890hY;
import p000X.C13080hr;
import p000X.C132665lf;
import p000X.C13910jS;
import p000X.C14100jl;
import p000X.C17200pq;
import p000X.C177097hJ;
import p000X.C177107hK;
import p000X.C26431Dg;
import p000X.C26441Dh;
import p000X.C26581Eb;
import p000X.C26591Ec;
import p000X.C33441cv;
import p000X.C51512Ky;
import p000X.C53732Ub;
import p000X.C91853yD;

public class UrlHandlerActivity extends BaseFragmentActivity implements AnonymousClass0RN, AnonymousClass0J5 {
    public static final Class A03 = UrlHandlerActivity.class;
    public C06590Pq A00;
    public AnonymousClass2M7 A01;
    public boolean A02;

    public final void A0V(Bundle bundle) {
    }

    public final String getModuleName() {
        return "url_handler";
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0060  */
    private void A01(Intent intent) {
        String token;
        C177107hK r0;
        Bundle bundle;
        String string;
        this.A01.A00.A03();
        String dataString = intent.getDataString();
        this.A02 = intent.getBooleanExtra("com.instagram.url.extra.SHOULD_RETURN_TO_SENDING_ACTIVITY", false);
        C26431Dg.A02(this.A00, this, this, intent);
        if (TextUtils.isEmpty(dataString)) {
            Bundle bundleExtra = intent.getBundleExtra("al_applink_data");
            if (!(bundleExtra == null || (bundle = bundleExtra.getBundle(B5B.INTENT_PARAM_EXTRAS)) == null || (string = bundle.getString("com.facebook.orca.extra.METADATA")) == null)) {
                try {
                    C13080hr A0A = C12890hY.A00.A0A(string);
                    A0A.A0p();
                    r0 = C177097hJ.parseFromJson(A0A);
                } catch (IOException unused) {
                    AnonymousClass0QD.A01("launch_from_messenger", "Can't parse metadata.");
                }
                if (r0 == null) {
                    dataString = r0.A00;
                } else {
                    dataString = null;
                }
                if (TextUtils.isEmpty(dataString)) {
                    AnonymousClass0DB.A04(A03, "Intent missing data url");
                    this.A01.A00.A01();
                    finish();
                }
            }
            r0 = null;
            if (r0 == null) {
            }
            if (TextUtils.isEmpty(dataString)) {
            }
        }
        AnonymousClass2M7 r6 = this.A01;
        Uri parse = Uri.parse(dataString);
        if (parse != null) {
            String scheme = parse.getScheme();
            String authority = parse.getAuthority();
            String path = parse.getPath();
            if (scheme == null) {
                scheme = "null";
            }
            if (authority == null) {
                authority = "null";
            }
            if (path == null) {
                path = "/path";
            }
            r6.A0A("uri", AnonymousClass000.A0N(scheme, "://", authority, path));
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("original_url", dataString);
        bundle2.putString("com.instagram.url.constants.ARGUMENTS_KEY_ANALYTICS_MODULE_NAME", getModuleName());
        bundle2.putString("IgSessionManager.SESSION_TOKEN_KEY", this.A00.getToken());
        Intent A002 = C53732Ub.A00(this, dataString);
        if (A002 != null) {
            this.A01.A0A("handler", "dfa");
            A002.putExtra("com.instagram.url.extra.BUNDLE", bundle2);
            AnonymousClass1BH.A03(A002, this);
            this.A01.A00.A04();
            finish();
        }
        AnonymousClass2MW A003 = C11310el.A00.A00(dataString, this.A00);
        if (A003 != null) {
            this.A01.A0A("handler", "legacy");
            C91853yD r4 = new C91853yD(AnonymousClass0QT.A00(this.A00, this).A02("ig_url_loaded"));
            Bundle extras = intent.getExtras();
            if (extras != null) {
                String valueOf = String.valueOf(extras.getParcelable("android.intent.extra.REFERRER"));
                if (!TextUtils.isEmpty(valueOf)) {
                    r4.A08("source_application", valueOf);
                }
                String string2 = extras.getString("short_url");
                if (!TextUtils.isEmpty(string2)) {
                    r4.A08("short_url", string2);
                }
            }
            r4.A08(IgReactNavigatorModule.URL, dataString);
            r4.A08("fbid", C14100jl.A01(this.A00));
            r4.A04("fb_installed", Boolean.valueOf(C17200pq.A03()));
            r4.A08("waterfall_id", C13910jS.A00());
            r4.A01();
            C11330en r42 = (C11330en) A003.A00;
            bundle2.putAll((Bundle) A003.A01);
            C06590Pq r1 = this.A00;
            if (r1.AgN()) {
                token = AnonymousClass0J1.A04(this).getToken();
            } else {
                token = r1.getToken();
            }
            bundle2.putString("IgSessionManager.SESSION_TOKEN_KEY", token);
            if (!r42.BdY()) {
                findViewById(C0003R.C0005id.layout_container_main).setBackground(new ColorDrawable(AnonymousClass1BA.A01(this, C0003R.attr.backgroundColorPrimary)));
            }
            C06590Pq r12 = this.A00;
            if (!(r42 instanceof C11320em)) {
                C132665lf.A00(r12).A00.A81(C132665lf.A01);
            }
            r42.AbA(bundle2, this, this.A00);
            this.A01.A00.A04();
            return;
        }
        C132665lf A004 = C132665lf.A00(this.A00);
        C132665lf.A01(A004, "no_url_handler");
        A004.A02();
        AnonymousClass0QD.A01("url_handler", AnonymousClass000.A0E("unable to handle url:", dataString));
        this.A01.A00.A01();
        finish();
    }

    public final C06590Pq A0L() {
        return this.A00;
    }

    public final void A0M() {
        if (A05().A0I() > 0) {
            super.A0M();
            return;
        }
        C26441Dh.A00(this.A00).A03(this, "up");
        if (!this.A02) {
            AnonymousClass1BH.A03(C11290ej.A00.A02(this, 268566528), this);
        }
        finish();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0076, code lost:
        if (r8.getExtras().getString("autologin") == null) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x008a, code lost:
        if (r8.getExtras().getString("fresh_sign_in") == null) goto L_0x008c;
     */
    public final void onCreate(Bundle bundle) {
        boolean z;
        boolean z2;
        int A002 = AnonymousClass0Z0.A00(2087277595);
        this.A00 = AnonymousClass0J1.A01(this);
        super.onCreate(bundle);
        AnonymousClass2M7 r1 = new AnonymousClass2M7();
        this.A01 = r1;
        r1.A0E(this, C26441Dh.A00(this.A00), true);
        this.A01.A0D();
        C12600h4.A00().A05(C12620h6.DEEPLINK);
        C06590Pq r12 = this.A00;
        if (r12.AgN()) {
            C26591Ec.A00(C05210Iq.A02(r12)).A02(getApplicationContext());
        }
        Intent intent = getIntent();
        String dataString = intent.getDataString();
        boolean z3 = false;
        if (dataString != null) {
            Set<String> queryParameterNames = Uri.parse(dataString).getQueryParameterNames();
            z2 = queryParameterNames.contains("autologin");
            z = queryParameterNames.contains("fresh_sign_in");
        } else {
            z = false;
            z2 = false;
        }
        if (!z2) {
            if (intent.getExtras() != null) {
                z2 = true;
            }
            z2 = false;
        }
        if (!z) {
            if (intent.getExtras() != null) {
                z = true;
            }
            z = false;
        }
        if (z2 && z) {
            z3 = true;
        }
        if (z3 && bundle == null && this.A00.AgN()) {
            C51512Ky r7 = new C51512Ky();
            r7.A09 = getResources().getString(C0003R.string.logged_in_as, new Object[]{C05210Iq.A02(this.A00).A06.AZn()});
            C11130eT.A01.BXT(new C33441cv(r7.A00()));
        }
        A01(getIntent());
        C26581Eb.A00(this, 1);
        AnonymousClass0Z0.A07(873011247, A002);
    }

    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        A01(intent);
    }

    public final void onPause() {
        int A002 = AnonymousClass0Z0.A00(2014607849);
        super.onPause();
        this.A01.A04();
        AnonymousClass0Z0.A07(1720025843, A002);
    }
}
