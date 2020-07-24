package p000X;

import java.lang.reflect.Array;
import java.util.Arrays;

/* renamed from: X.0Ek  reason: invalid class name and case insensitive filesystem */
public abstract class C04550Ek {
    public final short[] A00 = new short[2];
    public final short[] A01;
    public final short[][] A02;
    public final short[][] A03;
    public final /* synthetic */ C04500Ef A04;

    public C04550Ek(C04500Ef r5) {
        Class<short> cls = short.class;
        this.A04 = r5;
        this.A02 = (short[][]) Array.newInstance(cls, new int[]{16, 8});
        this.A03 = (short[][]) Array.newInstance(cls, new int[]{16, 8});
        this.A01 = new short[256];
    }

    public final void A00() {
        Arrays.fill(this.A00, 1024);
        int i = 0;
        while (true) {
            short[][] sArr = this.A02;
            if (i >= sArr.length) {
                break;
            }
            Arrays.fill(sArr[i], 1024);
            i++;
        }
        for (int i2 = 0; i2 < this.A02.length; i2++) {
            Arrays.fill(this.A03[i2], 1024);
        }
        Arrays.fill(this.A01, 1024);
    }
}
