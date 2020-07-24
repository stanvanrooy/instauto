package com.instagram.common.p004ui.text;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.os.Build;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import java.util.Locale;
import p000X.AnonymousClass0N0;
import p000X.AnonymousClass19g;
import p000X.AnonymousClass1EM;
import p000X.AnonymousClass1EQ;
import p000X.C06340Or;
import p000X.C11540f8;
import p000X.C38921m4;

/* renamed from: com.instagram.common.ui.text.TitleTextView */
public class TitleTextView extends TextView {
    private void A00(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass1EM.A3o, i, 0);
        boolean z = true;
        boolean z2 = true;
        if (obtainStyledAttributes.hasValue(6)) {
            z2 = !obtainStyledAttributes.getBoolean(6, true);
        }
        if (obtainStyledAttributes.hasValue(4)) {
            z = obtainStyledAttributes.getBoolean(4, true);
        }
        int resourceId = obtainStyledAttributes.getResourceId(3, 0);
        if (resourceId != 0) {
            setContentDescription(context.getText(resourceId));
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        if (resourceId2 != 0) {
            setHint(context.getText(resourceId2));
        }
        int resourceId3 = obtainStyledAttributes.getResourceId(2, 0);
        if (resourceId3 != 0) {
            setImeActionLabel(context.getText(resourceId3), getImeActionId());
        }
        int resourceId4 = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId4 != 0) {
            setText(context.getText(resourceId4));
        }
        obtainStyledAttributes.recycle();
        setIsBold(z2);
        setIsCapitalized(z);
    }

    public void setIsBold(boolean z) {
        Typeface typeface;
        if (Build.VERSION.SDK_INT < 21 || !(!AnonymousClass1EQ.A01.contains(C11540f8.A00().A01().A00.getConfiguration().locale.getLanguage()))) {
            getPaint().setFakeBoldText(z);
            return;
        }
        if (z) {
            typeface = AnonymousClass0N0.A02();
        } else {
            typeface = null;
        }
        setTypeface(typeface);
    }

    public void setIsCapitalized(boolean z) {
        if (z) {
            Locale locale = getResources().getConfiguration().locale;
            C38921m4 r0 = C38921m4.A01;
            if (r0 == null || !r0.A00.equals(locale)) {
                C38921m4.A01 = new C38921m4(locale);
            }
            setTransformationMethod(C38921m4.A01);
            return;
        }
        setTransformationMethod((TransformationMethod) null);
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        CharSequence Aon;
        if (charSequence == null) {
            Aon = null;
        } else {
            Aon = AnonymousClass19g.A00(getContext()).Aon(charSequence, -1);
        }
        super.setText(Aon, bufferType);
    }

    public void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (IndexOutOfBoundsException e) {
            if (!C06340Or.A04(this, getText())) {
                throw e;
            }
        }
    }

    public TitleTextView(Context context) {
        super(context);
        A00(context, (AttributeSet) null, 0);
    }

    public TitleTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context, attributeSet, 0);
    }

    public TitleTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context, attributeSet, i);
    }
}
