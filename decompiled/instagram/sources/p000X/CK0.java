package p000X;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.facebook.C0003R;
import com.instagram.p009ui.widget.inlineerror.InlineErrorMessageView;

/* renamed from: X.CK0 */
public final class CK0 implements C27637CLe {
    public View A00;
    public CheckBox A01;
    public TextView A02;
    public C28631Ck9 A03;
    public InlineErrorMessageView A04;
    public final String A05;

    public final void A8f() {
        this.A04.A05();
    }

    public final void BdL() {
        this.A02.post(new CK1(this));
    }

    public final void BoD() {
        this.A04.A06(this.A05);
    }

    public CK0(View view) {
        this.A04 = (InlineErrorMessageView) view.findViewById(C0003R.C0005id.checkbox_error_view);
        this.A02 = (TextView) view.findViewById(C0003R.C0005id.text_view);
        this.A01 = (CheckBox) view.findViewById(C0003R.C0005id.check_box);
        this.A00 = view.findViewById(C0003R.C0005id.checkbox_separator);
        this.A02.setFocusable(true);
        this.A02.setFocusableInTouchMode(true);
        this.A05 = view.getResources().getString(C0003R.string.lead_ad_custom_disclaimer_checkbox_error);
    }
}
