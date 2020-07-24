package com.facebook.catalyst.views.art;

import android.graphics.Paint;
import android.graphics.Typeface;
import com.facebook.react.uimanager.annotations.ReactProp;
import p000X.C23043A0y;

public class ARTTextShadowNode extends ARTShapeShadowNode {
    public int A00 = 0;
    public C23043A0y A01;

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004b, code lost:
        if ("bold".equals(r4.getString("fontWeight")) == false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0061, code lost:
        if ("italic".equals(r4.getString("fontStyle")) == false) goto L_0x0063;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    public static void A00(ARTTextShadowNode aRTTextShadowNode, Paint paint) {
        Paint.Align align;
        C23043A0y a0y;
        C23043A0y map;
        boolean z;
        boolean z2;
        int i = aRTTextShadowNode.A00;
        int i2 = 2;
        if (i == 0) {
            align = Paint.Align.LEFT;
        } else if (i != 1) {
            if (i == 2) {
                align = Paint.Align.CENTER;
            }
            a0y = aRTTextShadowNode.A01;
            if (a0y == null && !a0y.hasKey("font") && (map = aRTTextShadowNode.A01.getMap("font")) == null) {
                float f = 12.0f;
                if (map.hasKey("fontSize")) {
                    f = (float) map.getDouble("fontSize");
                }
                paint.setTextSize(f * aRTTextShadowNode.A02);
                if (map.hasKey("fontWeight")) {
                    z = true;
                }
                z = false;
                if (map.hasKey("fontStyle")) {
                    z2 = true;
                }
                z2 = false;
                if (z && z2) {
                    i2 = 3;
                } else if (z) {
                    i2 = 1;
                } else if (!z2) {
                    i2 = 0;
                }
                paint.setTypeface(Typeface.create(map.getString("fontFamily"), i2));
                return;
            }
            return;
        } else {
            align = Paint.Align.RIGHT;
        }
        paint.setTextAlign(align);
        a0y = aRTTextShadowNode.A01;
        if (a0y == null && !a0y.hasKey("font") && (map = aRTTextShadowNode.A01.getMap("font")) == null) {
        }
    }

    @ReactProp(defaultInt = 0, name = "alignment")
    public void setAlignment(int i) {
        this.A00 = i;
    }

    @ReactProp(name = "frame")
    public void setFrame(C23043A0y a0y) {
        this.A01 = a0y;
    }
}
