package p000X;

import android.os.Build;
import android.util.Log;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

/* renamed from: X.04d  reason: invalid class name and case insensitive filesystem */
public final class C028104d {
    public static final int[] A03 = {288, 4384, 8224};
    public final long A00;
    public final long A01;
    public final long A02;

    /* JADX WARNING: Removed duplicated region for block: B:26:0x005d A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x009a  */
    public C028104d() {
        int i;
        int i2;
        int i3;
        int i4;
        C04030Ca r16;
        String str;
        int i5;
        if (Build.VERSION.SDK_INT < 21 || C028004c.A00()) {
            byte[] bArr = null;
            try {
                FileInputStream fileInputStream = new FileInputStream("/proc/zoneinfo");
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr2 = new byte[4096];
                i5 = 0;
                while (true) {
                    try {
                        i5 = fileInputStream.read(bArr2);
                        if (i5 == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr2, 0, i5);
                    } catch (IOException e) {
                        e = e;
                        Log.e("MemProcWatermarkReader", "/proc/zoneinfo", e);
                        i = i5;
                        long j = 0;
                        long j2 = 0;
                        long j3 = 0;
                        i2 = 1;
                        i3 = 0;
                        while (bArr != null) {
                        }
                        this.A02 = j * OdexSchemeArtXdex.STATE_PGO_NEEDED;
                        this.A01 = j2 * OdexSchemeArtXdex.STATE_PGO_NEEDED;
                        this.A00 = OdexSchemeArtXdex.STATE_PGO_NEEDED * j3;
                    }
                }
                bArr = byteArrayOutputStream.toByteArray();
                int length = bArr.length;
                fileInputStream.close();
                i = 0;
                if (length > 0) {
                    while (true) {
                        if (i < length) {
                            if (bArr[i] == 0) {
                                break;
                            }
                            i++;
                        } else {
                            break;
                        }
                    }
                }
                i = length;
            } catch (IOException e2) {
                e = e2;
                i5 = 0;
                Log.e("MemProcWatermarkReader", "/proc/zoneinfo", e);
                i = i5;
                long j4 = 0;
                long j22 = 0;
                long j32 = 0;
                i2 = 1;
                i3 = 0;
                while (bArr != null) {
                    i4 = i3;
                    while (i4 < i) {
                    }
                    i2 = i4 + 1;
                    int[] iArr = A03;
                    int length2 = iArr.length;
                    String[] strArr = new String[length2];
                    long[] jArr = new long[length2];
                    r16 = AnonymousClass0Cb.A00;
                    if (r16 != null) {
                    }
                    str = strArr[0];
                    long j5 = jArr[1];
                    if (!"min".equals(str)) {
                    }
                    i3 = i2;
                }
                this.A02 = j4 * OdexSchemeArtXdex.STATE_PGO_NEEDED;
                this.A01 = j22 * OdexSchemeArtXdex.STATE_PGO_NEEDED;
                this.A00 = OdexSchemeArtXdex.STATE_PGO_NEEDED * j32;
            }
            long j42 = 0;
            long j222 = 0;
            long j322 = 0;
            i2 = 1;
            i3 = 0;
            while (bArr != null && i2 < i) {
                i4 = i3;
                while (i4 < i) {
                    byte b = bArr[i4];
                    if (b == 10 || b == 0) {
                        break;
                    }
                    i4++;
                }
                i2 = i4 + 1;
                int[] iArr2 = A03;
                int length22 = iArr2.length;
                String[] strArr2 = new String[length22];
                long[] jArr2 = new long[length22];
                r16 = AnonymousClass0Cb.A00;
                if (r16 != null) {
                    r16.BWr(bArr, i3, i2, iArr2, strArr2, jArr2, (float[]) null);
                }
                str = strArr2[0];
                long j52 = jArr2[1];
                if (!"min".equals(str)) {
                    j42 += j52;
                } else if ("low".equals(str)) {
                    j222 += j52;
                } else if ("high".equals(str)) {
                    j322 += j52;
                }
                i3 = i2;
            }
            this.A02 = j42 * OdexSchemeArtXdex.STATE_PGO_NEEDED;
            this.A01 = j222 * OdexSchemeArtXdex.STATE_PGO_NEEDED;
            this.A00 = OdexSchemeArtXdex.STATE_PGO_NEEDED * j322;
        }
    }
}
