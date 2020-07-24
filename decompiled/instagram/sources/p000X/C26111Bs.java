package p000X;

import android.content.Context;
import android.os.Environment;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import java.io.File;

/* renamed from: X.1Bs  reason: invalid class name and case insensitive filesystem */
public final class C26111Bs {
    public static File A00(Context context) {
        boolean z;
        if (C05770Lw.A00().A00.getBoolean("debug_sdcard_for_tmp_media_file", false)) {
            return context.getExternalFilesDir((String) null);
        }
        File filesDir = context.getFilesDir();
        if (filesDir == null) {
            AnonymousClass0QD.A01("GetFilesDir_null", context.getClass().getCanonicalName());
            filesDir = context.getExternalFilesDir((String) null);
        }
        try {
            z = false;
            if ((AnonymousClass0P6.A00(context) / OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED) / OdexSchemeArtXdex.STATE_MIXED_ATTEMPTED < 100) {
                z = true;
            }
        } catch (Throwable th) {
            AnonymousClass0QD.A09("internal_space_check_error", th);
            z = true;
        }
        if (!z || Environment.isExternalStorageEmulated()) {
            return filesDir;
        }
        return context.getExternalFilesDir((String) null);
    }
}
