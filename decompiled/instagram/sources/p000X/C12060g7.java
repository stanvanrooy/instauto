package p000X;

/* renamed from: X.0g7  reason: invalid class name and case insensitive filesystem */
public final class C12060g7 extends C10030cY {
    public final C12020g3 A00;
    public final boolean A01;

    public final AnonymousClass0IF getListenerMarkers() {
        int[] iArr = this.A01 ? new int[]{15335435, 23592980} : new int[]{15335435};
        return new AnonymousClass0IF(iArr, iArr);
    }

    public final void onMarkerCancel(AnonymousClass0ID r3) {
        this.A00.ADk(String.valueOf(r3.A04));
    }

    public final void onMarkerStart(AnonymousClass0ID r3) {
        this.A00.ADL(String.valueOf(r3.A04));
    }

    public final void onMarkerStop(AnonymousClass0ID r3) {
        this.A00.ADk(String.valueOf(r3.A04));
    }

    public C12060g7(C12020g3 r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }
}
