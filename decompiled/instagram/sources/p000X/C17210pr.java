package p000X;

import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: X.0pr  reason: invalid class name and case insensitive filesystem */
public enum C17210pr {
    KATANA("com.facebook.katana", ".provider.FirstPartyUserValuesProvider/user_values", true, 0),
    WAKIZASHI("com.facebook.wakizashi", ".provider.FirstPartyUserValuesProvider/user_values", true, 0),
    LITE("com.facebook.lite", ".provider.UserValuesProvider/user_values", false, 58962169);
    
    public final String A00;
    public final String A01;
    public final boolean A02;
    public final int A03;

    public final boolean A00(Context context) {
        int i;
        try {
            i = context.getPackageManager().getPackageInfo(this.A00, 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            i = -1;
        }
        if (i >= this.A03) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: public */
    C17210pr(String str, String str2, boolean z, int i) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = z;
        this.A03 = i;
    }
}
