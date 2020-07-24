package p000X;

import com.google.common.p003io.Closeables;
import java.io.InputStream;

/* renamed from: X.1hB  reason: invalid class name and case insensitive filesystem */
public final class C35941hB implements AnonymousClass1CA {
    public final long A00;
    public final InputStream A01;

    public final void A8w() {
        Closeables.A01(this.A01);
    }

    public final long A9g() {
        return this.A00;
    }

    public final InputStream AHT() {
        return this.A01;
    }

    public final void close() {
        this.A01.close();
    }

    public C35941hB(InputStream inputStream, long j) {
        this.A01 = inputStream;
        this.A00 = j;
    }
}
