package com.instagram.igds.components.snackbar;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.C0003R;
import com.instagram.common.p004ui.widget.imageview.RoundedCornerImageView;

public class IgdsUploadSnackBar extends FrameLayout {
    public TextView A00;
    public ImageView A01;
    public ProgressBar A02;
    public TextView A03;
    public TextView A04;
    public RoundedCornerImageView A05;

    public final void A01(int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.A02.setProgress(i, true);
        } else {
            this.A02.setProgress(i);
        }
    }

    public void setMediaThumbnailBitmap(Bitmap bitmap) {
        this.A05.setImageBitmap(bitmap);
    }

    public void setMediaThumbnailDrawable(Drawable drawable) {
        this.A05.setImageDrawable(drawable);
    }

    public void setMediaThumbnailDrawableRes(int i) {
        this.A05.setImageResource(i);
    }

    public void setMediaThumbnailUri(String str) {
        this.A05.setUrl(str);
    }

    public void setOverlayVisibility(int i) {
        this.A01.setVisibility(i);
    }

    public void setProgressBarVisibility(int i) {
        this.A02.setVisibility(i);
    }

    private void A00(Context context) {
        LayoutInflater.from(context).inflate(C0003R.layout.igds_upload_snackbar, this);
        this.A05 = (RoundedCornerImageView) findViewById(C0003R.C0005id.media_thumbnail);
        this.A01 = (ImageView) findViewById(C0003R.C0005id.media_thumbnail_overlay);
        this.A04 = (TextView) findViewById(C0003R.C0005id.status_text);
        this.A03 = (TextView) findViewById(C0003R.C0005id.explanation_text);
        this.A02 = (ProgressBar) findViewById(C0003R.C0005id.progress_bar);
        this.A00 = (TextView) findViewById(C0003R.C0005id.upload_snackbar_button);
    }

    public void setButtonTextAndOnClickListener(String str, View.OnClickListener onClickListener) {
        boolean z = !TextUtils.isEmpty(str);
        this.A00.setText(str);
        this.A00.setOnClickListener(onClickListener);
        TextView textView = this.A00;
        int i = 8;
        if (z) {
            i = 0;
        }
        textView.setVisibility(i);
    }

    public IgdsUploadSnackBar(Context context) {
        super(context);
        A00(context);
    }

    public IgdsUploadSnackBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context);
    }

    public IgdsUploadSnackBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context);
    }

    public void setExplanationText(int i) {
        this.A03.setText(i);
        this.A03.setVisibility(0);
    }

    public void setExplanationText(String str) {
        boolean z = !TextUtils.isEmpty(str);
        this.A03.setText(str);
        TextView textView = this.A03;
        int i = 8;
        if (z) {
            i = 0;
        }
        textView.setVisibility(i);
    }

    public void setStatusText(int i) {
        this.A04.setText(i);
    }

    public void setStatusText(String str) {
        this.A04.setText(str);
    }
}
