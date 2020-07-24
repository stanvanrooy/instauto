package p000X;

/* renamed from: X.1oU  reason: invalid class name and case insensitive filesystem */
public final class C40331oU implements C40341oV {
    public final int A00;
    public final int A01;
    public final int A02;
    public final float A03;
    public final int A04;

    public final boolean Acs() {
        return false;
    }

    public static C40331oU A00(int i, int i2) {
        int i3 = i2;
        return new C40331oU(i, i3, i, i3, ((float) i2) / ((float) i));
    }

    public final float AGA() {
        return this.A03;
    }

    public final int AIT() {
        return this.A04;
    }

    public C40331oU(int i, int i2, int i3, int i4, float f) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = i3;
        this.A04 = i4;
        this.A03 = f;
    }
}
