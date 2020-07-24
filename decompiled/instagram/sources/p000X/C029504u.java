package p000X;

import java.io.File;
import java.io.FileFilter;

/* renamed from: X.04u  reason: invalid class name and case insensitive filesystem */
public final class C029504u implements FileFilter {
    public final boolean accept(File file) {
        if (!file.isFile()) {
            return false;
        }
        String name = file.getName();
        if (!name.startsWith("batch-") || !name.endsWith(".json")) {
            return false;
        }
        return true;
    }
}
