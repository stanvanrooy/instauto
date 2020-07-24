package p000X;

import android.view.View;
import android.widget.TextView;
import com.facebook.C0003R;

/* renamed from: X.BWX */
public final class BWX extends AnonymousClass1ZK {
    public TextView A00;
    public TextView A01;
    public TextView A02;

    public BWX(View view) {
        super(view);
        this.A01 = (TextView) view.findViewById(C0003R.C0005id.qp_raw_text_body);
        this.A02 = (TextView) view.findViewById(C0003R.C0005id.qp_raw_text_toggle_cta);
        this.A00 = (TextView) view.findViewById(C0003R.C0005id.qp_copy_text_button);
    }
}
