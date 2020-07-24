package p000X;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: X.02n  reason: invalid class name and case insensitive filesystem */
public final class C024802n extends FilterOutputStream {
    public C024802n(OutputStream outputStream) {
        super(new GZIPOutputStream(outputStream));
    }

    public final void A00() {
        ((GZIPOutputStream) this.out).finish();
    }

    public final void write(byte[] bArr, int i, int i2) {
        this.out.write(bArr, i, i2);
    }
}
