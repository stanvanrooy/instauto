package p000X;

import android.view.View;
import android.widget.ImageView;
import com.facebook.C0003R;
import com.instagram.common.p004ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.p009ui.widget.pageindicator.CirclePageIndicator;

/* renamed from: X.CXG */
public final class CXG extends AnonymousClass1ZK {
    public View A00;
    public ImageView A01;
    public CXB A02;
    public ReboundViewPager A03;
    public CirclePageIndicator A04;

    public CXG(View view) {
        super(view);
        this.A00 = view;
        this.A03 = (ReboundViewPager) view.findViewById(C0003R.C0005id.view_pager);
        this.A04 = (CirclePageIndicator) view.findViewById(C0003R.C0005id.carousel_page_indicator);
        this.A01 = (ImageView) view.findViewById(C0003R.C0005id.canvas_right);
    }
}
