package p000X;

import java.io.File;
import java.util.zip.ZipEntry;

/* renamed from: X.05f  reason: invalid class name and case insensitive filesystem */
public final class C030605f extends C09830c8 {
    public File A00;
    public final int A01;
    public final /* synthetic */ AnonymousClass004 A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C030605f(AnonymousClass004 r3, AnonymousClass00G r4) {
        super(r3, r4);
        this.A02 = r3;
        this.A00 = new File(r3.A03.getApplicationInfo().nativeLibraryDir);
        this.A01 = r3.A00;
    }

    public final boolean A02(ZipEntry zipEntry, String str) {
        Object[] objArr;
        String str2;
        String name = zipEntry.getName();
        AnonymousClass004 r1 = this.A02;
        if (str.equals(r1.A00)) {
            r1.A00 = null;
            objArr = new Object[]{str};
            str2 = "allowing consideration of corrupted lib %s";
        } else {
            if ((this.A01 & 1) != 0) {
                File file = new File(this.A00, str);
                if (!file.isFile()) {
                    objArr = new Object[]{name, str};
                    str2 = "allowing considering of %s: %s not in system lib dir";
                } else {
                    long length = file.length();
                    long size = zipEntry.getSize();
                    if (length == size) {
                        return false;
                    }
                    String.format("allowing consideration of %s: sysdir file length is %s, but the file is %s bytes long in the APK", new Object[]{file, Long.valueOf(length), Long.valueOf(size)});
                    return true;
                }
            }
            return true;
        }
        String.format(str2, objArr);
        return true;
    }
}
