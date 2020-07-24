package p000X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import java.util.List;
import java.util.Set;

/* renamed from: X.0em  reason: invalid class name and case insensitive filesystem */
public final class C11320em implements C11330en {
    public static boolean A00(List list) {
        return "accounts".equalsIgnoreCase((String) list.get(0)) && "password".equalsIgnoreCase((String) list.get(1)) && "reset".equalsIgnoreCase((String) list.get(2)) && "confirm".equalsIgnoreCase((String) list.get(3));
    }

    public final boolean BdY() {
        return false;
    }

    public final Bundle A7i(String str, C06590Pq r8) {
        Bundle bundle;
        String str2;
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
            bundle = null;
            if (AnonymousClass2C2.A00(parse)) {
                List<String> pathSegments = parse.getPathSegments();
                if (pathSegments.size() == 4) {
                    if (A00(pathSegments)) {
                        Bundle bundle2 = new Bundle();
                        String queryParameter = parse.getQueryParameter("uidb36");
                        String queryParameter2 = parse.getQueryParameter("token");
                        if (!(queryParameter == null || queryParameter2 == null)) {
                            bundle2.putString("argument_user_id", Long.toString(Long.parseLong(queryParameter, 36)));
                            bundle2.putString("argument_reset_token", queryParameter2);
                            return bundle2;
                        }
                    }
                } else if (pathSegments.size() == 6 && A00(pathSegments)) {
                    bundle = new Bundle();
                    bundle.putString("argument_user_id", Long.toString(Long.parseLong(pathSegments.get(4), 36)));
                    str2 = pathSegments.get(5);
                }
            }
            return bundle;
        } else if (!"instagram".equalsIgnoreCase(scheme)) {
            return null;
        } else {
            bundle = null;
            if (parse.getPath().startsWith("/reset_password")) {
                Set<String> queryParameterNames = parse.getQueryParameterNames();
                if (queryParameterNames.contains("u") && queryParameterNames.contains("t")) {
                    bundle = new Bundle();
                    bundle.putString("argument_user_id", Long.toString(Long.parseLong(parse.getQueryParameter("u"), 36)));
                    str2 = parse.getQueryParameter("t");
                }
            }
            return bundle;
        }
        bundle.putString("argument_reset_token", str2);
        return bundle;
    }

    public final void AbA(Bundle bundle, FragmentActivity fragmentActivity, C06590Pq r6) {
        AnonymousClass0CL A03 = AnonymousClass0J1.A03(bundle);
        C132665lf A00 = C132665lf.A00(A03);
        if (!AnonymousClass5EG.A01(A03)) {
            AnonymousClass5F9.A00(fragmentActivity, AnonymousClass5EG.A00());
            C132665lf.A01(A00, "max_account_reached");
            A00.A02();
            fragmentActivity.finish();
            return;
        }
        C132665lf.A01(A00, "starting_password_reset");
        C130545iD r2 = new C130545iD();
        bundle.remove("original_url");
        AnonymousClass5QQ A002 = AnonymousClass5QQ.A00(bundle);
        A002.A06(Constants.A15);
        A002.A02();
        bundle.putAll(A002.A01());
        r2.setArguments(bundle);
        AnonymousClass1H6 A0Q = fragmentActivity.A05().A0Q();
        A0Q.A02(C0003R.C0005id.layout_container_main, r2);
        A0Q.A09();
    }
}
