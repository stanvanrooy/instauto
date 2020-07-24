package p000X;

import android.view.View;
import android.widget.LinearLayout;
import com.facebook.C0003R;

/* renamed from: X.1gf  reason: invalid class name and case insensitive filesystem */
public final class C35621gf extends AnonymousClass1ZK {
    public C476324u A00;
    public String A01;
    public final View A02;
    public final View A03;
    public final LinearLayout A04;

    public C35621gf(View view) {
        super(view);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(C0003R.C0005id.outer_container);
        this.A04 = linearLayout;
        C33781dU.A00(linearLayout, Constants.ONE);
        this.A02 = view.findViewById(C0003R.C0005id.avatar_container);
        this.A03 = view.findViewById(C0003R.C0005id.badge_label);
    }
}
