package p000X;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.instagram.model.hashtag.Hashtag;
import java.util.List;

/* renamed from: X.0es  reason: invalid class name and case insensitive filesystem */
public final class C11380es implements C11330en {
    public final boolean BdY() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009c, code lost:
        if ("locations".equals(r1) != false) goto L_0x009e;
     */
    public final Bundle A7i(String str, C06590Pq r7) {
        Bundle bundle;
        boolean z;
        String str2;
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
            bundle = null;
            if (AnonymousClass2C2.A00(parse)) {
                List<String> pathSegments = parse.getPathSegments();
                if (pathSegments.size() >= 3 && AnonymousClass1DW.A01(Constants.ONE).equalsIgnoreCase(pathSegments.get(0))) {
                    String lowerCase = pathSegments.get(1).toLowerCase();
                    if (!"tags".equals(lowerCase)) {
                        z = false;
                    }
                    z = true;
                    if (z) {
                        bundle = new Bundle();
                        bundle.putString("explore_type", pathSegments.get(1));
                        str2 = pathSegments.get(2);
                    }
                }
            }
            return bundle;
        } else if (!"instagram".equalsIgnoreCase(scheme)) {
            return null;
        } else {
            bundle = null;
            if (B5B.INTENT_PARAM_TAG.equals(parse.getHost()) && parse.getQueryParameterNames().contains("name")) {
                str2 = parse.getQueryParameter("name");
                if (!TextUtils.isEmpty(str2) && !str2.contains(" ")) {
                    bundle = new Bundle();
                    bundle.putString("explore_type", B5B.INTENT_PARAM_TAG);
                }
            }
            return bundle;
        }
        bundle.putString("explore_param", str2);
        return bundle;
    }

    public final void AbA(Bundle bundle, FragmentActivity fragmentActivity, C06590Pq r10) {
        C52362Om r4;
        AnonymousClass1HD A01;
        if (!r10.AgN()) {
            C15790nX.A00.A00(fragmentActivity, r10, bundle);
            return;
        }
        AnonymousClass0C1 A02 = C05210Iq.A02(r10);
        String string = bundle.getString("explore_type");
        if ("tags".equals(string) || B5B.INTENT_PARAM_TAG.equals(string)) {
            r4 = new C52362Om(fragmentActivity, r10);
            r4.A08 = false;
            A01 = C17910r0.A00.A01().A01(new Hashtag(bundle.getString("explore_param")), "from_url", "DEFAULT");
        } else if ("locations".equals(string)) {
            r4 = new C52362Om(fragmentActivity, r10);
            r4.A08 = false;
            A01 = C16230oG.A00.getFragmentFactory().Apr(bundle.getString("explore_param"));
        } else {
            return;
        }
        String token = A02.getToken();
        Bundle bundle2 = A01.mArguments;
        bundle2.putString("IgSessionManager.SESSION_TOKEN_KEY", token);
        A01.setArguments(bundle2);
        r4.A02 = A01;
        r4.A02();
    }
}
