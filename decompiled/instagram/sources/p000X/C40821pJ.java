package p000X;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.1pJ  reason: invalid class name and case insensitive filesystem */
public final class C40821pJ {
    public static void A03(View view, int i) {
        C476524w A00 = C476524w.A00(view, 1);
        if (A00.A0U()) {
            A00.A09 = new C27752CPw(A00, view, i);
        } else {
            A04(view, i);
        }
    }

    public static void A05(View view, C476824z r5) {
        C476524w A0Q = C476524w.A00(view, 1).A0R(new C54602Yc()).A0Q(250);
        A0Q.A0L(1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, view.getPivotX());
        A0Q.A0M(1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, view.getPivotY());
        A0Q.A09 = r5;
        A0Q.A0O();
    }

    public static Drawable A00(Context context, int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(C019000b.A00(context, C0003R.color.grey_9_10_transparent));
        gradientDrawable.setCornerRadius(((float) (i + (context.getResources().getDimensionPixelSize(C0003R.dimen.media_tag_indicator_padding) << 1))) / 2.0f);
        return gradientDrawable;
    }

    public static void A01(View view) {
        if (view.getVisibility() != 0) {
            view.setVisibility(0);
            C476524w A0Q = C476524w.A00(view, 1).A0R(new C54602Yc()).A0Q(250);
            A0Q.A0G(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f);
            A0Q.A0O();
        }
    }

    public static void A02(View view) {
        if (view.getVisibility() != 8) {
            C476524w A0Q = C476524w.A00(view, 1).A0R(new C54602Yc()).A0Q(250);
            A0Q.A0G(1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            A0Q.A09 = new AnonymousClass2XF(view);
            A0Q.A0O();
        }
    }

    public static void A04(View view, int i) {
        int measuredWidth = view.getMeasuredWidth();
        C476524w A0Q = C476524w.A00(view, 1).A0R(new C54602Yc()).A0Q(250);
        A0Q.A0A = new C54612Yd(view, measuredWidth, i);
        A0Q.A09 = new C54622Ye(view);
        A0Q.A0O();
    }

    public static void A06(C27734CPd cPd, C476824z r6) {
        PointF relativeTagPosition = cPd.getRelativeTagPosition();
        C476524w A0Q = C476524w.A00(cPd, 1).A0R(new C54602Yc()).A0Q(250);
        A0Q.A0L(1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, relativeTagPosition.x);
        A0Q.A0M(1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, relativeTagPosition.y);
        A0Q.A09 = r6;
        A0Q.A0O();
    }
}
