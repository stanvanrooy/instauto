package p000X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: X.1ed  reason: invalid class name and case insensitive filesystem */
public final class C34371ed extends C34381ee {
    public final WeakReference A00;

    public C34371ed(Context context, Resources resources) {
        super(resources);
        this.A00 = new WeakReference(context);
    }

    public final Drawable getDrawable(int i) {
        AnonymousClass1Ah r0;
        Drawable drawable = super.getDrawable(i);
        Context context = (Context) this.A00.get();
        if (!(drawable == null || context == null || (r0 = C25761Ae.A02().A01) == null)) {
            r0.BrM(context, i, drawable);
        }
        return drawable;
    }
}
