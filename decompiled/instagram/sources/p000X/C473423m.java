package p000X;

import android.content.Context;
import android.os.Build;
import android.view.PointerIcon;

/* renamed from: X.23m  reason: invalid class name and case insensitive filesystem */
public final class C473423m {
    public Object A00;

    public static C473423m A00(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new C473423m(PointerIcon.getSystemIcon(context, 1002));
        }
        return new C473423m((Object) null);
    }

    public C473423m(Object obj) {
        this.A00 = obj;
    }
}
