package p000X;

import java.io.Writer;

/* renamed from: X.BZS */
public final class BZS extends Writer {
    public final C13090hs A00;

    public final void close() {
    }

    public final void flush() {
    }

    public BZS(C13040hn r2) {
        this.A00 = new C13090hs(r2);
    }

    public final Writer append(char c) {
        write((int) c);
        return this;
    }

    public final Writer append(CharSequence charSequence) {
        String charSequence2 = charSequence.toString();
        this.A00.A07(charSequence2, 0, charSequence2.length());
        return this;
    }

    public final Writer append(CharSequence charSequence, int i, int i2) {
        String charSequence2 = charSequence.subSequence(i, i2).toString();
        this.A00.A07(charSequence2, 0, charSequence2.length());
        return this;
    }

    public final void write(int i) {
        C13090hs r4 = this.A00;
        char c = (char) i;
        if (r4.A02 >= 0) {
            C13090hs.A02(r4, 16);
        }
        r4.A04 = null;
        r4.A09 = null;
        char[] cArr = r4.A07;
        if (r4.A00 >= cArr.length) {
            C13090hs.A01(r4, 1);
            cArr = r4.A07;
        }
        int i2 = r4.A00;
        r4.A00 = i2 + 1;
        cArr[i2] = c;
    }

    public final void write(String str) {
        this.A00.A07(str, 0, str.length());
    }

    public final void write(String str, int i, int i2) {
        this.A00.A07(str, i, i2);
    }

    public final void write(char[] cArr) {
        this.A00.A08(cArr, 0, cArr.length);
    }

    public final void write(char[] cArr, int i, int i2) {
        this.A00.A08(cArr, i, i2);
    }
}
