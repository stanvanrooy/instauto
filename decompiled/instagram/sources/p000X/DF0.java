package p000X;

/* renamed from: X.DF0 */
public final class DF0 {
    public static final int[][] A02 = {new int[]{21522, 0}, new int[]{20773, 1}, new int[]{24188, 2}, new int[]{23371, 3}, new int[]{17913, 4}, new int[]{16590, 5}, new int[]{20375, 6}, new int[]{19104, 7}, new int[]{30660, 8}, new int[]{29427, 9}, new int[]{32170, 10}, new int[]{30877, 11}, new int[]{26159, 12}, new int[]{25368, 13}, new int[]{27713, 14}, new int[]{26998, 15}, new int[]{5769, 16}, new int[]{5054, 17}, new int[]{7399, 18}, new int[]{6608, 19}, new int[]{1890, 20}, new int[]{597, 21}, new int[]{3340, 22}, new int[]{2107, 23}, new int[]{13663, 24}, new int[]{12392, 25}, new int[]{16177, 26}, new int[]{14854, 27}, new int[]{9396, 28}, new int[]{8579, 29}, new int[]{11994, 30}, new int[]{11245, 31}};
    public final byte A00;
    public final Integer A01;

    public static DF0 A00(int i, int i2) {
        int bitCount;
        int i3 = Integer.MAX_VALUE;
        int i4 = 0;
        for (int[] iArr : A02) {
            int i5 = iArr[0];
            if (i5 == i || i5 == i2) {
                return new DF0(iArr[1]);
            }
            int bitCount2 = Integer.bitCount(i ^ i5);
            if (bitCount2 < i3) {
                i4 = iArr[1];
                i3 = bitCount2;
            }
            if (i != i2 && (bitCount = Integer.bitCount(i2 ^ i5)) < i3) {
                i4 = iArr[1];
                i3 = bitCount;
            }
        }
        if (i3 <= 3) {
            return new DF0(i4);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DF0)) {
            return false;
        }
        DF0 df0 = (DF0) obj;
        if (this.A01 == df0.A01 && this.A00 == df0.A00) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.A01.intValue() << 3) | this.A00;
    }

    public DF0(int i) {
        int i2 = (i >> 3) & 3;
        if (i2 >= 0) {
            Integer[] numArr = DF4.A00;
            if (i2 < numArr.length) {
                this.A01 = numArr[i2];
                this.A00 = (byte) (i & 7);
                return;
            }
        }
        throw new IllegalArgumentException();
    }
}
