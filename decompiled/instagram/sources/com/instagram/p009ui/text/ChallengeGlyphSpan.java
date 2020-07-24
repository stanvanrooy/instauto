package com.instagram.p009ui.text;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import com.facebook.react.uimanager.BaseViewManager;
import p000X.AnonymousClass0N4;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass7XE;
import p000X.C05900Mx;
import p000X.C120125Dh;

/* renamed from: com.instagram.ui.text.ChallengeGlyphSpan */
public class ChallengeGlyphSpan extends CustomTypefaceSpan {
    public final float A00;
    public final float A01;

    private void A00(TextPaint textPaint) {
        textPaint.setLinearText(true);
        textPaint.setSubpixelText(true);
        textPaint.setTextSize(this.A01 * textPaint.getTextSize());
        if (Build.VERSION.SDK_INT >= 21) {
            textPaint.setLetterSpacing(this.A00);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public ChallengeGlyphSpan(Context context, AnonymousClass7XE r5) {
        super(r0);
        float f;
        Typeface A012 = C05900Mx.A05.A00(context).A01(AnonymousClass0N4.CHALLENGES_GLYPH_REGULAR);
        AnonymousClass0a4.A06(A012);
        int intValue = r5.A06.intValue();
        switch (intValue) {
            case 0:
                f = 0.83f;
                break;
            case 2:
                f = 0.42f;
                break;
            case 3:
            case C120125Dh.VIEW_TYPE_SPINNER:
                f = 0.79f;
                break;
            case 4:
                f = 0.6f;
                break;
            default:
                f = 0.64f;
                break;
        }
        this.A01 = f;
        this.A00 = intValue != 3 ? BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER : 0.1f;
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        A00(textPaint);
    }

    public final void updateMeasureState(TextPaint textPaint) {
        super.updateMeasureState(textPaint);
        A00(textPaint);
    }
}
