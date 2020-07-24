package p000X;

import java.io.CharArrayWriter;
import java.io.InputStream;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.BitSet;

/* renamed from: X.0Rq  reason: invalid class name and case insensitive filesystem */
public final class C07070Rq extends InputStream {
    public static BitSet A07 = new BitSet(256);
    public static final Charset A08 = Charset.forName("UTF-8");
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 0;
    public CharArrayWriter A03;
    public final Reader A04;
    public final StringBuffer A05 = new StringBuffer();
    public final char[] A06 = new char[1024];

    static {
        for (int i = 97; i <= 122; i++) {
            A07.set(i);
        }
        for (int i2 = 65; i2 <= 90; i2++) {
            A07.set(i2);
        }
        for (int i3 = 48; i3 <= 57; i3++) {
            A07.set(i3);
        }
        A07.set(32);
        A07.set(45);
        A07.set(95);
        A07.set(46);
        A07.set(42);
    }

    public final void close() {
        this.A04.close();
        super.close();
    }

    public final int read() {
        int i;
        StringBuffer stringBuffer;
        BitSet bitSet;
        int i2;
        char c;
        StringBuffer stringBuffer2 = this.A05;
        if (stringBuffer2 == null || stringBuffer2.length() <= (i = this.A02)) {
            int i3 = this.A00;
            i = 0;
            if (i3 == 0 || i3 <= this.A01) {
                this.A00 = this.A04.read(this.A06);
                this.A01 = 0;
            }
            if (this.A00 == -1) {
                return -1;
            }
            char c2 = this.A06[this.A01];
            if (A07.get(c2)) {
                if (c2 == ' ') {
                    c2 = '+';
                }
                this.A01++;
                return c2;
            }
            this.A03.reset();
            this.A05.setLength(0);
            do {
                this.A03.write(c2);
                if (c2 >= 55296 && c2 <= 56319 && (i2 = this.A01 + 1) < this.A00 && (c = this.A06[i2]) >= 56320 && c <= 57343) {
                    this.A03.write(c);
                    this.A01++;
                }
                int i4 = this.A01 + 1;
                this.A01 = i4;
                if (i4 >= this.A00) {
                    break;
                }
                bitSet = A07;
                c2 = this.A06[i4];
            } while (!bitSet.get(c2));
            this.A03.flush();
            byte[] bytes = new String(this.A03.toCharArray()).getBytes(A08);
            for (int i5 = 0; i5 < bytes.length; i5++) {
                this.A05.append('%');
                char forDigit = Character.forDigit((bytes[i5] >> 4) & 15, 16);
                if (Character.isLetter(forDigit)) {
                    forDigit = (char) (forDigit - ' ');
                }
                this.A05.append(forDigit);
                char forDigit2 = Character.forDigit(bytes[i5] & 15, 16);
                if (Character.isLetter(forDigit2)) {
                    forDigit2 = (char) (forDigit2 - ' ');
                }
                this.A05.append(forDigit2);
            }
            this.A03.reset();
            this.A02 = 1;
            stringBuffer = this.A05;
        } else {
            stringBuffer = this.A05;
            this.A02 = i + 1;
        }
        return stringBuffer.charAt(i);
    }

    public C07070Rq(Reader reader, CharArrayWriter charArrayWriter) {
        this.A04 = reader;
        this.A03 = charArrayWriter;
    }
}
