package p000X;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.C0003R;

/* renamed from: X.AMS */
public final class AMS {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public View A08;
    public TextView A09;
    public TextView A0A;
    public final View A0B;
    public final View A0C;
    public final View A0D;

    public AMS(View view, int i, C23444AMr aMr) {
        View findViewById;
        View view2;
        this.A0D = view;
        ViewStub viewStub = (ViewStub) view.findViewById(C0003R.C0005id.iglive_buttons_container_stub);
        if (viewStub != null) {
            viewStub.setLayoutResource(i);
            findViewById = viewStub.inflate();
        } else {
            findViewById = view.findViewById(C0003R.C0005id.iglive_buttons_container);
        }
        this.A0B = findViewById;
        this.A0C = view.findViewById(C0003R.C0005id.comment_composer_post_button);
        if (aMr.A02) {
            View findViewById2 = this.A0D.findViewById(C0003R.C0005id.comment_composer_options_button);
            this.A02 = findViewById2;
            findViewById2.setVisibility(0);
        }
        if (aMr.A05) {
            View findViewById3 = this.A0B.findViewById(C0003R.C0005id.direct_share_button);
            this.A07 = findViewById3;
            findViewById3.setVisibility(0);
        }
        if (aMr.A07) {
            View findViewById4 = this.A0B.findViewById(C0003R.C0005id.camera_switch_button);
            this.A01 = findViewById4;
            findViewById4.setVisibility(0);
        }
        if (aMr.A03) {
            View findViewById5 = this.A0B.findViewById(C0003R.C0005id.heart_button);
            this.A03 = findViewById5;
            findViewById5.setVisibility(0);
        }
        if (aMr.A04) {
            View findViewById6 = this.A0B.findViewById(C0003R.C0005id.invite_cobroadcaster_button_with_badge);
            this.A04 = findViewById6;
            findViewById6.setVisibility(0);
        }
        if (aMr.A01) {
            View findViewById7 = this.A0B.findViewById(C0003R.C0005id.camera_ar_effect_button);
            this.A00 = findViewById7;
            findViewById7.setVisibility(0);
        }
        if (aMr.A00) {
            View view3 = this.A0B;
            int i2 = C0003R.C0005id.qa_mode_button_with_badge;
            if (view3.findViewById(C0003R.C0005id.qa_mode_button_with_badge) != null) {
                view2 = this.A0B;
            } else {
                view2 = this.A0B;
                i2 = C0003R.C0005id.qa_mode_button;
            }
            View findViewById8 = view2.findViewById(i2);
            this.A05 = findViewById8;
            findViewById8.setVisibility(8);
        }
        if (aMr.A06) {
            this.A08 = this.A0B.findViewById(C0003R.C0005id.shopping_button);
        }
    }
}
