package p000X;

import java.io.File;
import java.io.FileFilter;

/* renamed from: X.00r  reason: invalid class name and case insensitive filesystem */
public final class C020300r implements FileFilter {
    public final /* synthetic */ String A00;

    public C020300r(String str) {
        this.A00 = str;
    }

    public final boolean accept(File file) {
        String name = file.getName();
        if (name.startsWith(this.A00) || name.equals("MultiDex.lock")) {
            return false;
        }
        return true;
    }
}
