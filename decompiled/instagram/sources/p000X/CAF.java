package p000X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0003R;
import com.instagram.common.p004ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.CAF */
public final class CAF extends AnonymousClass2MK {
    public final float A00;

    public CAF(float f) {
        this.A00 = f;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass1ZK A01(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(C0003R.layout.media_thumbnail_preview_null_state_item_layout, viewGroup, false);
        ((MediaFrameLayout) AnonymousClass1E1.A07(inflate, C0003R.C0005id.preview_null_state_item)).setAspectRatio(this.A00);
        return new CAI(inflate);
    }

    public final Class A02() {
        return CAJ.class;
    }

    public final void A04(C40371oY r1, AnonymousClass1ZK r2) {
    }
}
