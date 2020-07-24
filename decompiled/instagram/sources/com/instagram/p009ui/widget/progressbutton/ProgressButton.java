package com.instagram.p009ui.widget.progressbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.C0003R;
import p000X.AnonymousClass1EM;
import p000X.C06220Of;
import p000X.C26771Ff;

/* renamed from: com.instagram.ui.widget.progressbutton.ProgressButton */
public class ProgressButton extends FrameLayout {
    public Drawable A00;
    public Integer A01;
    public ProgressBar A02;
    public TextView A03;
    public boolean A04;

    private void setTextSize(int i) {
        this.A03.setTextSize(0, (float) i);
    }

    public void setProgressBarColor(int i) {
        this.A02.getIndeterminateDrawable().mutate().setColorFilter(C26771Ff.A00(i));
    }

    public void setShowProgressBar(boolean z) {
        if (this.A04 != z) {
            this.A04 = z;
            ProgressBar progressBar = this.A02;
            int i = 0;
            int i2 = 4;
            if (z) {
                i2 = 0;
            }
            progressBar.setVisibility(i2);
            TextView textView = this.A03;
            if (z) {
                i = 4;
            }
            textView.setVisibility(i);
            if (this.A01 == null) {
                return;
            }
            if (z) {
                this.A00 = getBackground();
                setBackgroundResource(this.A01.intValue());
                return;
            }
            setBackground(this.A00);
            Drawable drawable = this.A00;
            if (drawable != null) {
                drawable.jumpToCurrentState();
            }
            this.A00 = null;
        }
    }

    public void setTextColor(int i) {
        this.A03.setTextColor(i);
    }

    public void setTypeface(int i) {
        this.A03.setTypeface((Typeface) null, i);
    }

    private void A00(Context context, AttributeSet attributeSet) {
        LayoutInflater.from(context).inflate(C0003R.layout.reg_next, this);
        this.A03 = (TextView) findViewById(C0003R.C0005id.button_text);
        this.A02 = (ProgressBar) findViewById(C0003R.C0005id.button_progress);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AnonymousClass1EM.A2x);
            int resourceId = obtainStyledAttributes.getResourceId(2, 0);
            if (resourceId != 0) {
                setText(context.getText(resourceId));
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
            if (dimensionPixelSize == -1) {
                dimensionPixelSize = getResources().getDimensionPixelSize(C0003R.dimen.font_medium);
            }
            setTextSize(dimensionPixelSize);
            if (obtainStyledAttributes.getBoolean(3, false)) {
                this.A03.setSingleLine();
                this.A03.setEllipsize(TextUtils.TruncateAt.END);
            }
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(6, -1);
            if (dimensionPixelSize2 != -1) {
                TextView textView = this.A03;
                C06220Of.A0Y(textView, dimensionPixelSize2, textView.getPaddingTop(), dimensionPixelSize2, this.A03.getPaddingBottom());
            }
            setBackground(obtainStyledAttributes.getDrawable(1));
            if (obtainStyledAttributes.hasValue(5)) {
                setProgressBarColor(obtainStyledAttributes.getColor(5, -65536));
            }
            if (obtainStyledAttributes.hasValue(4)) {
                setProgressBackgroundResource(obtainStyledAttributes.getResourceId(4, -1));
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.A03.setEnabled(z);
    }

    public void setProgressBackgroundResource(int i) {
        this.A01 = Integer.valueOf(i);
    }

    public ProgressButton(Context context) {
        super(context);
        A00(context, (AttributeSet) null);
    }

    public ProgressButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context, attributeSet);
    }

    public ProgressButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context, attributeSet);
    }

    public void setText(int i) {
        this.A03.setText(i);
    }

    public void setText(CharSequence charSequence) {
        this.A03.setText(charSequence);
    }
}
