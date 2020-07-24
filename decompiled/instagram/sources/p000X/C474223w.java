package p000X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* renamed from: X.23w  reason: invalid class name and case insensitive filesystem */
public final class C474223w {
    public static final Object A00 = new Object();
    public static final ThreadLocal A01 = new ThreadLocal();
    public static final WeakHashMap A02 = new WeakHashMap(0);

    public static ColorStateList A00(Context context, int i) {
        ColorStateList colorStateList;
        C116744zn r2;
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        synchronized (A00) {
            try {
                SparseArray sparseArray = (SparseArray) A02.get(context);
                if (!(sparseArray == null || sparseArray.size() <= 0 || (r2 = (C116744zn) sparseArray.get(i)) == null)) {
                    if (r2.A01.equals(context.getResources().getConfiguration())) {
                        colorStateList = r2.A00;
                    } else {
                        sparseArray.remove(i);
                    }
                }
                colorStateList = null;
            } catch (Throwable th) {
                while (true) {
                    th = th;
                }
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        Resources resources = context.getResources();
        ThreadLocal threadLocal = A01;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        boolean z = true;
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (i2 < 28 || i2 > 31) {
            z = false;
        }
        ColorStateList colorStateList2 = null;
        if (!z) {
            Resources resources2 = context.getResources();
            try {
                colorStateList2 = A7a.A00(resources2, resources2.getXml(i), context.getTheme());
            } catch (Exception e) {
                Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e);
            }
        }
        if (colorStateList2 == null) {
            return C019000b.A02(context, i);
        }
        synchronized (A00) {
            try {
                WeakHashMap weakHashMap = A02;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(context);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(context, sparseArray2);
                }
                sparseArray2.append(i, new C116744zn(colorStateList2, context.getResources().getConfiguration()));
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
        return colorStateList2;
    }

    public static Drawable A01(Context context, int i) {
        return C25761Ae.A02().A07(context, i);
    }
}
