package p000X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.1Ky  reason: invalid class name and case insensitive filesystem */
public abstract class C28241Ky implements C28111Kl {
    public static final long A06 = TimeUnit.SECONDS.toMillis(1);
    public static final long A07 = TimeUnit.MINUTES.toMillis(1);
    public final long A00;
    public final C13740j9 A01;
    public final AnonymousClass1L1 A02;
    public final AnonymousClass1L0 A03;
    public final AnonymousClass1L2 A04;
    public final long A05;

    public abstract void A02(Object obj, Object obj2, long j);

    public abstract void A03(Object obj, Object obj2, long j);

    public float A01(AnonymousClass1TY r2, C32761bo r3) {
        return r3.A02(r2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    public final void ADd(AnonymousClass1TY r8, C32761bo r9) {
        boolean z;
        long j;
        if (r9.A04(r8) != Constants.A0C) {
            z = false;
            if (A01(r8, r9) >= this.A04.A00) {
                z = true;
            }
        } else {
            z = false;
        }
        if (z) {
            this.A04.A01(r8.A03, A01(r8, r9), r9.A00);
            return;
        }
        if (r9.A04(r8) != Constants.ZERO) {
            float A012 = A01(r8, r9);
            AnonymousClass1L2 r3 = this.A04;
            boolean z2 = false;
            if (A012 >= r3.A00) {
                z2 = true;
            }
            if (!z2) {
                j = r3.A00(r8.A03, r9.A00);
                AnonymousClass1L2 r0 = this.A04;
                r0.A01.remove(r8.A03);
                if (j < this.A05) {
                    String AOQ = this.A03.AOQ(r8);
                    if (!this.A02.A00.A0E(AOQ)) {
                        A03(r8.A01, r8.A02, j);
                    } else if (this.A02.A03(AOQ, this.A00)) {
                        A02(r8.A01, r8.A02, j);
                    } else {
                        return;
                    }
                    this.A02.A02(AOQ);
                    return;
                }
                return;
            }
        }
        j = -1;
        if (j < this.A05) {
        }
    }

    public C28241Ky(AnonymousClass1L0 r10, C13740j9 r11) {
        this(AnonymousClass1L1.A00(r11), new AnonymousClass1L2(), r10, r11, A06, A07);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public C28241Ky(AnonymousClass1L0 r10, C13740j9 r11, long j) {
        this(AnonymousClass1L1.A00(r11), new AnonymousClass1L2(), r3, r11, j, A07);
        AnonymousClass1L0 r3 = r10;
    }

    public C28241Ky(AnonymousClass1L1 r1, AnonymousClass1L2 r2, AnonymousClass1L0 r3, C13740j9 r4, long j, long j2) {
        this.A02 = r1;
        this.A04 = r2;
        this.A03 = r3;
        this.A01 = r4;
        this.A05 = j;
        this.A00 = j2;
    }
}
