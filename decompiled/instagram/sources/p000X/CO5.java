package p000X;

import android.view.View;
import android.widget.TextView;
import com.facebook.C0003R;
import com.instagram.common.p004ui.base.IgSimpleImageView;
import com.instagram.common.p004ui.widget.imageview.IgImageView;

/* renamed from: X.CO5 */
public final class CO5 {
    public final View A00;
    public final TextView A01;
    public final TextView A02;
    public final IgSimpleImageView A03;
    public final IgImageView A04;

    public CO5(View view) {
        this.A00 = view;
        this.A04 = (IgImageView) view.findViewById(C0003R.C0005id.brand_image);
        this.A02 = (TextView) view.findViewById(C0003R.C0005id.brand_username);
        this.A01 = (TextView) view.findViewById(C0003R.C0005id.brand_full_name);
        this.A03 = (IgSimpleImageView) view.findViewById(C0003R.C0005id.info_icon);
    }
}
