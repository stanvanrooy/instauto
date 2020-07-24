package p000X;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import com.instagram.common.p004ui.widget.imageview.CircularImageView;

/* renamed from: X.AJ7 */
public final class AJ7 implements C476824z {
    public final /* synthetic */ View A00;
    public final /* synthetic */ CircularImageView A01;
    public final /* synthetic */ C476524w A02;
    public final /* synthetic */ AKB A03;

    public AJ7(AKB akb, CircularImageView circularImageView, View view, C476524w r4) {
        this.A03 = akb;
        this.A01 = circularImageView;
        this.A00 = view;
        this.A02 = r4;
    }

    public final void onFinish() {
        AKB akb = this.A03;
        CircularImageView circularImageView = this.A01;
        View view = this.A00;
        Animation animation = akb.A02;
        if (animation != null) {
            animation.cancel();
        }
        RotateAnimation A002 = AJ0.A00();
        akb.A02 = A002;
        A002.setAnimationListener(new AJ1(akb, view));
        circularImageView.startAnimation(akb.A02);
        this.A03.A0A.remove(this.A02);
    }
}
