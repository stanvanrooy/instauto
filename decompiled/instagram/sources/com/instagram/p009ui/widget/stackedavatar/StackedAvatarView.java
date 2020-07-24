package com.instagram.p009ui.widget.stackedavatar;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.C0003R;
import com.instagram.common.p004ui.widget.imageview.CircularImageView;
import com.instagram.common.typedurl.ImageUrl;
import p000X.AnonymousClass1EM;
import p000X.C124705Vy;
import p000X.C26771Ff;
import p000X.C46361zc;

/* renamed from: com.instagram.ui.widget.stackedavatar.StackedAvatarView */
public class StackedAvatarView extends FrameLayout {
    public CircularImageView A00;
    public int A01;
    public View A02;
    public View A03;
    public ViewGroup A04;
    public CircularImageView A05;
    public boolean A06;

    private void A00(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass1EM.A3T);
        try {
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0003R.dimen.avatar_size_small);
            this.A01 = dimensionPixelSize;
            if (obtainStyledAttributes.hasValue(0)) {
                this.A01 = obtainStyledAttributes.getDimensionPixelSize(0, this.A01);
            }
            this.A06 = obtainStyledAttributes.getBoolean(3, true);
            View inflate = LayoutInflater.from(getContext()).inflate(C0003R.layout.stacked_avatar, this, true);
            this.A00 = (CircularImageView) inflate.findViewById(C0003R.C0005id.avatar_front);
            this.A05 = (CircularImageView) inflate.findViewById(C0003R.C0005id.avatar_back);
            this.A03 = inflate.findViewById(C0003R.C0005id.avatar_front_background);
            this.A02 = inflate.findViewById(C0003R.C0005id.avatar_back_background);
            this.A04 = (ViewGroup) inflate.findViewById(C0003R.C0005id.avatar_front_container);
            if (this.A01 != dimensionPixelSize) {
                this.A00.getLayoutParams().width = this.A01;
                this.A00.getLayoutParams().height = this.A01;
                this.A05.getLayoutParams().width = this.A01;
                this.A05.getLayoutParams().height = this.A01;
                A01(true);
                int dimensionPixelSize2 = this.A01 + (obtainStyledAttributes.getDimensionPixelSize(1, context.getResources().getDimensionPixelSize(C0003R.dimen.stacked_avatar_stroke_size)) << 1);
                this.A03.getLayoutParams().width = dimensionPixelSize2;
                this.A03.getLayoutParams().height = dimensionPixelSize2;
                this.A02.getLayoutParams().width = dimensionPixelSize2;
                this.A02.getLayoutParams().height = dimensionPixelSize2;
            }
            View view = this.A02;
            int i = 0;
            if (!obtainStyledAttributes.getBoolean(2, false)) {
                i = 8;
            }
            view.setVisibility(i);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private void A01(boolean z) {
        int i;
        int i2;
        CircularImageView circularImageView = this.A05;
        int i3 = 8;
        if (z) {
            i3 = 0;
        }
        circularImageView.setVisibility(i3);
        if (z) {
            Resources resources = getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(C0003R.dimen.stacked_avatar_offset_size);
            getResources();
            i = (int) Math.floor((double) ((dimensionPixelSize * this.A01) / resources.getDimensionPixelSize(C0003R.dimen.avatar_size_small)));
            i2 = 0;
        } else {
            i = 0;
            i2 = 17;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(this.A04.getLayoutParams());
        marginLayoutParams.setMargins(i, i, 0, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(marginLayoutParams);
        layoutParams.gravity = i2;
        this.A04.setLayoutParams(layoutParams);
    }

    public void setColorFilterOnFrontIcon(ColorFilter colorFilter) {
        if (this.A00.getDrawable() != null) {
            this.A00.getDrawable().mutate().setColorFilter(colorFilter);
        }
        this.A00.setOnLoadListener(new C124705Vy(this, colorFilter));
    }

    public void setRingColor(int i) {
        ColorFilter A002 = C26771Ff.A00(i);
        this.A03.getBackground().setColorFilter(A002);
        this.A02.getBackground().setColorFilter(A002);
    }

    public void setUrls(ImageUrl imageUrl, ImageUrl imageUrl2) {
        if (!C46361zc.A02(imageUrl)) {
            this.A00.setUrl(imageUrl);
        } else {
            this.A00.A04();
        }
        if (!C46361zc.A02(imageUrl2)) {
            this.A05.setUrl(imageUrl2);
            A01(true);
            return;
        }
        this.A05.A04();
        A01(this.A06);
    }

    public StackedAvatarView(Context context) {
        super(context);
        A00(context, (AttributeSet) null);
    }

    public StackedAvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context, attributeSet);
    }

    public StackedAvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context, attributeSet);
    }
}
