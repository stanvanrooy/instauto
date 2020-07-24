package p000X;

import com.instagram.model.reels.Reel;
import java.util.List;

/* renamed from: X.1uR  reason: invalid class name and case insensitive filesystem */
public class C43451uR implements C13310iK, C43461uS {
    public C71333Ac A00;
    public C13300iJ A01;
    public C13300iJ A02;
    public String A03;
    public String A04;
    public String A05;
    public List A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public Reel A0A;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C13300iJ r1 = this.A02;
                C13300iJ r0 = ((C43451uR) obj).A02;
                if (r1 != null) {
                    if (!r1.equals(r0)) {
                        return false;
                    }
                } else if (r0 != null) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final Reel A00(AnonymousClass0C1 r4) {
        C71333Ac r0;
        if (!(this.A0A != null || (r0 = this.A00) == null || r0.A02 == null)) {
            this.A0A = C17020pY.A00().A0Q(r4).A0F(this.A00.A02, false);
        }
        return this.A0A;
    }

    public final C43471uT AXE() {
        return C43471uT.SUGGESTED_USER;
    }

    public final String getId() {
        return this.A02.getId();
    }

    public final int hashCode() {
        C13300iJ r0 = this.A02;
        if (r0 != null) {
            return r0.hashCode();
        }
        return 0;
    }
}
