package p000X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import java.util.List;
import java.util.Set;

/* renamed from: X.0er  reason: invalid class name and case insensitive filesystem */
public final class C11370er implements C11330en {
    public final boolean BdY() {
        return false;
    }

    public final Bundle A7i(String str, C06590Pq r9) {
        Bundle bundle;
        String queryParameter;
        String str2;
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if ("https".equalsIgnoreCase(scheme) || "http".equalsIgnoreCase(scheme)) {
            bundle = null;
            if (AnonymousClass2C2.A00(parse)) {
                List<String> pathSegments = parse.getPathSegments();
                if (pathSegments.size() != 2 && pathSegments.size() != 3) {
                    return null;
                }
                if (!"p".equalsIgnoreCase(pathSegments.get(0))) {
                    if ("p".equalsIgnoreCase(pathSegments.get(1))) {
                        C140125yt.A03(r9, parse, "MediaExternalUrlHandler");
                    }
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("com.instagram.url.constants.ARGUMENTS_KEY_MEDIA_SHORT_URL", parse.toString());
                return bundle2;
            }
        } else if (!"instagram".equalsIgnoreCase(scheme)) {
            return null;
        } else {
            bundle = null;
            if ("media".equalsIgnoreCase(parse.getHost())) {
                Bundle bundle3 = new Bundle();
                Set<String> queryParameterNames = parse.getQueryParameterNames();
                if (queryParameterNames.contains("id")) {
                    queryParameter = Uri.parse(C06360Ot.A05("https://instagram.com/p/%s", parse.getQueryParameter("id"))).toString();
                    str2 = "com.instagram.url.constants.ARGUMENTS_KEY_MEDIA_SHORT_URL";
                } else if (queryParameterNames.contains("raw_id")) {
                    queryParameter = parse.getQueryParameter("raw_id");
                    str2 = "com.instagram.url.constants.ARGUMENTS_KEY_MEDIA_ID";
                }
                bundle3.putString(str2, queryParameter);
                return bundle3;
            }
        }
        return bundle;
    }

    public final void AbA(Bundle bundle, FragmentActivity fragmentActivity, C06590Pq r4) {
        if (!r4.AgN()) {
            C15790nX.A00.A00(fragmentActivity, r4, bundle);
        } else {
            C140125yt.A04(r4, fragmentActivity, bundle);
        }
    }
}
