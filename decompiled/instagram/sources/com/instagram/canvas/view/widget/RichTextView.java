package com.instagram.canvas.view.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import android.widget.TextView;
import com.facebook.react.uimanager.BaseViewManager;
import p000X.AnonymousClass6VT;
import p000X.C25967BdM;
import p000X.C25968BdN;
import p000X.C25969BdO;
import p000X.C25970BdP;
import p000X.C25971BdQ;

public class RichTextView extends TextView {
    public void setText(C25971BdQ bdQ) {
        C25969BdO bdO;
        SpannableString spannableString = new SpannableString(bdQ.AXs());
        for (C25970BdP bdP : bdQ.ANd()) {
            if (!(bdP == null || (bdO = bdP.A02) == null)) {
                int i = C25968BdN.A00[bdO.ordinal()];
                if (i == 1) {
                    StyleSpan styleSpan = new StyleSpan(1);
                    int i2 = bdP.A01;
                    spannableString.setSpan(styleSpan, i2, bdP.A00 + i2, 0);
                } else if (i == 2) {
                    StyleSpan styleSpan2 = new StyleSpan(2);
                    int i3 = bdP.A01;
                    spannableString.setSpan(styleSpan2, i3, bdP.A00 + i3, 0);
                } else if (i == 3) {
                    UnderlineSpan underlineSpan = new UnderlineSpan();
                    int i4 = bdP.A01;
                    spannableString.setSpan(underlineSpan, i4, bdP.A00 + i4, 0);
                } else if (i == 4) {
                    StrikethroughSpan strikethroughSpan = new StrikethroughSpan();
                    int i5 = bdP.A01;
                    spannableString.setSpan(strikethroughSpan, i5, bdP.A00 + i5, 0);
                }
            }
        }
        setText(spannableString);
    }

    public void setTextDescriptor(C25967BdM bdM) {
        Typeface typeface;
        setTextColor(bdM.AXt());
        String AM0 = bdM.AM0();
        if (AnonymousClass6VT.A00.containsKey(AM0)) {
            typeface = (Typeface) AnonymousClass6VT.A00.get(AM0);
        } else {
            typeface = Typeface.DEFAULT;
        }
        setTypeface(typeface);
        setTextSize(2, Float.parseFloat(bdM.AM1()));
        int APX = bdM.APX();
        if (APX <= 0) {
            setMaxLines(Integer.MAX_VALUE);
            setSingleLine(false);
        } else {
            if (APX == 1) {
                setSingleLine(true);
            } else {
                setMaxLines(APX);
            }
            setEllipsize(TextUtils.TruncateAt.END);
        }
        String AP3 = bdM.AP3();
        Context context = getContext();
        int parseInt = (int) ((((float) Integer.parseInt(AP3)) * context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
        if (parseInt <= 0) {
            setLineSpacing(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f);
        } else {
            setLineSpacing((float) (parseInt - (getLineHeight() - ((int) getLineSpacingExtra()))), 1.0f);
        }
    }

    public RichTextView(Context context) {
        super(context);
    }

    public RichTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RichTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
