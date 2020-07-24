package p000X;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;

/* renamed from: X.1vR  reason: invalid class name and case insensitive filesystem */
public final class C44001vR {
    public static void A00(Context context) {
        InputMethodManager inputMethodManager;
        try {
            inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        } catch (Throwable unused) {
            inputMethodManager = null;
        }
        if (inputMethodManager != null) {
            for (Field field : inputMethodManager.getClass().getDeclaredFields()) {
                try {
                    if (!field.isAccessible()) {
                        field.setAccessible(true);
                    }
                    Object obj = field.get(inputMethodManager);
                    if ((obj instanceof View) && ((View) obj).getContext() == context) {
                        field.set(inputMethodManager, (Object) null);
                    }
                } catch (Throwable unused2) {
                }
            }
        }
    }
}
