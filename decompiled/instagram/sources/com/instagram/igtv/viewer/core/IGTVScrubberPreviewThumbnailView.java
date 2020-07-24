package com.instagram.igtv.viewer.core;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.facebook.C0003R;
import com.instagram.p009ui.videothumbnail.ThumbView;
import p000X.C15960no;
import p000X.C1647470w;

public class IGTVScrubberPreviewThumbnailView extends FrameLayout implements C1647470w {
    public FrameLayout A00;
    public SeekBar A01;
    public TextView A02;
    public ThumbView A03;
    public final int[] A04;
    public final int[] A05;

    public final void Bof(Bitmap bitmap, Rect rect, int i, int i2, double d) {
        int measuredWidth;
        int i3;
        int i4;
        int i5;
        int i6;
        ViewGroup.LayoutParams layoutParams = this.A03.getLayoutParams();
        layoutParams.height = (int) Math.round(((double) layoutParams.width) / d);
        SeekBar seekBar = this.A01;
        if (seekBar != null) {
            measuredWidth = seekBar.getMeasuredWidth();
            int i7 = this.A04[0];
            int i8 = this.A05[0];
            i3 = i7 - i8;
            i4 = (i8 + getMeasuredWidth()) - (this.A04[0] + this.A01.getMeasuredWidth());
        } else {
            measuredWidth = getMeasuredWidth();
            i3 = 0;
            i4 = 0;
        }
        int measuredWidth2 = this.A03.getMeasuredWidth() >> 1;
        int i9 = (int) (((double) measuredWidth) * ((((double) i) * 1.0d) / ((double) i2)));
        if (i9 < measuredWidth2 - i3) {
            i6 = 0;
        } else {
            if (i9 >= measuredWidth - (measuredWidth2 - i4)) {
                i5 = i3 + measuredWidth + i4;
                measuredWidth2 <<= 1;
            } else {
                i5 = i3 + i9;
            }
            i6 = i5 - measuredWidth2;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(this.A00.getLayoutParams());
        layoutParams2.gravity = 8388691;
        layoutParams2.leftMargin = i6;
        this.A00.setLayoutParams(layoutParams2);
        this.A02.setText(C15960no.A03((long) i));
        this.A00.setVisibility(0);
        this.A03.A01();
    }

    public void setVideoScrubber(SeekBar seekBar) {
        this.A01 = seekBar;
        if (seekBar != null) {
            seekBar.getLocationInWindow(this.A04);
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        getLocationInWindow(this.A05);
        SeekBar seekBar = this.A01;
        if (seekBar != null) {
            seekBar.getLocationInWindow(this.A04);
        }
    }

    public IGTVScrubberPreviewThumbnailView(Context context) {
        this(context, (AttributeSet) null);
    }

    public IGTVScrubberPreviewThumbnailView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IGTVScrubberPreviewThumbnailView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A05 = new int[2];
        this.A04 = new int[2];
        View inflate = LayoutInflater.from(getContext()).inflate(C0003R.layout.igtv_scrubber_preview_thumbnail_view, this);
        this.A00 = (FrameLayout) inflate.findViewById(C0003R.C0005id.preview_container);
        this.A03 = (ThumbView) inflate.findViewById(C0003R.C0005id.preview_thumbnail);
        this.A02 = (TextView) inflate.findViewById(C0003R.C0005id.scrubber_timer_text);
        this.A03.A00 = 30;
    }
}
