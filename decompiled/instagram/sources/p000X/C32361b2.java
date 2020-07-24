package p000X;

import android.view.View;
import android.view.ViewStub;
import com.facebook.C0003R;
import com.instagram.p009ui.widget.pageindicator.CirclePageIndicator;

/* renamed from: X.1b2  reason: invalid class name and case insensitive filesystem */
public final class C32361b2 implements AnonymousClass1RO {
    public C36841ih A00;
    public ViewStub A01;
    public CirclePageIndicator A02;

    public final void BB7(C36841ih r4, int i) {
        CirclePageIndicator circlePageIndicator;
        if (i == 4 && (circlePageIndicator = this.A02) != null) {
            circlePageIndicator.A01(r4.A01, false);
        }
    }

    public C32361b2(View view) {
        this.A02 = (CirclePageIndicator) view.findViewById(C0003R.C0005id.carousel_page_indicator);
    }

    public C32361b2(ViewStub viewStub) {
        this.A01 = viewStub;
    }
}
