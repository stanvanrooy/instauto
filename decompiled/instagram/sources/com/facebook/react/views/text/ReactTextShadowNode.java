package com.facebook.react.views.text;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spannable;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.annotations.ReactProp;
import java.util.ArrayList;
import java.util.Map;
import p000X.A0G;
import p000X.A5P;
import p000X.A8I;
import p000X.A8K;
import p000X.A8M;
import p000X.A8p;
import p000X.AD3;
import p000X.AnonymousClass0FY;
import p000X.C169427Mb;
import p000X.C230039z5;
import p000X.C230049z6;
import p000X.C230209zY;
import p000X.C230349zs;
import p000X.C23126A8e;

public class ReactTextShadowNode extends ReactBaseTextShadowNode {
    public static final TextPaint A03 = new TextPaint(1);
    public Spannable A00;
    public boolean A01;
    public final A5P A02;

    public final boolean A0A() {
        return true;
    }

    public final boolean A0B() {
        return false;
    }

    public final void At9(A8I a8i) {
        this.A00 = A0D(this, (String) null, true, a8i);
        A06();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0028, code lost:
        if (r20 < com.facebook.react.uimanager.BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) goto L_0x002a;
     */
    public static Layout A00(ReactTextShadowNode reactTextShadowNode, Spannable spannable, float f, C230049z6 r21) {
        float f2;
        boolean z;
        StaticLayout.Builder builder;
        TextPaint textPaint = A03;
        ReactTextShadowNode reactTextShadowNode2 = reactTextShadowNode;
        textPaint.setTextSize((float) reactTextShadowNode2.A0E.A02());
        Spannable spannable2 = spannable;
        BoringLayout.Metrics isBoring = BoringLayout.isBoring(spannable2, textPaint);
        if (isBoring == null) {
            f2 = Layout.getDesiredWidth(spannable2, textPaint);
        } else {
            f2 = Float.NaN;
        }
        float f3 = f;
        if (r21 != C230049z6.UNDEFINED) {
            z = false;
        }
        z = true;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        int i = reactTextShadowNode2.A00;
        if (reactTextShadowNode2.A05.getLayoutDirection() == AD3.RTL) {
            if (i == 5) {
                i = 3;
            } else if (i == 3) {
                i = 5;
            }
        }
        if (i == 1) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (i != 3 && i == 5) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (isBoring == null && (z || (!C230349zs.A00(f2) && f2 <= f))) {
            int ceil = (int) Math.ceil((double) f2);
            if (Build.VERSION.SDK_INT < 23) {
                return new StaticLayout(spannable2, textPaint, ceil, alignment, 1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, reactTextShadowNode2.A0K);
            }
            builder = StaticLayout.Builder.obtain(spannable2, 0, spannable2.length(), textPaint, ceil).setAlignment(alignment).setLineSpacing(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f).setIncludePad(reactTextShadowNode2.A0K).setBreakStrategy(reactTextShadowNode2.A0B).setHyphenationFrequency(0);
            if (Build.VERSION.SDK_INT >= 26) {
                builder.setJustificationMode(reactTextShadowNode2.A09);
            }
        } else if (isBoring != null && (z || ((float) isBoring.width) <= f)) {
            Layout.Alignment alignment2 = alignment;
            return BoringLayout.make(spannable2, textPaint, isBoring.width, alignment2, 1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, isBoring, reactTextShadowNode2.A0K);
        } else if (Build.VERSION.SDK_INT < 23) {
            return new StaticLayout(spannable2, textPaint, (int) f3, alignment, 1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, reactTextShadowNode2.A0K);
        } else {
            builder = StaticLayout.Builder.obtain(spannable2, 0, spannable2.length(), textPaint, (int) f3).setAlignment(alignment).setLineSpacing(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f).setIncludePad(reactTextShadowNode2.A0K).setBreakStrategy(reactTextShadowNode2.A0B).setHyphenationFrequency(0);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            builder.setUseLineSpacingFromFallbacks(true);
        }
        return builder.build();
    }

    public final void A09(A8K a8k) {
        A8K a8k2 = a8k;
        super.A09(a8k2);
        Spannable spannable = this.A00;
        if (spannable != null) {
            boolean z = this.A0J;
            A8M a8m = this.A05;
            float layoutPadding = a8m.getLayoutPadding(C23126A8e.A00(4));
            float layoutPadding2 = a8m.getLayoutPadding(C23126A8e.A00(1));
            float layoutPadding3 = a8m.getLayoutPadding(C23126A8e.A00(5));
            float layoutPadding4 = a8m.getLayoutPadding(C23126A8e.A00(3));
            int i = this.A00;
            if (a8m.getLayoutDirection() == AD3.RTL) {
                if (i == 5) {
                    i = 3;
                } else if (i == 3) {
                    i = 5;
                }
            }
            C230209zY r6 = new C230209zY(spannable, -1, z, layoutPadding, layoutPadding2, layoutPadding3, layoutPadding4, i, this.A0B, this.A09, -1, -1);
            a8k2.A0F.add(new A8p(a8k2, ATb(), r6));
        }
    }

    public final Iterable A7L() {
        Map map = this.A0H;
        if (map == null || map.isEmpty()) {
            return null;
        }
        Spannable spannable = this.A00;
        AnonymousClass0FY.A01(spannable, "Spannable element has not been prepared in onBeforeLayout");
        ArrayList arrayList = new ArrayList(r2);
        for (C169427Mb r0 : (C169427Mb[]) spannable.getSpans(0, spannable.length(), C169427Mb.class)) {
            ReactShadowNode reactShadowNode = (ReactShadowNode) this.A0H.get(Integer.valueOf(r0.A01));
            reactShadowNode.A7J();
            arrayList.add(reactShadowNode);
        }
        return arrayList;
    }

    public final void A06() {
        super.A06();
        super.ABz();
    }

    @ReactProp(name = "onTextLayout")
    public void setShouldNotifyOnTextLayout(boolean z) {
        this.A01 = z;
    }

    public ReactTextShadowNode() {
        this((A0G) null);
    }

    public ReactTextShadowNode(A0G a0g) {
        super(a0g);
        C230039z5 r1 = new C230039z5(this);
        this.A02 = r1;
        if (!AiS()) {
            this.A05.setMeasureFunction(r1);
        }
    }
}
