package p000X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.facebook.C0003R;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.facebook.smartcapture.components.ContourView;
import com.facebook.smartcapture.components.DottedAlignmentView;
import com.facebook.smartcapture.components.RectDetectionVisualizerView;
import com.facebook.smartcapture.p011ui.PhotoRequirementsView;
import com.facebook.smartcapture.p011ui.TextTipView;
import com.facebook.smartcapture.view.HelpButton;
import java.util.Map;

/* renamed from: X.C4n */
public final class C4n extends C27239C4g {
    public int A00;
    public int A01;
    public ObjectAnimator A02;
    public ImageButton A03;
    public ImageView A04;
    public ImageView A05;
    public ProgressBar A06;
    public ProgressBar A07;
    public ContourView A08;
    public RectDetectionVisualizerView A09;
    public PhotoRequirementsView A0A;
    public TextTipView A0B;
    public HelpButton A0C;
    public Integer A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public final Animator.AnimatorListener A0H = new C59(this);
    public final Handler A0I = new Handler(Looper.getMainLooper());
    public final View.OnClickListener A0J = new C27248C4y(this);
    public final Runnable A0K = new C5J(this);

    public static void A00(C4n c4n, int i) {
        c4n.A08.post(new C5R(c4n, i));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(753185334);
        View inflate = layoutInflater.inflate(C0003R.layout.default_capture_overlay_fragment, viewGroup, false);
        AnonymousClass0Z0.A09(36369608, A022);
        return inflate;
    }

    public final void onPause() {
        int A022 = AnonymousClass0Z0.A02(1078982505);
        super.onPause();
        DottedAlignmentView dottedAlignmentView = this.A08.A09;
        if (dottedAlignmentView != null) {
            dottedAlignmentView.post(new C213029Gq(dottedAlignmentView));
        }
        AnonymousClass0Z0.A09(-282832122, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0Z0.A02(-2052897385);
        super.onResume();
        RectDetectionVisualizerView rectDetectionVisualizerView = this.A09;
        rectDetectionVisualizerView.A08 = null;
        rectDetectionVisualizerView.postInvalidate();
        AnonymousClass0Z0.A09(-2008896361, A022);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0278, code lost:
        if (r2.isGenericDocumentCaptureEnabled() == false) goto L_0x027a;
     */
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        Drawable A022;
        super.onViewCreated(view, bundle);
        this.A04 = (ImageView) C26970BvZ.A00(view, C0003R.C0005id.iv_chevron_left);
        this.A08 = (ContourView) C26970BvZ.A00(view, C0003R.C0005id.contour_view);
        this.A0B = (TextTipView) C26970BvZ.A00(view, C0003R.C0005id.text_tip_view);
        this.A09 = (RectDetectionVisualizerView) C26970BvZ.A00(view, C0003R.C0005id.rect_detection_visualizer_view);
        this.A03 = (ImageButton) C26970BvZ.A00(view, C0003R.C0005id.btn_shutter);
        this.A06 = (ProgressBar) C26970BvZ.A00(view, C0003R.C0005id.pb_shutter_loading);
        this.A07 = (ProgressBar) C26970BvZ.A00(view, C0003R.C0005id.pb_shutter_motion_sensor_guidance);
        this.A0C = (HelpButton) C26970BvZ.A00(view, C0003R.C0005id.help_button);
        this.A05 = (ImageView) C26970BvZ.A00(view, C0003R.C0005id.iv_fallback_toggle);
        this.A0A = (PhotoRequirementsView) C26970BvZ.A00(view, C0003R.C0005id.photo_requirements_view);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A0F = bundle2.getBoolean("frame_forced_hidden");
        }
        if (this.A03 != null) {
            PhotoRequirementsView photoRequirementsView = this.A0A;
            boolean z2 = this.A0F;
            LayoutInflater from = LayoutInflater.from(photoRequirementsView.getContext());
            View inflate = from.inflate(C0003R.layout.photo_requirements_view, photoRequirementsView, false);
            photoRequirementsView.A00 = inflate;
            LinearLayout linearLayout = (LinearLayout) C26970BvZ.A00(inflate, C0003R.C0005id.photo_requirements_item_container);
            ImageView imageView = (ImageView) C26970BvZ.A00(photoRequirementsView.A00, C0003R.C0005id.iv_photo_requirements_close);
            photoRequirementsView.A01 = imageView;
            imageView.setOnClickListener(new C5F(photoRequirementsView));
            photoRequirementsView.A00.setOnClickListener((View.OnClickListener) null);
            ImageView imageView2 = photoRequirementsView.A01;
            photoRequirementsView.getContext();
            imageView2.setImageDrawable((Drawable) null);
            ViewGroup viewGroup = (ViewGroup) from.inflate(C0003R.layout.photo_requirements_item, linearLayout, false);
            photoRequirementsView.getContext();
            PhotoRequirementsView.A00(C0003R.string.photo_requirements_sheet_v2_info_title1, C0003R.string.photo_requirements_sheet_v2_info_sub_text1, viewGroup);
            linearLayout.addView(viewGroup);
            ViewGroup viewGroup2 = (ViewGroup) from.inflate(C0003R.layout.photo_requirements_item, linearLayout, false);
            photoRequirementsView.getContext();
            PhotoRequirementsView.A00(C0003R.string.photo_requirements_sheet_v2_info_title2, C0003R.string.photo_requirements_sheet_v2_info_sub_text2, viewGroup2);
            linearLayout.addView(viewGroup2);
            if (!z2) {
                ViewGroup viewGroup3 = (ViewGroup) from.inflate(C0003R.layout.photo_requirements_item, linearLayout, false);
                photoRequirementsView.getContext();
                PhotoRequirementsView.A00(C0003R.string.photo_requirements_sheet_v2_info_title3, C0003R.string.photo_requirements_sheet_v2_info_sub_text3, viewGroup3);
                C26970BvZ.A00(viewGroup3, C0003R.C0005id.photo_requirements_item_separator).setVisibility(8);
                linearLayout.addView(viewGroup3);
            } else {
                C26970BvZ.A00(viewGroup2, C0003R.C0005id.photo_requirements_item_separator).setVisibility(8);
            }
            TextTipView textTipView = this.A0B;
            textTipView.A04 = this.A04;
            ImageView imageView3 = textTipView.A00;
            Context context = textTipView.getContext();
            imageView3.setImageDrawable((Drawable) null);
            textTipView.getContext();
            int A002 = C213009Go.A00(context, C0003R.attr.sc_accent);
            textTipView.A05.put(Integer.valueOf(Constants.A0j.intValue()), new C5X(C0003R.string.tip_take_photo_of_id, C0003R.string.tip_entire_id_visible, A002, false));
            textTipView.A05.put(Integer.valueOf(Constants.ONE.intValue()), new C5X(C0003R.string.tip_hold_in_front, 0, A002, false));
            textTipView.A05.put(Integer.valueOf(Constants.A0C.intValue()), new C5X(C0003R.string.tip_move_closer, 0, C213009Go.A00(context, C0003R.attr.sc_warning), false));
            textTipView.A05.put(Integer.valueOf(Constants.A0u.intValue()), new C5X(C0003R.string.tip_capturing, C0003R.string.tip_hold_steady, C213009Go.A00(context, C0003R.attr.sc_positive), false));
            textTipView.A05.put(Integer.valueOf(Constants.A12.intValue()), new C5X(C0003R.string.tip_analysing_photo, 0, A002, true));
            Map map = textTipView.A05;
            map.put(Integer.valueOf(Constants.A14.intValue()), map.get(Integer.valueOf(Constants.A12.intValue())));
            Context requireContext = requireContext();
            Drawable A032 = C019000b.A03(requireContext, C0003R.C0004drawable.instagram_chevron_left_outline_24);
            if (A032 != null) {
                ImageView imageView4 = this.A04;
                if (A032 == null) {
                    A022 = null;
                } else {
                    A022 = C55072a1.A02(A032);
                    C55072a1.A06(A022, C213009Go.A00(requireContext, C0003R.attr.sc_always_white));
                }
                imageView4.setImageDrawable(A022);
            }
            this.A00 = C213009Go.A00(requireContext, C0003R.attr.sc_accent);
            this.A01 = C213009Go.A00(requireContext, C0003R.attr.sc_warning);
            this.A05.setImageDrawable((Drawable) null);
            this.A05.setColorFilter(this.A00);
        }
        AnonymousClass1E1.A0X(this.A05, ColorStateList.valueOf(C213009Go.A00(requireContext(), C0003R.attr.sc_always_white)));
        this.A04.setOnClickListener(new C4j(this));
        this.A0C.setOnClickListener(new C27240C4h(this));
        this.A03.setOnClickListener(new C58(this));
        this.A07.setProgress(0);
        this.A07.setMax(100);
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.A07, ReactProgressBarViewManager.PROP_PROGRESS, new int[]{0, 100});
        this.A02 = ofInt;
        ofInt.setStartDelay(500);
        this.A02.setDuration(2000);
        C5Y c5y = this.A01;
        boolean z3 = true;
        if (c5y != null) {
            z = true;
        }
        z = false;
        this.A0G = z;
        if (c5y == null || !c5y.isFallbackToggleEnabled()) {
            z3 = false;
        }
        if (z) {
            this.A08.setVisibility(8);
            if (z3 && this.A00 != C27238C4f.LOW_END) {
                this.A05.setVisibility(0);
                this.A03.setVisibility(8);
                this.A05.setOnClickListener(this.A0J);
            }
        } else {
            this.A09.setVisibility(8);
            this.A0B.setVisibility(8);
        }
        if (this.A0F) {
            this.A08.setVisibility(8);
        }
        Context context2 = getContext();
        if (context2 != null && C213009Go.A04(context2, C0003R.attr.id_capture_hide_id_placeholder)) {
            this.A08.setIdPlaceholderVisibility(8);
        }
        C213009Go.A03(requireContext(), this.A06);
    }
}
