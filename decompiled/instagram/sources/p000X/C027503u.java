package p000X;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: X.03u  reason: invalid class name and case insensitive filesystem */
public final class C027503u implements FilenameFilter {
    public final boolean accept(File file, String str) {
        return str.endsWith("_wrotedump");
    }
}
