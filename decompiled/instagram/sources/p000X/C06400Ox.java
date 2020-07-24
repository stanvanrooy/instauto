package p000X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import java.util.Locale;

/* renamed from: X.0Ox  reason: invalid class name and case insensitive filesystem */
public final class C06400Ox {
    public static Drawable A00(Context context, int i) {
        if (!A02(context)) {
            return C019000b.A03(context, i);
        }
        Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), i);
        return new C06410Oy(context.getResources(), decodeResource, decodeResource);
    }

    public static boolean A01() {
        byte directionality = Character.getDirectionality(Locale.getDefault().getDisplayName().charAt(0));
        if (directionality == 1 || directionality == 2) {
            return true;
        }
        return false;
    }

    public static boolean A02(Context context) {
        if ((context.getApplicationInfo().flags & 4194304) == 0 || context.getResources().getConfiguration().getLayoutDirection() != 1) {
            return false;
        }
        return true;
    }
}
