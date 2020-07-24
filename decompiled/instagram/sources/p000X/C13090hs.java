package p000X;

import com.facebook.common.dextricks.DexStore;
import java.util.ArrayList;

/* renamed from: X.0hs  reason: invalid class name and case insensitive filesystem */
public final class C13090hs {
    public static final char[] A0B = new char[0];
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public String A04;
    public ArrayList A05;
    public boolean A06 = false;
    public char[] A07;
    public char[] A08;
    public char[] A09;
    public final C13040hn A0A;

    public static void A00(C13090hs r2) {
        r2.A06 = false;
        r2.A05.clear();
        r2.A03 = 0;
        r2.A00 = 0;
    }

    public final void A09(char[] cArr, int i, int i2) {
        this.A04 = null;
        this.A09 = null;
        this.A08 = cArr;
        this.A02 = i;
        this.A01 = i2;
        if (this.A06) {
            A00(this);
        }
    }

    public final char[] A0B() {
        this.A02 = -1;
        this.A00 = 0;
        this.A01 = 0;
        this.A08 = null;
        this.A04 = null;
        this.A09 = null;
        if (this.A06) {
            A00(this);
        }
        char[] cArr = this.A07;
        if (cArr != null) {
            return cArr;
        }
        char[] A032 = A03(this, 0);
        this.A07 = A032;
        return A032;
    }

    public static void A01(C13090hs r2, int i) {
        if (r2.A05 == null) {
            r2.A05 = new ArrayList();
        }
        char[] cArr = r2.A07;
        r2.A06 = true;
        r2.A05.add(cArr);
        int i2 = r2.A03;
        int length = cArr.length;
        r2.A03 = i2 + length;
        int i3 = length >> 1;
        if (i3 >= i) {
            i = i3;
        }
        r2.A00 = 0;
        r2.A07 = new char[Math.min(DexStore.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED, length + i)];
    }

    public static void A02(C13090hs r5, int i) {
        int i2 = r5.A01;
        r5.A01 = 0;
        char[] cArr = r5.A08;
        r5.A08 = null;
        int i3 = r5.A02;
        r5.A02 = -1;
        int i4 = i + i2;
        char[] cArr2 = r5.A07;
        if (cArr2 == null || i4 > cArr2.length) {
            r5.A07 = A03(r5, i4);
        }
        if (i2 > 0) {
            System.arraycopy(cArr, i3, r5.A07, 0, i2);
        }
        r5.A03 = 0;
        r5.A00 = i2;
    }

    public static char[] A03(C13090hs r1, int i) {
        C13040hn r12 = r1.A0A;
        if (r12 != null) {
            return r12.A01(Constants.A0C, i);
        }
        return new char[Math.max(i, 1000)];
    }

    public final int A04() {
        if (this.A02 >= 0) {
            return this.A01;
        }
        char[] cArr = this.A09;
        if (cArr != null) {
            return cArr.length;
        }
        String str = this.A04;
        if (str != null) {
            return str.length();
        }
        return this.A03 + this.A00;
    }

    public final String A05() {
        if (this.A04 == null) {
            char[] cArr = this.A09;
            if (cArr != null) {
                this.A04 = new String(cArr);
            } else {
                int i = this.A02;
                String str = "";
                if (i >= 0) {
                    int i2 = this.A01;
                    if (i2 < 1) {
                        this.A04 = str;
                        return str;
                    }
                    this.A04 = new String(this.A08, i, i2);
                } else {
                    int i3 = this.A03;
                    int i4 = this.A00;
                    if (i3 == 0) {
                        if (i4 != 0) {
                            str = new String(this.A07, 0, i4);
                        }
                        this.A04 = str;
                    } else {
                        StringBuilder sb = new StringBuilder(i3 + i4);
                        ArrayList arrayList = this.A05;
                        if (arrayList != null) {
                            int size = arrayList.size();
                            for (int i5 = 0; i5 < size; i5++) {
                                char[] cArr2 = (char[]) this.A05.get(i5);
                                sb.append(cArr2, 0, cArr2.length);
                            }
                        }
                        sb.append(this.A07, 0, this.A00);
                        this.A04 = sb.toString();
                    }
                }
            }
        }
        return this.A04;
    }

    public final void A06() {
        if (this.A0A == null) {
            this.A02 = -1;
            this.A00 = 0;
            this.A01 = 0;
            this.A08 = null;
            this.A04 = null;
            this.A09 = null;
            if (this.A06) {
                A00(this);
            }
        } else if (this.A07 != null) {
            this.A02 = -1;
            this.A00 = 0;
            this.A01 = 0;
            this.A08 = null;
            this.A04 = null;
            this.A09 = null;
            if (this.A06) {
                A00(this);
            }
            char[] cArr = this.A07;
            this.A07 = null;
            this.A0A.A01[Constants.A0C.intValue()] = cArr;
        }
    }

    public final void A07(String str, int i, int i2) {
        if (this.A02 >= 0) {
            A02(this, i2);
        }
        this.A04 = null;
        this.A09 = null;
        char[] cArr = this.A07;
        int length = cArr.length;
        int i3 = this.A00;
        int i4 = length - i3;
        if (i4 >= i2) {
            str.getChars(i, i + i2, cArr, i3);
            this.A00 += i2;
            return;
        }
        if (i4 > 0) {
            int i5 = i + i4;
            str.getChars(i, i5, cArr, i3);
            i2 -= i4;
            i = i5;
        }
        while (true) {
            A01(this, i2);
            char[] cArr2 = this.A07;
            int min = Math.min(cArr2.length, i2);
            int i6 = i + min;
            str.getChars(i, i6, cArr2, 0);
            this.A00 += min;
            i2 -= min;
            if (i2 > 0) {
                i = i6;
            } else {
                return;
            }
        }
    }

    public final void A08(char[] cArr, int i, int i2) {
        if (this.A02 >= 0) {
            A02(this, i2);
        }
        this.A04 = null;
        this.A09 = null;
        char[] cArr2 = this.A07;
        int length = cArr2.length;
        int i3 = this.A00;
        int i4 = length - i3;
        if (i4 >= i2) {
            System.arraycopy(cArr, i, cArr2, i3, i2);
            this.A00 += i2;
            return;
        }
        if (i4 > 0) {
            System.arraycopy(cArr, i, cArr2, i3, i4);
            i += i4;
            i2 -= i4;
        }
        do {
            A01(this, i2);
            char[] cArr3 = this.A07;
            int min = Math.min(cArr3.length, i2);
            System.arraycopy(cArr, i, cArr3, 0, min);
            this.A00 += min;
            i += min;
            i2 -= min;
        } while (i2 > 0);
    }

    public final char[] A0A() {
        int i;
        char[] cArr = this.A09;
        if (cArr == null) {
            String str = this.A04;
            if (str != null) {
                cArr = str.toCharArray();
            } else {
                int i2 = this.A02;
                if (i2 >= 0) {
                    int i3 = this.A01;
                    if (i3 >= 1) {
                        cArr = new char[i3];
                        System.arraycopy(this.A08, i2, cArr, 0, i3);
                    }
                } else {
                    int A042 = A04();
                    if (A042 >= 1) {
                        cArr = new char[A042];
                        ArrayList arrayList = this.A05;
                        if (arrayList != null) {
                            int size = arrayList.size();
                            i = 0;
                            for (int i4 = 0; i4 < size; i4++) {
                                char[] cArr2 = (char[]) this.A05.get(i4);
                                int length = cArr2.length;
                                System.arraycopy(cArr2, 0, cArr, i, length);
                                i += length;
                            }
                        } else {
                            i = 0;
                        }
                        System.arraycopy(this.A07, 0, cArr, i, this.A00);
                    }
                }
                cArr = A0B;
            }
            this.A09 = cArr;
        }
        return cArr;
    }

    public final char[] A0C() {
        int min;
        char[] cArr = this.A07;
        int length = cArr.length;
        if (length == 262144) {
            min = 262145;
        } else {
            min = Math.min(DexStore.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED, (length >> 1) + length);
        }
        char[] cArr2 = new char[min];
        this.A07 = cArr2;
        System.arraycopy(cArr, 0, cArr2, 0, length);
        return this.A07;
    }

    public final char[] A0D() {
        if (this.A05 == null) {
            this.A05 = new ArrayList();
        }
        this.A06 = true;
        this.A05.add(this.A07);
        int length = this.A07.length;
        this.A03 += length;
        char[] cArr = new char[Math.min(length + (length >> 1), DexStore.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED)];
        this.A00 = 0;
        this.A07 = cArr;
        return cArr;
    }

    public final char[] A0E() {
        if (this.A02 >= 0) {
            A02(this, 1);
        } else {
            char[] cArr = this.A07;
            if (cArr == null) {
                this.A07 = A03(this, 0);
            } else if (this.A00 >= cArr.length) {
                A01(this, 1);
            }
        }
        return this.A07;
    }

    public final char[] A0F() {
        if (this.A02 >= 0) {
            return this.A08;
        }
        char[] cArr = this.A09;
        if (cArr != null) {
            return cArr;
        }
        String str = this.A04;
        if (str != null) {
            char[] charArray = str.toCharArray();
            this.A09 = charArray;
            return charArray;
        } else if (!this.A06) {
            return this.A07;
        } else {
            return A0A();
        }
    }

    public C13090hs(C13040hn r2) {
        this.A0A = r2;
    }

    public final String toString() {
        return A05();
    }
}
