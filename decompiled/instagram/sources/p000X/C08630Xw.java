package p000X;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* renamed from: X.0Xw  reason: invalid class name and case insensitive filesystem */
public final class C08630Xw {
    public static long A01(FileChannel fileChannel, ByteBuffer byteBuffer, long j) {
        A02(fileChannel, byteBuffer, 4, j);
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }

    public static void A02(FileChannel fileChannel, ByteBuffer byteBuffer, int i, long j) {
        int read;
        byteBuffer.position(0);
        byteBuffer.limit(i);
        while (byteBuffer.remaining() > 0 && (read = fileChannel.read(byteBuffer, j)) != -1) {
            j += (long) read;
        }
        if (byteBuffer.remaining() <= 0) {
            byteBuffer.position(0);
            return;
        }
        throw new C08610Xu("ELF file truncated");
    }

    public static long A00(FileChannel fileChannel, ByteBuffer byteBuffer, long j) {
        A02(fileChannel, byteBuffer, 8, j);
        return byteBuffer.getLong();
    }
}
