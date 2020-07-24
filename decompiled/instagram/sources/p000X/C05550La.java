package p000X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.common.p004ui.widget.imageview.CircularImageView;

/* renamed from: X.0La  reason: invalid class name and case insensitive filesystem */
public final class C05550La extends AnonymousClass2MK {
    public final AnonymousClass1ZK A01(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C13150hy.A02(viewGroup, "parent");
        C13150hy.A02(layoutInflater, "layoutInflater");
        return new AnonymousClass743(viewGroup, layoutInflater);
    }

    public final Class A02() {
        return C207948w6.class;
    }

    public final void A04(C40371oY r4, AnonymousClass1ZK r5) {
        C207948w6 r42 = (C207948w6) r4;
        AnonymousClass743 r52 = (AnonymousClass743) r5;
        C13150hy.A02(r42, "model");
        C13150hy.A02(r52, "holder");
        C13150hy.A02(r42, "model");
        r52.A01.setUrl(r42.A01, "RtcCallParticipantIndicatorViewHolder");
        CircularImageView circularImageView = r52.A01;
        C13150hy.A01(circularImageView, "avatar");
        circularImageView.setAlpha(r42.A00);
        r52.A00.setImageDrawable(r52.A02);
        ImageView imageView = r52.A00;
        int i = 8;
        if (r42.A04) {
            i = 0;
        }
        imageView.setVisibility(i);
        r52.A02.A01 = r42.A03 ? 1 : 0;
    }
}
