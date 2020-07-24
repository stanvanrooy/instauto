package p000X;

/* renamed from: X.20n  reason: invalid class name and case insensitive filesystem */
public final class C467020n extends C467120o {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C466520i A01;
    public final /* synthetic */ C465920c A02;
    public final /* synthetic */ C43451uR A03;

    public final void B5C(C13300iJ r1) {
    }

    public final void B5D(C13300iJ r1) {
    }

    public final void B5E(C13300iJ r1, Integer num) {
    }

    public C467020n(C465920c r1, C466520i r2, C43451uR r3, int i) {
        this.A02 = r1;
        this.A01 = r2;
        this.A03 = r3;
        this.A00 = i;
    }

    public final void Avu(C13300iJ r11) {
        if (this.A01.getAdapterPosition() != -1) {
            C465920c r0 = this.A02;
            C28161Kq r2 = r0.A05;
            C43411uN r1 = r0.A00;
            int i = r1.A00;
            int intValue = r1.A02(this.A03).intValue();
            C43451uR r5 = this.A03;
            C43411uN r02 = this.A02.A00;
            r2.BQ8(i, intValue, r5, r02.A08, "profile", r02.getId(), r02.A0B);
            C13390iS A0J = C26661Ek.A00(this.A02.A07).A0J(r11);
            if (A0J == C13390iS.FollowStatusFollowing || A0J == C13390iS.FollowStatusRequested) {
                this.A02.A08.run();
            }
            if (C29411Pu.A00) {
                this.A02.notifyItemChanged(this.A00);
            }
        }
    }
}
