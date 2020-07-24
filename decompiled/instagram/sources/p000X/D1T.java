package p000X;

import android.net.Uri;
import java.io.IOException;

/* renamed from: X.D1T */
public final class D1T implements C29613D1t {
    public Uri A00;
    public final D15 A01;

    public final void A87() {
        this.A01.cancel();
    }

    public final long BWT(D1M d1m) {
        this.A00 = d1m.A04;
        return this.A01.BWT(d1m);
    }

    public final void close() {
        this.A01.close();
    }

    public final int read(byte[] bArr, int i, int i2) {
        try {
            return this.A01.read(bArr, i, i2);
        } catch (IOException e) {
            throw e;
        }
    }

    public D1T(D15 d15) {
        this.A01 = d15;
    }

    public final Uri AZY() {
        return this.A00;
    }
}
