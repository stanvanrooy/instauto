package p000X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.DD1 */
public final class DD1 {
    public final C29876DEl A00 = new C29876DEl();
    public final C29875DEk A01 = new C29875DEk();

    public final C29835DCw A00(ByteBuffer byteBuffer) {
        boolean z;
        boolean z2;
        if ("KEYF".length() == 4) {
            int i = 0;
            while (true) {
                if (i < 4) {
                    if ("KEYF".charAt(i) != ((char) byteBuffer.get(byteBuffer.position() + 4 + i))) {
                        break;
                    }
                    i++;
                } else {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (z) {
            DDT ddt = new DDT();
            try {
                DD8 dd8 = new DD8();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                int position = byteBuffer.position();
                dd8.ABR(byteBuffer, byteBuffer.getInt(position) + position);
                dd8.A00(ddt);
                List list = ddt.A02;
                if (list != null) {
                    DDK[] ddkArr = new DDK[list.size()];
                    ddt.A04 = ddkArr;
                    ddt.A04 = (DDK[]) ddt.A02.toArray(ddkArr);
                    ddt.A02 = null;
                    ddt.A00 = 0;
                }
                List list2 = ddt.A01;
                if (list2 != null) {
                    if (ddt.A01 == null) {
                        ddt.A01 = new C29866DEb();
                    }
                    ddt.A01.A00 = list2;
                    ddt.A01 = null;
                }
                List list3 = ddt.A00;
                if (list3 != null) {
                    if (ddt.A01 == null) {
                        ddt.A01 = new C29866DEb();
                    }
                    ddt.A01.A01 = (C29865DEa[]) ddt.A00.toArray(new C29865DEa[list3.size()]);
                    ddt.A00 = null;
                }
                if (ddt.A03 == null) {
                    ddt.A03 = new byte[]{0};
                }
                ddt.A02 = new HashMap();
                for (DDK ddk : ddt.A04) {
                    ddk.A02.A00(ddt.A02);
                }
                return ddt;
            } catch (Exception e) {
                throw new C29052Cr5(e);
            }
        } else {
            if ("KYF3".length() == 4) {
                int i2 = 0;
                while (true) {
                    if (i2 < 4) {
                        if ("KYF3".charAt(i2) != ((char) byteBuffer.get(byteBuffer.position() + 4 + i2))) {
                            break;
                        }
                        i2++;
                    } else {
                        z2 = true;
                        break;
                    }
                }
            }
            z2 = false;
            if (z2) {
                DD2 dd2 = new DD2();
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                int position2 = byteBuffer.position();
                dd2.ABR(byteBuffer, byteBuffer.getInt(position2) + position2);
                return dd2;
            }
            throw new C29052Cr5();
        }
    }
}
