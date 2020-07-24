package p000X;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* renamed from: X.AXS */
public final class AXS {
    public static void A00(View view) {
        Context context;
        InputMethodManager inputMethodManager;
        if (view != null) {
            context = view.getContext();
        } else {
            context = null;
        }
        if (context != null && (inputMethodManager = (InputMethodManager) context.getSystemService("input_method")) != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public static void A01(View view) {
        Context context;
        if (view != null) {
            context = view.getContext();
        } else {
            context = null;
        }
        if (context != null) {
            context.getResources().getConfiguration();
            InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.showSoftInput(view, 1);
            }
        }
    }
}
