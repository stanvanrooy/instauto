package p000X;

import java.io.File;
import java.io.InputStream;

/* renamed from: X.0zK  reason: invalid class name and case insensitive filesystem */
public final class C22970zK implements C15830nb {
    public final File A00;

    public final InputStream BuM(InputStream inputStream) {
        File file = this.A00;
        if (file == null) {
            return inputStream;
        }
        return new C57782el(inputStream, file);
    }

    public C22970zK(File file) {
        this.A00 = file;
    }
}
