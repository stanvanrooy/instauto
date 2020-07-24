package p000X;

import java.io.File;

/* renamed from: X.BEL */
public final class BEL {
    public static String A00(File file) {
        if (file.getName().endsWith(".apk")) {
            return file.getName().replaceFirst("(_\\d+)?\\.apk", "").replace("base-", "config.").replace("-", ".config.").replace(".config.master", "").replace("config.master", "");
        }
        throw new IllegalArgumentException("Non-apk found in splits directory.");
    }
}
