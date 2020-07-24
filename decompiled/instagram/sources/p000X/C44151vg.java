package p000X;

import java.io.InputStream;

/* renamed from: X.1vg  reason: invalid class name and case insensitive filesystem */
public final class C44151vg implements C44161vh {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C33861dc A01;
    public final /* synthetic */ AnonymousClass1CA A02;
    public final /* synthetic */ AnonymousClass1C3 A03;
    public final /* synthetic */ C256719u A04;

    public C44151vg(C256719u r1, C33861dc r2, long j, AnonymousClass1CA r5, AnonymousClass1C3 r6) {
        this.A04 = r1;
        this.A01 = r2;
        this.A00 = j;
        this.A02 = r5;
        this.A03 = r6;
    }

    public final C17190pp[] AFj() {
        return this.A01.A01();
    }

    public final long AMM() {
        long j = this.A00;
        if (j == -1) {
            return this.A02.A9g();
        }
        return j;
    }

    public final InputStream ANj() {
        return this.A02.AHT();
    }

    public final int AWl() {
        return this.A01.A01;
    }

    public final void abort() {
        this.A03.A00();
    }

    public final void close() {
        this.A02.close();
    }

    public final long getContentLength() {
        return this.A02.A9g();
    }
}
