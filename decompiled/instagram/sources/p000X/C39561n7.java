package p000X;

import java.lang.ref.WeakReference;

/* renamed from: X.1n7  reason: invalid class name and case insensitive filesystem */
public final class C39561n7 {
    public C32571bU A00;
    public WeakReference A01;
    public final C39571n8 A02 = new C39571n8();

    public static void A00(C39561n7 r3) {
        r3.A02.A04.clear();
        C39571n8 r2 = r3.A02;
        r2.A04.add(new WeakReference(r3.A00));
        C39571n8 r0 = r3.A02;
        WeakReference weakReference = r3.A01;
        if (weakReference != null) {
            r0.A04.add(weakReference);
        }
    }
}
