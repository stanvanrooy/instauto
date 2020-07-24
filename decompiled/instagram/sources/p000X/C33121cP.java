package p000X;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.1cP  reason: invalid class name and case insensitive filesystem */
public final class C33121cP {
    public static int A00;
    public static int A01;
    public static Interpolator A02;
    public static boolean A03;
    public static Drawable A04;

    public static Animator A00(AnonymousClass1HD r8, boolean z, int i, boolean z2, boolean z3, boolean z4) {
        int i2;
        AnonymousClass1HD r4 = r8;
        View view = r8.mView;
        Context context = r4.getContext();
        int i3 = i;
        if (i == 0 || !z3 || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
        if (A03) {
            loadAnimator.setInterpolator(A02);
            if (z4) {
                i2 = A00;
            } else {
                i2 = A01;
            }
            loadAnimator.setDuration((long) i2);
            A03 = false;
        }
        loadAnimator.addListener(new AnonymousClass676(r4, context, z, i3, view, z2));
        return loadAnimator;
    }

    public static void A01(Context context, View view, boolean z) {
        if (z && view != null) {
            view.setElevation(C06220Of.A03(context, 4));
            A04 = view.getBackground();
            view.setBackground(new ColorDrawable(AnonymousClass1BA.A01(context, C0003R.attr.backgroundColorPrimary)));
        }
    }

    public static void A02(View view, boolean z) {
        if (z && view != null) {
            view.setElevation(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            view.setBackground(A04);
        }
    }
}
