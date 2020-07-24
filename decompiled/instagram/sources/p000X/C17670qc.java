package p000X;

import android.os.Bundle;
import com.instagram.igtv.viewer.edit.IGTVEditMetadataFragment;

/* renamed from: X.0qc  reason: invalid class name and case insensitive filesystem */
public final class C17670qc {
    public final AnonymousClass1HD A00(String str, String str2) {
        if (str == null) {
            str = AnonymousClass723.A00();
        }
        Bundle bundle = new Bundle();
        bundle.putString("igtv_session_id_arg", str);
        bundle.putString("igtv_media_id_arg", str2);
        IGTVEditMetadataFragment iGTVEditMetadataFragment = new IGTVEditMetadataFragment();
        iGTVEditMetadataFragment.setArguments(bundle);
        return iGTVEditMetadataFragment;
    }
}
