package p000X;

import android.view.View;
import android.widget.TextView;
import com.facebook.C0003R;
import com.instagram.common.p004ui.base.IgSimpleImageView;
import com.instagram.common.p004ui.widget.imageview.RoundedCornerImageView;
import com.instagram.igds.components.button.IgButton;

/* renamed from: X.CR7 */
public final class CR7 extends AnonymousClass1ZK {
    public TextView A00;
    public TextView A01;
    public IgSimpleImageView A02;
    public RoundedCornerImageView A03;
    public IgButton A04;

    public CR7(View view) {
        super(view);
        RoundedCornerImageView roundedCornerImageView = (RoundedCornerImageView) view.findViewById(C0003R.C0005id.collection_image);
        this.A03 = roundedCornerImageView;
        roundedCornerImageView.setBitmapShaderScaleType(C34221eI.CENTER_CROP);
        TextView textView = (TextView) view.findViewById(C0003R.C0005id.collection_name);
        this.A01 = textView;
        textView.getPaint().setFakeBoldText(true);
        this.A00 = (TextView) view.findViewById(C0003R.C0005id.collection_details);
        this.A04 = (IgButton) view.findViewById(C0003R.C0005id.collection_action_button);
        this.A02 = (IgSimpleImageView) view.findViewById(C0003R.C0005id.info_icon);
    }
}
