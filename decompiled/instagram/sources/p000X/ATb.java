package p000X;

import android.os.Environment;
import android.os.ParcelFileDescriptor;
import com.facebook.secure.fileprovider.common.FileStatHelper;
import java.io.File;
import java.io.FileNotFoundException;

/* renamed from: X.ATb */
public final class ATb {
    public static boolean A01(ParcelFileDescriptor parcelFileDescriptor) {
        ParcelFileDescriptor open;
        if (parcelFileDescriptor == null) {
            return false;
        }
        boolean z = false;
        if (FileStatHelper.statOpenFile(parcelFileDescriptor.getFd()).device == A00()) {
            z = true;
        }
        if (!z) {
            try {
                String canonicalPath = new File("/proc/self/fd", String.format("%d", new Object[]{Integer.valueOf(parcelFileDescriptor.getFd())})).getCanonicalPath();
                z = false;
                if (canonicalPath != null) {
                    open = ParcelFileDescriptor.open(new File(canonicalPath), 268435456);
                    if (FileStatHelper.statOpenFile(open.getFd()).device == A00()) {
                        z = true;
                    }
                    open.close();
                    return z;
                }
            } catch (FileNotFoundException unused) {
                return false;
            } catch (Throwable th) {
                open.close();
                throw th;
            }
        }
        return z;
    }

    public static long A00() {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return -1;
        }
        ParcelFileDescriptor open = ParcelFileDescriptor.open(externalStorageDirectory, 268435456);
        try {
            return FileStatHelper.statOpenFile(open.getFd()).device;
        } finally {
            open.close();
        }
    }
}
