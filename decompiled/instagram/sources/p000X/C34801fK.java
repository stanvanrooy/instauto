package p000X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* renamed from: X.1fK  reason: invalid class name and case insensitive filesystem */
public final class C34801fK implements C32211am {
    public final /* synthetic */ C34791fJ A00;

    public C34801fK(C34791fJ r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void B7G(View view) {
        ImageView imageView = (ImageView) view;
        C34791fJ r1 = this.A00;
        r1.A01 = imageView;
        r1.A00 = (ViewGroup) imageView.getParent();
    }
}
