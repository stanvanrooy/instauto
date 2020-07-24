package p000X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.1f2  reason: invalid class name and case insensitive filesystem */
public final class C34621f2 {
    public final C26571Ea A00;

    public final void A00() {
        C26571Ea r1 = this.A00;
        if (r1.A04() && ((TextView) r1.A01()).getVisibility() == 0) {
            View A01 = this.A00.A01();
            Context context = A01.getContext();
            Animation loadAnimation = AnimationUtils.loadAnimation(context, C0003R.anim.leave_through_bottom);
            loadAnimation.setAnimationListener(new AnonymousClass6Q9(this, A01, context));
            ((TextView) this.A00.A01()).startAnimation(loadAnimation);
        }
    }

    public final void A01(C39941no r10, boolean z, AnonymousClass0C1 r12) {
        String string;
        Object[] objArr;
        int i;
        if (z) {
            TextView textView = (TextView) this.A00.A01();
            AnonymousClass0a4.A07(textView, "Swipe up text is null when being bound to");
            Context context = textView.getContext();
            boolean booleanValue = ((Boolean) AnonymousClass0L6.A02(r12, AnonymousClass0L7.STORY_NEW_CTA_BUTTON, "is_tap_hint_text_enabled", false, (AnonymousClass04H) null)).booleanValue();
            int i2 = C0003R.string.reel_swipe_up_instructions;
            if (booleanValue) {
                i2 = C0003R.string.reel_tap_here_instructions;
            }
            if (r10.A0b()) {
                objArr = new Object[1];
                i = C0003R.string.reel_swipe_up_igtv_deeplink_info;
            } else if (r10.A0i()) {
                objArr = new Object[1];
                i = C0003R.string.reel_swipe_up_profile_shop;
            } else if (r10.A0d()) {
                objArr = new Object[1];
                i = C0003R.string.reel_swipe_up_instagram_shop;
            } else if (r10.A0g()) {
                objArr = new Object[1];
                i = C0003R.string.reel_swipe_up_product_collection;
            } else if (r10.A0h()) {
                objArr = new Object[1];
                i = C0003R.string.reel_swipe_up_product_detail_page;
            } else if (r10.A0Z()) {
                objArr = new Object[1];
                i = C0003R.string.reel_swipe_up_ar_effect_info;
            } else {
                AnonymousClass1UP A01 = C34581ey.A01(r10, context);
                if (A01 != null) {
                    string = A01.A08;
                    if (TextUtils.isEmpty(string) || booleanValue) {
                        if (A01.A00.equals(AnonymousClass1UR.AD_DESTINATION_WEB)) {
                            objArr = new Object[1];
                            i = C0003R.string.reel_swipe_up_weblink_info;
                        }
                    }
                    textView.setText(string);
                    View A012 = this.A00.A01();
                    A012.setVisibility(0);
                    A012.setAlpha(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                    Context context2 = ((TextView) this.A00.A01()).getContext();
                    A012.animate().alpha(1.0f).setDuration((long) context2.getResources().getInteger(C0003R.integer.reel_swipe_up_instructions_animation_length));
                    ((TextView) this.A00.A01()).startAnimation(AnimationUtils.loadAnimation(context2, C0003R.anim.enter_from_bottom));
                }
                string = context.getString(i2, new Object[]{C34581ey.A02(r10, context)});
                textView.setText(string);
                View A0122 = this.A00.A01();
                A0122.setVisibility(0);
                A0122.setAlpha(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                Context context22 = ((TextView) this.A00.A01()).getContext();
                A0122.animate().alpha(1.0f).setDuration((long) context22.getResources().getInteger(C0003R.integer.reel_swipe_up_instructions_animation_length));
                ((TextView) this.A00.A01()).startAnimation(AnimationUtils.loadAnimation(context22, C0003R.anim.enter_from_bottom));
            }
            objArr[0] = context.getString(i);
            string = context.getString(i2, objArr);
            textView.setText(string);
            View A01222 = this.A00.A01();
            A01222.setVisibility(0);
            A01222.setAlpha(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            Context context222 = ((TextView) this.A00.A01()).getContext();
            A01222.animate().alpha(1.0f).setDuration((long) context222.getResources().getInteger(C0003R.integer.reel_swipe_up_instructions_animation_length));
            ((TextView) this.A00.A01()).startAnimation(AnimationUtils.loadAnimation(context222, C0003R.anim.enter_from_bottom));
        }
    }

    public C34621f2(ViewStub viewStub) {
        this.A00 = new C26571Ea(viewStub);
    }
}
