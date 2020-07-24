package p000X;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: X.03o  reason: invalid class name and case insensitive filesystem */
public final class C026903o implements FilenameFilter {
    public final boolean accept(File file, String str) {
        return str.endsWith("_anr");
    }
}
