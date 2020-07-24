package p000X;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.modules.datepicker.DatePickerDialogModule;

/* renamed from: X.0ev  reason: invalid class name and case insensitive filesystem */
public final class C11410ev implements C11330en {
    public final boolean BdY() {
        return true;
    }

    public final void AbA(Bundle bundle, FragmentActivity fragmentActivity, C06590Pq r8) {
        Intent A02 = C11290ej.A00.A02(fragmentActivity, 335544320);
        Uri.Builder buildUpon = Uri.parse("instagram://story-camera").buildUpon();
        String string = bundle.getString("story-camera-mode-key", (String) null);
        if (string != null) {
            buildUpon.appendQueryParameter(DatePickerDialogModule.ARG_MODE, string);
        }
        String string2 = bundle.getString("effect_id_key", (String) null);
        if (string2 != null) {
            buildUpon.appendQueryParameter("effect_id", string2);
        }
        String string3 = bundle.getString("ch_key", (String) null);
        if (string3 != null) {
            buildUpon.appendQueryParameter("test_link_crypto_hash", string3);
        }
        String string4 = bundle.getString("revisionID_key", (String) null);
        if (string4 != null) {
            buildUpon.appendQueryParameter("test_link_revision_id", string4);
        }
        String string5 = bundle.getString("unlocked_sticker_id", (String) null);
        if (string5 != null) {
            buildUpon.appendQueryParameter("unlocked_sticker_id", string5);
        }
        A02.setData(buildUpon.build());
        AnonymousClass1BH.A03(A02, fragmentActivity);
        fragmentActivity.finish();
    }

    public final Bundle A7i(String str, C06590Pq r13) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        String host = parse.getHost();
        String path = parse.getPath();
        if (parse.isHierarchical()) {
            str3 = parse.getQueryParameter("story-camera-mode");
            str4 = parse.getQueryParameter("effect_id");
            str5 = parse.getQueryParameter("ch");
            str6 = parse.getQueryParameter("revision_id");
            str2 = parse.getQueryParameter("unlocked_sticker_id");
        } else {
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
            str6 = null;
        }
        if ((!"ig".equalsIgnoreCase(scheme) || !"story-camera".equals(host)) && ((!"http".equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme)) || !"instagram.com".equals(host) || !"/linking/create_story".equals(path))) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("story-camera-mode-key", str3);
        bundle.putString("effect_id_key", str4);
        bundle.putString("ch_key", str5);
        bundle.putString("revisionID_key", str6);
        bundle.putString("unlocked_sticker_id", str2);
        return bundle;
    }
}
