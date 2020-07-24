package p000X;

import android.view.View;
import android.widget.FrameLayout;
import com.facebook.C0003R;
import com.instagram.common.p004ui.base.IgSimpleImageView;
import com.instagram.p009ui.widget.emitter.PulseEmitter;
import com.instagram.p009ui.widget.gradientspinner.GradientSpinner;
import com.instagram.p009ui.widget.imageview.PulsingMultiImageView;

/* renamed from: X.1tr  reason: invalid class name and case insensitive filesystem */
public final class C43121tr implements C35751gs {
    public final View A00;
    public final FrameLayout A01;
    public final FrameLayout A02;
    public final IgSimpleImageView A03 = ((IgSimpleImageView) this.A01.findViewById(C0003R.C0005id.tray_double_avatar_background_back));
    public final IgSimpleImageView A04 = ((IgSimpleImageView) this.A01.findViewById(C0003R.C0005id.tray_double_avatar_background_front));
    public final PulseEmitter A05 = ((PulseEmitter) this.A01.findViewById(C0003R.C0005id.tray_double_avatar_pulse_emitter_back));
    public final PulseEmitter A06 = ((PulseEmitter) this.A01.findViewById(C0003R.C0005id.tray_double_avatar_pulse_emitter_front));
    public final GradientSpinner A07 = ((GradientSpinner) this.A01.findViewById(C0003R.C0005id.seen_state_circle_back));
    public final GradientSpinner A08 = ((GradientSpinner) this.A01.findViewById(C0003R.C0005id.seen_state_circle_front));
    public final PulsingMultiImageView A09 = ((PulsingMultiImageView) this.A01.findViewById(C0003R.C0005id.tray_double_avatar_back));
    public final PulsingMultiImageView A0A = ((PulsingMultiImageView) this.A01.findViewById(C0003R.C0005id.tray_double_avatar_front));

    public final View AGS() {
        return this.A0A;
    }

    public C43121tr(View view) {
        this.A01 = (FrameLayout) view.findViewById(C0003R.C0005id.avatar_container);
        this.A02 = (FrameLayout) view.findViewById(C0003R.C0005id.avatar_image_container);
        View findViewById = this.A01.findViewById(C0003R.C0005id.double_avatar_live_badge);
        this.A00 = findViewById;
        findViewById.getViewTreeObserver().addOnPreDrawListener(new C43131ts(this));
    }
}
