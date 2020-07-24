package com.instagram.direct.p018ui.bannerbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.C0003R;
import com.instagram.common.p004ui.base.IgSimpleImageView;
import p000X.AnonymousClass11J;
import p000X.AnonymousClass1EM;
import p000X.AnonymousClass1LT;

/* renamed from: com.instagram.direct.ui.bannerbutton.BannerButton */
public class BannerButton extends FrameLayout {
    public int A00;
    public int A01;
    public IgSimpleImageView A02;
    public IgSimpleImageView A03;
    public ViewStub A04;
    public ViewStub A05;
    public TextView A06;
    public TextView A07;

    public void setGlyphDrawable(Drawable drawable) {
        IgSimpleImageView igSimpleImageView = this.A03;
        if (igSimpleImageView != null) {
            igSimpleImageView.setVisibility(8);
        }
        if (this.A02 == null) {
            this.A02 = (IgSimpleImageView) this.A04.inflate();
        }
        if (!(this.A01 == -1 || this.A00 == -1)) {
            IgSimpleImageView igSimpleImageView2 = this.A02;
            AnonymousClass11J.A00(igSimpleImageView2);
            ((GradientDrawable) igSimpleImageView2.getBackground()).setColors(new int[]{this.A01, this.A00});
        }
        this.A02.setVisibility(0);
        this.A02.setImageDrawable(drawable);
    }

    public void setIconDrawable(Drawable drawable) {
        IgSimpleImageView igSimpleImageView = this.A02;
        if (igSimpleImageView != null) {
            igSimpleImageView.setVisibility(8);
        }
        if (this.A03 == null) {
            this.A03 = (IgSimpleImageView) this.A05.inflate();
        }
        this.A03.setVisibility(0);
        this.A03.setImageDrawable(drawable);
        if (this.A01 != -1 && this.A00 != -1) {
            Context context = getContext();
            IgSimpleImageView igSimpleImageView2 = this.A03;
            AnonymousClass11J.A00(igSimpleImageView2);
            this.A03.setImageDrawable(AnonymousClass1LT.A09(context, igSimpleImageView2.getDrawable(), this.A01, this.A00));
        }
    }

    private void A00(AttributeSet attributeSet) {
        Context context = getContext();
        inflate(context, C0003R.layout.banner_button_content, this);
        this.A05 = (ViewStub) findViewById(C0003R.C0005id.icon_stub);
        this.A04 = (ViewStub) findViewById(C0003R.C0005id.glyph_stub);
        this.A07 = (TextView) findViewById(C0003R.C0005id.title);
        this.A06 = (TextView) findViewById(C0003R.C0005id.text);
        View findViewById = findViewById(C0003R.C0005id.bottom_divider);
        getContext();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass1EM.A0M);
        this.A01 = obtainStyledAttributes.getColor(4, -1);
        this.A00 = obtainStyledAttributes.getColor(0, -1);
        Drawable drawable = obtainStyledAttributes.getDrawable(3);
        if (drawable != null) {
            setIconDrawable(drawable);
        } else {
            Drawable drawable2 = obtainStyledAttributes.getDrawable(1);
            if (drawable2 != null) {
                setGlyphDrawable(drawable2);
            }
        }
        int i = 0;
        this.A07.setText(obtainStyledAttributes.getResourceId(6, 0));
        this.A06.setText(obtainStyledAttributes.getResourceId(5, 0));
        if (!obtainStyledAttributes.getBoolean(2, false)) {
            i = 8;
        }
        findViewById.setVisibility(i);
    }

    public BannerButton(Context context) {
        super(context);
        A00((AttributeSet) null);
    }

    public BannerButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(attributeSet);
    }

    public BannerButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(attributeSet);
    }

    public void setText(int i) {
        this.A06.setText(i);
    }

    public void setText(CharSequence charSequence) {
        this.A06.setText(charSequence);
    }

    public void setTitle(int i) {
        this.A07.setText(i);
    }

    public void setTitle(CharSequence charSequence) {
        this.A07.setText(charSequence);
    }
}
