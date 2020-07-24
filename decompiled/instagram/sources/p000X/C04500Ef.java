package p000X;

import java.lang.reflect.Array;
import java.util.Arrays;

/* renamed from: X.0Ef  reason: invalid class name and case insensitive filesystem */
public abstract class C04500Ef {
    public final int A00;
    public final C04490Ee A01 = new C04490Ee();
    public final int[] A02 = new int[4];
    public final short[] A03;
    public final short[] A04;
    public final short[] A05;
    public final short[] A06;
    public final short[] A07;
    public final short[][] A08;
    public final short[][] A09;
    public final short[][] A0A;
    public final short[][] A0B;

    public C04500Ef(int i) {
        Class<short> cls = short.class;
        this.A0A = (short[][]) Array.newInstance(cls, new int[]{12, 16});
        this.A04 = new short[12];
        this.A05 = new short[12];
        this.A06 = new short[12];
        this.A07 = new short[12];
        this.A0B = (short[][]) Array.newInstance(cls, new int[]{12, 16});
        this.A08 = (short[][]) Array.newInstance(cls, new int[]{4, 64});
        this.A09 = new short[][]{new short[2], new short[2], new short[4], new short[4], new short[8], new short[8], new short[16], new short[16], new short[32], new short[32]};
        this.A03 = new short[16];
        this.A00 = (1 << i) - 1;
    }

    public void A00() {
        int[] iArr = this.A02;
        int i = 0;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        this.A01.A00 = 0;
        int i2 = 0;
        while (true) {
            short[][] sArr = this.A0A;
            if (i2 >= sArr.length) {
                break;
            }
            Arrays.fill(sArr[i2], 1024);
            i2++;
        }
        Arrays.fill(this.A04, 1024);
        Arrays.fill(this.A05, 1024);
        Arrays.fill(this.A06, 1024);
        Arrays.fill(this.A07, 1024);
        int i3 = 0;
        while (true) {
            short[][] sArr2 = this.A0B;
            if (i3 >= sArr2.length) {
                break;
            }
            Arrays.fill(sArr2[i3], 1024);
            i3++;
        }
        int i4 = 0;
        while (true) {
            short[][] sArr3 = this.A08;
            if (i4 >= sArr3.length) {
                break;
            }
            Arrays.fill(sArr3[i4], 1024);
            i4++;
        }
        while (true) {
            short[][] sArr4 = this.A09;
            if (i < sArr4.length) {
                Arrays.fill(sArr4[i], 1024);
                i++;
            } else {
                Arrays.fill(this.A03, 1024);
                return;
            }
        }
    }
}
