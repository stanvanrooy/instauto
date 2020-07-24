package p000X;

import java.io.InputStream;
import java.io.Reader;

/* renamed from: X.BZV */
public abstract class BZV extends Reader {
    public int A00;
    public int A01;
    public InputStream A02;
    public byte[] A03;
    public char[] A04 = null;
    public final C13030hm A05;

    public void close() {
        InputStream inputStream = this.A02;
        if (inputStream != null) {
            this.A02 = null;
            byte[] bArr = this.A03;
            if (bArr != null) {
                this.A03 = null;
                this.A05.A02(bArr);
            }
            inputStream.close();
        }
    }

    public int read() {
        if (this.A04 == null) {
            this.A04 = new char[1];
        }
        if (read(this.A04, 0, 1) < 1) {
            return -1;
        }
        return this.A04[0];
    }

    public BZV(C13030hm r2, InputStream inputStream, byte[] bArr, int i, int i2) {
        this.A05 = r2;
        this.A02 = inputStream;
        this.A03 = bArr;
        this.A01 = i;
        this.A00 = i2;
    }
}
