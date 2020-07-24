package p000X;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.List;
import java.util.Set;

/* renamed from: X.0ep  reason: invalid class name and case insensitive filesystem */
public final class C11350ep implements C11330en {
    public final boolean BdY() {
        return false;
    }

    public final Bundle A7i(String str, C06590Pq r11) {
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if ("https".equalsIgnoreCase(scheme) || "http".equalsIgnoreCase(scheme)) {
            if (!AnonymousClass2C2.A00(parse)) {
                return null;
            }
            List<String> pathSegments = parse.getPathSegments();
            if (pathSegments.size() != 2) {
                return null;
            }
            if (!"_n".equalsIgnoreCase(pathSegments.get(0)) && !"n".equalsIgnoreCase(pathSegments.get(0))) {
                return null;
            }
            Bundle bundle = new Bundle();
            String str2 = pathSegments.get(1);
            bundle.putString("destination_id", str2);
            bundle.putString("encoded_query", parse.getEncodedQuery());
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            Set<String> queryParameterNames2 = parse.getQueryParameterNames();
            boolean contains = queryParameterNames2.contains("utm_medium");
            String str3 = IgReactPurchaseExperienceBridgeModule.EMAIL;
            if ((!contains || !parse.getQueryParameter("utm_medium").equalsIgnoreCase(str3)) && !str2.equalsIgnoreCase("emaillogin")) {
                str3 = "";
                if ((!queryParameterNames2.contains("utm_medium") || !parse.getQueryParameter("utm_medium").equalsIgnoreCase(str3)) && !str2.equalsIgnoreCase("smslogin")) {
                    str3 = null;
                }
            }
            if (queryParameterNames.contains("uid") && queryParameterNames.contains("token") && str3 != null) {
                bundle.putString("uid", parse.getQueryParameter("uid"));
                bundle.putString("token", parse.getQueryParameter("token"));
                bundle.putString("source", str3);
            }
            if (queryParameterNames.contains("auto_send")) {
                bundle.putString("auto_send", parse.getQueryParameter("auto_send"));
            }
            if (!queryParameterNames.contains("bypass")) {
                return bundle;
            }
            bundle.putBoolean("bypass", parse.getBooleanQueryParameter("bypass", false));
            return bundle;
        } else if (!"instagram".equalsIgnoreCase(scheme)) {
            return null;
        } else {
            String host = parse.getHost();
            if (!host.equalsIgnoreCase(AnonymousClass1DW.A01(Constants.ZERO)) && !host.equalsIgnoreCase(AnonymousClass1DW.A01(Constants.ONE)) && !host.equalsIgnoreCase(AnonymousClass1DW.A01(Constants.A0C)) && !host.equalsIgnoreCase(AnonymousClass1DW.A01(Constants.A0Y))) {
                return null;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("destination_id", host);
            bundle2.putString("encoded_query", parse.getEncodedQuery());
            return bundle2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0048, code lost:
        if (r10.containsKey("source") == false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (r10.containsKey("source") == false) goto L_0x001c;
     */
    public final void AbA(Bundle bundle, FragmentActivity fragmentActivity, C06590Pq r12) {
        boolean z;
        String queryParameter;
        boolean z2;
        String str;
        if (bundle.containsKey("uid") && bundle.containsKey("token")) {
            z = true;
        }
        z = false;
        if (z) {
            C130005hL.A00(r12).A00.Bpg(C130005hL.A01);
        }
        FragmentActivity fragmentActivity2 = fragmentActivity;
        if (r12.AgN()) {
            if (bundle.containsKey("uid") && bundle.containsKey("token")) {
                z2 = true;
            }
            z2 = false;
            if (z2) {
                AnonymousClass0C1 A02 = C05210Iq.A02(r12);
                String l = Long.toString(Long.parseLong(bundle.getString("uid"), 36));
                C130005hL A00 = C130005hL.A00(A02);
                if (A02.A04().equals(l)) {
                    C140125yt.A01(fragmentActivity, bundle);
                    str = "already_logged_in";
                } else {
                    C13300iJ A01 = A02.A05.A01(l);
                    if (A01 != null) {
                        C140125yt.A01(fragmentActivity, bundle);
                        C024402j r3 = A02.A05;
                        if (r3.A0A(fragmentActivity, A02, A01)) {
                            r3.A06(fragmentActivity2, A02, A01, "deep_link", (Intent) null);
                        }
                        str = "already_logged_in";
                    } else if (AnonymousClass5EG.A01(A02)) {
                        bundle.putBoolean("IS_ADD_ACCOUNT_FLOW", true);
                        C130005hL.A01(A00, "start_sign_in_flow");
                        C15790nX.A00.A00(fragmentActivity, A02, bundle);
                        return;
                    } else {
                        AnonymousClass5F9.A00(fragmentActivity, AnonymousClass5EG.A00());
                        fragmentActivity.finish();
                        str = "max_account_reached";
                    }
                }
                C130005hL.A01(A00, str);
                A00.A02();
                return;
            }
            C140125yt.A01(fragmentActivity, bundle);
            return;
        }
        Uri A002 = C140125yt.A00(bundle);
        if (A002 != null) {
            C35111fp A003 = C35111fp.A00(r12);
            if (A002 == null) {
                queryParameter = null;
            } else {
                queryParameter = A002.getQueryParameter("attempt_id");
            }
            A003.A02(queryParameter, "ig_app_auth");
        }
        C15790nX.A00.A00(fragmentActivity, r12, bundle);
    }
}
