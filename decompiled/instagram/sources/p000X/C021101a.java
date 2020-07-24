package p000X;

import android.os.SystemClock;

/* renamed from: X.01a  reason: invalid class name and case insensitive filesystem */
public final class C021101a extends C035407j {
    public final C035307i A03() {
        return new AnonymousClass01D();
    }

    public final boolean A04(C035307i r3) {
        AnonymousClass01D r32 = (AnonymousClass01D) r3;
        C035707m.A00(r32);
        r32.A00 = SystemClock.elapsedRealtime();
        r32.A01 = SystemClock.uptimeMillis();
        return true;
    }
}
