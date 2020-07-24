package p000X;

import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: X.DD3 */
public final class DD3 {
    public static int A00(ByteBuffer byteBuffer, int i, int i2) {
        short s;
        int i3 = i - byteBuffer.getInt(i);
        int i4 = (i2 << 1) + 4;
        if (i4 >= byteBuffer.getShort(i3) || (s = byteBuffer.getShort(i3 + i4)) == 0) {
            return 0;
        }
        return s + i;
    }

    public static C29869DEe A01(ByteBuffer byteBuffer, int i, int i2, Class cls) {
        int i3;
        int A00 = A00(byteBuffer, i, i2);
        if (A00 != 0) {
            i3 = A00 + byteBuffer.getInt(A00);
        } else {
            i3 = 0;
        }
        if (i3 == 0) {
            return null;
        }
        C29869DEe dEe = (C29869DEe) cls.newInstance();
        dEe.ABR(byteBuffer, i3);
        return dEe;
    }

    public static C29869DEe A02(ByteBuffer byteBuffer, int i, int i2, Class cls) {
        int A00 = A00(byteBuffer, i, i2);
        if (A00 == 0) {
            return null;
        }
        C29869DEe dEe = (C29869DEe) cls.newInstance();
        dEe.ABR(byteBuffer, A00);
        return dEe;
    }

    public static String A03(ByteBuffer byteBuffer, int i) {
        if (byteBuffer.hasArray()) {
            return new String(byteBuffer.array(), i + 4, byteBuffer.getInt(i), Charset.forName("UTF-8"));
        }
        int i2 = byteBuffer.getInt(i);
        byte[] bArr = new byte[i2];
        int position = byteBuffer.position();
        byteBuffer.position(i + 4);
        byteBuffer.get(bArr);
        byteBuffer.position(position);
        return new String(bArr, 0, i2, Charset.forName("UTF-8"));
    }

    public static String A04(ByteBuffer byteBuffer, int i, int i2) {
        int i3;
        int A00 = A00(byteBuffer, i, i2);
        if (A00 != 0) {
            i3 = A00 + byteBuffer.getInt(A00);
        } else {
            i3 = 0;
        }
        if (i3 != 0) {
            return A03(byteBuffer, i3);
        }
        return null;
    }

    public static byte[] A05(ByteBuffer byteBuffer, int i, int i2) {
        int A00 = A00(byteBuffer, i, i2);
        if (A00 == 0) {
            return null;
        }
        byte[] bArr = new byte[byteBuffer.getInt(byteBuffer.getInt(A00) + A00)];
        ByteBuffer slice = byteBuffer.slice();
        slice.position(A00 + byteBuffer.getInt(A00) + 4);
        slice.get(bArr);
        return bArr;
    }

    public static float[] A06(ByteBuffer byteBuffer, int i, int i2) {
        int A00 = A00(byteBuffer, i, i2);
        if (A00 == 0) {
            return null;
        }
        int i3 = byteBuffer.getInt(byteBuffer.getInt(A00) + A00);
        int i4 = A00 + byteBuffer.getInt(A00) + 4;
        float[] fArr = new float[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            fArr[i5] = byteBuffer.getFloat((i5 << 2) + i4);
        }
        return fArr;
    }

    public static C29869DEe[] A07(ByteBuffer byteBuffer, int i, int i2, int i3, Class cls) {
        int A00 = A00(byteBuffer, i, i2);
        if (A00 == 0) {
            return null;
        }
        int i4 = byteBuffer.getInt(byteBuffer.getInt(A00) + A00);
        int i5 = A00 + byteBuffer.getInt(A00) + 4;
        C29869DEe[] dEeArr = (C29869DEe[]) Array.newInstance(cls, i4);
        for (int i6 = 0; i6 < i4; i6++) {
            C29869DEe dEe = (C29869DEe) cls.newInstance();
            dEe.ABR(byteBuffer, (i6 * i3) + i5);
            dEeArr[i6] = dEe;
        }
        return dEeArr;
    }

    public static C29869DEe[] A08(ByteBuffer byteBuffer, int i, int i2, Class cls) {
        int A00 = A00(byteBuffer, i, i2);
        if (A00 == 0) {
            return null;
        }
        int i3 = byteBuffer.getInt(byteBuffer.getInt(A00) + A00);
        int i4 = A00 + byteBuffer.getInt(A00) + 4;
        C29869DEe[] dEeArr = (C29869DEe[]) Array.newInstance(cls, i3);
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = (i5 << 2) + i4;
            int i7 = byteBuffer.getInt(i6);
            if (i7 != 0) {
                int i8 = i6 + i7;
                C29869DEe dEe = (C29869DEe) cls.newInstance();
                dEe.ABR(byteBuffer, i8);
                dEeArr[i5] = dEe;
            }
        }
        return dEeArr;
    }
}
