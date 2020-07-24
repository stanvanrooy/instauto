package p000X;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.1ez  reason: invalid class name and case insensitive filesystem */
public final class C34591ez {
    public final int A00;
    public final long A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final TextView A06;
    public final TextView A07;
    public final AnonymousClass0C1 A08;

    public final void A00() {
        if (this.A00 > 0) {
            this.A05.setVisibility(8);
        }
        if (this.A01 > 0 && !TextUtils.isEmpty(this.A07.getText())) {
            this.A02.setAlpha(1.0f);
            this.A03.setAlpha(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        }
    }

    public C34591ez(View view, AnonymousClass0C1 r6) {
        this.A05 = view;
        this.A02 = AnonymousClass1E1.A07(view, C0003R.C0005id.cta_button);
        this.A07 = (TextView) AnonymousClass1E1.A07(view, C0003R.C0005id.cta_button_text);
        this.A04 = AnonymousClass1E1.A07(view, C0003R.C0005id.cta_chevron);
        this.A08 = r6;
        AnonymousClass0L7 r3 = AnonymousClass0L7.STORY_NEW_CTA_BUTTON;
        this.A01 = ((Double) AnonymousClass0L6.A02(r6, r3, "dwell_time_in_milliseconds", Double.valueOf(0.0d), (AnonymousClass04H) null)).longValue();
        this.A00 = ((Integer) AnonymousClass0L6.A02(r6, r3, "entry_animation_style", 0, (AnonymousClass04H) null)).intValue();
        this.A03 = AnonymousClass1E1.A07(view, C0003R.C0005id.cta_button_post_dwell);
        this.A06 = (TextView) AnonymousClass1E1.A07(view, C0003R.C0005id.cta_button_post_dwell_text);
    }
}
