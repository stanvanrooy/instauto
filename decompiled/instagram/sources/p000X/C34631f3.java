package p000X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.C0003R;
import com.instagram.reels.viewer.attribution.CyclingFrameLayout;

/* renamed from: X.1f3  reason: invalid class name and case insensitive filesystem */
public final class C34631f3 {
    public TextView A00;
    public TextView A01;
    public TextView A02;
    public TextView A03;
    public final View A04;
    public final C34651f5 A05;
    public final C34651f5 A06;
    public final C34661f6 A07;
    public final C34641f4 A08;
    public final C34691f9 A09;
    public final CyclingFrameLayout A0A;
    public final C34701fA A0B;
    public final C34721fC A0C;
    public final C34731fD A0D;
    public final C34711fB A0E;
    public final C34681f8 A0F;

    public C34631f3(ViewGroup viewGroup) {
        this.A04 = viewGroup.findViewById(C0003R.C0005id.reel_viewer_header);
        this.A0A = (CyclingFrameLayout) viewGroup.findViewById(C0003R.C0005id.reel_viewer_attribution_frame_layout);
        this.A08 = new C34641f4((ViewStub) viewGroup.findViewById(C0003R.C0005id.reel_app_attribution_subtitle_stub));
        this.A05 = new C34651f5((ViewStub) viewGroup.findViewById(C0003R.C0005id.reel_effect_attribution_subtitle_stub));
        this.A06 = new C34651f5((ViewStub) viewGroup.findViewById(C0003R.C0005id.reel_format_attribution_subtitle_stub));
        this.A07 = new C34661f6((ViewStub) viewGroup.findViewById(C0003R.C0005id.reel_music_attribution_subtitle_stub));
        this.A0F = new C34681f8((ViewStub) viewGroup.findViewById(C0003R.C0005id.reel_video_call_attribution_subtitle_stub));
        this.A09 = new C34691f9((ViewStub) viewGroup.findViewById(C0003R.C0005id.reel_canvas_attribution_subtitle_stub));
        this.A0B = new C34701fA((ViewStub) viewGroup.findViewById(C0003R.C0005id.group_reel_attribution_subtitle_stub));
        this.A0E = new C34711fB((ViewStub) viewGroup.findViewById(C0003R.C0005id.reel_unlockable_sticker_attribution_subtitle_stub));
        this.A0C = new C34721fC((ViewStub) viewGroup.findViewById(C0003R.C0005id.reel_highlights_attribution_subtitle_stub));
        this.A0D = new C34731fD((ViewStub) viewGroup.findViewById(C0003R.C0005id.reel_internal_attribution_subtitle_stub));
    }
}
