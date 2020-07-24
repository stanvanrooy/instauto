package p000X;

import android.view.animation.RotateAnimation;
import com.instagram.common.p004ui.widget.imageview.CircularImageView;

/* renamed from: X.AJ5 */
public final class AJ5 implements C476824z {
    public final /* synthetic */ C23347AIy A00;
    public final /* synthetic */ AKJ A01;

    public AJ5(C23347AIy aIy, AKJ akj) {
        this.A00 = aIy;
        this.A01 = akj;
    }

    public final void onFinish() {
        RotateAnimation A002 = AJ0.A00();
        A002.setAnimationListener(new AJ6(this));
        ((CircularImageView) this.A00.A02.A01()).startAnimation(A002);
    }
}
