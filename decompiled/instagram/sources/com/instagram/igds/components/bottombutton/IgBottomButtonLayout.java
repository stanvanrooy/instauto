package com.instagram.igds.components.bottombutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.C0003R;
import p000X.AnonymousClass1EM;

public class IgBottomButtonLayout extends LinearLayout {
    public View A00;
    public TextView A01;
    public TextView A02;
    public TextView A03;

    public static void A01(Context context, TypedArray typedArray, int i, TextView textView) {
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId != 0) {
            textView.setText(context.getText(resourceId));
            textView.setVisibility(0);
            return;
        }
        A03(typedArray.getText(i), textView);
    }

    private void A02(Context context, AttributeSet attributeSet) {
        setOrientation(1);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AnonymousClass1EM.A0O, 0, 0);
        if (obtainStyledAttributes.getBoolean(1, false)) {
            inflate(context, C0003R.layout.bottom_button_full_width, this);
            TextView textView = (TextView) findViewById(C0003R.C0005id.bb_primary_action);
            this.A02 = textView;
            A01(context, obtainStyledAttributes, 2, textView);
        } else {
            inflate(context, C0003R.layout.bottom_button_layout, this);
            TextView textView2 = (TextView) findViewById(C0003R.C0005id.bb_primary_action);
            this.A02 = textView2;
            A01(context, obtainStyledAttributes, 2, textView2);
            TextView textView3 = (TextView) findViewById(C0003R.C0005id.bb_secondary_action);
            this.A03 = textView3;
            A01(context, obtainStyledAttributes, 3, textView3);
            TextView textView4 = (TextView) findViewById(C0003R.C0005id.bb_footer);
            this.A01 = textView4;
            A01(context, obtainStyledAttributes, 0, textView4);
            this.A00 = findViewById(C0003R.C0005id.bb_extra_padding);
            A00();
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (r0.getVisibility() == 8) goto L_0x0013;
     */
    private void A00() {
        boolean z;
        if (this.A00 != null) {
            TextView textView = this.A03;
            boolean z2 = true;
            int i = 0;
            if (textView != null) {
                z = false;
            }
            z = true;
            TextView textView2 = this.A01;
            if (!(textView2 == null || textView2.getVisibility() == 8)) {
                z2 = false;
            }
            View view = this.A00;
            if (!z || !z2) {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    public void setFooterText(CharSequence charSequence) {
        TextView textView = this.A01;
        if (textView != null) {
            A03(charSequence, textView);
            A00();
        }
    }

    public void setPrimaryActionOnClickListener(View.OnClickListener onClickListener) {
        this.A02.setOnClickListener(onClickListener);
    }

    public void setPrimaryActionText(CharSequence charSequence) {
        A03(charSequence, this.A02);
    }

    public void setPrimaryButtonEnabled(boolean z) {
        this.A02.setEnabled(z);
        Drawable background = this.A02.getBackground();
        int i = 64;
        if (z) {
            i = 255;
        }
        background.setAlpha(i);
    }

    public void setSecondaryActionOnClickListener(View.OnClickListener onClickListener) {
        TextView textView = this.A03;
        if (textView != null) {
            textView.setOnClickListener(onClickListener);
        }
    }

    public void setSecondaryActionText(CharSequence charSequence) {
        TextView textView = this.A03;
        if (textView != null) {
            A03(charSequence, textView);
            A00();
        }
    }

    public static void A03(CharSequence charSequence, TextView textView) {
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
            return;
        }
        textView.setText(charSequence);
        textView.setVisibility(0);
    }

    public void setPrimaryAction(CharSequence charSequence, View.OnClickListener onClickListener) {
        setPrimaryActionText(charSequence);
        setPrimaryActionOnClickListener(onClickListener);
    }

    public void setSecondaryAction(CharSequence charSequence, View.OnClickListener onClickListener) {
        setSecondaryActionText(charSequence);
        setSecondaryActionOnClickListener(onClickListener);
    }

    public IgBottomButtonLayout(Context context) {
        super(context);
        A02(context, (AttributeSet) null);
    }

    public IgBottomButtonLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A02(context, attributeSet);
    }

    public IgBottomButtonLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A02(context, attributeSet);
    }
}
