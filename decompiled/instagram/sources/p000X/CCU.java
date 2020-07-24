package p000X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.instagram.p009ui.widget.radiogroup.IgRadioGroup;

/* renamed from: X.CCU */
public final class CCU {
    public String A00;
    public final FragmentActivity A01;
    public final CD3 A02;
    public final IgRadioGroup A03;

    public CCU(View view, CD3 cd3, FragmentActivity fragmentActivity) {
        this.A03 = (IgRadioGroup) view.findViewById(C0003R.C0005id.connect_page_radio_group);
        this.A02 = cd3;
        this.A01 = fragmentActivity;
    }
}
