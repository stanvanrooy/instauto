package p000X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import java.util.Set;

/* renamed from: X.0eq  reason: invalid class name and case insensitive filesystem */
public final class C11360eq implements C11330en {
    public final boolean BdY() {
        return false;
    }

    public final Bundle A7i(String str, C06590Pq r7) {
        Uri parse = Uri.parse(str);
        if (!"instagram".equalsIgnoreCase(parse.getScheme()) || !"smsrecovery".equalsIgnoreCase(parse.getHost())) {
            return null;
        }
        Bundle bundle = new Bundle();
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        if (queryParameterNames.contains("token") && queryParameterNames.contains("utm_medium")) {
            bundle.putString("token", parse.getQueryParameter("token"));
        }
        return bundle;
    }

    public final void AbA(Bundle bundle, FragmentActivity fragmentActivity, C06590Pq r6) {
        bundle.putBoolean("smsrecovery", true);
        if (r6.AgN()) {
            Bundle bundle2 = ((AnonymousClass0C1) r6).A02(fragmentActivity, false, "settings").A00;
            bundle2.putAll(bundle);
            C15790nX.A00.A00(fragmentActivity, r6, bundle2);
            return;
        }
        C15790nX.A00.A00(fragmentActivity, r6, bundle);
    }
}
