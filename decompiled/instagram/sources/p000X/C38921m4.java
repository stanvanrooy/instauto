package p000X;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

/* renamed from: X.1m4  reason: invalid class name and case insensitive filesystem */
public final class C38921m4 implements TransformationMethod {
    public static C38921m4 A01;
    public final Locale A00;

    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
    }

    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.A00);
        }
        return null;
    }

    public C38921m4(Locale locale) {
        this.A00 = locale;
    }
}
