package p000X;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* renamed from: X.0lC  reason: invalid class name and case insensitive filesystem */
public final class C14600lC {
    public static volatile String A00;
    public static volatile boolean A01;

    public static String A00() {
        String str;
        FileInputStream fileInputStream;
        if (!A01) {
            try {
                fileInputStream = new FileInputStream(new File("/proc/self/cmdline"));
                byte[] bArr = new byte[512];
                int read = fileInputStream.read(bArr);
                if (read != -1) {
                    str = new String(bArr, 0, read).trim();
                    fileInputStream.close();
                    A00 = str;
                    A01 = true;
                } else {
                    throw new EOFException();
                }
            } catch (IOException unused) {
                str = null;
            } catch (Throwable th) {
                fileInputStream.close();
                throw th;
            }
        }
        return A00;
    }
}
