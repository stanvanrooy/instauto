package p000X;

import android.content.Context;
import java.io.File;
import java.io.IOException;

/* renamed from: X.0Za  reason: invalid class name and case insensitive filesystem */
public final class C08860Za {
    public final File A00;

    public C08860Za(String str) {
        this.A00 = new File(str, "modules");
    }

    public final File A02(String str, String str2) {
        File file = this.A00;
        if (str2 == null) {
            str2 = "0";
        }
        return new File(file, AnonymousClass000.A0J(str, "_", str2));
    }

    public static void A00(File file) {
        File[] listFiles;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File A002 : listFiles) {
                A00(A002);
            }
        }
        file.delete();
    }

    public static boolean A01(Context context) {
        boolean z = false;
        if (context.getPackageName().contains("instagram")) {
            z = true;
        }
        if (!z) {
            return false;
        }
        return true;
    }

    public final void A03(String str, String str2) {
        File A02 = A02(str, str2);
        if (!A02.exists() && !A02.mkdirs() && !A02.isDirectory()) {
            throw new IOException(AnonymousClass000.A0E("Error creating directory: '", A02.getCanonicalPath()));
        }
    }
}
