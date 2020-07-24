package p000X;

/* renamed from: X.1ua  reason: invalid class name and case insensitive filesystem */
public final class C43541ua implements C36851ii, C43551ub, C36871ik {
    public int A00;
    public C28452Ch9 A01;
    public boolean A02 = false;
    public boolean A03 = false;
    public boolean A04;
    public boolean A05 = true;
    public boolean A06 = true;
    public boolean A07 = false;
    public int A08 = -1;
    public C43561uc A09 = C43561uc.NONE;

    public final C43561uc AMv() {
        return this.A09;
    }

    public final boolean Ai7() {
        if (this.A09 != C43561uc.NONE) {
            return true;
        }
        return false;
    }

    public final int getPosition() {
        boolean z = false;
        if (this.A08 >= 0) {
            z = true;
        }
        AnonymousClass0a4.A0B(z, "Position is not set.");
        return this.A08;
    }

    public final void Bja(int i) {
        C12670hC.A02();
        this.A08 = i;
    }

    public final void Bhs(C43561uc r1) {
        this.A09 = r1;
    }
}
