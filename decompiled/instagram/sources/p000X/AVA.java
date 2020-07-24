package p000X;

/* renamed from: X.AVA */
public final class AVA {
    public static AVB parseFromJson(C13080hr r3) {
        AVB avb = new AVB();
        if (r3.A0g() != C13120hv.START_OBJECT) {
            r3.A0f();
            return null;
        }
        while (r3.A0p() != C13120hv.END_OBJECT) {
            String A0i = r3.A0i();
            r3.A0p();
            AnonymousClass1N4.A01(avb, A0i, r3);
            r3.A0f();
        }
        return avb;
    }
}
