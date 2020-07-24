package p000X;

import android.view.View;
import android.widget.TextView;
import com.facebook.C0003R;

/* renamed from: X.BWW */
public final class BWW extends AnonymousClass1ZK {
    public View A00;
    public TextView A01;
    public TextView A02;
    public TextView A03;
    public TextView A04;
    public TextView A05;
    public TextView A06;
    public TextView A07;

    public BWW(View view) {
        super(view);
        this.A07 = (TextView) view.findViewById(C0003R.C0005id.qp_item_title);
        this.A03 = (TextView) view.findViewById(C0003R.C0005id.qp_item_id_value);
        this.A05 = (TextView) view.findViewById(C0003R.C0005id.qp_item_surface_value);
        this.A01 = (TextView) view.findViewById(C0003R.C0005id.qp_item_content_value);
        this.A02 = (TextView) view.findViewById(C0003R.C0005id.qp_item_duration_value);
        this.A06 = (TextView) view.findViewById(C0003R.C0005id.qp_item_surface_info_value);
        this.A04 = (TextView) view.findViewById(C0003R.C0005id.qp_item_qualification_value);
        this.A00 = view.findViewById(C0003R.C0005id.qp_item_preview_button);
    }
}
