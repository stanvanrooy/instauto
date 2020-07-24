package p000X;

import java.io.File;

/* renamed from: X.0mc  reason: invalid class name and case insensitive filesystem */
public final class C15270mc {
    public C56252cB A00;
    public boolean A01;
    public long A02 = 0;
    public C33371co A03;
    public boolean A04;
    public boolean A05 = false;
    public final File A06;
    public final String A07;

    public final synchronized long A00() {
        return this.A02;
    }

    public final synchronized C33371co A01() {
        return this.A03;
    }

    public final synchronized void A04(long j, boolean z) {
        this.A02 = j;
        this.A03 = null;
        this.A05 = true;
        this.A04 = z;
    }

    public final synchronized void A05(C33371co r2) {
        this.A03 = r2;
    }

    public final synchronized void A06(C56252cB r2, boolean z) {
        this.A00 = r2;
        this.A01 = z;
    }

    public final synchronized boolean A07() {
        return this.A04;
    }

    public final synchronized boolean A08() {
        return this.A05;
    }

    public final File A02() {
        return new File(this.A06, AnonymousClass000.A0E(this.A07, ".clean"));
    }

    public final File A03() {
        return new File(this.A06, AnonymousClass000.A0E(this.A07, ".metadata"));
    }

    public C15270mc(File file, String str) {
        this.A06 = file;
        this.A07 = str;
    }
}
