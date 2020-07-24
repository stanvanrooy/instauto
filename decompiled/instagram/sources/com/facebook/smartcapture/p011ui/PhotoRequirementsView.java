package com.facebook.smartcapture.p011ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.C0003R;
import p000X.B7F;
import p000X.C26970BvZ;

/* renamed from: com.facebook.smartcapture.ui.PhotoRequirementsView */
public class PhotoRequirementsView extends FrameLayout {
    public View A00;
    public ImageView A01;
    public B7F A02;
    public boolean A03 = false;

    public PhotoRequirementsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static void A00(int i, int i2, ViewGroup viewGroup) {
        ((ImageView) C26970BvZ.A00(viewGroup, C0003R.C0005id.iv_photo_requirements_item_icon)).setVisibility(8);
        ((TextView) C26970BvZ.A00(viewGroup, C0003R.C0005id.tv_photo_requirements_item_title)).setText(i);
        ((TextView) C26970BvZ.A00(viewGroup, C0003R.C0005id.tv_photo_requirements_item_subtext)).setText(i2);
    }
}
