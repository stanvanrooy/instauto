package p000X;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.0ex  reason: invalid class name and case insensitive filesystem */
public final class C11430ex implements C11330en {
    public final boolean BdY() {
        return false;
    }

    public final void AbA(Bundle bundle, FragmentActivity fragmentActivity, C06590Pq r7) {
        String string = bundle.getString("igtv_deeplink_short_url_arg");
        boolean z = bundle.getBoolean("igtv_deeplink_should_open_in_browser");
        if (!r7.AgN()) {
            C15790nX.A00.A00(fragmentActivity, r7, bundle);
        } else if (!TextUtils.isEmpty(string) && !z) {
            Intent A02 = C11290ej.A00.A02(fragmentActivity, 335544320);
            A02.setData(Uri.parse("instagram://tv_viewer").buildUpon().appendQueryParameter("short_url", string).build());
            AnonymousClass1BH.A03(A02, fragmentActivity);
            fragmentActivity.finish();
        } else if (z) {
            AnonymousClass2UC r2 = new AnonymousClass2UC(fragmentActivity, r7, bundle.getString("igtv_deeplink_full_url_arg"), AnonymousClass2UD.IGTV_MEDIA_LINK);
            r2.A04(bundle.getString("com.instagram.url.constants.ARGUMENTS_KEY_ANALYTICS_MODULE_NAME"));
            r2.A01();
            fragmentActivity.finish();
        }
    }

    public final Bundle A7i(String str, C06590Pq r3) {
        return AnonymousClass2C3.A00(str);
    }
}
