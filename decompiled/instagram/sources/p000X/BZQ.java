package p000X;

import com.facebook.common.dextricks.DexStore;
import java.lang.ref.SoftReference;

/* renamed from: X.BZQ */
public final class BZQ {
    public static final byte[] A03 = C13180i1.A01();
    public static final char[] A04 = C13180i1.A02();
    public static final ThreadLocal A05 = new ThreadLocal();
    public BZR A00;
    public C13090hs A01;
    public final char[] A02;

    public static BZQ A01() {
        BZQ bzq;
        SoftReference softReference = (SoftReference) A05.get();
        if (softReference == null) {
            bzq = null;
        } else {
            bzq = (BZQ) softReference.get();
        }
        if (bzq != null) {
            return bzq;
        }
        BZQ bzq2 = new BZQ();
        A05.set(new SoftReference(bzq2));
        return bzq2;
    }

    public static void A02(int i) {
        throw new IllegalArgumentException(BZP.A00(i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0045, code lost:
        if (r7 < r2.length) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0047, code lost:
        p000X.BZR.A00(r4);
        r2 = r4.A01;
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004d, code lost:
        r5 = r9 + 1;
        r1 = r11.charAt(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0053, code lost:
        if (r1 > 127) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0055, code lost:
        r2 = r8[r1];
        r4.A00 = r7;
        r4.A02(92);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005e, code lost:
        if (r2 >= 0) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0060, code lost:
        r4.A02(117);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0067, code lost:
        if (r1 <= 255) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0069, code lost:
        r6 = r1 >> 8;
        r2 = A03;
        r4.A02(r2[r6 >> 4]);
        r4.A02(r2[r6 & 15]);
        r1 = r1 & 255;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007d, code lost:
        r2 = A03;
        r4.A02(r2[r1 >> 4]);
        r4.A02(r2[r1 & 15]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008d, code lost:
        r7 = r4.A00;
        r2 = r4.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0091, code lost:
        r9 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0093, code lost:
        r4.A02(48);
        r4.A02(48);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009c, code lost:
        r4.A02((byte) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a3, code lost:
        if (r1 > 2047) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a5, code lost:
        r6 = r7 + 1;
        r2[r7] = (byte) ((r1 >> 6) | 192);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ae, code lost:
        r1 = (r1 & '?') | 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b3, code lost:
        if (r6 < r2.length) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b5, code lost:
        p000X.BZR.A00(r4);
        r2 = r4.A01;
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00bb, code lost:
        r7 = r6 + 1;
        r2[r6] = (byte) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c4, code lost:
        if (r1 < 55296) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c9, code lost:
        if (r1 > 57343) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ce, code lost:
        if (r1 <= 56319) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d0, code lost:
        A02(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d3, code lost:
        if (r5 < r3) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d5, code lost:
        A02(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d8, code lost:
        r8 = r5 + 1;
        r5 = A00(r1, r11.charAt(r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e5, code lost:
        if (r5 <= 1114111) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e7, code lost:
        A02(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ea, code lost:
        r6 = r7 + 1;
        r2[r7] = (byte) ((r5 >> 18) | 240);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f4, code lost:
        if (r6 < r2.length) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f6, code lost:
        p000X.BZR.A00(r4);
        r2 = r4.A01;
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00fc, code lost:
        r1 = r6 + 1;
        r2[r6] = (byte) (((r5 >> 12) & 63) | 128);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0108, code lost:
        if (r1 < r2.length) goto L_0x0110;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x010a, code lost:
        p000X.BZR.A00(r4);
        r2 = r4.A01;
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0110, code lost:
        r6 = r1 + 1;
        r2[r1] = (byte) (((r5 >> 6) & 63) | 128);
        r1 = (r5 & '?') | 128;
        r5 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0121, code lost:
        r8 = r7 + 1;
        r2[r7] = (byte) ((r1 >> 12) | 224);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x012b, code lost:
        if (r8 < r2.length) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x012d, code lost:
        p000X.BZR.A00(r4);
        r2 = r4.A01;
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0133, code lost:
        r6 = r8 + 1;
        r2[r8] = (byte) (((r1 >> 6) & 63) | 128);
     */
    public final byte[] A03(String str) {
        BZR bzr = this.A00;
        if (bzr == null) {
            bzr = new BZR(500);
            this.A00 = bzr;
        }
        int length = str.length();
        bzr.A01();
        byte[] bArr = bzr.A01;
        int i = 0;
        int i2 = 0;
        loop0:
        while (i < length) {
            int[] iArr = C13180i1.A06;
            while (true) {
                char charAt = str.charAt(i);
                if (charAt <= 127 && iArr[charAt] == 0) {
                    if (i2 >= bArr.length) {
                        BZR.A00(bzr);
                        bArr = bzr.A01;
                        i2 = 0;
                    }
                    bArr[i2] = (byte) charAt;
                    i++;
                    i2++;
                    if (i >= length) {
                        break loop0;
                    }
                }
            }
        }
        BZR bzr2 = this.A00;
        bzr2.A00 = i2;
        return bzr2.A05();
    }

    public BZQ() {
        char[] cArr = new char[6];
        this.A02 = cArr;
        cArr[0] = '\\';
        cArr[2] = '0';
        cArr[3] = '0';
    }

    public static int A00(int i, int i2) {
        if (i2 >= 56320 && i2 <= 57343) {
            return ((i - 55296) << 10) + DexStore.LOAD_RESULT_PGO_ATTEMPTED + (i2 - 56320);
        }
        throw new IllegalArgumentException(AnonymousClass000.A0O("Broken surrogate pair: first char 0x", Integer.toHexString(i), ", second 0x", Integer.toHexString(i2), "; illegal combination"));
    }
}
