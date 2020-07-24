package p000X;

import android.view.animation.RotateAnimation;
import com.instagram.common.p004ui.widget.imageview.CircularImageView;

/* renamed from: X.AJB */
public final /* synthetic */ class AJB implements C476824z {
    public final /* synthetic */ CircularImageView A00;
    public final /* synthetic */ AJE A01;

    public /* synthetic */ AJB(AJE aje, CircularImageView circularImageView) {
        this.A01 = aje;
        this.A00 = circularImageView;
    }

    public final void onFinish() {
        AJE aje = this.A01;
        CircularImageView circularImageView = this.A00;
        RotateAnimation A002 = AJ0.A00();
        A002.setAnimationListener(new AJC(aje, circularImageView));
        circularImageView.startAnimation(A002);
    }
}
