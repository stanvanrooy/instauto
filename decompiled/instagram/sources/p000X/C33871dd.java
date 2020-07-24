package p000X;

import android.content.Context;
import android.widget.ImageView;
import com.facebook.C0003R;

/* renamed from: X.1dd  reason: invalid class name and case insensitive filesystem */
public final class C33871dd {
    public static void A00(ImageView imageView, int i) {
        String quantityString;
        boolean z = false;
        if (i > 0) {
            z = true;
        }
        imageView.setActivated(z);
        imageView.setImageLevel(Math.min(i, 10000));
        Context context = imageView.getContext();
        if (i == 0) {
            quantityString = context.getString(C0003R.string.message);
        } else if (i < 99) {
            quantityString = context.getResources().getQuantityString(C0003R.plurals.notification_badge_description_plural, i, new Object[]{Integer.valueOf(i)});
        } else {
            quantityString = context.getResources().getQuantityString(C0003R.plurals.notification_badge_description_more_than, 99, new Object[]{99});
        }
        imageView.setContentDescription(quantityString);
    }
}
