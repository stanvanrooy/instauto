package p000X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.0f3  reason: invalid class name and case insensitive filesystem */
public final class C11490f3 implements C11330en {
    public final boolean BdY() {
        return false;
    }

    public final void AbA(Bundle bundle, FragmentActivity fragmentActivity, C06590Pq r7) {
        AnonymousClass1HD A0N;
        if (bundle != null && (A0N = fragmentActivity.A05().A0N("IgInsightsAccountInsightsRoute")) != null && (A0N instanceof C23176ABe) && r7.AgN()) {
            C16330oQ.A00.A04(A0N.getContext(), (C23176ABe) A0N, C05210Iq.A02(r7)).BpO(Constants.ZERO, Constants.A0N);
        }
    }

    public final Bundle A7i(String str, C06590Pq r5) {
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        String host = parse.getHost();
        if (!"instagram".equalsIgnoreCase(scheme) || !"create_post".equals(host)) {
            return null;
        }
        return new Bundle();
    }
}
