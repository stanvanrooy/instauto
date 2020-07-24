package p000X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import java.util.HashSet;

/* renamed from: X.B63 */
public abstract class B63 {
    public static final HashSet A00;

    public String A01() {
        return !(this instanceof C25193B5z) ? !(this instanceof B60) ? "com.facebook.katana" : "com.facebook.orca" : "com.facebook.wakizashi";
    }

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("8a3c4b262d721acd49a4bf97d5213199c86fa2b9");
        hashSet.add("a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc");
        hashSet.add("5e8f16062ea3cd2c4a0d547876baa6f38cabf625");
        A00 = hashSet;
    }

    public static final boolean A00(Context context, String str) {
        String str2 = Build.BRAND;
        int i = context.getApplicationInfo().flags;
        if (!str2.startsWith("generic") || (i & 2) == 0) {
            try {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo(str, 64).signatures;
                int length = signatureArr.length;
                int i2 = 0;
                while (i2 < length) {
                    if (!A00.contains(C55062a0.A01(signatureArr[i2].toByteArray()))) {
                        i2++;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        }
        return true;
    }
}
