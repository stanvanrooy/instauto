package p000X;

import java.io.IOException;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.BZF */
public final class BZF implements AnonymousClass977 {
    public final C04140Cp A00 = new C11060eM();
    public final AnonymousClass0OT A01;
    public final AnonymousClass0C1 A02;
    public final Set A03 = Collections.newSetFromMap(new BZE(this));

    public final C14490kj A00(String str, C25268BBj bBj, String str2, boolean z, C29016CqU cqU) {
        try {
            AnonymousClass93A A002 = AnonymousClass93A.A00(C25267BBi.A00(str, bBj, str2, this.A02, z, false));
            AnonymousClass2MU.A03(A002, new BZI(this, cqU), new AnonymousClass0OR(this.A01, 333, 3, false, true));
            return A002;
        } catch (IOException | IllegalArgumentException e) {
            BZN bzn = new BZN("Invalid query parameters", e);
            if (cqU != null) {
                cqU.B0N(bzn);
            }
            return AnonymousClass2MU.A01(bzn);
        }
    }

    public final C14490kj AE5(String str, String str2, C25268BBj bBj, String str3, boolean z, C29016CqU cqU) {
        C14490kj r1;
        C14490kj r4;
        this.A00.now();
        C29016CqU cqU2 = cqU;
        if (cqU != null) {
            cqU2.B0O();
        }
        boolean booleanValue = ((Boolean) AnonymousClass0L6.A02(this.A02, AnonymousClass0L7.STORIES_SN_LAUNCHER, "sn_prefetch_optimization_enabled", false, (AnonymousClass04H) null)).booleanValue();
        boolean z2 = false;
        C25268BBj bBj2 = bBj;
        if (booleanValue) {
            z2 = this.A03.contains(bBj2);
        }
        String str4 = str2;
        String str5 = str3;
        boolean z3 = z;
        if (!z || (booleanValue && z2)) {
            try {
                r1 = AnonymousClass93A.A00(C25267BBi.A00(str4, bBj2, str5, this.A02, z3, true));
                AnonymousClass2MU.A03(r1, new BZM(this, cqU2), new AnonymousClass0OR(this.A01, 331, 3, false, true));
            } catch (IOException | IllegalArgumentException e) {
                BZN bzn = new BZN("Invalid query parameters", e);
                if (cqU != null) {
                    cqU2.B0N(bzn);
                }
                r1 = AnonymousClass2MU.A01(bzn);
            }
            BZK bzk = new BZK(this, str4, bBj2, str5, z3, cqU2);
            AnonymousClass0OR r12 = new AnonymousClass0OR(this.A01, 332, 3, false, true);
            C206098rz r42 = new C206098rz(r1, Throwable.class, bzk);
            r1.A3T(r42, C206128s2.A00(r12, r42));
            r4 = r42;
        } else {
            r4 = A00(str4, bBj2, str5, z3, cqU2);
        }
        return C206078rx.A01(r4, new C25887BbZ(this, booleanValue, bBj2, cqU2), new AnonymousClass0OR(this.A01, 330, 3, false, true));
    }

    public BZF(AnonymousClass0C1 r2) {
        this.A02 = r2;
        this.A01 = C05700Lp.A00();
    }
}
