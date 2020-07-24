package p000X;

import android.view.View;
import com.instagram.common.p004ui.widget.imageview.CircularImageView;

/* renamed from: X.AJD */
public final /* synthetic */ class AJD implements View.OnClickListener {
    public final /* synthetic */ AJE A00;

    public /* synthetic */ AJD(AJE aje) {
        this.A00 = aje;
    }

    public final void onClick(View view) {
        AJE aje = this.A00;
        AJO ajo = aje.A00;
        ajo.schedule(AnonymousClass5FT.A02(ajo.A03, aje.A01, ajo.A01));
        CircularImageView circularImageView = (CircularImageView) aje.A06.A01();
        circularImageView.setUrl(C30941Vv.A01("👋"));
        AJ0.A03(circularImageView, new AJB(aje, circularImageView));
        AJ0.A02(aje.A04);
    }
}
