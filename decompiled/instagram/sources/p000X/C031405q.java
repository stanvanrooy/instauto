package p000X;

import android.content.Context;
import java.io.File;
import java.io.RandomAccessFile;

/* renamed from: X.05q  reason: invalid class name and case insensitive filesystem */
public class C031405q extends C038208p {
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x002d */
    public final void A01(boolean z) {
        if (!z) {
            File file = this.A00;
            AnonymousClass0FY.A00(file);
            AnonymousClass0ZJ.A01(2147483648L, "AppUnpacker.fsync", -283075799);
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                randomAccessFile.getFD().sync();
                randomAccessFile.close();
                AnonymousClass0ZJ.A00(2147483648L, -1677413782);
            } catch (Throwable th) {
                AnonymousClass0ZJ.A00(2147483648L, -1948416264);
                throw th;
            }
        }
    }

    public final boolean A02(Context context, byte[] bArr) {
        File file = this.A00;
        AnonymousClass0FY.A00(file);
        return !file.exists();
    }

    public C031405q(String str, String str2) {
        super(str, str2);
    }
}
