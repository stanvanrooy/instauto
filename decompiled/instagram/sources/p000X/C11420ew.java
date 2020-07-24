package p000X;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.0ew  reason: invalid class name and case insensitive filesystem */
public final class C11420ew implements C11330en {
    public final boolean BdY() {
        return false;
    }

    public final Bundle A7i(String str, C06590Pq r3) {
        return AnonymousClass2C3.A01(str);
    }

    public final void AbA(Bundle bundle, FragmentActivity fragmentActivity, C06590Pq r7) {
        if (!r7.AgN()) {
            C15790nX.A00.A00(fragmentActivity, r7, bundle);
            return;
        }
        Intent A02 = C11290ej.A00.A02(fragmentActivity, 335544320);
        Uri build = Uri.parse("instagram://tv_viewer").buildUpon().appendQueryParameter("channel_user_id", bundle.getString("igtv_profile_deeplink_user_id_arg")).build();
        String string = bundle.getString("igtv_deeplink_media_id_arg");
        if (!TextUtils.isEmpty(string)) {
            build = build.buildUpon().appendQueryParameter("id", string).build();
        }
        A02.setData(build);
        AnonymousClass1BH.A03(A02, fragmentActivity);
        fragmentActivity.finish();
    }
}
