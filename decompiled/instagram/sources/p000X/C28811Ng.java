package p000X;

import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1Ng  reason: invalid class name and case insensitive filesystem */
public final class C28811Ng {
    public AnonymousClass1Nf A00;
    public C28801Ne A01;
    public AnonymousClass1NZ A02;
    public AnonymousClass1NY A03;
    public C28781Nb A04;
    public AnonymousClass1Nd A05;
    public boolean A06;
    public final Map A07 = new HashMap();

    public final void A01() {
        this.A06 = false;
        C28781Nb r1 = this.A04;
        if (r1 != null) {
            r1.BDR((C155326kE) null);
        }
        AnonymousClass1Nd r0 = this.A05;
        if (r0 != null) {
            r0.A8X();
        }
        AnonymousClass1Nf r02 = this.A00;
        if (r02 != null) {
            C27321Hj.A05(r02.A00);
        }
    }

    public static boolean A00(C28811Ng r6, C155326kE r7, AnonymousClass0C1 r8) {
        String str;
        if (r6.A04 != null) {
            AnonymousClass1NR r1 = (AnonymousClass1NR) r6.A07.get(QuickPromotionSurface.TOOLTIP);
            if (r1 == null) {
                AnonymousClass0QD.A02("IG-QP", AnonymousClass000.A0J("QPSurfaceValidator required for tooltip but was not provided. promotion id: ", r7.AT8(), " will be skipped."));
            } else if (r1.A03(r7)) {
                if (r1.A02(r7)) {
                    r6.A04.BRr(r7);
                    return true;
                }
                AnonymousClass2C0 A022 = C17640qZ.A00.A02(r8);
                QPTooltipAnchor AYW = r7.AYW();
                C92493zF r2 = new C92493zF(AnonymousClass0QT.A00(A022.A00, A022).A02("ig_qp_tooltip_no_anchor"));
                if (AYW != null) {
                    str = AYW.A00;
                } else {
                    str = "unknown";
                }
                r2.A08("anchor_name", str);
                r2.A08("promotion_id", r7.AT8());
                r2.A01();
                if (!r6.A06) {
                    r6.A06 = true;
                    r6.A04.BDR(r7);
                    return false;
                }
            }
        }
        return false;
    }
}
