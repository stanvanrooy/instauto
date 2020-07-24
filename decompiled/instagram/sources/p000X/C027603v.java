package p000X;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: X.03v  reason: invalid class name and case insensitive filesystem */
public final class C027603v implements FilenameFilter {
    public final FilenameFilter[] A00;

    public final boolean accept(File file, String str) {
        for (FilenameFilter accept : this.A00) {
            if (accept.accept(file, str)) {
                return false;
            }
        }
        return true;
    }

    public C027603v(FilenameFilter... filenameFilterArr) {
        this.A00 = filenameFilterArr;
    }
}
