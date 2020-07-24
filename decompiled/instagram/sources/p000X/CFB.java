package p000X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.instagram.igds.components.switchbutton.IgSwitch;

/* renamed from: X.CFB */
public final class CFB extends AnonymousClass1ZK {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public FragmentActivity A05;
    public CD3 A06;
    public CDA A07;
    public IgSwitch A08;
    public AnonymousClass0C1 A09;
    public final C27480CEw A0A;

    public CFB(View view, CD3 cd3, CDA cda, AnonymousClass0C1 r5, FragmentActivity fragmentActivity, C27480CEw cEw) {
        super(view);
        this.A06 = cd3;
        this.A07 = cda;
        this.A09 = r5;
        this.A05 = fragmentActivity;
        this.A04 = view.findViewById(C0003R.C0005id.quick_promote_special_requirement_switch_row);
        this.A02 = view.findViewById(C0003R.C0005id.quick_promote_special_requirement_down_button_row);
        this.A03 = view.findViewById(C0003R.C0005id.quick_promote_special_requirement_down_button_row_divider);
        this.A00 = view.findViewById(C0003R.C0005id.quick_promote_political_ad_switch_row);
        this.A01 = view.findViewById(C0003R.C0005id.quick_promote_regulation_switch_row_divider);
        this.A0A = cEw;
    }
}
