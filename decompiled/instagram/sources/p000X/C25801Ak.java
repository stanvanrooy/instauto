package p000X;

import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import java.lang.reflect.Field;

/* renamed from: X.1Ak  reason: invalid class name and case insensitive filesystem */
public final class C25801Ak {
    public static Field A00;
    public static boolean A01;

    public static void A01(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        if (!A01) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
                A00 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("LayoutInflaterCompatHC", AnonymousClass000.A0J("forceSetFactory2 Could not find field 'mFactory2' on class ", LayoutInflater.class.getName(), "; inflation may have unexpected results."), e);
            }
            A01 = true;
        }
        Field field = A00;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException e2) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 could not set the Factory2 on LayoutInflater " + layoutInflater + "; inflation may have unexpected results.", e2);
            }
        }
    }

    public static void A00(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
        if (Build.VERSION.SDK_INT < 21) {
            LayoutInflater.Factory factory = layoutInflater.getFactory();
            if (factory instanceof LayoutInflater.Factory2) {
                A01(layoutInflater, (LayoutInflater.Factory2) factory);
            } else {
                A01(layoutInflater, factory2);
            }
        }
    }
}
