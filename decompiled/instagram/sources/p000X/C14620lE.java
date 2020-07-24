package p000X;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0lE  reason: invalid class name and case insensitive filesystem */
public final class C14620lE {
    public static final Map A02 = new HashMap();
    public final File A00;
    public final Object A01 = new Object();

    public final String A00() {
        String str;
        FileInputStream fileInputStream;
        Base64OutputStream base64OutputStream;
        try {
            fileInputStream = new FileInputStream(this.A00);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((int) this.A00.length());
            base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 0);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read != -1) {
                    base64OutputStream.write(bArr, 0, read);
                } else {
                    base64OutputStream.close();
                    String byteArrayOutputStream2 = byteArrayOutputStream.toString("UTF-8");
                    fileInputStream.close();
                    base64OutputStream.close();
                    return byteArrayOutputStream2;
                }
            }
        } catch (IOException e) {
            if (e.getMessage() != null) {
                str = e.getMessage();
            } else {
                str = "description N/A";
            }
            return AnonymousClass000.A0J("[I/O error: ", str, "]");
        } catch (Throwable th) {
            fileInputStream.close();
            base64OutputStream.close();
            throw th;
        }
    }

    public C14620lE(File file) {
        this.A00 = file;
    }
}
