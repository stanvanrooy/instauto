package p000X;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.C0003R;
import com.instagram.common.p004ui.widget.imageview.IgImageView;

/* renamed from: X.C60 */
public final class C60 implements C32211am {
    public final /* synthetic */ C61 A00;

    public C60(C61 c61) {
        this.A00 = c61;
    }

    public final void B7G(View view) {
        C61 c61 = this.A00;
        c61.A03 = view;
        c61.A00 = view.getContext();
        ViewStub viewStub = (ViewStub) view.findViewById(C0003R.C0005id.fundraiser_sticker_header_avatar_container_top_left_stub);
        viewStub.setLayoutResource(C0003R.layout.profile_header_user_avatar);
        View inflate = viewStub.inflate();
        this.A00.A0D = (IgImageView) inflate.findViewById(C0003R.C0005id.row_profile_header_imageview);
        this.A00.A0D.setVisibility(0);
        inflate.findViewById(C0003R.C0005id.reel_ring).setVisibility(8);
        this.A00.A0A = (TextView) view.findViewById(C0003R.C0005id.fundraiser_sticker_header_full_name);
        this.A00.A05 = (TextView) view.findViewById(C0003R.C0005id.fundraiser_sticker_header_business_category);
        C61 c612 = this.A00;
        c612.A0E = new C26571Ea((ViewStub) c612.A03.findViewById(C0003R.C0005id.fundraiser_sticker_header_metrics));
        C61 c613 = this.A00;
        c613.A04 = c613.A0E.A01().findViewById(C0003R.C0005id.fundraiser_sticker_halfsheet_neue_header_post_count_container);
        C61 c614 = this.A00;
        c614.A01 = c614.A0E.A01().findViewById(C0003R.C0005id.fundraiser_sticker_halfsheet_neue_header_followers_container);
        C61 c615 = this.A00;
        c615.A02 = c615.A0E.A01().findViewById(C0003R.C0005id.fundraiser_sticker_halfsheet_neue_header_following_container);
        C61 c616 = this.A00;
        c616.A0C = (TextView) c616.A04.findViewById(C0003R.C0005id.fundraiser_sticker_halfsheet_neue_header_textview_metric_count);
        C61 c617 = this.A00;
        c617.A0B = (TextView) c617.A04.findViewById(C0003R.C0005id.fundraiser_sticker_halfsheet_neue_header_textview_metric_label);
        C61 c618 = this.A00;
        c618.A07 = (TextView) c618.A01.findViewById(C0003R.C0005id.fundraiser_sticker_halfsheet_neue_header_textview_metric_count);
        C61 c619 = this.A00;
        c619.A06 = (TextView) c619.A01.findViewById(C0003R.C0005id.fundraiser_sticker_halfsheet_neue_header_textview_metric_label);
        C61 c6110 = this.A00;
        c6110.A09 = (TextView) c6110.A02.findViewById(C0003R.C0005id.fundraiser_sticker_halfsheet_neue_header_textview_metric_count);
        C61 c6111 = this.A00;
        c6111.A08 = (TextView) c6111.A02.findViewById(C0003R.C0005id.fundraiser_sticker_halfsheet_neue_header_textview_metric_label);
    }
}
