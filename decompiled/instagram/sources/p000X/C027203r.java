package p000X;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: X.03r  reason: invalid class name and case insensitive filesystem */
public final class C027203r implements FilenameFilter {
    public final boolean accept(File file, String str) {
        return str.endsWith("_lib");
    }
}
