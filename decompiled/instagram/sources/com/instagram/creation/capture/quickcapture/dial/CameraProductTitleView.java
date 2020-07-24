package com.instagram.creation.capture.quickcapture.dial;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.C0003R;
import com.instagram.model.shopping.Product;
import p000X.AnonymousClass1EM;
import p000X.AnonymousClass3In;
import p000X.C019000b;
import p000X.C52952Qw;

public class CameraProductTitleView extends LinearLayout {
    public Drawable A00;
    public boolean A01;
    public int A02;
    public TextView A03;
    public TextView A04;

    public void setProduct(Product product) {
        if (product != null) {
            this.A04.setText(product.A0I.toUpperCase());
            TextView textView = this.A03;
            Context context = getContext();
            Integer valueOf = Integer.valueOf(this.A02);
            textView.setText(TextUtils.concat(new CharSequence[]{" · ", C52952Qw.A01(product, context, valueOf, valueOf)}));
            TextView textView2 = this.A04;
            TextView textView3 = this.A03;
            if (this.A01) {
                textView2.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                textView3.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, this.A00, (Drawable) null);
            }
            this.A04.setGravity(8388611);
            this.A03.setVisibility(0);
            return;
        }
        this.A04.setText(C0003R.string.unavailable_label);
        TextView textView4 = this.A03;
        TextView textView5 = this.A04;
        if (this.A01) {
            textView4.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            textView5.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, this.A00, (Drawable) null);
        }
        this.A04.setGravity(17);
        this.A03.setVisibility(8);
    }

    private void A00(Context context, AttributeSet attributeSet) {
        LayoutInflater.from(context).inflate(C0003R.layout.camera_product_title_view, this);
        this.A04 = (TextView) findViewById(C0003R.C0005id.title);
        this.A03 = (TextView) findViewById(C0003R.C0005id.price);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass1EM.A0a);
            boolean z = obtainStyledAttributes.getBoolean(0, false);
            this.A01 = z;
            if (z) {
                this.A00 = C019000b.A03(context, C0003R.C0004drawable.dial_element_title_chevron);
                this.A03.setCompoundDrawablePadding(context.getResources().getDimensionPixelSize(C0003R.dimen.effect_title_carat_padding));
            }
            if (obtainStyledAttributes.hasValue(1)) {
                int resourceId = obtainStyledAttributes.getResourceId(1, C0003R.style.TextViewStyle);
                this.A02 = resourceId;
                AnonymousClass3In.A06(this.A04, resourceId);
                AnonymousClass3In.A06(this.A03, this.A02);
            }
            obtainStyledAttributes.recycle();
        }
    }

    public CameraProductTitleView(Context context) {
        super(context);
        A00(context, (AttributeSet) null);
    }

    public CameraProductTitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context, attributeSet);
    }
}
