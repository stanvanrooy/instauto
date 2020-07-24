package p000X;

import android.os.Build;
import android.view.View;

/* renamed from: X.23l  reason: invalid class name and case insensitive filesystem */
public abstract class C473323l {
    public final int A00 = 28;
    public final int A01;
    public final Class A02;

    public abstract Object A01(View view);

    public C473323l(int i, Class cls) {
        this.A01 = i;
        this.A02 = cls;
    }

    public final Object A00(View view) {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= this.A00) {
            z = true;
        }
        if (z) {
            return A01(view);
        }
        Object tag = view.getTag(this.A01);
        if (this.A02.isInstance(tag)) {
            return tag;
        }
        return null;
    }
}
