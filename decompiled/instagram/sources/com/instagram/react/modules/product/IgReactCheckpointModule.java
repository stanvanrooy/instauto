package com.instagram.react.modules.product;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.facebook.fbreact.specs.NativeIGCheckpointReactModuleSpec;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.module.annotations.ReactModule;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p000X.A44;
import p000X.AnonymousClass000;
import p000X.Constants;
import p000X.AnonymousClass0CL;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass0RN;
import p000X.AnonymousClass12C;
import p000X.AnonymousClass1BH;
import p000X.AnonymousClass2OA;
import p000X.AnonymousClass2VL;
import p000X.AnonymousClass3M1;
import p000X.AnonymousClass6VY;
import p000X.C05210Iq;
import p000X.C06590Pq;
import p000X.C126785c0;
import p000X.C129145fs;
import p000X.C130995iw;
import p000X.C138925w4;
import p000X.C138985wA;
import p000X.C139005wC;
import p000X.C139015wE;
import p000X.C139045wH;
import p000X.C139105wO;
import p000X.C139205xE;
import p000X.C139365xU;
import p000X.C143496Bw;
import p000X.C17920r1;
import p000X.C17970r6;
import p000X.C2102594w;
import p000X.C227489qa;
import p000X.C228259s1;
import p000X.C23041A0r;
import p000X.C23043A0y;
import p000X.C43791v5;
import p000X.C55982bj;

@ReactModule(name = "IGCheckpointReactModule")
public class IgReactCheckpointModule extends NativeIGCheckpointReactModuleSpec {
    public static final String ALERT_MESSAGE_KEY = "alert_message";
    public static final String ALERT_TITLE_KEY = "alert_title";
    public static final String BIG_BLUE_TOKEN = "bigBlueToken";
    public static final String GOOGLE_OAUTH_TOKEN = "googleOAuthToken";
    public static final String MODULE_NAME = "IGCheckpointReactModule";
    public final C06590Pq mSession;

    public String getName() {
        return MODULE_NAME;
    }

    public void logoutAllUsersWithReactTag(double d) {
    }

    public static Map convertParams(C23043A0y a0y) {
        HashMap hashMap = new HashMap();
        putAll(hashMap, a0y);
        return hashMap;
    }

    private C17920r1 getGenericCallback(C2102594w r2) {
        return new C139045wH(this, r2);
    }

    private void onCheckpointCompleted() {
        C139205xE A00 = C17970r6.A00(this.mSession);
        if (A00 != null) {
            A00.A01();
        }
    }

    public void continueChallengeWithData(C23043A0y a0y, double d) {
        C138925w4.A00(getReactApplicationContext(), this.mSession, "challenge/", Constants.A0N, new C139005wC(this, a0y, d), (Map) null);
    }

    public void getEncryptedPassword(String str, String str2, C2102594w r7) {
        C06590Pq r0 = this.mSession;
        C228259s1 A03 = C23041A0r.A03();
        AnonymousClass2VL r2 = new AnonymousClass2VL(r0);
        A03.putString("encryptedPassword", r2.encodePassword(str));
        A03.putString("encryptedConfirmedPassword", r2.encodePassword(str2));
        r7.resolve(A03);
    }

    public void goToHomeScreen() {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        intent.setFlags(268435456);
        AnonymousClass1BH.A0F(intent, getReactApplicationContext());
    }

    public void proceedAndUpdateChallengeWithParams(C23043A0y a0y, C23043A0y a0y2, double d, C2102594w r12) {
        C138985wA r0 = new C138985wA(this, this.mSession, a0y2, (int) d, r12);
        C138925w4.A00(getReactApplicationContext(), this.mSession, "challenge/", Constants.ONE, r0, convertParams(a0y));
    }

    public void resetChallengeWithReactTag(double d) {
        C138925w4.A00(getReactApplicationContext(), this.mSession, "challenge/reset/", Constants.ONE, new C139015wE(this, d), (Map) null);
    }

    public IgReactCheckpointModule(A44 a44, C06590Pq r2) {
        super(a44);
        this.mSession = r2;
    }

    public static void closeCheckpointWithAlert(IgReactCheckpointModule igReactCheckpointModule, C23043A0y a0y, int i) {
        Activity currentActivity = igReactCheckpointModule.getCurrentActivity();
        if (!a0y.hasKey(ALERT_TITLE_KEY) || !a0y.hasKey(ALERT_MESSAGE_KEY) || currentActivity == null) {
            igReactCheckpointModule.closeCheckpoint((double) i);
            return;
        }
        String string = a0y.getString(ALERT_TITLE_KEY);
        String string2 = a0y.getString(ALERT_MESSAGE_KEY);
        AnonymousClass2OA r2 = new AnonymousClass2OA(currentActivity);
        r2.A03 = string;
        r2.A0M(string2);
        r2.A0A(17039370, new C139105wO(igReactCheckpointModule, i));
        r2.A03().show();
    }

    public static void putAll(Map map, C23043A0y a0y) {
        ReadableMapKeySetIterator keySetIterator = a0y.keySetIterator();
        while (keySetIterator.Aby()) {
            String Aq1 = keySetIterator.Aq1();
            if (a0y.getType(Aq1) == ReadableType.String) {
                map.put(Aq1, a0y.getString(Aq1));
            }
        }
    }

    public static void reportSoftError(C43791v5 r1) {
        if (r1.A02()) {
            AnonymousClass0QD.A09("Checkpoint native module error", r1.A01);
        }
    }

    public void closeCheckpoint(double d) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.finish();
        }
        onCheckpointCompleted();
    }

    public void extractCountryCodeAndNumber(String str, C2102594w r7) {
        String str2;
        int length;
        A44 reactApplicationContext = getReactApplicationContext();
        String str3 = AnonymousClass3M1.A00(reactApplicationContext).A00;
        String str4 = AnonymousClass3M1.A00(reactApplicationContext).A01;
        String A0E = AnonymousClass000.A0E("+", AnonymousClass3M1.A00(reactApplicationContext).A01);
        if (!TextUtils.isEmpty(str)) {
            if (str.startsWith(str4)) {
                length = str4.length();
            } else if (str.startsWith(A0E)) {
                length = A0E.length();
            }
            str2 = str.substring(length);
            C228259s1 A03 = C23041A0r.A03();
            A03.putString("country", str3);
            A03.putString("countryCode", str4);
            A03.putString("phoneNumber", str2);
            r7.resolve(A03);
        }
        str2 = "";
        C228259s1 A032 = C23041A0r.A03();
        A032.putString("country", str3);
        A032.putString("countryCode", str4);
        A032.putString("phoneNumber", str2);
        r7.resolve(A032);
    }

    public void fetchBBT(C2102594w r4) {
        if (C55982bj.A00().A04()) {
            C228259s1 A03 = C23041A0r.A03();
            A03.putString(BIG_BLUE_TOKEN, C55982bj.A00().A02());
            r4.resolve(A03);
            return;
        }
        r4.reject(new Throwable());
    }

    public void fetchFacebookToken(C2102594w r12) {
        C227489qa A02 = AnonymousClass6VY.A02(getCurrentActivity());
        AnonymousClass0CL A01 = C05210Iq.A01(this.mSession);
        C126785c0 r2 = C126785c0.DELTA_CHALLENGE;
        A02.registerLifecycleListener(new C139365xU(A01, r2, r12, A02, A02));
        new C130995iw(A01, A02, C129145fs.CHALLENGE_CLEAR_LOGIN, A02, (String) null).A05(r2);
    }

    public void fetchGoogleOAuthToken(double d, C2102594w r7) {
        List<String> A01 = C143496Bw.A01(getReactApplicationContext(), this.mSession, (String) null, (AnonymousClass0RN) null);
        if (!A01.isEmpty()) {
            C228259s1 A03 = C23041A0r.A03();
            StringBuilder sb = new StringBuilder();
            for (String append : A01) {
                sb.append(append);
                sb.append(",");
            }
            A03.putString(GOOGLE_OAUTH_TOKEN, sb.toString());
            r7.resolve(A03);
            return;
        }
        r7.reject(new Throwable());
    }

    public void generateURIWithPreviewDataString(String str, C2102594w r5) {
        getReactApplicationContext();
        C228259s1 A03 = C23041A0r.A03();
        A03.putString("imagePreviewURI", (String) null);
        if (!TextUtils.isEmpty(str)) {
            A03.putString("imagePreviewURI", AnonymousClass12C.A01(str).AZc());
        }
        r5.resolve(A03);
    }

    public void proceedChallengeWithParams(C23043A0y a0y, C2102594w r8) {
        A44 reactApplicationContext = getReactApplicationContext();
        C06590Pq r1 = this.mSession;
        Map convertParams = convertParams(a0y);
        C138925w4.A00(reactApplicationContext, r1, "challenge/", Constants.ONE, new C139045wH(this, r8), convertParams);
    }

    public void replayChallengeWithParams(C23043A0y a0y, C2102594w r8) {
        A44 reactApplicationContext = getReactApplicationContext();
        C06590Pq r1 = this.mSession;
        Map convertParams = convertParams(a0y);
        C138925w4.A00(reactApplicationContext, r1, "challenge/replay/", Constants.ONE, new C139045wH(this, r8), convertParams);
    }
}
