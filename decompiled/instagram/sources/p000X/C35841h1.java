package p000X;

import android.content.Context;
import android.graphics.ColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.p004ui.widget.imageview.CircularImageView;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;
import com.instagram.p009ui.widget.emitter.PulseEmitter;
import com.instagram.p009ui.widget.gradientspinner.GradientSpinner;
import com.instagram.p009ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.p009ui.widget.imageview.PulsingMultiImageView;
import java.util.List;

/* renamed from: X.1h1  reason: invalid class name and case insensitive filesystem */
public final class C35841h1 {
    public static void A00(C35761gt r4) {
        r4.A0E.A04();
        r4.A0E.setVisibility(8);
        PulseEmitter pulseEmitter = r4.A05;
        if (pulseEmitter != null) {
            pulseEmitter.A02();
            r4.A05.setVisibility(8);
            r4.A07.A0B();
            r4.A07.setVisibility(8);
        }
        View view = r4.A02;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = r4.A01;
        if (view2 != null) {
            view2.setVisibility(4);
        }
        r4.A0E.setColorFilter((ColorFilter) null);
        r4.A0E.setPadding(0, 0, 0, 0);
        CircularImageView circularImageView = r4.A0E;
        circularImageView.setBackgroundColor(C019000b.A00(circularImageView.getContext(), C0003R.color.transparent));
        r4.A0F.setVisibility(8);
        GradientSpinnerAvatarView gradientSpinnerAvatarView = r4.A06;
        if (gradientSpinnerAvatarView != null) {
            gradientSpinnerAvatarView.setVisibility(8);
        }
        View view3 = r4.A02;
        if (view3 != null) {
            view3.setVisibility(8);
        }
        PulseEmitter pulseEmitter2 = r4.A05;
        if (pulseEmitter2 != null) {
            pulseEmitter2.setVisibility(8);
        }
        PulsingMultiImageView pulsingMultiImageView = r4.A07;
        if (pulsingMultiImageView != null) {
            pulsingMultiImageView.setVisibility(8);
        }
    }

    public static void A01(C35761gt r4, C31581Yw r5) {
        View view;
        if (r4.A04.A05) {
            if (r4.A02 == null) {
                View inflate = r4.A0A.inflate();
                r4.A02 = inflate;
                inflate.getViewTreeObserver().addOnPreDrawListener(new C41781qt(r4));
                r4.A03 = (TextView) r4.A02.findViewById(C0003R.C0005id.badge_label);
                r4.A00 = r4.A02.findViewById(C0003R.C0005id.badge_icon);
            }
            r4.A02.setVisibility(0);
            if (r5.A04.A0X()) {
                view = r4.A00;
            } else {
                view = r4.A03;
            }
            C35851h2 r2 = r4.A04;
            boolean z = r2.A06;
            int i = C0003R.C0004drawable.reel_badge_label_background;
            if (z) {
                i = C0003R.C0004drawable.reel_badge_question_and_answer_label_background;
            }
            if (r2.A01) {
                i = C0003R.C0004drawable.reel_badge_label_inactive_background;
            }
            view.setBackgroundResource(i);
            TextView textView = r4.A03;
            if (textView != null) {
                boolean z2 = r4.A04.A06;
                int i2 = C0003R.string.reel_tray_item_live_label;
                if (z2) {
                    i2 = C0003R.string.reel_tray_item_live_question_and_answer_label;
                }
                textView.setText(i2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0095, code lost:
        if (p000X.C35861h3.A01(r10, r9) == false) goto L_0x0097;
     */
    public static void A02(C35761gt r8, C31581Yw r9, AnonymousClass0C1 r10, int i, AnonymousClass0RN r12) {
        boolean z;
        if (r8.A04.A04) {
            if (r8.A05 == null) {
                r8.A05 = (PulseEmitter) r8.A0B.inflate();
                r8.A07 = (PulsingMultiImageView) r8.A0C.inflate();
            }
            r8.A05.setVisibility(0);
            r8.A05.A01();
            r8.A07.setVisibility(0);
            r8.A07.setAnimatingImageUrl(r9.A04.A0A());
            PulsingMultiImageView pulsingMultiImageView = r8.A07;
            pulsingMultiImageView.setContentDescription(pulsingMultiImageView.getResources().getString(C0003R.string.carousel_story_description, new Object[]{r9.A04.A0M.getName(), Integer.valueOf(i)}));
            return;
        }
        String moduleName = r12.getModuleName();
        r8.A0E.setVisibility(0);
        r8.A0E.setScaleX(r8.A04.A00);
        r8.A0E.setScaleY(r8.A04.A00);
        r8.A0E.setScaleType(ImageView.ScaleType.CENTER_CROP);
        r8.A0E.setOnLoadListener(new C36011hI(r8, r9, moduleName, r10));
        if (C35861h3.A02(r10, r9)) {
            z = true;
        }
        z = false;
        if (z) {
            CircularImageView circularImageView = r8.A0E;
            Context context = circularImageView.getContext();
            circularImageView.setImageDrawable(context.getResources().getDrawable(C0003R.C0004drawable.instagram_add_outline_24));
            r8.A0E.setColorFilter(C26771Ff.A00(C019000b.A00(context, C0003R.color.igds_primary_button)));
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0003R.dimen.preview_tray_self_add_to_story_icon_padding);
            r8.A0E.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            r8.A0E.setBackgroundColor(C019000b.A00(context, C0003R.color.igds_icon_on_media));
        } else {
            Reel reel = r9.A04;
            ImageUrl A0A = reel.A0A();
            ImageUrl imageUrl = A0A;
            if (A0A != null) {
                r8.A0E.setUrl(imageUrl, moduleName);
                if (C35861h3.A01(r10, r9)) {
                    CircularImageView circularImageView2 = r8.A0E;
                    Context context2 = circularImageView2.getContext();
                    circularImageView2.A0A(context2.getResources().getDimensionPixelSize(C0003R.dimen.circular_avatar_inner_stroke_width), C019000b.A00(context2, C0003R.color.white));
                }
            } else {
                AnonymousClass0QD.A01("ReelAvatarCommonBinder", AnonymousClass000.A0E("Reel has no cover image. Reel id: ", reel.getId()));
            }
        }
        CircularImageView circularImageView3 = r8.A0E;
        circularImageView3.setContentDescription(circularImageView3.getResources().getString(C0003R.string.carousel_story_description, new Object[]{r9.A04.A0M.getName(), Integer.valueOf(i)}));
    }

    public static void A03(AnonymousClass0C1 r3, C35761gt r4, C31581Yw r5, C31581Yw r6, boolean z) {
        C35851h2 r2 = r4.A04;
        if (r2.A03) {
            GradientSpinner gradientSpinner = r4.A0F;
            if (r2.A02) {
                gradientSpinner.setGradientColors((int) C0003R.style.BroadcastQuestionAndAnswerItemGradientStyle);
            } else {
                gradientSpinner.setGradientColors((int) C0003R.style.BroadcastItemGradientStyle);
            }
            r4.A0F.setRotation(90.0f);
        } else {
            GradientSpinner gradientSpinner2 = r4.A0F;
            if (!gradientSpinner2.A0C()) {
                C35871h4.A01(gradientSpinner2, r5.A04, r3);
                r4.A0F.setRotation(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            }
        }
        if (r6 != null) {
            r6.A00 = r4.A0F.getProgressState();
        }
        C37361jX r1 = r5.A00;
        if (r1 != null) {
            r4.A0F.setProgressState(r1);
        } else if (r5.A04.A0t) {
            r4.A0F.A09();
        } else {
            r4.A0F.A0A();
        }
        if (r5.A05(r3) || z) {
            r4.A0F.A06();
        } else {
            r4.A0F.A04();
        }
        GradientSpinner gradientSpinner3 = r4.A0F;
        gradientSpinner3.setErrorColour(C019000b.A00(gradientSpinner3.getContext(), C0003R.color.igds_error_or_destructive));
        r4.A0F.setVisibility(0);
    }

    public static void A04(AnonymousClass0C1 r5, GradientSpinnerAvatarView gradientSpinnerAvatarView, C31581Yw r7) {
        AnonymousClass11J.A02(r7.A04.A0Z());
        List A00 = AnonymousClass48j.A00(r5, r7.A04);
        gradientSpinnerAvatarView.A05((ImageUrl) A00.get(0), (ImageUrl) A00.get(1), r7.A01);
        if (!gradientSpinnerAvatarView.A07()) {
            gradientSpinnerAvatarView.setGradientColorRes(C0003R.style.GradientPatternStyle);
            gradientSpinnerAvatarView.setRotation(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        }
        if (r7.A01 == null) {
            gradientSpinnerAvatarView.A04();
        }
        if (!r7.A05(r5)) {
            gradientSpinnerAvatarView.setGradientSpinnerActivated(true);
        } else {
            gradientSpinnerAvatarView.setGradientSpinnerActivated(false);
        }
        gradientSpinnerAvatarView.setGradientSpinnerVisible(true);
    }
}
