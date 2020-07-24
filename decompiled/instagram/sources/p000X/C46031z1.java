package p000X;

import android.content.res.Resources;
import android.text.Html;
import android.text.Spanned;

/* renamed from: X.1z1  reason: invalid class name and case insensitive filesystem */
public final class C46031z1 {
    public static Spanned A02(C477125c r4, String... strArr) {
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            strArr2[i] = Html.escapeHtml(strArr[i]);
        }
        return Html.fromHtml(r4.A74(strArr2));
    }

    public static Spanned A01(Resources resources, int i, String... strArr) {
        return A02(new C477025b(resources, i), strArr);
    }

    public static Spanned A00(Resources resources, int i) {
        return Html.fromHtml(resources.getString(i));
    }
}
