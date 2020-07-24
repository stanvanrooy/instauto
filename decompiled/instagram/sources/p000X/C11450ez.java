package p000X;

import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.profile.intf.AutoLaunchReelParams;
import java.util.List;

/* renamed from: X.0ez  reason: invalid class name and case insensitive filesystem */
public final class C11450ez implements C11330en {
    public final boolean BdY() {
        return false;
    }

    public final void AbA(Bundle bundle, FragmentActivity fragmentActivity, C06590Pq r4) {
        if (bundle.containsKey("InstagramUrlLaunchConstants.EXTRA_USER_NAME")) {
            C140125yt.A06(r4, fragmentActivity, bundle);
        }
    }

    public final Bundle A7i(String str, C06590Pq r10) {
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if ((!"https".equalsIgnoreCase(scheme) && !"http".equalsIgnoreCase(scheme)) || !AnonymousClass2C2.A00(parse)) {
            return null;
        }
        List<String> pathSegments = parse.getPathSegments();
        if (pathSegments.size() < 2 || !"live".equalsIgnoreCase(pathSegments.get(1))) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("InstagramUrlLaunchConstants.EXTRA_USER_NAME", pathSegments.get(0));
        AnonymousClass6KD r3 = new AnonymousClass6KD(C145496Jw.LIVE, (String) null);
        if (pathSegments.size() != 2) {
            if (pathSegments.size() != 3) {
                return null;
            }
            r3.A00 = pathSegments.get(2);
        }
        bundle.putParcelable("InstagramUrlLaunchConstants.EXTRA_AUTO_LAUNCH_REEL_PARAMS", new AutoLaunchReelParams(r3));
        return bundle;
    }
}
