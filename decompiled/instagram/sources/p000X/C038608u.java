package p000X;

import java.io.EOFException;
import java.io.InputStream;
import java.util.zip.CRC32;

/* renamed from: X.08u  reason: invalid class name and case insensitive filesystem */
public final class C038608u extends C04760Fm {
    public static long A00(InputStream inputStream) {
        int read = inputStream.read();
        if (read != -1) {
            long j = (long) (read & 127);
            int i = 0;
            while ((read & 128) != 0) {
                i++;
                if (i < 9) {
                    read = inputStream.read();
                    if (read != -1) {
                        if (read != 0) {
                            j |= ((long) (read & 127)) << (i * 7);
                        }
                    }
                }
                throw new AnonymousClass09D();
            }
            return j;
        }
        throw new EOFException();
    }

    public static boolean A01(byte[] bArr, int i, int i2, int i3) {
        CRC32 crc32 = new CRC32();
        crc32.update(bArr, i, i2);
        long value = crc32.getValue();
        for (int i4 = 0; i4 < 4; i4++) {
            if (((byte) ((int) (value >>> (i4 << 3)))) != bArr[i3 + i4]) {
                return false;
            }
        }
        return true;
    }
}
