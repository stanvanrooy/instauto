package com.instagram.igds.components.snackbar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.C0003R;
import com.instagram.common.p004ui.widget.imageview.IgImageView;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.p009ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import p000X.AnonymousClass46K;

public class IgdsSnackBar extends FrameLayout {
    public FrameLayout A00;
    public TextView A01;
    public IgImageView A02;
    public IgImageView A03;
    public ViewGroup A04;
    public TextView A05;
    public IgImageView A06;
    public IgImageView A07;
    public GradientSpinnerAvatarView A08;

    public static void A01(IgdsSnackBar igdsSnackBar, IgImageView igImageView) {
        igdsSnackBar.A00.setVisibility(0);
        igImageView.setVisibility(0);
    }

    public final void A02() {
        this.A00.setVisibility(8);
        this.A06.setVisibility(8);
        this.A07.setVisibility(8);
        this.A08.setVisibility(8);
        this.A02.setVisibility(8);
        setBackgroundResource(0);
        setMessageText("");
        setButtonTextAndOnClickListener("", (View.OnClickListener) null);
    }

    public void setCircularImageDrawable(Drawable drawable) {
        A01(this, this.A06);
        this.A06.setImageDrawable(drawable);
    }

    public void setCircularImageDrawableRes(int i) {
        A01(this, this.A06);
        this.A06.setImageResource(i);
    }

    public void setCircularImageUri(ImageUrl imageUrl) {
        A01(this, this.A06);
        this.A06.setUrl(imageUrl);
    }

    public void setDoubleAvatarImageDrawable(Drawable drawable, Drawable drawable2) {
        GradientSpinnerAvatarView gradientSpinnerAvatarView = this.A08;
        this.A00.setVisibility(0);
        gradientSpinnerAvatarView.setVisibility(0);
        GradientSpinnerAvatarView gradientSpinnerAvatarView2 = this.A08;
        if (gradientSpinnerAvatarView2.A0L) {
            gradientSpinnerAvatarView2.A0I.setImageDrawable(drawable);
            if (drawable2 == null) {
                gradientSpinnerAvatarView2.A0H.A05();
            } else {
                gradientSpinnerAvatarView2.A0H.setImageDrawable(drawable2);
            }
            gradientSpinnerAvatarView2.A0I.setVisibility(0);
            gradientSpinnerAvatarView2.A0K.setVisibility(0);
            if (2 != gradientSpinnerAvatarView2.A03) {
                gradientSpinnerAvatarView2.A03 = 2;
                GradientSpinnerAvatarView.A01(gradientSpinnerAvatarView2);
                return;
            }
            return;
        }
        throw new IllegalStateException("Params for double avatars were not passed in at initialization time");
    }

    public void setDoubleAvatarImageUri(ImageUrl imageUrl, ImageUrl imageUrl2) {
        GradientSpinnerAvatarView gradientSpinnerAvatarView = this.A08;
        this.A00.setVisibility(0);
        gradientSpinnerAvatarView.setVisibility(0);
        this.A08.A05(imageUrl, imageUrl2, (AnonymousClass46K) null);
    }

    public void setDoubleAvatarRingColor(int i) {
        this.A08.setBackgroundRingColor(i);
    }

    public void setMessageText(String str) {
        this.A01.setText(str);
    }

    public void setSnackBarBackgroundColor(int i) {
        this.A04.setBackgroundColor(i);
    }

    public void setSquareImageDrawable(Drawable drawable) {
        A01(this, this.A07);
        this.A07.setImageDrawable(drawable);
    }

    public void setSquareImageDrawableRes(int i) {
        A01(this, this.A07);
        this.A07.setImageResource(i);
    }

    public void setSquareImageUri(ImageUrl imageUrl) {
        A01(this, this.A07);
        this.A07.setUrl(imageUrl);
    }

    public void setTextColor(int i) {
        this.A01.setTextColor(i);
    }

    private void A00(Context context) {
        LayoutInflater.from(context).inflate(C0003R.layout.igds_snackbar, this);
        this.A04 = (ViewGroup) findViewById(C0003R.C0005id.snackbar_container);
        this.A00 = (FrameLayout) findViewById(C0003R.C0005id.image_container);
        this.A06 = (IgImageView) findViewById(C0003R.C0005id.circular_image);
        this.A07 = (IgImageView) findViewById(C0003R.C0005id.square_image);
        this.A08 = (GradientSpinnerAvatarView) findViewById(C0003R.C0005id.double_avatar_image);
        this.A02 = (IgImageView) findViewById(C0003R.C0005id.error_icon);
        this.A03 = (IgImageView) findViewById(C0003R.C0005id.warning_icon);
        this.A01 = (TextView) findViewById(C0003R.C0005id.snackbar_message);
        this.A05 = (TextView) findViewById(C0003R.C0005id.snackbar_button);
    }

    public void setButtonTextAndOnClickListener(String str, View.OnClickListener onClickListener) {
        boolean z = !TextUtils.isEmpty(str);
        this.A05.setText(str);
        this.A05.setOnClickListener(onClickListener);
        TextView textView = this.A05;
        int i = 8;
        if (z) {
            i = 0;
        }
        textView.setVisibility(i);
    }

    public IgdsSnackBar(Context context) {
        super(context);
        A00(context);
    }

    public IgdsSnackBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context);
    }

    public IgdsSnackBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context);
    }
}
