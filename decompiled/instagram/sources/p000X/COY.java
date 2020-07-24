package p000X;

import android.view.View;
import android.widget.TextView;
import com.facebook.C0003R;
import com.instagram.common.p004ui.widget.imageview.CircularImageView;

/* renamed from: X.COY */
public final class COY {
    public final View A00;
    public final TextView A01;
    public final TextView A02;
    public final CircularImageView A03;

    public COY(View view) {
        this.A00 = view;
        this.A03 = (CircularImageView) view.findViewById(C0003R.C0005id.row_partner_imageview);
        this.A02 = (TextView) view.findViewById(C0003R.C0005id.row_partner_title);
        this.A01 = (TextView) view.findViewById(C0003R.C0005id.row_partner_subtitle);
    }
}
