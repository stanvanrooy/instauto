package p000X;

import android.app.usage.StorageStatsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.facebook.common.dextricks.OdexSchemeArtTurbo;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.BWK */
public final class BWK implements C194388Tu {
    public static final String[] A02 = {"base.odex", "base.vdex", "base.art", "base.oat"};
    public static final String[] A03 = {"arm", "arm64", "x86", "x86_64"};
    public final Context A00;
    public final String[] A01;

    public final String AiW() {
        return "code";
    }

    public final Map BYM() {
        long j;
        HashMap hashMap = new HashMap();
        try {
            File file = new File(this.A00.getPackageCodePath());
            BWM bwm = new BWM(C698333v.A01(file));
            hashMap.put("apk", bwm);
            if (Build.VERSION.SDK_INT > 19) {
                File canonicalFile = file.getParentFile().getCanonicalFile();
                BWM bwm2 = new BWM(C698333v.A01(canonicalFile));
                C698433w r7 = new C698433w(0, 0, 0);
                File file2 = new File(canonicalFile, OdexSchemeArtTurbo.OREO_ODEX_DIR);
                for (String file3 : A03) {
                    File file4 = new File(file2, file3);
                    for (String str : this.A01) {
                        try {
                            C698433w A012 = C698333v.A01(new File(file4, str.trim()));
                            if (A012.A02 != 0) {
                                r7 = r7.A00(A012);
                                hashMap.put(AnonymousClass000.A0E("<oat_dir>/", str), new BWM(A012));
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
                BWM bwm3 = new BWM(r7);
                hashMap.put("extra", bwm3);
                bwm = new BWM(bwm2.A00(bwm3));
            }
            Context context = this.A00;
            if (Build.VERSION.SDK_INT < 26) {
                j = -1;
            } else {
                StorageStatsManager storageStatsManager = (StorageStatsManager) context.getSystemService(StorageStatsManager.class);
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                if (!(storageStatsManager == null || applicationInfo == null)) {
                    try {
                        j = storageStatsManager.queryStatsForUid(applicationInfo.storageUuid, applicationInfo.uid).getAppBytes();
                    } catch (IOException unused2) {
                    }
                }
                j = -1;
            }
            if (j < 0) {
                hashMap.put("code", bwm);
                return hashMap;
            }
            hashMap.put("bf_measurement", bwm);
            hashMap.put("code", new BWM(j, j, bwm.A01));
            return hashMap;
        } catch (IOException unused3) {
        }
    }

    public BWK(Context context, String[] strArr) {
        this.A00 = context;
        this.A01 = strArr;
    }
}
