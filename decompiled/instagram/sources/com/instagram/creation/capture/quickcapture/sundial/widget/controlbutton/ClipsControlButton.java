package com.instagram.creation.capture.quickcapture.sundial.widget.controlbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.C0003R;
import p000X.AnonymousClass0N0;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1EM;
import p000X.C019000b;

public class ClipsControlButton extends LinearLayout {
    public Drawable A00;
    public Drawable A01;
    public boolean A02;
    public final ImageView A03;
    public final TextView A04;

    private void A00() {
        Drawable drawable;
        ImageView imageView = this.A03;
        if (imageView != null) {
            if (this.A02) {
                drawable = this.A01;
            } else {
                drawable = this.A00;
            }
            imageView.setImageDrawable(drawable);
        }
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.A00 = drawable;
        A00();
    }

    public void setButtonIconSelectedDrawable(Drawable drawable) {
        this.A01 = drawable;
        A00();
    }

    public void setButtonSelected(boolean z) {
        this.A02 = z;
        A00();
    }

    public void setButtonText(String str) {
        TextView textView = this.A04;
        if (textView != null) {
            textView.setText(str);
            this.A04.setSelected(true);
        }
    }

    public ClipsControlButton(Context context) {
        this(context, (AttributeSet) null);
    }

    public ClipsControlButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ClipsControlButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        LayoutInflater.from(getContext()).inflate(C0003R.layout.layout_clips_control_button, this);
        this.A03 = (ImageView) findViewById(C0003R.C0005id.control_button_icon);
        TextView textView = (TextView) findViewById(C0003R.C0005id.control_button_text);
        this.A04 = textView;
        AnonymousClass0a4.A06(this.A03);
        AnonymousClass0a4.A06(textView);
        textView.setTypeface(AnonymousClass0N0.A02());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass1EM.A0k);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.A00 = C019000b.A03(context, resourceId);
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        if (resourceId2 != 0) {
            this.A01 = C019000b.A03(context, resourceId2);
        }
        setButtonText(obtainStyledAttributes.getString(2));
        A00();
        obtainStyledAttributes.recycle();
    }
}
