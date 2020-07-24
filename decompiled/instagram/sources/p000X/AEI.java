package p000X;

import android.os.SystemClock;

/* renamed from: X.AEI */
public final class AEI {
    public boolean A00;
    public final long A01 = SystemClock.elapsedRealtime();
    public final C24309Ala A02;
    public final C13300iJ A03;

    public final boolean equals(Object obj) {
        C13300iJ r0;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AEI aei = (AEI) obj;
            C13300iJ r1 = this.A03;
            if (!(r1 == null || (r0 = aei.A03) == null)) {
                return r1.equals(r0);
            }
        }
        return false;
    }

    public final int hashCode() {
        C13300iJ r0 = this.A03;
        if (r0 != null) {
            return r0.hashCode();
        }
        return 0;
    }

    public final String toString() {
        String id;
        C13300iJ r0 = this.A03;
        if (r0 == null) {
            id = "unknown";
        } else {
            id = r0.getId();
        }
        return AnonymousClass000.A0N("participant: ", id, "\n status: ", this.A02.toString());
    }

    public AEI(C13300iJ r3, C24309Ala ala) {
        this.A03 = r3;
        this.A02 = ala;
    }
}
