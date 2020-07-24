package p000X;

import android.content.Context;
import android.view.View;
import com.facebook.C0003R;
import com.instagram.model.reels.Reel;

/* renamed from: X.1h3  reason: invalid class name and case insensitive filesystem */
public final class C35861h3 {
    public static boolean A01(AnonymousClass0C1 r2, C31581Yw r3) {
        if (!AnonymousClass1OY.MAIN_FEED_TRAY.equals(r3.A05) || C35561gZ.A00(r2, r3) != 3) {
            return false;
        }
        return true;
    }

    public static boolean A02(AnonymousClass0C1 r2, C31581Yw r3) {
        Reel reel = r3.A04;
        if (reel.A0x && reel.A0l(r2)) {
            Reel reel2 = r3.A04;
            if (reel2.A0a() || reel2.A0e() || r3.A02) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static void A00(View view, Context context) {
        if (view.getLayoutParams() == null) {
            AnonymousClass1ZN r2 = new AnonymousClass1ZN(context.getResources().getDimensionPixelSize(C0003R.dimen.tray_item_with_preview_background_content_width), context.getResources().getDimensionPixelSize(C0003R.dimen.tray_item_with_preview_background_content_height));
            r2.leftMargin = context.getResources().getDimensionPixelSize(C0003R.dimen.tray_in_feed_item_margin);
            r2.rightMargin = context.getResources().getDimensionPixelSize(C0003R.dimen.tray_in_feed_item_margin);
            view.setLayoutParams(r2);
        }
    }
}
