package p000X;

import android.graphics.Paint;
import android.graphics.Typeface;

/* renamed from: X.A5c */
public final class A5c extends A5f {
    public C23043A0y A00;
    public int A01;

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004b, code lost:
        if ("bold".equals(r4.getString("fontWeight")) == false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0061, code lost:
        if ("italic".equals(r4.getString("fontStyle")) == false) goto L_0x0063;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    public static void A00(A5c a5c, Paint paint) {
        Paint.Align align;
        C23043A0y a0y;
        C23043A0y map;
        boolean z;
        boolean z2;
        int i = a5c.A01;
        int i2 = 2;
        if (i == 0) {
            align = Paint.Align.LEFT;
        } else if (i != 1) {
            if (i == 2) {
                align = Paint.Align.CENTER;
            }
            a0y = a5c.A00;
            if (a0y == null && !a0y.hasKey("font") && (map = a5c.A00.getMap("font")) == null) {
                float f = 12.0f;
                if (map.hasKey("fontSize")) {
                    f = (float) map.getDouble("fontSize");
                }
                paint.setTextSize(f * a5c.A02);
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
        a0y = a5c.A00;
        if (a0y == null && !a0y.hasKey("font") && (map = a5c.A00.getMap("font")) == null) {
        }
    }

    public A5c(C23043A0y a0y) {
        super(a0y);
        C23043A0y a0y2;
        if (a0y.hasKey("frame")) {
            a0y2 = a0y.getMap("frame");
        } else {
            a0y2 = null;
        }
        this.A00 = a0y2;
        this.A01 = a0y.hasKey("alignment") ? a0y.getInt("alignment") : 0;
    }
}
