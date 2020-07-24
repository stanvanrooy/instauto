package p000X;

import android.content.Context;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import java.util.concurrent.Callable;

/* renamed from: X.0Of  reason: invalid class name and case insensitive filesystem */
public final class C06220Of {
    public static boolean A00;
    public static final RectF A01 = new RectF();
    public static final int[] A02 = new int[2];

    public static float A05(DisplayMetrics displayMetrics, int i) {
        return TypedValue.applyDimension(1, (float) i, displayMetrics);
    }

    public static void A0f(TextView textView, Drawable drawable) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public static float A04(DisplayMetrics displayMetrics) {
        return ((float) displayMetrics.widthPixels) / ((float) displayMetrics.heightPixels);
    }

    public static RectF A0A(View view) {
        RectF rectF = new RectF();
        A0Z(view, rectF);
        return rectF;
    }

    public static DisplayMetrics A0B(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static void A0F(View view) {
        if (view != null) {
            view.setVisibility(8);
            view.setOnClickListener((View.OnClickListener) null);
        }
    }

    public static void A0T(View view, int i) {
        if (view != null) {
            view.setVisibility(i);
        }
    }

    public static void A0Z(View view, RectF rectF) {
        int[] iArr = A02;
        view.getLocationInWindow(iArr);
        float f = (float) iArr[0];
        float f2 = (float) iArr[1];
        rectF.set(f, f2, (((float) view.getWidth()) * view.getScaleX()) + f, (((float) view.getHeight()) * view.getScaleY()) + f2);
    }

    public static void A0a(View view, View view2, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            view.addOnLayoutChangeListener(new C06230Og(view, z, view2));
        }
    }

    public static void A0c(View view, Runnable runnable) {
        view.addOnLayoutChangeListener(new C06260Oj(runnable));
    }

    public static float A00(Context context, float f) {
        return TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    public static float A01(Context context, float f) {
        return f / context.getResources().getDisplayMetrics().density;
    }

    public static float A02(Context context, float f) {
        return TypedValue.applyDimension(2, f, context.getResources().getDisplayMetrics());
    }

    public static float A03(Context context, int i) {
        return A05(context.getResources().getDisplayMetrics(), i);
    }

    public static int A06(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return point.y;
    }

    public static int A07(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return point.x;
    }

    public static int A08(Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static int A09(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static String A0C(TextView textView) {
        return textView.getText().toString();
    }

    public static void A0D(View view) {
        AnonymousClass0a4.A06(view);
        ((InputMethodManager) view.getContext().getSystemService("input_method")).toggleSoftInput(2, 1);
    }

    public static void A0E(View view) {
        AnonymousClass0a4.A06(view);
        ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static void A0G(View view) {
        AnonymousClass0a4.A06(view);
        ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
    }

    public static void A0H(View view) {
        AnonymousClass0a4.A06(view);
        view.postDelayed(new C06330Oq(view), 60);
    }

    public static void A0I(View view, int i) {
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.bottomMargin = i;
            view.setLayoutParams(marginLayoutParams);
        }
    }

    public static void A0J(View view, int i) {
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            AnonymousClass1X6.A00(marginLayoutParams, i);
            view.setLayoutParams(marginLayoutParams);
        }
    }

    public static void A0K(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }

    public static void A0L(View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    public static void A0M(View view, int i) {
        view.setPadding(i, view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
    }

    public static void A0N(View view, int i) {
        view.setPaddingRelative(i, view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom());
    }

    public static void A0O(View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), i, view.getPaddingBottom());
    }

    public static void A0P(View view, int i) {
        view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), i, view.getPaddingBottom());
    }

    public static void A0Q(View view, int i) {
        view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), view.getPaddingBottom());
    }

    public static void A0R(View view, int i) {
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.setMarginStart(i);
            view.setLayoutParams(marginLayoutParams);
        }
    }

    public static void A0S(View view, int i) {
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.topMargin = i;
            view.setLayoutParams(marginLayoutParams);
        }
    }

    public static void A0U(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i;
        view.setLayoutParams(layoutParams);
    }

    public static void A0V(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        view.setLayoutParams(layoutParams);
    }

    public static void A0W(View view, int i, int i2) {
        view.setPadding(i, view.getPaddingTop(), i2, view.getPaddingBottom());
    }

    public static void A0X(View view, int i, int i2) {
        view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
    }

    public static void A0Y(View view, int i, int i2, int i3, int i4) {
        Context context = view.getContext();
        view.setPadding((int) A03(context, i), (int) A03(context, i2), (int) A03(context, i3), (int) A03(context, i4));
    }

    public static void A0b(View view, Runnable runnable) {
        AnonymousClass0a4.A06(view);
        if (view.isLaidOut()) {
            runnable.run();
        } else {
            view.addOnLayoutChangeListener(new C06240Oh(view, runnable));
        }
    }

    public static void A0d(View view, Callable callable) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        viewTreeObserver.addOnPreDrawListener(new C06310Oo(viewTreeObserver, view, callable));
    }

    public static void A0e(View view, Callable callable, Callable callable2, int i) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        Handler handler = new Handler();
        C06290Om r0 = new C06290Om(handler, viewTreeObserver, view, callable);
        C06280Ol r3 = new C06280Ol(viewTreeObserver, r0, view, callable2);
        viewTreeObserver.addOnPreDrawListener(r0);
        AnonymousClass0ZA.A09(handler, r3, (long) i, -1185737387);
    }

    public static boolean A0g(Context context) {
        if (context.getResources().getConfiguration().orientation != 1) {
            return false;
        }
        return true;
    }

    public static boolean A0h(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            view.setAlpha(0.8f);
            return false;
        } else if (action != 1 && action != 3) {
            return false;
        } else {
            view.setAlpha(1.0f);
            return false;
        }
    }

    public static boolean A0i(TextView textView) {
        if (textView.getText().length() == 0) {
            return true;
        }
        return false;
    }
}
