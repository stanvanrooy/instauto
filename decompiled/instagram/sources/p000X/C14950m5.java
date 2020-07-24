package p000X;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.0m5  reason: invalid class name and case insensitive filesystem */
public final class C14950m5 {
    public static void A00(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void A02(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        byte[] bArr = new byte[1024];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    return;
                }
            } finally {
                A00(fileOutputStream);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r5.listFiles().length == 0) goto L_0x0033;
     */
    public static synchronized void A03(File file, String str) {
        synchronized (C14950m5.class) {
            if (file.exists()) {
                if (file.isDirectory()) {
                    for (File A03 : file.listFiles()) {
                        A03(A03, str);
                    }
                } else if (str != null) {
                    if (file.getName().equals(str)) {
                    }
                }
                file.delete();
            }
        }
    }

    public static void A01(File file) {
        if ((!file.exists() && !file.mkdirs()) || !file.isDirectory()) {
            throw new IOException("Unable to create dir: " + file);
        }
    }

    public static void A04(File file, String str, int... iArr) {
        for (File file2 : file.listFiles()) {
            if (file2.isDirectory()) {
                try {
                    int parseInt = Integer.parseInt(file2.getName());
                    boolean z = true;
                    for (int i : iArr) {
                        if (parseInt == i) {
                            z = false;
                        }
                    }
                    if (z) {
                        A03(file2, str);
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
    }
}
