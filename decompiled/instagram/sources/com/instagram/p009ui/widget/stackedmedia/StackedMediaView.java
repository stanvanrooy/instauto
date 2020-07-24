package com.instagram.p009ui.widget.stackedmedia;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.C0003R;
import com.instagram.common.p004ui.widget.imageview.IgImageView;

/* renamed from: com.instagram.ui.widget.stackedmedia.StackedMediaView */
public class StackedMediaView extends FrameLayout {
    public IgImageView A00;
    public IgImageView A01;

    private void A00() {
        View inflate = LayoutInflater.from(getContext()).inflate(C0003R.layout.stacked_media, this, true);
        this.A01 = (IgImageView) inflate.findViewById(C0003R.C0005id.media_front);
        this.A00 = (IgImageView) inflate.findViewById(C0003R.C0005id.media_back);
    }

    public void setUrls(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            this.A01.setUrl(str);
        } else {
            this.A01.A04();
        }
        if (!TextUtils.isEmpty(str2)) {
            this.A00.setUrl(str2);
        } else {
            this.A00.A04();
        }
    }

    public StackedMediaView(Context context) {
        super(context);
        A00();
    }

    public StackedMediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public StackedMediaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }
}
