package p000X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;

/* renamed from: X.1An  reason: invalid class name and case insensitive filesystem */
public final class C25831An {
    public TypedValue A00;
    public final Context A01;
    public final TypedArray A02;

    public static C25831An A00(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C25831An(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static C25831An A01(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new C25831An(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public final int A02(int i, int i2) {
        return this.A02.getDimensionPixelOffset(i, i2);
    }

    public final int A03(int i, int i2) {
        return this.A02.getDimensionPixelSize(i, i2);
    }

    public final int A04(int i, int i2) {
        return this.A02.getInt(i, i2);
    }

    public final int A05(int i, int i2) {
        return this.A02.getResourceId(i, i2);
    }

    public final ColorStateList A06(int i) {
        int resourceId;
        ColorStateList A002;
        if (!this.A02.hasValue(i) || (resourceId = this.A02.getResourceId(i, 0)) == 0 || (A002 = C474223w.A00(this.A01, resourceId)) == null) {
            return this.A02.getColorStateList(i);
        }
        return A002;
    }

    public final Drawable A07(int i) {
        int resourceId;
        if (!this.A02.hasValue(i) || (resourceId = this.A02.getResourceId(i, 0)) == 0) {
            return this.A02.getDrawable(i);
        }
        return C474223w.A01(this.A01, resourceId);
    }

    public final Drawable A08(int i) {
        int resourceId;
        Drawable A08;
        if (!this.A02.hasValue(i) || (resourceId = this.A02.getResourceId(i, 0)) == 0) {
            return null;
        }
        C25751Ad A012 = C25751Ad.A01();
        Context context = this.A01;
        synchronized (A012) {
            A08 = A012.A00.A08(context, resourceId, true);
        }
        return A08;
    }

    public final CharSequence A09(int i) {
        return this.A02.getText(i);
    }

    public final String A0A(int i) {
        return this.A02.getString(i);
    }

    public final void A0B() {
        this.A02.recycle();
    }

    public final boolean A0C(int i) {
        return this.A02.hasValue(i);
    }

    public final boolean A0D(int i, boolean z) {
        return this.A02.getBoolean(i, z);
    }

    public C25831An(Context context, TypedArray typedArray) {
        this.A01 = context;
        this.A02 = typedArray;
    }
}
