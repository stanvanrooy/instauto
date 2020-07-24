package p000X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.instagram.p009ui.widget.radiogroup.IgRadioGroup;
import java.util.Arrays;

/* renamed from: X.CCL */
public final class CCL {
    public final FragmentActivity A00;
    public final CD3 A01;
    public final CDA A02;
    public final IgRadioGroup A03;

    public CCL(View view, CD3 cd3, CDA cda, FragmentActivity fragmentActivity) {
        this.A00 = fragmentActivity;
        this.A03 = (IgRadioGroup) view.findViewById(C0003R.C0005id.special_requirement_radio_group);
        this.A01 = cd3;
        this.A02 = cda;
        for (CC7 cc7 : Arrays.asList(CC7.values())) {
            if (!(cc7 == CC7.A06 || cc7 == CC7.POLITICAL)) {
                IgRadioGroup igRadioGroup = this.A03;
                CCK cck = new CCK(this.A00, true);
                switch (cc7.ordinal()) {
                    case 1:
                        cck.setPrimaryText(cc7.A00);
                        cck.setSecondaryText((int) C0003R.string.promote_special_requirement_bottom_sheet_credit_subtitle);
                        break;
                    case 2:
                        cck.setPrimaryText(cc7.A00);
                        cck.setSecondaryText((int) C0003R.string.promote_special_requirement_bottom_sheet_employment_subtitle);
                        break;
                    case 3:
                        cck.setPrimaryText(cc7.A00);
                        cck.setSecondaryText((int) C0003R.string.promote_special_requirement_bottom_sheet_housing_subtitle);
                        break;
                }
                cck.A3h(new CCM(this, cc7));
                cck.A01(true);
                igRadioGroup.addView(cck);
            }
        }
    }
}
