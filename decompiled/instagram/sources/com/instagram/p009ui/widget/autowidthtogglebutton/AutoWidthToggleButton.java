package com.instagram.p009ui.widget.autowidthtogglebutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import com.instagram.igds.components.button.IgButton;
import p000X.AnonymousClass1EM;
import p000X.AnonymousClass96C;
import p000X.C13150hy;

/* renamed from: com.instagram.ui.widget.autowidthtogglebutton.AutoWidthToggleButton */
public final class AutoWidthToggleButton extends IgButton {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public boolean A05;

    private final void A00(String str) {
        if (str != null) {
            if (this.A02 != null) {
                TextView textView = this.A06;
                C13150hy.A01(textView, "mTextView");
                float measureText = textView.getPaint().measureText(str);
                TextView textView2 = this.A06;
                C13150hy.A01(textView2, "mTextView");
                if (Float.compare(measureText, textView2.getPaint().measureText(this.A02)) <= 0) {
                    return;
                }
            }
            this.A02 = str;
        }
    }

    public final void onMeasure(int i, int i2) {
        String str;
        setText(this.A02);
        super.onMeasure(i, i2);
        if (this.A05) {
            str = this.A04;
        } else {
            str = this.A03;
        }
        setText(str);
    }

    public final void setContentDescriptionOff(String str) {
        this.A00 = str;
        if (!this.A05) {
            setContentDescription(str);
        }
    }

    public final void setContentDescriptionOn(String str) {
        this.A01 = str;
        if (this.A05) {
            setContentDescription(str);
        }
    }

    public final void setTextOff(String str) {
        this.A03 = str;
        if (!this.A05) {
            setText(str);
        }
        A00(str);
        invalidate();
    }

    public final void setTextOn(String str) {
        this.A04 = str;
        if (this.A05) {
            setText(str);
        }
        A00(str);
        invalidate();
    }

    public final void setToggled(boolean z) {
        AnonymousClass96C r0;
        String str;
        String str2;
        this.A05 = z;
        if (z) {
            r0 = AnonymousClass96C.LABEL;
        } else {
            r0 = AnonymousClass96C.LABEL_EMPHASIZED;
        }
        setStyle(r0);
        if (z) {
            str = this.A04;
        } else {
            str = this.A03;
        }
        setText(str);
        if (z) {
            str2 = this.A01;
        } else {
            str2 = this.A00;
        }
        setContentDescription(str2);
        invalidate();
    }

    public final String getContentDescriptionOff() {
        return this.A00;
    }

    public final String getContentDescriptionOn() {
        return this.A01;
    }

    public final String getTextOff() {
        return this.A03;
    }

    public final String getTextOn() {
        return this.A04;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AutoWidthToggleButton(Context context) {
        this(context, (AttributeSet) null);
        C13150hy.A02(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AutoWidthToggleButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C13150hy.A02(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AutoWidthToggleButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C13150hy.A02(context, "context");
        Context context2 = getContext();
        C13150hy.A01(context2, "getContext()");
        TypedArray obtainStyledAttributes = context2.getTheme().obtainStyledAttributes(attributeSet, AnonymousClass1EM.A0K, i, 0);
        try {
            setToggled(obtainStyledAttributes.getBoolean(2, false));
            setTextOn(obtainStyledAttributes.getString(4));
            setTextOff(obtainStyledAttributes.getString(3));
            setContentDescriptionOn(obtainStyledAttributes.getString(1));
            setContentDescriptionOff(obtainStyledAttributes.getString(0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
