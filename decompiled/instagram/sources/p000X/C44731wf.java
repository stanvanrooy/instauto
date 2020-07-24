package p000X;

import java.io.File;

/* renamed from: X.1wf  reason: invalid class name and case insensitive filesystem */
public final class C44731wf {
    public static void A00(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File A02 : listFiles) {
                A02(A02);
            }
        }
    }

    public static void A01(File file, C29336Cw5 cw5) {
        cw5.BXd(file);
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    A01(file2, cw5);
                } else {
                    cw5.Bty(file2);
                }
            }
        }
        cw5.BXZ(file);
    }

    public static boolean A02(File file) {
        if (file.isDirectory()) {
            A00(file);
        }
        return file.delete();
    }
}
