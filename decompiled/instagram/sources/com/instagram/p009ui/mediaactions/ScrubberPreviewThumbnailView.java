package com.instagram.p009ui.mediaactions;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.C0003R;
import com.instagram.p009ui.videothumbnail.ThumbView;
import p000X.C15960no;
import p000X.C1647470w;

/* renamed from: com.instagram.ui.mediaactions.ScrubberPreviewThumbnailView */
public class ScrubberPreviewThumbnailView extends FrameLayout implements C1647470w {
    public LinearLayout A00;
    public TextView A01;
    public ThumbView A02;

    public final void Bof(Bitmap bitmap, Rect rect, int i, int i2, double d) {
        int i3;
        ViewGroup.LayoutParams layoutParams = this.A02.getLayoutParams();
        layoutParams.height = (int) Math.round(((double) layoutParams.width) / d);
        int measuredWidth = getMeasuredWidth();
        int i4 = layoutParams.width >> 1;
        int i5 = (int) (((double) measuredWidth) * ((((double) i) * 1.0d) / ((double) i2)));
        if (i5 < i4) {
            i3 = 0;
        } else if (i5 >= measuredWidth - i4) {
            i3 = measuredWidth - (i4 << 1);
        } else {
            i3 = i5 - i4;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(this.A00.getLayoutParams());
        layoutParams2.gravity = 8388691;
        layoutParams2.leftMargin = i3;
        this.A00.setLayoutParams(layoutParams2);
        this.A01.setText(C15960no.A03((long) i));
        this.A00.setVisibility(0);
        this.A02.A01();
    }

    public ScrubberPreviewThumbnailView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ScrubberPreviewThumbnailView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrubberPreviewThumbnailView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View inflate = LayoutInflater.from(getContext()).inflate(C0003R.layout.scrubber_preview_thumbnail_view, this);
        this.A00 = (LinearLayout) inflate.findViewById(C0003R.C0005id.preview_container);
        this.A02 = (ThumbView) inflate.findViewById(C0003R.C0005id.preview_thumbnail);
        this.A01 = (TextView) inflate.findViewById(C0003R.C0005id.scrubber_timer_text);
        this.A02.A00 = 30;
    }
}
