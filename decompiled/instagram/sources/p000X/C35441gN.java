package p000X;

import java.io.InputStream;

/* renamed from: X.1gN  reason: invalid class name and case insensitive filesystem */
public final class C35441gN {
    public int A00;
    public boolean A01 = false;
    public byte[] A02;
    public final C252918f A03;
    public final byte[] A04 = new byte[4096];

    public final void A01() {
        this.A01 = false;
        this.A00 = 0;
        C252918f r4 = this.A03;
        C253018g r3 = r4.A00;
        if (!r3.A03 || (this.A02.length <= r3.A00 * r3.A01 && r4.A01.size() < r4.A00.A02)) {
            r4.A01.add(this);
        }
    }

    public static void A00(C35441gN r5, byte[] bArr, int i) {
        int i2 = r5.A00;
        int i3 = i2 + i;
        byte[] bArr2 = r5.A02;
        int length = bArr2.length;
        if (i3 > length) {
            byte[] bArr3 = new byte[Math.max(length << 1, i3)];
            System.arraycopy(bArr2, 0, bArr3, 0, i2);
            r5.A02 = bArr3;
        }
        System.arraycopy(bArr, 0, r5.A02, r5.A00, i);
        r5.A00 = i3;
    }

    public final void A02(InputStream inputStream) {
        while (true) {
            int read = inputStream.read(this.A04);
            if (read != -1) {
                appendBytesFromIOBuffer(read);
            } else {
                return;
            }
        }
    }

    public void appendBytesFromIOBuffer(int i) {
        if (this.A01) {
            throw new RuntimeException("The buffer is already frozen");
        } else if (i < 0) {
            throw new IndexOutOfBoundsException(AnonymousClass000.A05("Negative length detected : ", i));
        } else if (i != 0) {
            A00(this, this.A04, i);
        }
    }

    public byte[] getIOBuffer() {
        return this.A04;
    }

    public C35441gN(C252918f r2, int i) {
        this.A03 = r2;
        this.A02 = new byte[i];
    }
}
