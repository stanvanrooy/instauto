package p000X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import com.facebook.C0003R;
import com.instagram.common.p004ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.DTG */
public final class DTG {
    public final int A00;
    public final int A01;
    public final Drawable A02;
    public final Drawable A03;
    public final GestureDetector A04;
    public final MediaFrameLayout A05;
    public final AnonymousClass1UH A06;
    public final C36411i0 A07;
    public final AnonymousClass1NJ A08;
    public final C36841ih A09;

    public DTG(Context context, AnonymousClass1UH r4, C36411i0 r5, MediaFrameLayout mediaFrameLayout, int i, int i2, AnonymousClass1NJ r9, C36841ih r10) {
        GestureDetector gestureDetector = new GestureDetector(context, new DTH(this));
        this.A04 = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.A06 = r4;
        this.A07 = r5;
        this.A05 = mediaFrameLayout;
        this.A01 = i;
        this.A00 = i2;
        this.A08 = r9;
        this.A09 = r10;
        this.A03 = C019000b.A03(context, C0003R.C0004drawable.bg_dark_grey_gradient);
        this.A02 = C019000b.A03(context, C0003R.C0004drawable.bg_grey_gradient);
    }
}
