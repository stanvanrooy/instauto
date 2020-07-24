package p000X;

import android.graphics.RectF;
import android.view.View;
import com.facebook.C0003R;
import com.instagram.p009ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.1gb  reason: invalid class name and case insensitive filesystem */
public final class C35581gb extends AnonymousClass1ZK implements C35591gc {
    public final C35741gr A00;
    public final C35601gd A01;

    public final void AbC(float f) {
    }

    public final boolean BnP() {
        return true;
    }

    public final View AGR() {
        return this.A01.A02.A02;
    }

    public final View AGS() {
        return this.A00.AGS();
    }

    public final View ATg() {
        return this.itemView;
    }

    public final String ATm() {
        return this.A01.A02.A01;
    }

    public final GradientSpinner ATs() {
        return this.A00.A06.A0F;
    }

    public final void Bk4(C476324u r2) {
        this.A01.A01 = r2;
    }

    public C35581gb(View view, boolean z) {
        super(view);
        this.A01 = new C35601gd(view, z);
        this.A00 = new C35741gr(view.findViewById(C0003R.C0005id.avatar_container));
    }

    public final RectF AGQ() {
        return C06220Of.A0A(AGS());
    }

    public final void AcW() {
        AGS().setVisibility(4);
    }

    public final void Bo5() {
        AGS().setVisibility(0);
    }
}
