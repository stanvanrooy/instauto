package p000X;

import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.B7M */
public final class B7M {
    public static String A00(B7N b7n) {
        byte[] bytes = b7n.AZb().getBytes("UTF-8");
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            instance.update(bytes, 0, bytes.length);
            return Base64.encodeToString(instance.digest(), 11);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
