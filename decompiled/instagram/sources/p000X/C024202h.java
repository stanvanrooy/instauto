package p000X;

/* renamed from: X.02h  reason: invalid class name and case insensitive filesystem */
public final class C024202h implements AnonymousClass06Y {
    public final AnonymousClass06Y A00;
    public final C032406e A01;
    public final C033906u A02;
    public final String A03;

    public final void B32() {
        if (this.A01 != null) {
            AnonymousClass0FY.A00(this.A03);
        }
        this.A00.B32();
        C033906u r0 = this.A02;
        if (r0 != null) {
            r0.A01.stopSelf(r0.A00);
        }
    }

    public final void BWA(boolean z) {
        this.A00.BWA(z);
    }

    public C024202h(AnonymousClass06Y r1, C033906u r2, String str, C032406e r4) {
        this.A00 = r1;
        this.A02 = r2;
        this.A03 = str;
        this.A01 = r4;
    }
}
