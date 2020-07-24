package p000X;

import java.io.File;
import java.io.FileFilter;

/* renamed from: X.0gY  reason: invalid class name and case insensitive filesystem */
public final class C12320gY implements FileFilter {
    public final boolean accept(File file) {
        String name = file.getName();
        if (name.startsWith("cpu")) {
            int i = 3;
            while (i < name.length()) {
                if (Character.isDigit(name.charAt(i))) {
                    i++;
                }
            }
            return true;
        }
        return false;
    }
}
