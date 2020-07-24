package p000X;

/* renamed from: X.1dm  reason: invalid class name and case insensitive filesystem */
public final class C33961dm implements C33951dl {
    public final /* synthetic */ C33941dk A00;
    public final /* synthetic */ C27321Hj A01;

    public final boolean Bmp() {
        return false;
    }

    public C33961dm(C27321Hj r1, C33941dk r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public final void BSk(float f) {
        AnonymousClass1YO r1 = this.A01.A0O;
        if (r1.A0E()) {
            r1.A03.A00();
        }
        this.A01.A0G.A00();
    }

    public final boolean Bmq(C255119b r5) {
        C27321Hj r1 = this.A01;
        int i = 0;
        if (r1.A0c) {
            i = 1;
        }
        if (r1.A0J.A09.A07) {
            i++;
        }
        if (i == 0) {
            return false;
        }
        if (r5.ALs() < i) {
            return true;
        }
        if (r5.ALs() != i || r5.AI1(0).getHeight() + r5.AI1(0).getTop() <= this.A01.A02) {
            return false;
        }
        return true;
    }

    public final boolean Bmr(C255119b r4) {
        C27321Hj r1 = this.A01;
        int i = 0;
        if (r1.A0c) {
            i = 1;
        }
        if (r1.A0J.A09.A07) {
            i++;
        }
        if (r4.AI5() == 0 || i == 0) {
            return this.A00.Bmr(r4);
        }
        if (this.A00.Bmr(r4) || r4.ALs() == i) {
            return true;
        }
        return false;
    }
}
