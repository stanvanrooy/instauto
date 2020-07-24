package p000X;

/* renamed from: X.0hQ  reason: invalid class name and case insensitive filesystem */
public final class C12810hQ {
    public static void A02(C17860qv r3) {
        A03(r3, -5, 3, true, true);
    }

    public static C12830hS A00() {
        AnonymousClass0O1 A00 = AnonymousClass0O1.A00();
        A00.A01 = "SerialScheduler";
        return new C12820hR(A00.A01());
    }

    public static void A01(C17860qv r1) {
        AnonymousClass2IN.A00.schedule(r1);
    }

    public static void A03(C17860qv r6, int i, int i2, boolean z, boolean z2) {
        AnonymousClass0OT A00 = C05700Lp.A00();
        r6.onStart();
        A00.ADc(new C22650ym(i, i2, z, z2, r6));
    }

    public static void A04(C17860qv r11, int i, int i2, boolean z, boolean z2, int i3) {
        AnonymousClass0OT A00 = C05700Lp.A00();
        AnonymousClass0O3.A00().A01(new AnonymousClass22J(r11.getRunnableId(), r11, i, i2, z, z2, A00), (long) i3);
    }
}
