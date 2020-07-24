package p000X;

import android.util.Base64;
import java.io.File;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.BHY */
public final class BHY {
    public static String A00(String str, String str2) {
        int length;
        if (str == null || str2 == null || str.isEmpty() || str2.isEmpty()) {
            throw new IllegalArgumentException("Invalid Input");
        }
        int length2 = str2.length();
        StringBuilder sb = new StringBuilder("Blowfish");
        char c = File.separatorChar;
        sb.append(c);
        sb.append("CBC");
        sb.append(c);
        sb.append("PKCS5Padding");
        Cipher instance = Cipher.getInstance(sb.toString());
        SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), "Blowfish");
        int i = length2 >> 1;
        byte[] bytes = str2.substring(0, i).getBytes();
        byte[] bytes2 = str2.substring(i, length2).getBytes();
        if (bytes == null || bytes2 == null || (length = bytes.length) != bytes2.length) {
            throw new NullPointerException("Invalid IV");
        }
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i2] = (byte) (bytes[i2] ^ bytes2[i2]);
        }
        instance.init(1, secretKeySpec, new IvParameterSpec(bArr));
        return Base64.encodeToString(instance.doFinal(str.getBytes()), 0);
    }
}
