package p000X;

import android.content.Context;
import java.io.File;

/* renamed from: X.0lI  reason: invalid class name and case insensitive filesystem */
public final class C14660lI {
    public final int A00;
    public final File A01;
    public final File A02;

    public final File A01(String str) {
        if (!this.A02.exists()) {
            synchronized (this.A02) {
                C14950m5.A01(this.A02);
            }
        }
        return File.createTempFile(str, "", this.A02);
    }

    public C14660lI(Context context) {
        C14580l9 r0;
        this.A01 = context.getDir("overtheair", 0);
        this.A02 = new File(context.getCacheDir(), "tmp_resources");
        synchronized (C14580l9.class) {
            if (C14580l9.A03 == null) {
                C14580l9.A03 = new C14580l9(context);
            }
            r0 = C14580l9.A03;
        }
        this.A00 = r0.A02();
    }

    public static File A00(C14660lI r4, int i) {
        String num = Integer.toString(i);
        StringBuilder sb = new StringBuilder("resources");
        String str = File.separator;
        sb.append(str);
        sb.append(r4.A00);
        sb.append(str);
        sb.append(num);
        File file = new File(r4.A01, sb.toString());
        C14950m5.A01(file);
        return file;
    }
}
