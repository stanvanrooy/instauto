package com.facebook.browser.lite.extensions.autofill.base;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.JavascriptInterface;
import android.widget.Toast;
import com.facebook.browser.lite.bridge.BrowserLiteJSBridgeProxy;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCallback;
import com.facebook.businessextension.jscalls.GetNonceJSBridgeCall;
import com.facebook.businessextension.jscalls.HideAutofillBarJSBridgeCall;
import com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCall;
import java.util.ArrayList;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000X.AQ8;
import p000X.ATK;
import p000X.ATL;
import p000X.AnonymousClass000;
import p000X.AnonymousClass088;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass2ZY;
import p000X.C05370Ke;
import p000X.C180787ni;
import p000X.C23575ARw;
import p000X.C24075AhV;
import p000X.C24096Ai0;
import p000X.C24097Ai2;

public class AutofillSharedJSBridgeProxy extends BrowserLiteJSBridgeProxy {
    public String A00;
    public int A01;
    public Long A02;
    public String A03;
    public String A04;
    public final Intent A05;
    public final C24075AhV A06;
    public final BrowserLiteJSBridgeCallback A07 = new AutofillJSBridgeCallback();
    public final String A08;
    public final boolean A09;

    public final class AutofillJSBridgeCallback extends BrowserLiteJSBridgeCallback.Stub {
        public /* synthetic */ AutofillJSBridgeCallback() {
            AnonymousClass0Z0.A0A(554923676, AnonymousClass0Z0.A03(2089537908));
            AnonymousClass0Z0.A0A(445986533, AnonymousClass0Z0.A03(180432862));
        }

        public final void AuE(BrowserLiteJSBridgeCall browserLiteJSBridgeCall, int i, Bundle bundle) {
            int A03 = AnonymousClass0Z0.A03(-382012831);
            if (browserLiteJSBridgeCall.A04.equals("requestAutoFill")) {
                RequestAutofillJSBridgeCall requestAutofillJSBridgeCall = new RequestAutofillJSBridgeCall(browserLiteJSBridgeCall.A00, browserLiteJSBridgeCall.A03, browserLiteJSBridgeCall.A01, browserLiteJSBridgeCall.A05, browserLiteJSBridgeCall.A02);
                String A032 = requestAutofillJSBridgeCall.A03();
                ArrayList arrayList = new ArrayList();
                for (AutofillData autofillData : C24096Ai0.A05(bundle.getStringArrayList("BrowserLiteIntent.EXTRA_AUTOFILL_ENTRY_JSON_STRINGS"))) {
                    if (!TextUtils.isEmpty((CharSequence) autofillData.A01().get(A032))) {
                        arrayList.add(autofillData);
                    }
                }
                if (!arrayList.isEmpty()) {
                    AutofillSharedJSBridgeProxy autofillSharedJSBridgeProxy = AutofillSharedJSBridgeProxy.this;
                    autofillSharedJSBridgeProxy.A06.A05(autofillSharedJSBridgeProxy, requestAutofillJSBridgeCall, arrayList);
                }
            }
            AnonymousClass0Z0.A0A(-312531223, A03);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0017 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0018 A[RETURN] */
    private JSONObject A00(String str) {
        JSONObject jSONObject;
        boolean z;
        try {
            jSONObject = new JSONObject(str);
            try {
                z = jSONObject.optString("nonce").equals(this.A00);
            } catch (JSONException unused) {
            }
        } catch (JSONException unused2) {
            jSONObject = null;
            z = false;
            if (!z) {
            }
        }
        if (!z) {
            return jSONObject;
        }
        return null;
    }

    private void A02(String str) {
        C24096Ai0.A07(new C24097Ai2(str, this.A08, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, 0));
    }

    public final void A09(BrowserLiteJSBridgeCall browserLiteJSBridgeCall, Bundle bundle) {
        C180787ni r6;
        BrowserLiteJSBridgeCall browserLiteJSBridgeCall2 = browserLiteJSBridgeCall;
        String str = browserLiteJSBridgeCall.A04;
        if (str.equals("getNonce") || str.equals("requestAutoFill")) {
            String str2 = this.A04;
            String string = bundle.getString("callbackID");
            if (string == null) {
                r6 = null;
            } else {
                r6 = new C180787ni(str2, true, string, bundle.getString("callback_result"));
            }
        } else {
            Log.e("AutofillSharedJSBridgeProxy", AnonymousClass000.A0E("No valid callback found for call: ", str));
            r6 = null;
        }
        String str3 = this.A04;
        AQ8 A052 = A05();
        if (A052 != null && r6 != null) {
            A052.A0l(new AnonymousClass088(this, A052, browserLiteJSBridgeCall2, str3, r6));
        }
    }

    @JavascriptInterface
    public void requestAutoFill(String str) {
        String str2;
        A02("JS_REQUEST_AUTOFILL");
        JSONObject A002 = A00(str);
        if (A002 != null) {
            if (this.A02 == null) {
                this.A02 = Long.valueOf(C05370Ke.A00.now());
                String str3 = this.A08;
                String str4 = this.A03;
                try {
                    JSONArray jSONArray = new JSONArray(A002.getString("allFields"));
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        arrayList.add(jSONArray.getString(i));
                    }
                    Collections.sort(arrayList);
                    str2 = TextUtils.join(", ", arrayList);
                } catch (JSONException e) {
                    ATK.A02("AutofillSharedUtil", e, "Failed to parseAllFields", e);
                    str2 = null;
                }
                C24096Ai0.A07(new C24097Ai2("FIRST_FORM_INTERACTION", str3, C24096Ai0.A04(A002), C24096Ai0.A03(A002), str2, (String) null, (String) null, A06(), str4, (String) null, 0, 0, 0, 0));
            }
            Intent intent = this.A05;
            boolean z = false;
            if (intent != null && intent.getBooleanExtra("BrowserLiteIntent.EXTRA_AUTOFILL_DEBUG_KEY", false)) {
                z = true;
            }
            if (z) {
                Toast.makeText(A03(), "requestAutofill", 0).show();
            }
            if (!this.A09) {
                RequestAutofillJSBridgeCall requestAutofillJSBridgeCall = new RequestAutofillJSBridgeCall(A03(), this.A03, A04(), A06(), A002);
                BrowserLiteJSBridgeCallback browserLiteJSBridgeCallback = this.A07;
                ATL A003 = ATL.A00();
                ATL.A02(A003, new C23575ARw(A003, requestAutofillJSBridgeCall, browserLiteJSBridgeCallback));
            }
        }
    }

    @JavascriptInterface
    public void saveAutofillData(String str) {
        long now;
        A02("JS_SAVE_AUTOFILL_DATA");
        JSONObject A002 = A00(str);
        if (A002 != null) {
            Long l = this.A02;
            if (l == null) {
                now = 0;
            } else {
                now = C05370Ke.A00.now() - l.longValue();
            }
            Long valueOf = Long.valueOf(now);
            String str2 = this.A08;
            long longValue = valueOf.longValue();
            int i = this.A01 + 1;
            this.A01 = i;
            String str3 = this.A03;
            String A062 = A06();
            String A032 = C24096Ai0.A03(A002);
            C24096Ai0.A07(new C24097Ai2("FORM_COMPLETION", str2, C24096Ai0.A04(A002), C24096Ai0.A03(A002), A032, (String) null, (String) null, A062, str3, (String) null, longValue, i, 0, 0));
            Intent intent = this.A05;
            boolean z = false;
            if (intent != null && intent.getBooleanExtra("BrowserLiteIntent.EXTRA_AUTOFILL_DEBUG_KEY", false)) {
                z = true;
            }
            if (z) {
                Toast.makeText(A03(), "saveAutofillData", 0).show();
            }
            if (!this.A09) {
                AutofillData A003 = C24096Ai0.A00(A002);
                if (A002.has("autofillFields")) {
                    try {
                        RequestAutofillJSBridgeCall.A00(A002);
                    } catch (JSONException unused) {
                    }
                }
                this.A06.A04(this, A003);
            }
        }
    }

    @JavascriptInterface
    public void initializeCallbackHandler(String str) {
        try {
            this.A04 = new JSONObject(str).getString("name");
        } catch (JSONException e) {
            Log.e("AutofillSharedJSBridgeProxy", "Exception parsing initializeCallbackHandler call", e);
        }
    }

    public AutofillSharedJSBridgeProxy(AQ8 aq8, C24075AhV ahV, Intent intent, String str) {
        A07(aq8);
        this.A06 = ahV;
        this.A05 = intent;
        this.A08 = str;
        boolean z = false;
        if (intent != null && intent.getBooleanExtra("BrowserLiteIntent.EXTRA_AUTOFILL_NO_PROMPT_MODE_ENABLED", false)) {
            z = true;
        }
        this.A09 = z;
    }

    @JavascriptInterface
    public void getNonce(String str) {
        this.A00 = AnonymousClass2ZY.A00().toString();
        GetNonceJSBridgeCall getNonceJSBridgeCall = new GetNonceJSBridgeCall(A03(), this.A03, A04(), A06(), new JSONObject(str));
        String A012 = getNonceJSBridgeCall.A01();
        String str2 = this.A00;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("nonce", str2);
        } catch (JSONException e) {
            ATK.A02("GetNonceJSBridgeCall", e, "Failed to set nonce result", e);
        }
        Bundle bundle = new Bundle();
        bundle.putString("callbackID", A012);
        bundle.putString("callback_result", jSONObject.toString());
        A09(getNonceJSBridgeCall, bundle);
        this.A02 = null;
        this.A01 = 0;
        String uuid = AnonymousClass2ZY.A00().toString();
        this.A03 = uuid;
        this.A06.A01 = uuid;
    }

    @JavascriptInterface
    public void hideAutoFillBar(String str) {
        JSONObject A002 = A00(str);
        if (A002 != null) {
            HideAutofillBarJSBridgeCall hideAutofillBarJSBridgeCall = new HideAutofillBarJSBridgeCall(A03(), this.A03, A04(), A06(), A002);
            BrowserLiteJSBridgeCallback browserLiteJSBridgeCallback = this.A07;
            ATL A003 = ATL.A00();
            ATL.A02(A003, new C23575ARw(A003, hideAutofillBarJSBridgeCall, browserLiteJSBridgeCallback));
        }
    }
}
