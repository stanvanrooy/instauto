package p000X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

/* renamed from: X.1ef  reason: invalid class name and case insensitive filesystem */
public final class C34391ef {
    public static final int[] A00 = {16843518};
    public static final int[] A01 = {16842908};
    public static final int[] A02 = {-16842919, -16842908};
    public static final int[] A03 = {16842919};
    public static final int[] A04 = {16842913};
    public static final ThreadLocal A05 = new ThreadLocal();
    public static final int[] A06 = {16842912};
    public static final int[] A07 = {-16842910};
    public static final int[] A08 = new int[0];
    public static final int[] A09 = new int[1];

    public static int A01(Context context, int i) {
        int[] iArr = A09;
        iArr[0] = i;
        C25831An A002 = C25831An.A00(context, (AttributeSet) null, iArr);
        try {
            return A002.A02.getColor(0, 0);
        } finally {
            A002.A0B();
        }
    }

    public static ColorStateList A02(Context context, int i) {
        int[] iArr = A09;
        iArr[0] = i;
        C25831An A002 = C25831An.A00(context, (AttributeSet) null, iArr);
        try {
            return A002.A06(0);
        } finally {
            A002.A0B();
        }
    }

    public static void A03(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C26061Bl.A0E);
        try {
            if (!obtainStyledAttributes.hasValue(115)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int A00(Context context, int i) {
        ColorStateList A022 = A02(context, i);
        if (A022 != null && A022.isStateful()) {
            return A022.getColorForState(A07, A022.getDefaultColor());
        }
        ThreadLocal threadLocal = A05;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        float f = typedValue.getFloat();
        int A012 = A01(context, i);
        return C60702kK.A03(A012, Math.round(((float) Color.alpha(A012)) * f));
    }
}
