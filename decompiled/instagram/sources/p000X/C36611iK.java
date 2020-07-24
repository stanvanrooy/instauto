package p000X;

import android.graphics.Matrix;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.C0003R;
import com.instagram.common.p004ui.widget.imageview.ConstrainedImageView;

/* renamed from: X.1iK  reason: invalid class name and case insensitive filesystem */
public final class C36611iK {
    public C36691iS A00;
    public final float A01;
    public final Matrix A02 = new Matrix();
    public final FrameLayout A03;
    public final ConstrainedImageView A04;
    public final ConstrainedImageView A05;
    public final int A06;
    public final int A07;
    public final C35691gm A08;
    public final ConstrainedImageView A09;

    public C36611iK(FrameLayout frameLayout, int i) {
        this.A03 = frameLayout;
        this.A04 = (ConstrainedImageView) frameLayout.findViewById(C0003R.C0005id.item_emoji_bg);
        this.A09 = (ConstrainedImageView) frameLayout.findViewById(C0003R.C0005id.item_emoji);
        this.A05 = (ConstrainedImageView) frameLayout.findViewById(C0003R.C0005id.item_emoji_overlay);
        this.A06 = C06220Of.A0B(this.A09.getContext()).densityDpi;
        this.A07 = i;
        if (C36621iL.A00()) {
            this.A05.setImageResource(C0003R.C0004drawable.right_bottom_triangle);
        }
        C35651gi r1 = new C35651gi(this.A09);
        r1.A0A = true;
        r1.A07 = true;
        r1.A05 = new C36631iM(this);
        this.A08 = r1.A00();
        ViewGroup.LayoutParams layoutParams = this.A04.getLayoutParams();
        int i2 = this.A07;
        layoutParams.width = i2;
        layoutParams.height = i2;
        this.A04.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.A09.getLayoutParams();
        int i3 = this.A07;
        layoutParams2.width = i3;
        layoutParams2.height = i3;
        this.A09.setLayoutParams(layoutParams2);
        ViewGroup.LayoutParams layoutParams3 = this.A05.getLayoutParams();
        int i4 = this.A07;
        layoutParams3.width = i4;
        layoutParams3.height = i4;
        this.A05.setLayoutParams(layoutParams3);
        this.A01 = ((float) this.A07) / ((float) this.A09.getContext().getResources().getDimensionPixelSize(C0003R.dimen.emoji_icon_size));
    }
}
