package p000X;

import android.view.ViewStub;
import com.instagram.p009ui.widget.slideouticon.SlideInAndOutIconView;

/* renamed from: X.1an  reason: invalid class name and case insensitive filesystem */
public final class C32221an {
    public SlideInAndOutIconView A00;
    public final ViewStub A01;

    public final SlideInAndOutIconView A00() {
        if (this.A00 == null) {
            SlideInAndOutIconView slideInAndOutIconView = (SlideInAndOutIconView) this.A01.inflate();
            this.A00 = slideInAndOutIconView;
            slideInAndOutIconView.setSlideDirection(C38811lt.END);
        }
        return this.A00;
    }

    public C32221an(ViewStub viewStub) {
        this.A01 = viewStub;
    }
}
