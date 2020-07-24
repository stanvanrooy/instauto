package p000X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.C0003R;

/* renamed from: X.AOJ */
public final class AOJ {
    public final View A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final ViewGroup A06;
    public final LinearLayout A07;
    public final TextView A08;
    public final TextView A09;
    public final TextView A0A;
    public final TextView A0B;
    public final TextView A0C;
    public final C72733Gu A0D;
    public final C72733Gu A0E;
    public final C72733Gu A0F;
    public final C72733Gu A0G;

    public AOJ(View view) {
        this.A04 = view;
        this.A07 = (LinearLayout) view.findViewById(C0003R.C0005id.iglive_surface_view_frame);
        this.A00 = view.findViewById(C0003R.C0005id.iglive_capture_on);
        this.A08 = (TextView) view.findViewById(C0003R.C0005id.iglive_connecting_text_view);
        this.A03 = view.findViewById(C0003R.C0005id.iglive_capture_prepare);
        this.A01 = view.findViewById(C0003R.C0005id.iglive_cancel_button);
        this.A06 = (ViewGroup) view.findViewById(C0003R.C0005id.iglive_label_row);
        this.A0E = C72733Gu.A00(view, C0003R.C0005id.iglive_internal_mode_stub);
        this.A02 = view.findViewById(C0003R.C0005id.layout_iglive_header);
        this.A0A = (TextView) view.findViewById(C0003R.C0005id.iglive_label);
        View findViewById = view.findViewById(C0003R.C0005id.iglive_view_count_container);
        this.A05 = findViewById;
        this.A0C = (TextView) findViewById.findViewById(C0003R.C0005id.iglive_view_count);
        this.A09 = (TextView) view.findViewById(C0003R.C0005id.end_button);
        this.A0B = (TextView) view.findViewById(C0003R.C0005id.insta_video_condition_indicator);
        this.A0D = C72733Gu.A00(view, C0003R.C0005id.iglive_capture_paused_stub);
        this.A0F = C72733Gu.A00(view, C0003R.C0005id.iglive_capture_hint_text_stub);
        this.A0G = C72733Gu.A00(view, C0003R.C0005id.iglive_capture_rights_manager_checkpoint_stub);
    }
}
