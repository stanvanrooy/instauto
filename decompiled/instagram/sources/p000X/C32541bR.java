package p000X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.facebook.C0003R;
import com.instagram.common.p004ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.p009ui.mediaactions.LikeActionView;
import com.instagram.p009ui.mediaactions.MediaActionsView;

/* renamed from: X.1bR  reason: invalid class name and case insensitive filesystem */
public final class C32541bR {
    public C36841ih A00;
    public AnonymousClass1NJ A01;
    public final ViewGroup A02;
    public final C32281at A03;
    public final C32221an A04;
    public final C32551bS A05;
    public final C32271as A06;
    public final LikeActionView A07;
    public final MediaActionsView A08;
    public final ReboundViewPager A09;

    public final View A00() {
        Object tag = this.A09.A0C.getTag();
        if (tag instanceof C44461wC) {
            return ((C44461wC) tag).A02;
        }
        if (tag instanceof AnonymousClass24E) {
            return ((AnonymousClass24E) tag).ANP();
        }
        if (tag instanceof AnonymousClass2Z9) {
            return ((AnonymousClass2Z9) tag).A01;
        }
        throw new IllegalArgumentException("Unsupported type in carousel");
    }

    public C32541bR(View view, AnonymousClass0C1 r4) {
        this.A02 = (ViewGroup) view.findViewById(C0003R.C0005id.carousel_media_group);
        this.A07 = (LikeActionView) view.findViewById(C0003R.C0005id.like_heart);
        this.A08 = (MediaActionsView) view.findViewById(C0003R.C0005id.row_carousel_media_actions);
        this.A04 = new C32221an((ViewStub) view.findViewById(C0003R.C0005id.audio_icon_view_stub));
        this.A09 = (ReboundViewPager) view.findViewById(C0003R.C0005id.carousel_viewpager);
        this.A05 = new C32551bS((ViewStub) view.findViewById(C0003R.C0005id.carousel_index_indicator_stub), r4);
        this.A06 = new C32271as((ViewStub) view.findViewById(C0003R.C0005id.save_to_collection_upsell_view_stub));
        this.A03 = new C32281at((ViewStub) view.findViewById(C0003R.C0005id.branded_content_violation_banner));
    }
}
