package p000X;

import com.facebook.common.patch.core.BsdiffNativeLibrary;
import com.facebook.common.patch.core.PatchException;
import java.io.File;
import java.io.IOException;

/* renamed from: X.0lP  reason: invalid class name and case insensitive filesystem */
public final class C14730lP {
    public final C14740lQ A00 = new C14740lQ(new BsdiffNativeLibrary());

    public final void A00(File file, File file2, File file3) {
        this.A00.A00.A00();
        try {
            BsdiffNativeLibrary.patch(file.getAbsolutePath(), file3.getAbsolutePath(), file2.getAbsolutePath());
        } catch (IOException e) {
            throw new PatchException(e);
        }
    }
}
