package p000X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.List;

/* renamed from: X.CY6 */
public final class CY6 {
    public static int A00(CY7 cy7, Context context) {
        if (cy7 == null) {
            return 0;
        }
        float f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        switch (cy7.A01.intValue()) {
            case 1:
                f = cy7.A00;
                break;
            case 2:
                f = C06220Of.A00(context, cy7.A00);
                break;
        }
        return Math.round(f);
    }

    public static GradientDrawable A01(Context context, List list, int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius((float) context.getResources().getDimensionPixelSize(C0003R.dimen.canvas_button_corner_radius));
        if (list == null || !list.contains(CY9.BUTTON_OUTLINE)) {
            gradientDrawable.setColor(i);
            return gradientDrawable;
        }
        gradientDrawable.setStroke(context.getResources().getDimensionPixelSize(C0003R.dimen.canvas_button_stroke), i);
        gradientDrawable.setColor(0);
        return gradientDrawable;
    }

    public static void A02(View view, CY8 cy8) {
        CY7 cy7 = cy8.A01;
        Context context = view.getContext();
        view.setPadding(A00(cy7, context), A00(cy8.A03, context), A00(cy8.A02, context), A00(cy8.A00, context));
    }
}
