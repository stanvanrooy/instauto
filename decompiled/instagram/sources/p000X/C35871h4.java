package p000X;

import com.instagram.model.reels.Reel;
import com.instagram.p009ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.1h4  reason: invalid class name and case insensitive filesystem */
public final class C35871h4 {
    public static C35981hF A00(Reel reel, AnonymousClass0C1 r2) {
        if (reel.A0E(r2) != null) {
            return reel.A0E(r2);
        }
        if (reel.A0h(r2)) {
            return new C44711wd();
        }
        if (reel.A0j(r2)) {
            return new C35991hG();
        }
        return new C35971hE();
    }

    public static void A01(GradientSpinner gradientSpinner, Reel reel, AnonymousClass0C1 r3) {
        C35981hF A0E = reel.A0E(r3);
        if (A0E != null) {
            gradientSpinner.setGradientColors(A0E);
        } else {
            gradientSpinner.setGradientColors(A00(reel, r3));
        }
    }
}
