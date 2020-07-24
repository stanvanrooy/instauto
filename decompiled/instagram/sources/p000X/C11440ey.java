package p000X;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.audio.model.AudioPageModelType;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.realtimeclient.RealtimeSubscription;

/* renamed from: X.0ey  reason: invalid class name and case insensitive filesystem */
public final class C11440ey implements C11330en {
    public final boolean BdY() {
        return false;
    }

    public final void AbA(Bundle bundle, FragmentActivity fragmentActivity, C06590Pq r19) {
        C06590Pq r2 = r19;
        Bundle bundle2 = bundle;
        String string = bundle2.getString("ARG_CLIPS_SHORT_URL_ID");
        FragmentActivity fragmentActivity2 = fragmentActivity;
        if (!r2.AgN()) {
            C15790nX.A00.A00(fragmentActivity2, r2, bundle2);
        } else if (string != null) {
            AnonymousClass0C1 r22 = (AnonymousClass0C1) r2;
            if (AnonymousClass1WV.A03(r22)) {
                C18600s7.A00.A06(r22, fragmentActivity2, new ClipsViewerConfig(ClipsViewerSource.THIRD_PARTY_URL, (String) null, string, (String) null, (String) null, 0, (String) null, (AudioPageModelType) null, (String) null, (String) null), new AnonymousClass418(this));
                fragmentActivity2.finish();
                return;
            }
            C140125yt.A04(r22, fragmentActivity2, bundle2);
        } else {
            Intent A02 = C11290ej.A00.A02(fragmentActivity2, 335544320);
            A02.setData(Uri.parse("instagram://explore").buildUpon().appendQueryParameter("ClipsConstants.URL_PARAM_AUTO_LAUNCH_EXPLORE_CLIPS_VIEWER", RealtimeSubscription.GRAPHQL_MQTT_VERSION).build());
            AnonymousClass1BH.A03(A02, fragmentActivity2);
            fragmentActivity2.finish();
        }
    }

    public final Bundle A7i(String str, C06590Pq r3) {
        return AnonymousClass2C4.A00(str);
    }
}
