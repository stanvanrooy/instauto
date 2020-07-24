package p000X;

import android.os.Build;

/* renamed from: X.A4M */
public final class A4M {
    public final A4Z A00;
    public final A4Z A01;

    public static A4M A00() {
        A4Z a4z;
        if (Build.VERSION.SDK_INT < 21) {
            a4z = new A4Z(Constants.ONE, "native_modules", 2000000);
        } else {
            a4z = new A4Z(Constants.ONE, "native_modules", 0);
        }
        C23070A4n a4n = new C23070A4n();
        A4Z a4z2 = new A4Z(Constants.ONE, "js", 0);
        boolean z = false;
        if (a4n.A00 == null) {
            z = true;
        }
        AnonymousClass0FY.A03(z, "Setting JS queue multiple times!");
        a4n.A00 = a4z2;
        boolean z2 = false;
        if (a4n.A01 == null) {
            z2 = true;
        }
        AnonymousClass0FY.A03(z2, "Setting native modules queue spec multiple times!");
        a4n.A01 = a4z;
        AnonymousClass0FY.A00(a4z);
        A4Z a4z3 = a4n.A00;
        AnonymousClass0FY.A00(a4z3);
        return new A4M(a4z, a4z3);
    }

    public A4M(A4Z a4z, A4Z a4z2) {
        this.A01 = a4z;
        this.A00 = a4z2;
    }
}
