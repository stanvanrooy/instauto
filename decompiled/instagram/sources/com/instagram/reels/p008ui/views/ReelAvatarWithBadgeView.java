package com.instagram.reels.p008ui.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.C0003R;
import com.instagram.common.p004ui.widget.imageview.CornerPunchedImageView;
import com.instagram.common.typedurl.ImageUrl;
import p000X.C019000b;
import p000X.C06220Of;
import p000X.C06400Ox;
import p000X.C26571Ea;

/* renamed from: com.instagram.reels.ui.views.ReelAvatarWithBadgeView */
public class ReelAvatarWithBadgeView extends FrameLayout {
    public Drawable A00;
    public CornerPunchedImageView A01;
    public C26571Ea A02;
    public int A03;
    public final int A04;
    public final boolean A05;

    public final void A00(ImageUrl imageUrl, ImageUrl imageUrl2, int i, int i2, int i3, int i4) {
        CornerPunchedImageView cornerPunchedImageView = this.A01;
        cornerPunchedImageView.setLayoutParams(new FrameLayout.LayoutParams(i, i));
        C06220Of.A0R(cornerPunchedImageView, i2);
        C06220Of.A0S(cornerPunchedImageView, i2);
        CornerPunchedImageView cornerPunchedImageView2 = (CornerPunchedImageView) this.A02.A01();
        cornerPunchedImageView2.setLayoutParams(new FrameLayout.LayoutParams(i, i));
        cornerPunchedImageView2.setPunchOffsetX(i3);
        cornerPunchedImageView2.setPunchOffsetY(i3);
        cornerPunchedImageView2.setPunchRadius(i4);
        setDoubleAvatarUrlsAndVisibility(imageUrl, imageUrl2, (String) null);
    }

    public void setBadgeOffset(int i) {
        this.A03 = i;
        invalidate();
    }

    public void setDoubleAvatarUrlsAndVisibility(ImageUrl imageUrl, ImageUrl imageUrl2, String str) {
        CornerPunchedImageView cornerPunchedImageView = (CornerPunchedImageView) this.A02.A01();
        this.A01.setUrl(imageUrl, str);
        if (imageUrl2 != null) {
            cornerPunchedImageView.setUrl(imageUrl2, str);
        } else {
            cornerPunchedImageView.setPlaceHolderColor(this.A04);
            cornerPunchedImageView.A05();
        }
        this.A01.setVisibility(0);
        cornerPunchedImageView.setVisibility(0);
    }

    public void setFrontAvatarPunchOffsetX(int i) {
        this.A01.setPunchOffsetX(i);
    }

    public void setFrontAvatarPunchOffsetY(int i) {
        this.A01.setPunchOffsetY(i);
    }

    public void setFrontAvatarPunchRadius(int i) {
        this.A01.setPunchRadius(i);
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        this.A01.setScaleType(scaleType);
        C26571Ea r1 = this.A02;
        if (r1.A04()) {
            ((CornerPunchedImageView) r1.A01()).setScaleType(scaleType);
        }
    }

    public void setSingleAvatarUrlAndVisibility(ImageUrl imageUrl, String str) {
        this.A01.setUrl(imageUrl, str);
        this.A01.setVisibility(0);
        this.A02.A02(8);
    }

    public final void dispatchDraw(Canvas canvas) {
        int intrinsicWidth;
        super.dispatchDraw(canvas);
        if (this.A00 != null) {
            canvas.save();
            int width = getWidth();
            float height = (float) ((getHeight() - (this.A00.getIntrinsicHeight() >> 1)) - this.A03);
            if (this.A05) {
                intrinsicWidth = this.A00.getIntrinsicWidth() >> 1;
            } else {
                intrinsicWidth = width - (this.A00.getIntrinsicWidth() >> 1);
            }
            canvas.translate((float) (intrinsicWidth - this.A03), height);
            this.A00.draw(canvas);
            canvas.restore();
        }
    }

    public ReelAvatarWithBadgeView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ReelAvatarWithBadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ReelAvatarWithBadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A05 = C06400Ox.A02(context);
        View inflate = LayoutInflater.from(context).inflate(C0003R.layout.reel_avatar_with_badge_view, this, false);
        addView(inflate);
        this.A01 = (CornerPunchedImageView) inflate.findViewById(C0003R.C0005id.reel_viewer_front_avatar);
        this.A02 = new C26571Ea((ViewStub) inflate.findViewById(C0003R.C0005id.reel_viewer_back_avatar_stub));
        CornerPunchedImageView cornerPunchedImageView = this.A01;
        cornerPunchedImageView.A00 = false;
        cornerPunchedImageView.invalidate();
        this.A04 = C019000b.A00(getContext(), C0003R.color.igds_highlight_background);
        this.A03 = context.getResources().getDimensionPixelSize(C0003R.dimen.reel_avatar_with_badge_badge_offset);
    }
}
