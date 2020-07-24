package p000X;

import android.content.Context;
import com.facebook.C0003R;
import com.instagram.model.reels.Reel;

/* renamed from: X.1gw  reason: invalid class name and case insensitive filesystem */
public final class C35791gw {
    public static void A00(Context context, C35621gf r3, C31581Yw r4) {
        int i;
        Reel reel = r4.A04;
        r3.A01 = reel.getId();
        if (reel.A0w) {
            r3.A04.setAlpha(0.3f);
        } else {
            r3.A04.setAlpha(1.0f);
        }
        if (r4.A05.equals(AnonymousClass1OY.EXPLORE)) {
            i = context.getResources().getDimensionPixelSize(C0003R.dimen.tray_padding_above_avatars);
        } else {
            i = 0;
        }
        C06220Of.A0Q(r3.A04, i);
        C476324u r1 = r3.A00;
        if (r1 != null) {
            r1.A0B(Constants.ONE);
            r3.A00 = null;
        }
    }
}
