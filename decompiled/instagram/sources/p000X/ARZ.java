package p000X;

import android.text.TextUtils;

/* renamed from: X.ARZ */
public final class ARZ {
    public AQ8 A00;
    public boolean A01 = true;
    public boolean A02 = false;

    public ARZ(AQ8 aq8) {
        this.A00 = aq8;
    }

    public static long A00(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            long longValue = Long.valueOf(Long.parseLong(str)).longValue();
            if (longValue >= 0) {
                return longValue;
            }
            return -1;
        } catch (NumberFormatException unused) {
        }
    }
}
