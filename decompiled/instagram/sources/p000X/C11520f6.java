package p000X;

import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0f6  reason: invalid class name and case insensitive filesystem */
public final class C11520f6 implements C11330en {
    public C22800z1 A00;
    public C68172yZ A01;

    public final boolean BdY() {
        return false;
    }

    private void A00(AnonymousClass0C1 r5, Bundle bundle, FragmentActivity fragmentActivity) {
        C15890nh r2 = new C15890nh(r5);
        r2.A09 = Constants.A0N;
        r2.A0C = "notifications/whitelisted_react_native_routes_from_notif/";
        r2.A06(C99364Rj.class, false);
        C17850qu A03 = r2.A03();
        A03.A00 = new B4Q(this, r5, fragmentActivity, bundle);
        A05(this, "routes_request_start");
        C68172yZ r1 = new C68172yZ(fragmentActivity);
        this.A01 = r1;
        r1.A00(fragmentActivity.getString(C0003R.string.loading));
        this.A01.setCancelable(true);
        this.A01.setCanceledOnTouchOutside(false);
        this.A01.setOnCancelListener(new B4S(this, fragmentActivity));
        this.A01.show();
        C28351Lj.A00(fragmentActivity, AnonymousClass1L8.A00(fragmentActivity), A03);
    }

    public static void A01(C11520f6 r1) {
        C68172yZ r0 = r1.A01;
        if (r0 != null && r0.isShowing()) {
            r1.A01.dismiss();
        }
    }

    public static void A05(C11520f6 r1, String str) {
        C22800z1 r12 = r1.A00;
        if (r12 != null) {
            r12.A5I(C35051fj.A0O, str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x010f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0110, code lost:
        p000X.AnonymousClass0QD.A01("ReactNativeRouteHandler", r0.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0119, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x010f A[ExcHandler: IllegalArgumentException | SecurityException (r0v5 'e' java.lang.RuntimeException A[CUSTOM_DECLARE]), Splitter:B:2:0x0016] */
    public final Bundle A7i(String str, C06590Pq r11) {
        String str2;
        HashMap hashMap;
        if (((Boolean) C05640Lj.A00(AnonymousClass0L7.RN_ROUTE_HANDLER, "is_enabled", false)).booleanValue()) {
            try {
                Uri A002 = C08480Xf.A00(str);
                String scheme = A002.getScheme();
                if (("ig".equalsIgnoreCase(scheme) || "instagram".equalsIgnoreCase(scheme)) && "react_native".equals(A002.getHost())) {
                    String queryParameter = A002.getQueryParameter("route");
                    if (!TextUtils.isEmpty(queryParameter)) {
                        String queryParameter2 = A002.getQueryParameter(DialogModule.KEY_TITLE);
                        String queryParameter3 = A002.getQueryParameter("params");
                        String queryParameter4 = A002.getQueryParameter("is_buat_required");
                        if (TextUtils.isEmpty(queryParameter2)) {
                            str2 = "";
                        } else {
                            str2 = URLDecoder.decode(queryParameter2, "utf-8");
                        }
                        if (TextUtils.isEmpty(queryParameter3)) {
                            queryParameter3 = "{}";
                        }
                        String decode = URLDecoder.decode(queryParameter3, "utf-8");
                        if (!TextUtils.isEmpty(decode)) {
                            JSONObject jSONObject = new JSONObject(decode);
                            hashMap = new HashMap();
                            Iterator<String> keys = jSONObject.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                hashMap.put(next, jSONObject.get(next).toString());
                            }
                        } else {
                            hashMap = null;
                        }
                        Bundle bundle = new Bundle();
                        if (hashMap != null && !hashMap.isEmpty()) {
                            for (Map.Entry entry : hashMap.entrySet()) {
                                bundle.putString((String) entry.getKey(), (String) entry.getValue());
                            }
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("bundle_param_route", queryParameter);
                        bundle2.putString("bundle_param_title", str2);
                        bundle2.putBundle("bundle_param_props", bundle);
                        if (!RealtimeSubscription.GRAPHQL_MQTT_VERSION.equals(queryParameter4)) {
                            return bundle2;
                        }
                        bundle2.putBoolean("bundle_param_buat_required", true);
                        return bundle2;
                    }
                }
            } catch (IOException | SecurityException | JSONException e) {
                if (!TextUtils.isEmpty(e.getMessage())) {
                    AnonymousClass0QD.A01("ReactNativeRouteHandler", e.getMessage());
                }
            } catch (IllegalArgumentException | SecurityException e2) {
            }
            return null;
        }
        return null;
    }

    public final void AbA(Bundle bundle, FragmentActivity fragmentActivity, C06590Pq r10) {
        String string = bundle.getString("bundle_param_route");
        C22790z0 r0 = C22760yx.A00(r10).A00;
        this.A00 = r0;
        C35071fl r3 = C35051fj.A0O;
        r0.Bpg(r3);
        C22800z1 r2 = this.A00;
        if (TextUtils.isEmpty(string)) {
            string = "unknown";
        }
        r2.A3C(r3, AnonymousClass000.A0E("route_name:", string));
        A05(this, "handle_start");
        if (!(r10 instanceof AnonymousClass0C1)) {
            A05(this, "invalid_session");
            A02(this, fragmentActivity);
        } else if (bundle.getBoolean("bundle_param_buat_required", false)) {
            AnonymousClass0C1 r102 = (AnonymousClass0C1) r10;
            A05(this, "start_buat_fetch");
            C23802AbW.A00(fragmentActivity, AnonymousClass1L8.A00(fragmentActivity), r102, new C26908BuX(new B4T(this, r102, bundle, fragmentActivity), fragmentActivity, r102, "", "ReactNativeRouteHandler"));
        } else {
            A04(this, (AnonymousClass0C1) r10, bundle, fragmentActivity);
        }
    }

    public static void A02(C11520f6 r1, FragmentActivity fragmentActivity) {
        A01(r1);
        A05(r1, "activity_closed");
        fragmentActivity.finish();
    }

    public static void A03(C11520f6 r1, C06590Pq r2, Bundle bundle, FragmentActivity fragmentActivity, String str) {
        A05(r1, "route_launched");
        C53832Un newReactNativeLauncher = C16920pO.getInstance().newReactNativeLauncher(r2);
        newReactNativeLauncher.BkI(str);
        String string = bundle.getString("bundle_param_title");
        if (!TextUtils.isEmpty(string)) {
            newReactNativeLauncher.BlH(string);
        }
        Bundle bundle2 = bundle.getBundle("bundle_param_props");
        if (bundle2 != null && !bundle2.isEmpty()) {
            newReactNativeLauncher.Bjt(bundle2);
        }
        C52362Om BrT = newReactNativeLauncher.BrT(fragmentActivity);
        BrT.A08 = false;
        BrT.A02();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005c, code lost:
        if (java.lang.Math.abs(java.lang.System.currentTimeMillis() - r6.A01) >= p000X.B4P.A01) goto L_0x005e;
     */
    public static void A04(C11520f6 r10, AnonymousClass0C1 r11, Bundle bundle, FragmentActivity fragmentActivity) {
        List list;
        boolean z;
        B4P A002 = B4P.A00();
        synchronized (A002) {
            list = null;
            if (A002.A00 == null && StoredPreferences.A00 != null) {
                SharedPreferences A003 = C05750Lu.A00("RNWhiteListedRouteStore_Prefs");
                Set<String> stringSet = A003.getStringSet("RNWhiteListedRouteStore_RL", (Set) null);
                long j = A003.getLong("RNWhiteListedRouteStore_TS", 0);
                int i = A003.getInt("RNWhiteListedRouteStore_RC", -1);
                if (stringSet != null && j > 0 && i >= 0) {
                    A002.A00 = new B4R(stringSet, j, i);
                }
            }
            B4R b4r = A002.A00;
            if (b4r != null) {
                Set set = b4r.A02;
                if (set != null && !set.isEmpty() && b4r.A00 < 15) {
                    z = true;
                }
                z = false;
                if (z) {
                    A002.A00.A00++;
                    B4P.A01(A002);
                    B4R b4r2 = A002.A00;
                    if (b4r2.A02 == null) {
                        b4r2.A02 = new HashSet();
                    }
                    list = Collections.unmodifiableList(new ArrayList(Collections.unmodifiableSet(b4r2.A02)));
                }
            }
        }
        if (list == null || list.isEmpty()) {
            r10.A00(r11, bundle, fragmentActivity);
            return;
        }
        A05(r10, "routes_processing_cache");
        String string = bundle.getString("bundle_param_route");
        if (TextUtils.isEmpty(string) || !list.contains(string)) {
            A05(r10, "route_not_in_cache");
            r10.A00(r11, bundle, fragmentActivity);
            return;
        }
        A03(r10, r11, bundle, fragmentActivity, string);
        A01(r10);
    }
}
