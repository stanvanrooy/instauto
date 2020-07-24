package p000X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;

/* renamed from: X.1fH  reason: invalid class name and case insensitive filesystem */
public final class C34771fH implements C32211am {
    public final /* synthetic */ C34761fG A00;

    public C34771fH(C34761fG r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void B7G(View view) {
        ImageView imageView = (ImageView) view;
        C34761fG r1 = this.A00;
        C13150hy.A01(imageView, "view");
        C13150hy.A02(imageView, "<set-?>");
        r1.A01 = imageView;
        C34761fG r12 = this.A00;
        ViewParent parent = r12.A00().getParent();
        if (parent != null) {
            r12.A00 = (ViewGroup) parent;
            return;
        }
        throw new C183227s6("null cannot be cast to non-null type android.view.ViewGroup");
    }
}
