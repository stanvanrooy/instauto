package p000X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.p004ui.base.IgTextView;
import com.instagram.common.p004ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.common.p004ui.widget.framelayout.MediaFrameLayout;
import com.instagram.common.p004ui.widget.imageview.CornerPunchedImageView;
import com.instagram.common.p004ui.widget.imageview.IgImageView;
import com.instagram.common.p004ui.widget.imageview.RoundedCornerImageView;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.p009ui.simplevideolayout.SimpleVideoLayout;
import com.instagram.p009ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;
import com.instagram.p009ui.widget.segmentedprogressbar.SegmentedProgressBar;
import com.instagram.p009ui.widget.textureview.ScalingTextureView;
import com.instagram.reels.p008ui.badge.ReelBrandingBadgeView;
import com.instagram.reels.p008ui.views.ReelAvatarWithBadgeView;
import com.instagram.reels.viewer.common.ReelViewGroup;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1ei  reason: invalid class name and case insensitive filesystem */
public final class C34421ei extends C34431ej implements C34441ek, C34451el, C34461em, C34471en, C34481eo, C34491ep {
    public ImageView A00;
    public IgTextView A01;
    public C39941no A02;
    public C50282Fr A03;
    public AnonymousClass1OY A04;
    public C476424v A05;
    public C64982sM A06;
    public ReelBrandingBadgeView A07;
    public AnonymousClass420 A08;
    public AnonymousClass2OC A09;
    public boolean A0A = false;
    public final int A0B;
    public final Rect A0C;
    public final View A0D;
    public final View A0E;
    public final View A0F;
    public final View A0G;
    public final View A0H;
    public final View A0I;
    public final View A0J;
    public final ViewStub A0K;
    public final ViewStub A0L;
    public final ViewStub A0M;
    public final TextView A0N;
    public final TextView A0O;
    public final TextView A0P;
    public final ColorFilterAlphaImageView A0Q;
    public final C32231ao A0R;
    public final MediaFrameLayout A0S;
    public final IgImageView A0T;
    public final RoundedCornerImageView A0U;
    public final C26571Ea A0V;
    public final C26571Ea A0W;
    public final C26571Ea A0X;
    public final C26571Ea A0Y;
    public final C26571Ea A0Z;
    public final C26571Ea A0a;
    public final C34761fG A0b;
    public final IgProgressImageView A0c;
    public final C34881fS A0d;
    public final C34981fc A0e;
    public final C34971fb A0f;
    public final C34851fP A0g;
    public final ReelAvatarWithBadgeView A0h;
    public final C34741fE A0i;
    public final C34781fI A0j;
    public final C34791fJ A0k;
    public final C34811fL A0l;
    public final C34831fN A0m;
    public final C34921fW A0n;
    public final C35001fe A0o;
    public final C34951fZ A0p;
    public final C34961fa A0q;
    public final C34891fT A0r;
    public final C34901fU A0s;
    public final C34941fY A0t;
    public final C34841fO A0u;
    public final C34531et A0v;
    public final C34501eq A0w;
    public final C34511er A0x;
    public final C34631f3 A0y;
    public final ReelViewGroup A0z;
    public final RoundedCornerFrameLayout A10;
    public final SegmentedProgressBar A11;
    public final Runnable A12;
    public final AnonymousClass0C1 A13;

    public final void BHd(C64982sM r5, int i) {
        if (i == 1) {
            this.A11.setProgress(r5.A07);
        } else if (i == 2) {
            this.A09.BW4(this.A03, this.A02, r5.A0U);
        }
    }

    public final View A03() {
        return this.A0v.A05;
    }

    public final View A04() {
        return this.A01;
    }

    public final View A05() {
        return this.A0v.A03;
    }

    public final View A06() {
        return this.A0v.A04;
    }

    public final View A07() {
        return this.A0v.A0Z;
    }

    public final View A08() {
        return this.A0v.A0A;
    }

    public final C32231ao A09() {
        return this.A0R;
    }

    public final View A0A() {
        return this.A0v.A0l;
    }

    public final void A0B() {
        C158306pP A002 = this.A0o.A00();
        A002.A03.setVisibility(0);
        A002.A03.setAlpha(1.0f);
        A002.A02 = false;
    }

    public final void A0C() {
        this.A0o.A00().A00();
    }

    public final boolean A0D() {
        C158306pP r4 = this.A0o.A04;
        if (r4 == null) {
            return false;
        }
        boolean z = false;
        if (r4.A03.getVisibility() == 0) {
            z = true;
        }
        r4.A03.setVisibility(8);
        r4.A02 = true;
        return z;
    }

    public final FrameLayout A0E() {
        return this.A0z;
    }

    public final FrameLayout A0F() {
        return this.A0S;
    }

    public final C26571Ea A0G() {
        return this.A0Y;
    }

    public final IgProgressImageView A0H() {
        return this.A0c;
    }

    public final SimpleVideoLayout A0I() {
        return (SimpleVideoLayout) this.A0X.A01();
    }

    public final RoundedCornerFrameLayout A0J() {
        return this.A10;
    }

    public final ScalingTextureView A0K() {
        return (ScalingTextureView) this.A0Z.A01();
    }

    public final void A0L() {
        this.A0c.setVisibility(0);
    }

    public final void A0M(int i) {
        this.A0J.setVisibility(i);
    }

    public final void A0N(boolean z) {
        this.A0c.setVisibility(0);
    }

    public final void A0O() {
        ReelAvatarWithBadgeView reelAvatarWithBadgeView = this.A0h;
        reelAvatarWithBadgeView.A01.A04();
        C26571Ea r1 = reelAvatarWithBadgeView.A02;
        if (r1.A04()) {
            ((CornerPunchedImageView) r1.A01()).A04();
        }
        this.A0P.setText("");
        this.A0O.setText("");
        this.A02 = null;
        this.A06 = null;
        this.A03 = null;
        this.A05 = null;
        this.A0c.A03();
        this.A0T.A04();
        this.A11.setProgress(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        C34531et r12 = this.A0v;
        r12.A0q.setText("");
        r12.A0o.setText("");
        AnonymousClass420 r0 = this.A08;
        if (r0 != null) {
            C58732gR r13 = r0.A00;
            List emptyList = Collections.emptyList();
            AnonymousClass0a4.A09(true);
            r13.A03(new C31571Yv((String) null, emptyList, 0, 0, 0));
        }
    }

    public final AnonymousClass3GL AHU() {
        return this.A0v.AHU();
    }

    public final View ATr() {
        return this.A0g.A05;
    }

    public final void BAC(boolean z) {
        this.A0v.A0z.A01(this.A02, z, this.A13);
    }

    public final void BAD() {
        this.A0v.A0z.A00();
    }

    public final void BHh() {
        C34531et r2 = this.A0v;
        r2.A0J.A0N = false;
        r2.AHU().reset();
        r2.A0y.A00.setVisibility(8);
        r2.A0x.A00();
    }

    public final void Bgb(float f) {
        LinearLayout linearLayout;
        this.A0I.setAlpha(f);
        this.A11.setAlpha(f);
        this.A0E.setAlpha(f);
        C34531et r1 = this.A0v;
        r1.A0c.setAlpha(f);
        r1.A0a.setAlpha(f);
        C158276pM r0 = r1.A0K;
        if (!(r0 == null || (linearLayout = r0.A02) == null)) {
            linearLayout.setAlpha(f);
        }
        View view = r1.A0y.A00;
        if (view != null) {
            view.setAlpha(f);
        }
        r1.A0x.A05.setAlpha(f);
        TextView textView = this.A0v.A0w.A01;
        if (textView != null) {
            textView.setAlpha(f);
        }
        View view2 = this.A0v.A0r.A00;
        if (view2 != null) {
            view2.setAlpha(f);
        }
    }

    public C34421ei(ViewGroup viewGroup, AnonymousClass0C1 r7) {
        this.A13 = r7;
        this.A0w = new C34501eq((ViewStub) viewGroup.findViewById(C0003R.C0005id.media_gating_view_stub));
        this.A0x = new C34511er((ViewStub) viewGroup.findViewById(C0003R.C0005id.media_url_share_interstitial_view_stub));
        C26571Ea r1 = new C26571Ea((ViewStub) viewGroup.findViewById(C0003R.C0005id.reel_viewer_loading_spinner_stub));
        this.A0V = r1;
        r1.A03(new C34521es(this));
        this.A0J = viewGroup.findViewById(C0003R.C0005id.video_loading_spinner);
        this.A0F = viewGroup.findViewById(C0003R.C0005id.header_menu_button);
        this.A11 = (SegmentedProgressBar) viewGroup.findViewById(C0003R.C0005id.reel_viewer_progress_bar);
        View findViewById = viewGroup.findViewById(C0003R.C0005id.back_shadow_affordance);
        this.A0D = findViewById;
        Context context = viewGroup.getContext();
        findViewById.setBackgroundResource(C06400Ox.A02(context) ? C0003R.C0004drawable.reel_viewer_shadow_right : C0003R.C0004drawable.reel_viewer_shadow_left);
        this.A0v = new C34531et((LinearLayout) viewGroup.findViewById(C0003R.C0005id.reel_item_toolbar_container), this.A13);
        this.A10 = (RoundedCornerFrameLayout) viewGroup.findViewById(C0003R.C0005id.reel_viewer_media_layout);
        this.A0z = (ReelViewGroup) viewGroup.findViewById(C0003R.C0005id.reel_view_group);
        this.A0Z = new C26571Ea((ViewStub) viewGroup.findViewById(C0003R.C0005id.reel_viewer_texture_viewstub));
        this.A0X = new C26571Ea((ViewStub) viewGroup.findViewById(C0003R.C0005id.video_container_viewstub));
        this.A0I = viewGroup.findViewById(C0003R.C0005id.reel_viewer_top_shadow);
        this.A0E = viewGroup.findViewById(C0003R.C0005id.reel_viewer_header);
        this.A0G = viewGroup.findViewById(C0003R.C0005id.profile_picture_container);
        ReelAvatarWithBadgeView reelAvatarWithBadgeView = (ReelAvatarWithBadgeView) viewGroup.findViewById(C0003R.C0005id.reel_viewer_profile_picture);
        this.A0h = reelAvatarWithBadgeView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
        reelAvatarWithBadgeView.setScaleType(scaleType);
        RoundedCornerImageView roundedCornerImageView = (RoundedCornerImageView) viewGroup.findViewById(C0003R.C0005id.reel_viewer_effect_icon);
        this.A0U = roundedCornerImageView;
        roundedCornerImageView.setScaleType(scaleType);
        this.A0H = viewGroup.findViewById(C0003R.C0005id.reel_viewer_text_container);
        this.A0P = (TextView) viewGroup.findViewById(C0003R.C0005id.reel_viewer_title);
        this.A0O = (TextView) viewGroup.findViewById(C0003R.C0005id.reel_viewer_timestamp);
        this.A0Y = new C26571Ea((ViewStub) viewGroup.findViewById(C0003R.C0005id.reel_viewer_tall_android_top_bar_stub));
        this.A0y = new C34631f3(viewGroup);
        this.A0N = (TextView) viewGroup.findViewById(C0003R.C0005id.empty_reel_error_message);
        this.A0S = (MediaFrameLayout) viewGroup.findViewById(C0003R.C0005id.reel_viewer_media_container);
        IgProgressImageView igProgressImageView = (IgProgressImageView) viewGroup.findViewById(C0003R.C0005id.reel_viewer_image_view);
        this.A0c = igProgressImageView;
        igProgressImageView.A05.setScaleType(ImageView.ScaleType.CENTER_CROP);
        IgProgressImageView igProgressImageView2 = this.A0c;
        viewGroup.getContext();
        igProgressImageView2.setPlaceHolderColor(C019000b.A00(context, C0003R.color.grey_9));
        IgProgressImageView igProgressImageView3 = this.A0c;
        viewGroup.getContext();
        igProgressImageView3.setProgressBarDrawable(C019000b.A03(context, C0003R.C0004drawable.reel_image_determinate_progress));
        IgProgressImageView igProgressImageView4 = this.A0c;
        viewGroup.getContext();
        igProgressImageView4.setIndeterminateProgressBarDrawable(C019000b.A03(context, C0003R.C0004drawable.reel_image_indeterminate_progress));
        IgImageView igImageView = (IgImageView) viewGroup.findViewById(C0003R.C0005id.reel_viewer_image_view_transition);
        this.A0T = igImageView;
        igImageView.setVisibility(8);
        this.A0T.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.A0a = new C26571Ea((ViewStub) viewGroup.findViewById(C0003R.C0005id.reel_viewer_zero_rating_data_banner_stub));
        this.A0M = (ViewStub) viewGroup.findViewById(C0003R.C0005id.reel_item_confetti_stub);
        this.A0L = (ViewStub) viewGroup.findViewById(C0003R.C0005id.close_friends_badge_stub);
        this.A0K = (ViewStub) viewGroup.findViewById(C0003R.C0005id.branding_badge_stub);
        this.A0i = new C34741fE(new C26571Ea((ViewStub) viewGroup.findViewById(C0003R.C0005id.reel_chat_sticker_stub)));
        C26571Ea r12 = new C26571Ea((ViewStub) viewGroup.findViewById(C0003R.C0005id.reel_hmu_sticker_stub));
        C13150hy.A02(r12, "$this$viewHolder");
        this.A0b = new C34761fG(r12);
        this.A0j = new C34781fI(new C26571Ea((ViewStub) viewGroup.findViewById(C0003R.C0005id.reel_countdown_sticker_stub)));
        this.A0k = new C34791fJ(new C26571Ea((ViewStub) viewGroup.findViewById(C0003R.C0005id.reel_discussion_sticker_stub)));
        this.A0l = new C34811fL(new C26571Ea((ViewStub) viewGroup.findViewById(C0003R.C0005id.reel_event_sticker_stub)));
        this.A0m = new C34831fN(new C26571Ea((ViewStub) viewGroup.findViewById(C0003R.C0005id.reel_fundraiser_sticker_stub)));
        this.A0u = new C34841fO(new C26571Ea((ViewStub) viewGroup.findViewById(C0003R.C0005id.reel_smb_support_sticker_stub)));
        this.A0g = new C34851fP((ViewStub) viewGroup.findViewById(C0003R.C0005id.reel_poll_stub));
        this.A0d = new C34881fS((FrameLayout) viewGroup.findViewById(C0003R.C0005id.reel_bloks_container));
        this.A0r = new C34891fT((ViewStub) viewGroup.findViewById(C0003R.C0005id.reel_question_sticker_stub));
        this.A0s = new C34901fU(new C26571Ea((ViewStub) viewGroup.findViewById(C0003R.C0005id.reel_quiz_sticker_stub)));
        this.A0n = new C34921fW(new C26571Ea((ViewStub) viewGroup.findViewById(C0003R.C0005id.reel_group_polls_sticker_stub)));
        this.A0t = new C34941fY((ViewStub) viewGroup.findViewById(C0003R.C0005id.reel_slider_sticker_stub));
        this.A0p = new C34951fZ((ViewStub) viewGroup.findViewById(C0003R.C0005id.reel_music_sticker_stub));
        ColorFilterAlphaImageView colorFilterAlphaImageView = (ColorFilterAlphaImageView) viewGroup.findViewById(C0003R.C0005id.reel_retry_icon);
        this.A0Q = colorFilterAlphaImageView;
        colorFilterAlphaImageView.setNormalColorFilter(-1);
        this.A0Q.setActiveColorFilter(-16777216);
        this.A0q = new C34961fa((ViewStub) viewGroup.findViewById(C0003R.C0005id.reel_product_sticker_stub), this.A0z, this.A13);
        this.A0f = new C34971fb((ViewStub) viewGroup.findViewById(C0003R.C0005id.reel_item_suggested_highlight_footer));
        this.A0e = new C34981fc((ViewStub) viewGroup.findViewById(C0003R.C0005id.reel_viewer_suggested_highlight_end_card_stub));
        this.A0C = new Rect();
        viewGroup.getContext();
        this.A12 = new C34991fd(this, context.getResources().getDimensionPixelSize(C0003R.dimen.reel_item_close_friends_badge_tap_target_height));
        this.A0R = new C32231ao((ViewStub) viewGroup.findViewById(C0003R.C0005id.media_subtitle_view_stub));
        this.A0o = new C35001fe((ViewStub) viewGroup.findViewById(C0003R.C0005id.reel_identifier_metadata_overlay_stub));
        this.A0W = new C26571Ea((ViewStub) viewGroup.findViewById(C0003R.C0005id.reel_viewer_tray_nux_stub));
        this.A0B = (int) (((float) ((Integer) AnonymousClass0L6.A02(r7, AnonymousClass0L7.REEL_TAP_TARGETS, "sponsored_label_bottom_buffer_dp", 0, (AnonymousClass04H) null)).intValue()) * viewGroup.getResources().getDisplayMetrics().density);
    }
}
