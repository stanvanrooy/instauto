package p000X;

import android.os.Process;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0d1  reason: invalid class name and case insensitive filesystem */
public final class C10320d1 extends AnonymousClass0Hz implements AnonymousClass0I8 {
    public int A00;
    public long A01;
    public AnonymousClass0I7 A02;
    public String A03;
    public final AnonymousClass066 A04;
    public final AnonymousClass0IO A05;
    public final C10880e1 A06 = C10880e1.A00;
    public volatile int A07;
    public volatile AnonymousClass0ID A08;

    private AnonymousClass0I7 A00() {
        if (this.A02 == null) {
            this.A02 = new AnonymousClass0I7();
        }
        return this.A02;
    }

    private AnonymousClass0ID A01() {
        if (this.A08 != null) {
            return this.A08;
        }
        throw new IllegalStateException("Do not use MarkerEditor after call to editingCompleted()");
    }

    public final AnonymousClass0Hz A03(String str, double d) {
        AnonymousClass066 r0 = this.A04;
        AnonymousClass0ID A012 = A01();
        AnonymousClass0I0 r3 = r0.A03;
        int myTid = Process.myTid();
        AnonymousClass0IA r1 = r0.A0K;
        r3.A02.A00();
        try {
            A012.A09 = myTid;
            A012.A06(str, d);
            r1.A00(A012);
            return this;
        } finally {
            r3.A02.unlock();
        }
    }

    public final AnonymousClass0Hz A04(String str, int i) {
        AnonymousClass066 r0 = this.A04;
        AnonymousClass0ID A012 = A01();
        AnonymousClass0I0 r4 = r0.A03;
        int myTid = Process.myTid();
        AnonymousClass0IA r3 = r0.A0K;
        r4.A02.A00();
        try {
            A012.A09 = myTid;
            AnonymousClass0Hh r2 = A012.A0Q;
            r2.A08 = null;
            r2.A07 = null;
            r2.A05.add(str);
            AnonymousClass0Hh.A01(r2, (long) i);
            AnonymousClass0Hh.A00(r2, (byte) 2);
            r3.A00(A012);
            return this;
        } finally {
            r4.A02.unlock();
        }
    }

    public final AnonymousClass0Hz A05(String str, long j) {
        AnonymousClass066 r0 = this.A04;
        AnonymousClass0ID A012 = A01();
        AnonymousClass0I0 r3 = r0.A03;
        int myTid = Process.myTid();
        AnonymousClass0IA r1 = r0.A0K;
        r3.A02.A00();
        try {
            A012.A09 = myTid;
            A012.A07(str, j);
            r1.A00(A012);
            return this;
        } finally {
            r3.A02.unlock();
        }
    }

    public final AnonymousClass0Hz A06(String str, String str2) {
        AnonymousClass066 r0 = this.A04;
        AnonymousClass0ID A012 = A01();
        AnonymousClass0I0 r3 = r0.A03;
        int myTid = Process.myTid();
        AnonymousClass0IA r1 = r0.A0K;
        r3.A02.A00();
        try {
            A012.A09 = myTid;
            A012.A08(str, str2);
            r1.A00(A012);
            return this;
        } finally {
            r3.A02.unlock();
        }
    }

    public final AnonymousClass0Hz A07(String str, boolean z) {
        long j;
        AnonymousClass066 r0 = this.A04;
        AnonymousClass0ID A012 = A01();
        AnonymousClass0I0 r4 = r0.A03;
        int myTid = Process.myTid();
        AnonymousClass0IA r3 = r0.A0K;
        r4.A02.A00();
        try {
            A012.A09 = myTid;
            AnonymousClass0Hh r2 = A012.A0Q;
            r2.A08 = null;
            r2.A07 = null;
            r2.A05.add(str);
            if (z) {
                j = 1;
            } else {
                j = 0;
            }
            AnonymousClass0Hh.A01(r2, j);
            AnonymousClass0Hh.A00(r2, (byte) 8);
            r3.A00(A012);
            return this;
        } finally {
            r4.A02.unlock();
        }
    }

    public final AnonymousClass0I8 A08(String str) {
        this.A03 = str;
        this.A01 = -1;
        this.A00 = 0;
        return this;
    }

    public final AnonymousClass0I8 A43(String str, String[] strArr) {
        if (strArr == null) {
            return this;
        }
        A00().A00(str, C04960Hf.A03(strArr), 4);
        return this;
    }

    public final void Aoj() {
        if (this.A03 != null) {
            BXK();
        }
        this.A08 = null;
        this.A07 = 7;
        this.A05.A00.set(this);
    }

    public final AnonymousClass0I8 BXJ(long j) {
        if (this.A00 != 1 || j == -1) {
            this.A01 = j;
            return this;
        }
        throw new IllegalStateException("You can't collect metadata with custom timestamp, as point appeared in the past but metadata is to be collected in the present");
    }

    public final AnonymousClass0Hz BXK() {
        String r1;
        if (this.A03 != null) {
            AnonymousClass0I7 r2 = this.A02;
            if (r2 != null) {
                r2.A03 = true;
            }
            AnonymousClass066 r8 = this.A04;
            AnonymousClass0ID A012 = A01();
            int i = this.A07;
            String str = this.A03;
            AnonymousClass0I7 r11 = this.A02;
            long j = this.A01;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            int i2 = this.A00;
            int myTid = Process.myTid();
            boolean z = false;
            if (j == -1) {
                z = true;
            }
            long A072 = r8.A07(j, timeUnit);
            AnonymousClass0I0 r3 = r8.A03;
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            boolean z2 = !z;
            AnonymousClass0IA r9 = r8.A0K;
            r3.A02.A00();
            try {
                A012.A09 = myTid;
                long nanos = timeUnit2.toNanos(A072) - A012.A0F;
                long j2 = A012.A0D;
                boolean z3 = false;
                if (AnonymousClass0I0.A0A(A012, r9)) {
                    if (j2 == 0 || i2 == 0) {
                        A012.A04(nanos, TimeUnit.NANOSECONDS, i, str, r11, (AnonymousClass0SN) null);
                        r9.A01(A012, str, r11, timeUnit2.toMillis(A072), timeUnit2.toNanos(A072), z2, i);
                    } else {
                        z3 = true;
                    }
                }
                if (z3) {
                    AnonymousClass0SN A0B = r3.A0B(j2);
                    r3.A02.A00();
                    A012.A04(nanos, TimeUnit.NANOSECONDS, i, str, r11, A0B);
                    r9.A01(A012, str, r11, timeUnit2.toMillis(A072), timeUnit2.toNanos(A072), z2, i);
                    r3.A02.unlock();
                }
                int i3 = A012.A04;
                if (AnonymousClass066.A06(r8)) {
                    if (r11 == null) {
                        r1 = null;
                    } else {
                        r1 = r11.toString();
                    }
                    AnonymousClass066.A05(r8, "markerPoint", i3, str, r1);
                }
                this.A03 = null;
                this.A02 = null;
                this.A01 = -1;
                this.A00 = 0;
                return this;
            } finally {
                r3.A02.unlock();
            }
        } else {
            throw new IllegalStateException("You should not use PointEditor after point was completed");
        }
    }

    public final AnonymousClass0I8 BXL(boolean z) {
        if (!z) {
            this.A00 = 0;
            return this;
        } else if (this.A01 == -1) {
            this.A00 = 1;
            return this;
        } else {
            throw new IllegalStateException("You can't collect metadata with custom timestamp, as point appeared in the past but metadata is to be collected in the present");
        }
    }

    public C10320d1(AnonymousClass066 r2, AnonymousClass0IO r3) {
        this.A04 = r2;
        this.A05 = r3;
    }

    public final AnonymousClass0I8 A3x(String str, double d) {
        A00().A00(str, String.valueOf(d), 6);
        return this;
    }

    public final AnonymousClass0I8 A3y(String str, int i) {
        A00().A00(str, String.valueOf(i), 2);
        return this;
    }

    public final AnonymousClass0I8 A3z(String str, String str2) {
        A00().A00(str, str2, 1);
        return this;
    }

    public final AnonymousClass0I8 A40(String str, boolean z) {
        A00().A00(str, String.valueOf(z), 8);
        return this;
    }

    public final AnonymousClass0I8 A41(String str, double[] dArr) {
        A00().A00(str, C04960Hf.A00(dArr), 7);
        return this;
    }

    public final AnonymousClass0I8 A42(String str, int[] iArr) {
        A00().A00(str, C04960Hf.A01(iArr), 5);
        return this;
    }

    public final AnonymousClass0I8 A44(String str, boolean[] zArr) {
        A00().A00(str, C04960Hf.A04(zArr), 9);
        return this;
    }

    public final AnonymousClass0Hz A02(int i) {
        this.A07 = i;
        return this;
    }
}
