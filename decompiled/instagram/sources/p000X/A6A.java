package p000X;

import android.view.View;
import android.view.ViewParent;

/* renamed from: X.A6A */
public final class A6A {
    public static A6D A00(View view) {
        while (!(view instanceof A6D)) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                return null;
            }
            AnonymousClass0FY.A02(parent instanceof View);
            view = (View) parent;
        }
        return (A6D) view;
    }
}
