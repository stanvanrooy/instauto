package p000X;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* renamed from: X.0lS  reason: invalid class name and case insensitive filesystem */
public final class C14750lS {
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        r0 = p000X.C140395zN.A00;
     */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ab A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    public final boolean A00(File file, C209268zo r15) {
        boolean z;
        boolean z2;
        byte[] bArr;
        byte b;
        byte b2;
        String str = r15.A00;
        if (str != null) {
            int length = str.length();
            if ((length & 1) == 0) {
                byte[] bArr2 = new byte[(length >> 1)];
                int i = 0;
                int i2 = 0;
                while (true) {
                    z = true;
                    if (i >= length) {
                        z = false;
                        break;
                    }
                    int i3 = i + 1;
                    char charAt = str.charAt(i);
                    if (charAt > 'f' || (b = bArr[charAt]) == -1) {
                        break;
                    }
                    i = i3 + 1;
                    char charAt2 = str.charAt(i3);
                    if (charAt2 > 'f' || (b2 = bArr[charAt2]) == -1) {
                        break;
                    }
                    bArr2[i2] = (byte) ((b << 4) | b2);
                    i2++;
                }
                if (!z) {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(file);
                        try {
                            MessageDigest instance = MessageDigest.getInstance("MD5");
                            byte[] bArr3 = new byte[8192];
                            while (true) {
                                int read = fileInputStream.read(bArr3);
                                if (read <= 0) {
                                    break;
                                }
                                instance.update(bArr3, 0, read);
                            }
                            z2 = Arrays.equals(instance.digest(), bArr2);
                            C14950m5.A00(fileInputStream);
                        } catch (IOException e) {
                            AnonymousClass0DB.A0Q("Releng.FileIOUtils", e, "Unable to read update file %s", file.getName());
                            C14950m5.A00(fileInputStream);
                            z2 = false;
                            if (z2) {
                            }
                        } catch (NoSuchAlgorithmException e2) {
                            AnonymousClass0DB.A0N("Releng.FileIOUtils", e2, "Unable to generate MD5 hash");
                            C14950m5.A00(fileInputStream);
                            z2 = false;
                            if (z2) {
                            }
                        } catch (Throwable th) {
                            C14950m5.A00(fileInputStream);
                            throw th;
                        }
                    } catch (FileNotFoundException e3) {
                        AnonymousClass0DB.A0Q("Releng.FileIOUtils", e3, "Unable to find update file %s", file.getName());
                        z2 = false;
                    }
                    if (z2) {
                        return true;
                    }
                    return false;
                }
                throw new IllegalArgumentException(AnonymousClass000.A0E("Invalid hexadecimal digit: ", str));
            }
            throw new IllegalArgumentException("Odd number of characters.");
        }
        return true;
    }
}
