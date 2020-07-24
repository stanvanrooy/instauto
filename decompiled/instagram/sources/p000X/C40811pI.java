package p000X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.widget.TextView;

/* renamed from: X.1pI  reason: invalid class name and case insensitive filesystem */
public final class C40811pI {
    public static final TypedValue A00 = new TypedValue();

    public static Drawable A00(Context context, int i, int i2) {
        if (i == 0) {
            return null;
        }
        Drawable A03 = C019000b.A03(context, i);
        Resources.Theme theme = context.getTheme();
        TypedValue typedValue = A00;
        theme.resolveAttribute(i2, typedValue, true);
        A03.setColorFilter(C26771Ff.A00(typedValue.data));
        return A03;
    }

    public static Drawable A01(Context context, int i, int i2) {
        Drawable mutate = C019000b.A03(context, i).mutate();
        mutate.setColorFilter(C26771Ff.A00(C019000b.A00(context, i2)));
        return mutate;
    }

    public static void A02(TextView textView) {
        int currentTextColor = textView.getCurrentTextColor();
        for (Drawable drawable : textView.getCompoundDrawables()) {
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(currentTextColor, PorterDuff.Mode.SRC_IN));
            }
        }
    }
}
