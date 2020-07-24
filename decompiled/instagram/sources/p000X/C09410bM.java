package p000X;

/* renamed from: X.0bM  reason: invalid class name and case insensitive filesystem */
public final class C09410bM implements AnonymousClass0Q6 {
    public final /* synthetic */ C09380bJ A00;

    public C09410bM(C09380bJ r1) {
        this.A00 = r1;
    }

    public final void onAppBackgrounded() {
        int A03 = AnonymousClass0Z0.A03(-1492467675);
        if (C62742oI.A00) {
            AnonymousClass0QD.A03("camera_leak", AnonymousClass000.A0E("Camera leak detected after app backgrounded. Product name: ", "Optic"), 1);
        }
        AnonymousClass0Z0.A0A(17539588, A03);
    }

    public final void onAppForegrounded() {
        AnonymousClass0Z0.A0A(-414875054, AnonymousClass0Z0.A03(-676147440));
    }
}
