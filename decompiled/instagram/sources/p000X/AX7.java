package p000X;

import java.io.File;

/* renamed from: X.AX7 */
public final class AX7 {
    public static void A00(File file) {
        if (file.exists()) {
            if (file.isDirectory()) {
                return;
            }
            if (!file.delete()) {
                throw new AX6(file.getAbsolutePath(), new AX8(file.getAbsolutePath()));
            }
        }
        if (!file.mkdirs() && !file.isDirectory()) {
            throw new AX6(file.getAbsolutePath());
        }
    }
}
