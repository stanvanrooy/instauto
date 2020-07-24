package p000X;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.ImageView;

/* renamed from: X.1fE  reason: invalid class name and case insensitive filesystem */
public final class C34741fE {
    public ViewGroup A00;
    public ImageView A01;
    public final C26571Ea A02;

    public static void A00(C34741fE r2, Activity activity, int i, AnonymousClass1RF r5) {
        C56142c0 r1 = new C56142c0(activity, new AnonymousClass95U(i));
        r1.A02(r2.A01);
        r1.A05 = C56162c2.ABOVE_ANCHOR;
        r1.A0C = true;
        r1.A04 = r5;
        r1.A00().A05();
    }

    public C34741fE(C26571Ea r2) {
        this.A02 = r2;
        r2.A03(new C34751fF(this));
    }
}
