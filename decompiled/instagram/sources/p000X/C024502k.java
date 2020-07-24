package p000X;

import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: X.02k  reason: invalid class name and case insensitive filesystem */
public final class C024502k {
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        r0 = move-exception;
     */
    public static String A00(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(bArr, 0, bArr.length);
        gZIPOutputStream.finish();
        String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        gZIPOutputStream.close();
        return encodeToString;
    }
}
