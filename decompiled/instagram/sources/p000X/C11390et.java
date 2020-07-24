package p000X;

import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;

/* renamed from: X.0et  reason: invalid class name and case insensitive filesystem */
public final class C11390et implements C11330en {
    public final boolean BdY() {
        return false;
    }

    public final Bundle A7i(String str, C06590Pq r8) {
        if (!C12800hP.A0J(r8)) {
            return null;
        }
        Uri parse = Uri.parse(str);
        if (!"instagram".equalsIgnoreCase(parse.getScheme()) || !"fb_friends".equalsIgnoreCase(parse.getHost()) || !parse.getQueryParameterNames().contains("source")) {
            return null;
        }
        String queryParameter = parse.getQueryParameter("source");
        String queryParameter2 = parse.getQueryParameter("platform");
        Bundle bundle = new Bundle();
        bundle.putString("source", queryParameter);
        bundle.putString("platform", queryParameter2);
        return bundle;
    }

    public final void AbA(Bundle bundle, FragmentActivity fragmentActivity, C06590Pq r9) {
        if (!r9.AgN()) {
            C15790nX.A00.A00(fragmentActivity, r9, bundle);
        } else if (C12800hP.A0J(r9)) {
            C127505dB r2 = new C127505dB();
            AnonymousClass0C1 r92 = (AnonymousClass0C1) r9;
            Resources resources = fragmentActivity.getResources();
            Bundle bundle2 = new Bundle();
            int intValue = Constants.ZERO.intValue();
            bundle2.putString("IgSessionManager.SESSION_TOKEN_KEY", r92.getToken());
            bundle2.putInt("UserListWithSocialConnectFragment.ARGUMENTS_TYPE", intValue);
            bundle2.putString("UserListWithSocialConnectFragment.ARGUMENTS_TITLE", resources.getString(C0003R.string.find_friends_item_facebook_friends));
            bundle2.putBoolean("UserListWithSocialConnectFragment.ARGUMENTS_OPEN_BACK_BUTTON", true);
            String A00 = C14100jl.A00(r92);
            if (A00 != null) {
                bundle2.putString("UserListWithSocialConnectFragment.ARGUMENTS_ACCESS_TOKEN", A00);
            }
            r2.setArguments(bundle2);
            AnonymousClass1H6 A0Q = fragmentActivity.A05().A0Q();
            A0Q.A02(C0003R.C0005id.layout_container_main, r2);
            A0Q.A09();
        }
    }
}
