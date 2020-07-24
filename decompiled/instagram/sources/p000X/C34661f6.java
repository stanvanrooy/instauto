package p000X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.C0003R;

/* renamed from: X.1f6  reason: invalid class name and case insensitive filesystem */
public final class C34661f6 {
    public C54742Ys A00;
    public ViewGroup A01;
    public ViewStub A02;
    public ImageView A03;
    public TextView A04;
    public final int A05;
    public final Drawable A06;
    public final C34671f7 A07;

    public C34661f6(Context context) {
        Resources resources = context.getResources();
        this.A05 = context.getResources().getDimensionPixelSize(C0003R.dimen.music_attribution_sound_wave_bar_shadow_thickness);
        C34671f7 A002 = C34671f7.A00(resources.getDimensionPixelSize(C0003R.dimen.music_attribution_sound_wave_bar_max_height), 1.0f);
        this.A07 = A002;
        A002.A01(this.A05, C019000b.A00(context, C0003R.color.black_6_transparent));
        Drawable A032 = C019000b.A03(context, C0003R.C0004drawable.music_explicit);
        this.A06 = A032;
        A032.mutate().setColorFilter(C019000b.A00(context, C0003R.color.white_40_transparent), PorterDuff.Mode.SRC_IN);
    }

    public C34661f6(ViewStub viewStub) {
        this(viewStub.getContext());
        this.A02 = viewStub;
    }
}
