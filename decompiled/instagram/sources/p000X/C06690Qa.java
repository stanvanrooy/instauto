package p000X;

import java.io.File;

/* renamed from: X.0Qa  reason: invalid class name and case insensitive filesystem */
public final class C06690Qa implements AnonymousClass0VC {
    public final File BYC(File file) {
        File replaceFileExtension = AnonymousClass0VL.replaceFileExtension(file, ".pending", ".batch");
        if (file.renameTo(replaceFileExtension)) {
            return replaceFileExtension;
        }
        AnonymousClass0DB.A0D("FileBasedSessionHandler_Rename", "Failed to rename to .batch file");
        return null;
    }
}
