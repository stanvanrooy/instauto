package p000X;

import java.util.Random;

/* renamed from: X.1lS  reason: invalid class name and case insensitive filesystem */
public final class C38551lS implements C06570Po {
    public final int A00;
    public final int A01;
    public final boolean A02;

    public final void onUserSessionWillEnd(boolean z) {
    }

    public C38551lS(boolean z, int i) {
        this.A02 = z;
        this.A01 = i;
        this.A00 = new Random().nextInt(i);
    }
}
