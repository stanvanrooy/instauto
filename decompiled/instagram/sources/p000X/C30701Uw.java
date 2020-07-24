package p000X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.1Uw  reason: invalid class name and case insensitive filesystem */
public final class C30701Uw extends C27291Hg {
    public C255119b A00;

    public final void Azh() {
        this.A00 = null;
    }

    public final void BJx() {
        C36841ih r2;
        C255119b r4 = this.A00;
        int AOh = r4.AOh();
        for (int ALs = r4.ALs(); ALs <= AOh; ALs++) {
            if (C36371hw.A06(r4, ALs) == C36421i1.AD_CTA) {
                C36401hz r42 = (C36401hz) r4.AI4(ALs).getTag();
                AnonymousClass1NJ r3 = r42.A01;
                if (r3 != null && (r2 = r42.A02) != null) {
                    String A02 = C17050pb.A02(r42.A06.getContext(), r3, r2.AHt());
                    r42.A06.setText(A02);
                    C36841ih r0 = r42.A02;
                    r0.A0M = A02;
                    AnonymousClass1VW.A02(r42, r0.A0a, false);
                    AnonymousClass1VW.A03(r42.A01, r42.A02, r42.A09);
                    return;
                }
                return;
            }
        }
    }

    public final void Ayk(View view) {
        this.A00 = AnonymousClass1YG.A00((ViewGroup) view.findViewById(16908298));
    }
}
