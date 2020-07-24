package p000X;

/* renamed from: X.1uP  reason: invalid class name and case insensitive filesystem */
public final class C43431uP {
    public AnonymousClass20T A00;
    public AnonymousClass20T A01;
    public AnonymousClass20T A02;
    public AnonymousClass20T A03;
    public C43461uS A04;
    public C43471uT A05;
    public C43451uR A06;
    public String A07;

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        if (r1.equals(r5.A07) == false) goto L_0x001e;
     */
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C43431uP r5 = (C43431uP) obj;
                String str = this.A07;
                if (str == null) {
                    if (r5.A07 != null) {
                        return false;
                    }
                }
                if (this.A05 == r5.A05) {
                    C43461uS r1 = this.A04;
                    if (r1 != null) {
                        if (!r1.equals(r5.A04)) {
                            return false;
                        }
                    } else if (r5.A04 != null) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void A00() {
        C43471uT r0;
        C43451uR r1 = this.A06;
        if (r1 != null) {
            this.A04 = r1;
            if (r1.A02 != null) {
                this.A07 = r1.getId();
            }
        } else {
            AnonymousClass20T r02 = this.A02;
            if (r02 == null && (r02 = this.A00) == null && (r02 = this.A03) == null && (r02 = this.A01) == null) {
                AnonymousClass0QD.A02("SuggestedItem", "Unknown SuggestedItem Type. PLEASE FIX ASAP BECAUSE YOU ARE SENDING UNKNOWN FEED ITEM JSON TO CLIENT.");
                r0 = C43471uT.UNKNOWN;
                this.A05 = r0;
            }
            this.A04 = r02;
            this.A07 = r02.A01;
        }
        r0 = this.A04.AXE();
        this.A05 = r0;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        String str = this.A07;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (527 + hashCode) * 31;
        C43471uT r0 = this.A05;
        if (r0 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = r0.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        C43461uS r02 = this.A04;
        if (r02 != null) {
            i = r02.hashCode();
        }
        return i3 + i;
    }

    public C43431uP() {
    }

    public C43431uP(C43451uR r1) {
        this.A06 = r1;
        A00();
    }
}
