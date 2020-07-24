package p000X;

import android.view.View;
import com.facebook.C0003R;

/* renamed from: X.1mN  reason: invalid class name and case insensitive filesystem */
public final class C39111mN {
    public static void A00(C32291au r1, AnonymousClass0C1 r2, C39101mM r3, boolean z, Integer num) {
        Integer num2;
        if (r1 != null && (!C36351hu.A00(r2).A01() || AnonymousClass1YN.A02(r2, "ig_disable_video_autoplay"))) {
            r1.A00 = new C28116Cbe(r2, r3, r1);
        }
        if (r1 == null || C36351hu.A00(r2).A01() || num != (num2 = Constants.ZERO)) {
            r1.A00(r2, Constants.ONE);
            return;
        }
        r1.A00(r2, num2);
        View findViewById = r1.A01.A01().findViewById(C0003R.C0005id.zero_rating_video_badge_container);
        int i = 8;
        if (z) {
            i = 0;
        }
        findViewById.setVisibility(i);
    }
}
