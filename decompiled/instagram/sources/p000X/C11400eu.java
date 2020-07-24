package p000X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.guides.intf.model.MinimalGuide;
import java.util.List;

/* renamed from: X.0eu  reason: invalid class name and case insensitive filesystem */
public final class C11400eu implements C11330en {
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0041, code lost:
        if (android.text.TextUtils.isEmpty(r1) != false) goto L_0x0043;
     */
    public final Bundle A7i(String str, C06590Pq r7) {
        String str2;
        try {
            Uri A00 = C08480Xf.A00(str);
            String scheme = A00.getScheme();
            if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                if (AnonymousClass2C2.A00(A00)) {
                    List<String> pathSegments = A00.getPathSegments();
                    if (pathSegments.size() >= 3 && "guide".equals(pathSegments.get(1))) {
                        str2 = pathSegments.get(pathSegments.size() - 1);
                    }
                }
                return null;
            }
            if ("instagram".equalsIgnoreCase(scheme) && "guide".equals(A00.getHost()) && A00.getQueryParameterNames().contains("id")) {
                str2 = A00.getQueryParameter("id");
            }
            return null;
            Bundle bundle = new Bundle();
            bundle.putString("guide_id", str2);
            return bundle;
        } catch (Exception unused) {
        }
    }

    public final void AbA(Bundle bundle, FragmentActivity fragmentActivity, C06590Pq r16) {
        C06590Pq r1 = r16;
        if (!r1.AgN()) {
            C15790nX.A00.A00(fragmentActivity, r1, bundle);
            return;
        }
        C18830sU.A00.A02(fragmentActivity, C05210Iq.A02(r1), new MinimalGuide(bundle.getString("guide_id"), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, false), AnonymousClass6VD.DEEP_LINK);
        fragmentActivity.finish();
    }

    public final boolean BdY() {
        return false;
    }
}
