package p000X;

import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.C0003R;

/* renamed from: X.1f5  reason: invalid class name and case insensitive filesystem */
public final class C34651f5 {
    public ViewGroup A00;
    public ImageView A01;
    public TextView A02;
    public final ViewStub A03;

    public final void A00() {
        if (this.A00 == null) {
            ViewGroup viewGroup = (ViewGroup) this.A03.inflate();
            this.A00 = viewGroup;
            this.A01 = (ImageView) viewGroup.findViewById(C0003R.C0005id.effect_attribution_icon);
            this.A02 = (TextView) this.A00.findViewById(C0003R.C0005id.effect_attribution_label);
        }
    }

    public C34651f5(ViewStub viewStub) {
        this.A03 = viewStub;
    }
}
