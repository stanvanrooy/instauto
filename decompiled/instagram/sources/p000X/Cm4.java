package p000X;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* renamed from: X.Cm4 */
public final class Cm4 implements Closeable {
    public byte[] A00;
    public int A01;
    public int A02;
    public final InputStream A03;
    public final Charset A04;
    public final /* synthetic */ C28736Clr A05;

    public Cm4(C28736Clr clr, InputStream inputStream, Charset charset) {
        this.A05 = clr;
        if (charset == null) {
            throw null;
        } else if (charset.equals(C28736Clr.A0H)) {
            this.A03 = inputStream;
            this.A04 = charset;
            this.A00 = new byte[8192];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }

    private void A00() {
        InputStream inputStream = this.A03;
        byte[] bArr = this.A00;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.A02 = 0;
            this.A01 = read;
            return;
        }
        throw new EOFException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002e, code lost:
        if (r3[r2] == 13) goto L_0x0030;
     */
    public final String A01() {
        int i;
        int i2;
        byte[] bArr;
        int i3;
        synchronized (this.A03) {
            if (this.A00 != null) {
                if (this.A02 >= this.A01) {
                    A00();
                }
                int i4 = this.A02;
                int i5 = i4;
                while (true) {
                    int i6 = this.A01;
                    if (i4 != i6) {
                        byte[] bArr2 = this.A00;
                        if (bArr2[i4] == 10) {
                            if (i4 != i5) {
                                i3 = i4 - 1;
                            }
                            i3 = i4;
                            String str = new String(bArr2, i5, i3 - i5, this.A04.name());
                            this.A02 = i4 + 1;
                            return str;
                        }
                        i4++;
                    } else {
                        C28752Cm8 cm8 = new C28752Cm8(this, (i6 - i5) + 80);
                        loop1:
                        while (true) {
                            byte[] bArr3 = this.A00;
                            int i7 = this.A02;
                            cm8.write(bArr3, i7, this.A01 - i7);
                            this.A01 = -1;
                            A00();
                            i = this.A02;
                            i2 = i;
                            while (true) {
                                if (i != this.A01) {
                                    bArr = this.A00;
                                    if (bArr[i] == 10) {
                                        break loop1;
                                    }
                                    i++;
                                }
                            }
                        }
                        if (i != i2) {
                            cm8.write(bArr, i2, i - i2);
                        }
                        this.A02 = i + 1;
                        String cm82 = cm8.toString();
                        return cm82;
                    }
                }
            } else {
                throw new IOException("LineReader is closed");
            }
        }
    }

    public final void close() {
        synchronized (this.A03) {
            if (this.A00 != null) {
                this.A00 = null;
                this.A03.close();
            }
        }
    }
}
