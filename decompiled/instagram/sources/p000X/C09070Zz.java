package p000X;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.Deflater;

/* renamed from: X.0Zz  reason: invalid class name and case insensitive filesystem */
public final class C09070Zz {
    public static byte[] A00(byte[] bArr) {
        Deflater deflater = new Deflater(9);
        deflater.setInput(bArr);
        deflater.finish();
        int length = bArr.length + 32;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        byte[] bArr2 = new byte[length];
        while (!deflater.finished()) {
            byteArrayOutputStream.write(bArr2, 0, deflater.deflate(bArr2));
        }
        try {
            byteArrayOutputStream.close();
        } catch (IOException e) {
            AnonymousClass0DB.A0O("ZlibCompressionUtil", e, "got io exception closing ByteArrayOutputStream");
        }
        deflater.end();
        return byteArrayOutputStream.toByteArray();
    }
}
