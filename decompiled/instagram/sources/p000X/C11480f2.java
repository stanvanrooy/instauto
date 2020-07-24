package p000X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.model.mediatype.MediaType;

/* renamed from: X.0f2  reason: invalid class name and case insensitive filesystem */
public final class C11480f2 implements C11330en {
    public final boolean BdY() {
        return false;
    }

    public final void AbA(Bundle bundle, FragmentActivity fragmentActivity, C06590Pq r12) {
        if (bundle.containsKey("media_id") && bundle.containsKey("media_type")) {
            String string = bundle.getString("media_id");
            int i = MediaType.PHOTO.A00;
            try {
                Integer.parseInt(bundle.getString("media_type"));
                if (string != null && fragmentActivity != null) {
                    C52362Om r2 = new C52362Om(fragmentActivity, r12);
                    C162186w3 A03 = C16330oQ.A00.A03();
                    int i2 = -1;
                    if (MediaType.A00(i) == MediaType.CAROUSEL) {
                        i2 = 0;
                    }
                    r2.A02 = A03.A00(string, i, i2, -1, false);
                    r2.A02();
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    public final Bundle A7i(String str, C06590Pq r6) {
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        String host = parse.getHost();
        if (!"instagram".equalsIgnoreCase(scheme) || !"insights_edit_post".equals(host)) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("media_id", parse.getQueryParameter("media_id"));
        bundle.putString("media_type", parse.getQueryParameter("media_type"));
        return bundle;
    }
}
