package p000X;

import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: X.DD7 */
public final class DD7 {
    public static int A00(ByteBuffer byteBuffer, int i, int i2) {
        short s;
        int i3 = i - byteBuffer.getInt(i);
        int i4 = (i2 << 1) + 4;
        if (i4 >= byteBuffer.getShort(i3) || (s = byteBuffer.getShort(i3 + i4)) == 0) {
            return 0;
        }
        return s + i;
    }

    public static C29868DEd A01(ByteBuffer byteBuffer, int i, int i2, Class cls) {
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
        C29868DEd dEd = (C29868DEd) cls.newInstance();
        dEd.ABR(byteBuffer, i3);
        return dEd;
    }

    public static String A02(ByteBuffer byteBuffer, int i) {
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

    public static byte[] A03(ByteBuffer byteBuffer, int i, int i2) {
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

    public static float[] A04(ByteBuffer byteBuffer, int i, int i2) {
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

    public static C29868DEd[] A05(ByteBuffer byteBuffer, int i, int i2, Class cls) {
        int A00 = A00(byteBuffer, i, i2);
        if (A00 == 0) {
            return null;
        }
        int i3 = byteBuffer.getInt(byteBuffer.getInt(A00) + A00);
        int i4 = A00 + byteBuffer.getInt(A00) + 4;
        C29868DEd[] dEdArr = (C29868DEd[]) Array.newInstance(cls, i3);
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = (i5 << 2) + i4;
            int i7 = byteBuffer.getInt(i6);
            if (i7 != 0) {
                int i8 = i6 + i7;
                C29868DEd dEd = (C29868DEd) cls.newInstance();
                dEd.ABR(byteBuffer, i8);
                dEdArr[i5] = dEd;
            }
        }
        return dEdArr;
    }

    public static String[] A06(ByteBuffer byteBuffer, int i, int i2) {
        int A00 = A00(byteBuffer, i, i2);
        if (A00 == 0) {
            return null;
        }
        int i3 = byteBuffer.getInt(byteBuffer.getInt(A00) + A00);
        int i4 = A00 + byteBuffer.getInt(A00) + 4;
        String[] strArr = new String[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = (i5 << 2) + i4;
            int i7 = byteBuffer.getInt(i6);
            if (i7 != 0) {
                strArr[i5] = A02(byteBuffer, i6 + i7);
            }
        }
        return strArr;
    }
}
