package p000X;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import java.util.List;

/* renamed from: X.0f1  reason: invalid class name and case insensitive filesystem */
public final class C11470f1 implements C11330en {
    public final boolean BdY() {
        return false;
    }

    public final Bundle A7i(String str, C06590Pq r12) {
        Object obj;
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if ((!"http".equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme)) || !"ig.me".equalsIgnoreCase(parse.getHost())) {
            return null;
        }
        Bundle bundle = new Bundle();
        List pathSegments = parse.getPathSegments();
        if (!pathSegments.isEmpty()) {
            String str2 = (String) pathSegments.get(0);
            if ("w".equalsIgnoreCase(str2)) {
                bundle.putBoolean("should_land_on_web", true);
                bundle.putParcelable("uri", parse);
                return bundle;
            }
            if (pathSegments.size() <= 1 || !"p".equalsIgnoreCase((String) pathSegments.get(1))) {
                bundle.putString("destination", str2);
                if (pathSegments.size() > 1) {
                    if ("f".equalsIgnoreCase((String) pathSegments.get(0)) || "follow".equalsIgnoreCase((String) pathSegments.get(0))) {
                        bundle.putString("InstagramUrlLaunchConstants.EXTRA_USER_NAME", (String) pathSegments.get(1));
                    } else {
                        obj = pathSegments.get(1);
                    }
                }
            } else {
                C140125yt.A03(r12, parse, "IgMeExternalUrlHandler");
                bundle.putString("destination", "p");
                if (pathSegments.size() > 2) {
                    obj = pathSegments.get(2);
                }
            }
            bundle.putString("parameter", (String) obj);
        }
        bundle.putString("short_url", parse.toString());
        bundle.putString("encoded_query", parse.getEncodedQuery());
        return bundle;
    }

    public final void AbA(Bundle bundle, FragmentActivity fragmentActivity, C06590Pq r8) {
        Integer num;
        Uri uri = (Uri) bundle.getParcelable("uri");
        if (uri == null || !bundle.getBoolean("should_land_on_web")) {
            String string = bundle.getString("destination");
            String string2 = bundle.getString("parameter");
            if ("p".equalsIgnoreCase(string)) {
                if (!TextUtils.isEmpty(string2)) {
                    bundle.putString("com.instagram.url.constants.ARGUMENTS_KEY_MEDIA_SHORT_URL", Uri.parse(C06360Ot.formatString("https://instagram.com/p/%s", string2)).toString());
                    C140125yt.A04(r8, fragmentActivity, bundle);
                    return;
                }
                num = Constants.ZERO;
            } else if ("u".equalsIgnoreCase(string)) {
                if (!TextUtils.isEmpty(string2)) {
                    bundle.putString("InstagramUrlLaunchConstants.EXTRA_USER_NAME", string2);
                }
                C140125yt.A06(r8, fragmentActivity, bundle);
                return;
            } else if ("e".equalsIgnoreCase(string)) {
                num = Constants.ONE;
            } else if ("n".equalsIgnoreCase(string)) {
                num = Constants.A0C;
            } else if ("f".equalsIgnoreCase(string) || "follow".equalsIgnoreCase(string)) {
                bundle.putBoolean("UserDetailFragment.EXTRA_SHOULD_SHOW_NAMETAG_RESULT_CARD", true);
                C140125yt.A06(r8, fragmentActivity, bundle);
                return;
            } else {
                C132665lf.A00(r8).A00.Bpg(C132665lf.A01);
                bundle.putString("com.instagram.android.fragment.ARGUMENTS_KEY_SHORT_CODE", string);
                AnonymousClass1HD A07 = AnonymousClass2UZ.A00().A07();
                bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", r8.getToken());
                A07.setArguments(bundle);
                C52362Om r1 = new C52362Om(fragmentActivity, r8);
                r1.A02 = A07;
                r1.A08 = false;
                r1.A02();
                return;
            }
            bundle.putString("destination_id", AnonymousClass1DW.A01(num));
            C140125yt.A01(fragmentActivity, bundle);
            return;
        }
        C140125yt.A02(fragmentActivity, r8, uri, bundle.getString("com.instagram.url.constants.ARGUMENTS_KEY_ANALYTICS_MODULE_NAME"));
        fragmentActivity.finish();
    }
}
