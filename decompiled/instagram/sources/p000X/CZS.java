package p000X;

import android.view.View;
import android.widget.TextView;
import com.facebook.C0003R;
import com.instagram.common.p004ui.widget.reboundviewpager.ReboundViewPager;

/* renamed from: X.CZS */
public final class CZS {
    public static CZT A00(View view) {
        CZT czt = new CZT();
        czt.A01 = (TextView) view.findViewById(C0003R.C0005id.suggested_user_carousel_title);
        czt.A00 = (TextView) view.findViewById(C0003R.C0005id.suggested_user_carousel_subtitle);
        czt.A02 = (ReboundViewPager) view.findViewById(C0003R.C0005id.netego_rebound_view_pager);
        return czt;
    }
}
