package p000X;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: X.0lB  reason: invalid class name and case insensitive filesystem */
public final class C14590lB {
    public final File A00;
    public final Map A01 = new HashMap();
    public final Executor A02;

    public final synchronized C14610lD A00(String str) {
        C14610lD r1;
        r1 = (C14610lD) this.A01.get(str);
        if (r1 == null) {
            File file = new File(this.A00, str);
            File parentFile = file.getParentFile();
            AnonymousClass0FY.A01(parentFile, "expecting a file which is always under some dir");
            if (parentFile.exists() && !parentFile.isDirectory()) {
                AnonymousClass0DB.A0K("LightSharedPreferencesFactory", "cannot create directory %s, a file already exists with that name", parentFile.getAbsolutePath());
            }
            if (!parentFile.exists()) {
                parentFile.mkdirs();
            }
            r1 = new C14610lD(file, this.A02);
            this.A01.put(str, r1);
        }
        return r1;
    }

    public C14590lB(Executor executor, File file) {
        this.A02 = executor;
        this.A00 = file;
    }
}
