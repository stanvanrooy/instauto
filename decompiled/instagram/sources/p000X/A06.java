package p000X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;

/* renamed from: X.A06 */
public final class A06 {
    public View A00;
    public A05 A01;

    public static A05 A00(A06 a06) {
        if (a06.A01 == null) {
            a06.A01 = new A05(a06.A00.getContext());
            Drawable background = a06.A00.getBackground();
            AnonymousClass1E1.A0a(a06.A00, (Drawable) null);
            if (background == null) {
                AnonymousClass1E1.A0a(a06.A00, a06.A01);
            } else {
                AnonymousClass1E1.A0a(a06.A00, new LayerDrawable(new Drawable[]{a06.A01, background}));
            }
        }
        return a06.A01;
    }

    public final void A02(int i) {
        if (i != 0 || this.A01 != null) {
            A05 A002 = A00(this);
            A002.A02 = i;
            A002.invalidateSelf();
        }
    }

    public A06(View view) {
        this.A00 = view;
    }

    public final void A01(float f) {
        A05 A002 = A00(this);
        if (!C206858uF.A00(A002.A00, f)) {
            A002.A00 = f;
            A002.A0H = true;
            A002.invalidateSelf();
        }
    }
}
