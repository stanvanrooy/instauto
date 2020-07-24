package p000X;

import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.C0003R;
import com.instagram.common.p004ui.widget.imageview.CircularImageView;
import com.instagram.p009ui.widget.emitter.PulseEmitter;
import com.instagram.p009ui.widget.gradientspinner.GradientSpinner;
import com.instagram.p009ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.p009ui.widget.imageview.PulsingMultiImageView;

/* renamed from: X.1gt  reason: invalid class name and case insensitive filesystem */
public final class C35761gt implements C35751gs {
    public View A00;
    public View A01;
    public View A02;
    public TextView A03;
    public C35851h2 A04;
    public PulseEmitter A05;
    public GradientSpinnerAvatarView A06;
    public PulsingMultiImageView A07;
    public final ViewStub A08;
    public final ViewStub A09;
    public final ViewStub A0A;
    public final ViewStub A0B;
    public final ViewStub A0C;
    public final FrameLayout A0D;
    public final CircularImageView A0E;
    public final GradientSpinner A0F;

    public final View AGS() {
        PulsingMultiImageView pulsingMultiImageView;
        C35851h2 r0 = this.A04;
        if (r0 == null || !r0.A04 || (pulsingMultiImageView = this.A07) == null) {
            return this.A0E;
        }
        return pulsingMultiImageView;
    }

    public C35761gt(View view) {
        this.A0B = (ViewStub) view.findViewById(C0003R.C0005id.pulse_emitter_stub);
        this.A0C = (ViewStub) view.findViewById(C0003R.C0005id.pulsing_image_view_stub);
        this.A09 = (ViewStub) view.findViewById(C0003R.C0005id.failed_stub);
        this.A0A = (ViewStub) view.findViewById(C0003R.C0005id.live_badge_stub);
        this.A0F = (GradientSpinner) view.findViewById(C0003R.C0005id.seen_state);
        this.A0E = (CircularImageView) view.findViewById(C0003R.C0005id.avatar_image_view);
        this.A0D = (FrameLayout) view.findViewById(C0003R.C0005id.avatar_container);
        this.A08 = (ViewStub) view.findViewById(C0003R.C0005id.double_avatar_stub);
    }
}
