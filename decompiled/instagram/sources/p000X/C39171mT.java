package p000X;

import com.instagram.p009ui.widget.pageindicator.CirclePageIndicator;

/* renamed from: X.1mT  reason: invalid class name and case insensitive filesystem */
public final class C39171mT {
    public static void A00(C32361b2 r6, AnonymousClass1NJ r7, C36841ih r8) {
        C36841ih r0 = r6.A00;
        if (!(r0 == null || r0 == r8)) {
            r8.A0C(r6, true);
        }
        r6.A00 = r8;
        if (r7.A1W()) {
            if (r6.A02 == null) {
                r6.A02 = (CirclePageIndicator) r6.A01.inflate();
            }
            CirclePageIndicator circlePageIndicator = r6.A02;
            circlePageIndicator.setVisibility(0);
            circlePageIndicator.A00(r8.AHt(), Math.max(r7.A04, r7.A07()));
            circlePageIndicator.A01(r8.A01, false);
            r8.A0B(r6, true);
            return;
        }
        C06220Of.A0F(r6.A02);
    }
}
