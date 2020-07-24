package p000X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Binder;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Set;

/* renamed from: X.B64 */
public final class B64 {
    public static boolean A00(Context context, Set set, Set set2) {
        PackageManager packageManager = context.getPackageManager();
        for (String str : context.getPackageManager().getPackagesForUid(Binder.getCallingUid())) {
            if (set.isEmpty() || set.contains(str)) {
                try {
                    Signature[] signatureArr = packageManager.getPackageInfo(str, 64).signatures;
                    if (signatureArr != null && signatureArr.length == 1) {
                        byte[] byteArray = signatureArr[0].toByteArray();
                        MessageDigest instance = MessageDigest.getInstance("SHA-1");
                        instance.update(byteArray, 0, byteArray.length);
                        if (!set2.contains(Base64.encodeToString(instance.digest(), 11))) {
                            continue;
                        } else if (set.isEmpty()) {
                            return true;
                        } else {
                            if (set.contains(str)) {
                                return true;
                            }
                        }
                    }
                } catch (NoSuchAlgorithmException e) {
                    throw new RuntimeException(e);
                } catch (PackageManager.NameNotFoundException unused) {
                    continue;
                }
            }
        }
        return false;
    }
}
