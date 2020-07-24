package p000X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.instagram.igds.components.switchbutton.IgSwitch;

/* renamed from: X.AOW */
public final class AOW implements AnonymousClass1N6 {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AP0 A01;

    public AOW(AP0 ap0, View view) {
        this.A01 = ap0;
        this.A00 = view;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        AOV aov = (AOV) obj;
        AP0 ap0 = this.A01;
        View view = this.A00;
        AOV aov2 = (AOV) ((AOZ) ap0.A03.getValue()).A00.A02();
        if (aov2 != null) {
            ((LinearLayout) view.findViewById(C0003R.C0005id.payment_container)).removeAllViews();
            int i = 0;
            for (Object next : aov2.A08) {
                int i2 = i + 1;
                if (i < 0) {
                    AnonymousClass10L.A05();
                }
                APS aps = (APS) next;
                Context context = ap0.getContext();
                if (context != null) {
                    C13150hy.A01(context, "context");
                    C23485AOh aOh = new C23485AOh(context);
                    String str = (String) aov2.A07.get(aps.A00());
                    if (str != null) {
                        ImageView imageView = aOh.A01;
                        C23334AIl aIl = aps.A00;
                        if (aIl == null) {
                            C13150hy.A03("supportTier");
                        }
                        imageView.setImageResource(C23332AIj.A00(aIl, false));
                        C13150hy.A01(str, "price");
                        String str2 = aov2.A01;
                        String str3 = aov2.A04;
                        aOh.A02.setText(str);
                        C23485AOh aOh2 = aOh;
                        aOh.A02.setOnClickListener(new AP1(aOh2, ap0, str, aps, str2, str3));
                    }
                    View view2 = aOh.A00;
                    int i3 = 0;
                    if (i == aov2.A08.size() - 1) {
                        i3 = 8;
                    }
                    view2.setVisibility(i3);
                    ((LinearLayout) view.findViewById(C0003R.C0005id.payment_container)).addView(aOh);
                }
                i = i2;
            }
        }
        View view3 = this.A00;
        boolean z = aov.A09;
        int i4 = 0;
        int i5 = 8;
        if (z) {
            i5 = 0;
        }
        if (z) {
            i4 = 8;
        }
        View findViewById = view3.findViewById(C0003R.C0005id.loading_indicator);
        C13150hy.A01(findViewById, "view.findViewById<ImageV…>(R.id.loading_indicator)");
        ((ImageView) findViewById).setVisibility(i5);
        View findViewById2 = view3.findViewById(C0003R.C0005id.description);
        C13150hy.A01(findViewById2, "view.findViewById<TextView>(R.id.description)");
        ((TextView) findViewById2).setVisibility(i4);
        View findViewById3 = view3.findViewById(C0003R.C0005id.payment_container);
        C13150hy.A01(findViewById3, "view.findViewById<Linear…>(R.id.payment_container)");
        ((LinearLayout) findViewById3).setVisibility(i4);
        View findViewById4 = view3.findViewById(C0003R.C0005id.helper_text);
        C13150hy.A01(findViewById4, "view.findViewById<TextView>(R.id.helper_text)");
        ((TextView) findViewById4).setVisibility(i4);
        AP0 ap02 = this.A01;
        View view4 = this.A00;
        AOV aov3 = (AOV) ((AOZ) ap02.A03.getValue()).A00.A02();
        if (aov3 != null) {
            View findViewById5 = view4.findViewById(C0003R.C0005id.title);
            C13150hy.A01(findViewById5, "findViewById<TextView>(R.id.title)");
            ((TextView) findViewById5).setText(aov3.A06);
            View findViewById6 = view4.findViewById(C0003R.C0005id.description);
            C13150hy.A01(findViewById6, "findViewById<TextView>(R.id.description)");
            ((TextView) findViewById6).setText(aov3.A00);
            FragmentActivity activity = ap02.getActivity();
            if (activity != null) {
                C13150hy.A01(activity, "it");
                View findViewById7 = view4.findViewById(C0003R.C0005id.helper_text);
                C13150hy.A01(findViewById7, "findViewById(R.id.helper_text)");
                AnonymousClass4XW.A00(activity, (AnonymousClass0C1) ap02.A05.getValue(), (TextView) findViewById7, aov3.A05, "https://www.facebook.com/help/instagram/2616421785238765", AnonymousClass2UD.LIVE_USER_PAY_VIEWER_LEARN_MORE, ap02.getModuleName());
            }
        }
        AP0 ap03 = this.A01;
        View view5 = this.A00;
        if (((Boolean) ap03.A02.getValue()).booleanValue()) {
            ViewStub viewStub = (ViewStub) view5.findViewById(C0003R.C0005id.mock_payment_stub);
            if (viewStub != null) {
                viewStub.setVisibility(0);
            }
            ((IgSwitch) view5.findViewById(C0003R.C0005id.mock_payment_switch)).setToggleListener(new AQ1(ap03));
        }
    }
}
