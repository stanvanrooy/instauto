package p000X;

import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import com.facebook.C0003R;

/* renamed from: X.CJ1 */
public final class CJ1 {
    public final View A00;
    public final RadioButton A01;
    public final TextView A02;

    public CJ1(View view) {
        this.A00 = view;
        this.A02 = (TextView) view.findViewById(C0003R.C0005id.report_tag_title);
        this.A01 = (RadioButton) view.findViewById(C0003R.C0005id.report_tag_radio_button);
    }
}
