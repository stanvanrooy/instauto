package p000X;

import android.content.Context;
import android.util.TypedValue;
import com.facebook.C0003R;

/* renamed from: X.1Ir  reason: invalid class name and case insensitive filesystem */
public final class C27651Ir {
    public static int A00(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0003R.attr.actionBarHeight, typedValue, true);
        if (typedValue.type == 5) {
            return (int) typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        AnonymousClass0QD.A02("ActionBarDimensions", "Could't find action bar height attr.");
        return context.getResources().getDimensionPixelSize(C0003R.dimen.instagram_default_action_bar_height);
    }
}
