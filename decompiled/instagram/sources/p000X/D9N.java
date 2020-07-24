package p000X;

import android.util.Log;
import java.nio.ByteBuffer;
import java.util.UUID;

/* renamed from: X.D9N */
public final class D9N {
    public static byte[] A01(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int i;
        int length;
        if (bArr != null) {
            i = bArr.length;
        } else {
            i = 0;
        }
        int i2 = i + 32;
        if (uuidArr != null) {
            i2 += (uuidArr.length << 4) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i2);
        allocate.putInt(i2);
        allocate.putInt(1886614376);
        int i3 = 0;
        if (uuidArr != null) {
            i3 = 16777216;
        }
        allocate.putInt(i3);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(r3);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (!(bArr == null || (length = bArr.length) == 0)) {
            allocate.putInt(length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    public static UUID A00(byte[] bArr) {
        D9O d9o = new D9O(bArr);
        DA8 da8 = null;
        if (d9o.A00 >= 32) {
            d9o.A0C(0);
            if (d9o.A00() == (d9o.A00 - d9o.A01) + 4 && d9o.A00() == 1886614376) {
                int A00 = (d9o.A00() >> 24) & 255;
                if (A00 > 1) {
                    Log.w("PsshAtomUtil", AnonymousClass000.A05("Unsupported pssh version: ", A00));
                } else {
                    UUID uuid = new UUID(d9o.A04(), d9o.A04());
                    if (A00 == 1) {
                        d9o.A0D(d9o.A02() << 4);
                    }
                    int A02 = d9o.A02();
                    if (A02 == d9o.A00 - d9o.A01) {
                        byte[] bArr2 = new byte[A02];
                        d9o.A0F(bArr2, 0, A02);
                        da8 = new DA8(uuid, bArr2);
                    }
                }
            }
        }
        if (da8 == null) {
            return null;
        }
        return da8.A00;
    }
}
