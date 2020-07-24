package p000X;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.1cO  reason: invalid class name and case insensitive filesystem */
public final class C33111cO {
    public static int A00;
    public static int A01;
    public static Interpolator A02;
    public static boolean A03;
    public static boolean A04;

    public static Animation A00(Context context, View view, int i, boolean z) {
        int i2;
        view.setElevation(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        Animation loadAnimation = AnimationUtils.loadAnimation(context, i);
        if (A03) {
            loadAnimation.setInterpolator(A02);
            if (z) {
                i2 = A00;
            } else {
                i2 = A01;
            }
            loadAnimation.setDuration((long) i2);
            A03 = false;
        }
        return loadAnimation;
    }

    public static Animation A02(AnonymousClass1HD r5, int i, boolean z, boolean z2, boolean z3) {
        View view = r5.mView;
        Context context = r5.getContext();
        if (z && Build.VERSION.SDK_INT >= 21) {
            Animation A012 = A01(context, view, i, z3);
            if (!A04 && (context instanceof C11850fm)) {
                Animation A013 = A01(context, view, i, z3);
                A013.reset();
                Activity activity = (Activity) context;
                AnonymousClass1EW A032 = AnonymousClass1EW.A03(activity);
                A032.A07.clearAnimation();
                A032.A07.setAnimation(A013);
                View findViewById = activity.findViewById(16908335);
                if (findViewById != null) {
                    A013.setAnimationListener(new C1896888r());
                    findViewById.clearAnimation();
                    findViewById.setAnimation(A013);
                    AnonymousClass1X4.A01 = true;
                }
            }
            return A012;
        } else if (Build.VERSION.SDK_INT < 21 || view == null || !z2) {
            return null;
        } else {
            A04 = r5 instanceof AnonymousClass1HM;
            return A00(context, view, i, z3);
        }
    }

    public static Animation A01(Context context, View view, int i, boolean z) {
        int i2;
        Animation loadAnimation = AnimationUtils.loadAnimation(context, i);
        loadAnimation.setAnimationListener(new C73143Io(view, context));
        if (A03) {
            loadAnimation.setInterpolator(A02);
            if (z) {
                i2 = A00;
            } else {
                i2 = A01;
            }
            loadAnimation.setDuration((long) i2);
            A03 = false;
        }
        return loadAnimation;
    }
}
