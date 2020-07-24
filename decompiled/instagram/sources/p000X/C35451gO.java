package p000X;

import android.os.Build;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1gO  reason: invalid class name and case insensitive filesystem */
public final class C35451gO {
    public static List A00(View view) {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 28) {
            z = true;
        }
        if (!z) {
            return Collections.emptyList();
        }
        return A01(view);
    }

    public static List A01(View view) {
        DisplayCutout displayCutout;
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null || (displayCutout = rootWindowInsets.getDisplayCutout()) == null) {
            return Collections.emptyList();
        }
        return displayCutout.getBoundingRects();
    }
}
