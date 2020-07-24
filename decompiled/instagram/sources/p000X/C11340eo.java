package p000X;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import java.util.List;

/* renamed from: X.0eo  reason: invalid class name and case insensitive filesystem */
public final class C11340eo implements C11330en {
    public final boolean BdY() {
        return false;
    }

    public final Bundle A7i(String str, C06590Pq r6) {
        Uri parse = Uri.parse(str);
        if (!"https".equalsIgnoreCase(parse.getScheme()) || !AnonymousClass2C2.A00(parse)) {
            return null;
        }
        List<String> pathSegments = parse.getPathSegments();
        if (pathSegments.size() != 4 || !"accounts".equalsIgnoreCase(pathSegments.get(0)) || !"confirm_email".equalsIgnoreCase(pathSegments.get(1))) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("EMAIL_NONCE", pathSegments.get(2));
        bundle.putString("ENCODED_EMAIL", pathSegments.get(3));
        return bundle;
    }

    public final void AbA(Bundle bundle, FragmentActivity fragmentActivity, C06590Pq r7) {
        if (!r7.AgN()) {
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("allow_confirm_email", true);
            bundle2.putString("confirm_email_nonce", bundle.getString("EMAIL_NONCE"));
            bundle2.putString("confirm_email_encoded_email", bundle.getString("ENCODED_EMAIL"));
            C15790nX.A00.A00(fragmentActivity, r7, bundle2);
            return;
        }
        Intent A02 = C11290ej.A00.A02(fragmentActivity, 0);
        A02.setData(Uri.parse(C06360Ot.formatString("https://confirm_email/?nonce=%s&encoded_email=%s", bundle.getString("EMAIL_NONCE"), bundle.getString("ENCODED_EMAIL"))));
        AnonymousClass1BH.A03(A02, fragmentActivity);
        fragmentActivity.finish();
    }
}
