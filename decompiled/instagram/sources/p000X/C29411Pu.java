package p000X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.p004ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.p009ui.recyclerpager.HorizontalRecyclerPager;

/* renamed from: X.1Pu  reason: invalid class name and case insensitive filesystem */
public final class C29411Pu {
    public static boolean A00;

    public static C31711Zp A00(Context context, View view) {
        C31711Zp r2 = new C31711Zp();
        r2.A02 = view.findViewById(C0003R.C0005id.netego_carousel_header);
        r2.A03 = view.findViewById(C0003R.C0005id.top_divider);
        r2.A00 = view.findViewById(C0003R.C0005id.bottom_divider);
        r2.A07 = (TextView) view.findViewById(C0003R.C0005id.netego_carousel_title);
        r2.A06 = (TextView) view.findViewById(C0003R.C0005id.netego_carousel_subtitle);
        ViewStub viewStub = (ViewStub) view.findViewById(C0003R.C0005id.netego_carousel_cta);
        viewStub.setLayoutResource(C0003R.layout.netego_carousel_text_cta);
        r2.A05 = (TextView) viewStub.inflate();
        ConstraintLayout constraintLayout = (ConstraintLayout) ((ViewStub) view.findViewById(C0003R.C0005id.netego_carousel_footer)).inflate();
        r2.A08 = constraintLayout;
        r2.A04 = (TextView) constraintLayout.findViewById(C0003R.C0005id.bottom_cta_text);
        r2.A0A = (HorizontalRecyclerPager) view.findViewById(C0003R.C0005id.netego_carousel_view);
        r2.A01 = view.findViewById(C0003R.C0005id.footer_space);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0003R.dimen.card_spacing);
        if (Build.VERSION.SDK_INT < 21) {
            r2.A07.getPaint().setFakeBoldText(true);
            r2.A05.getPaint().setFakeBoldText(true);
        }
        ViewStub viewStub2 = (ViewStub) view.findViewById(C0003R.C0005id.netego_button_stub);
        viewStub2.setLayoutResource(C0003R.layout.netego_carousel_more_button);
        ColorFilterAlphaImageView colorFilterAlphaImageView = (ColorFilterAlphaImageView) viewStub2.inflate();
        r2.A09 = colorFilterAlphaImageView;
        colorFilterAlphaImageView.setVisibility(8);
        r2.A0A.A0r(new C31721Zq(dimensionPixelSize, dimensionPixelSize));
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(C0003R.dimen.carousel_horizontal_padding);
        HorizontalRecyclerPager horizontalRecyclerPager = r2.A0A;
        horizontalRecyclerPager.setHorizontalPeekOffset(dimensionPixelSize2);
        ((C31331Xq) horizontalRecyclerPager.A0K).A0J();
        return r2;
    }

    public static void A01(C31711Zp r14) {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) r14.A0A.A0L;
        boolean z = false;
        for (int A1g = linearLayoutManager.A1g(); A1g <= linearLayoutManager.A1h(); A1g++) {
            View childAt = r14.A0A.getChildAt(A1g);
            if (childAt != null) {
                View findViewById = childAt.findViewById(C0003R.C0005id.suggested_user_card_new_badge);
                View findViewById2 = childAt.findViewById(C0003R.C0005id.suggested_entity_card_small_circle_new_badge);
                if (!(findViewById == null || findViewById.getVisibility() == 8 || findViewById2 == null || findViewById2.getVisibility() == 0 || C466320g.A00)) {
                    ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(findViewById, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("scaleX", new float[]{1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER}), PropertyValuesHolder.ofFloat("scaleY", new float[]{1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER})});
                    ofPropertyValuesHolder.setDuration(175);
                    ofPropertyValuesHolder.addListener(new C119345Ab(findViewById));
                    ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(findViewById2, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("scaleX", new float[]{BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f}), PropertyValuesHolder.ofFloat("scaleY", new float[]{BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f})});
                    ofPropertyValuesHolder2.setDuration(175);
                    ofPropertyValuesHolder2.addListener(new C119335Aa(findViewById2));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playSequentially(new Animator[]{ofPropertyValuesHolder, ofPropertyValuesHolder2});
                    animatorSet.start();
                    z = true;
                }
            }
        }
        if (!C466320g.A00 && z) {
            C466320g.A00 = true;
        }
    }
}
