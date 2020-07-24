package p000X;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.lang.ref.WeakReference;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.1r0  reason: invalid class name and case insensitive filesystem */
public final class C41831r0 extends Drawable {
    public static Paint A03;
    public static Paint A04;
    public AnonymousClass8MY A00;
    public boolean A01;
    public boolean A02;

    private void A00() {
        AnonymousClass1GK r1;
        if (!this.A01) {
            this.A01 = true;
            AnonymousClass8MZ r3 = this.A00.A01;
            r3.A01++;
            if (r3.A06 == null && r3.A04 != null) {
                r3.A04.add(new WeakReference(this));
                if (r3.A06 == null && (r1 = r3.A02) != null && !r3.A05) {
                    r1.A04();
                    r3.A05 = true;
                }
            }
        }
    }

    public final int getAlpha() {
        return this.A00.A00.getAlpha();
    }

    public final Drawable.ConstantState getConstantState() {
        return this.A00;
    }

    public final int getIntrinsicHeight() {
        return this.A00.A01.A03.getHeight();
    }

    public final int getIntrinsicWidth() {
        return this.A00.A01.A03.getWidth();
    }

    public final int getOpacity() {
        Bitmap bitmap = this.A00.A01.A06;
        if (bitmap == null || bitmap.hasAlpha() || getAlpha() < 255) {
            return -3;
        }
        return -1;
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, AnonymousClass1EM.A2L);
        String string = obtainAttributes.getString(4);
        int dimensionPixelSize = obtainAttributes.getDimensionPixelSize(1, 0);
        int dimensionPixelSize2 = obtainAttributes.getDimensionPixelSize(0, 0);
        float integer = ((float) resources.getDisplayMetrics().densityDpi) / ((float) obtainAttributes.getInteger(3, 0));
        obtainAttributes.recycle();
        this.A00.A00(string, (int) Math.ceil((double) (((float) dimensionPixelSize) * integer)), (int) Math.ceil((double) (((float) dimensionPixelSize2) * integer)));
    }

    public final Drawable mutate() {
        if (!this.A02 && super.mutate() == this) {
            this.A00 = new AnonymousClass8MY(this.A00);
            this.A02 = true;
        }
        return this;
    }

    public final void setAlpha(int i) {
        this.A00.A00.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A00.A00.setColorFilter(colorFilter);
    }

    public final boolean setVisible(boolean z, boolean z2) {
        AnonymousClass1GK r0;
        if (z) {
            A00();
        } else if (this.A01) {
            AnonymousClass8MZ r4 = this.A00.A01;
            int i = r4.A01 - 1;
            r4.A01 = i;
            if (i == 0) {
                r4.A06 = null;
            }
            List list = r4.A04;
            if (list != null) {
                int size = list.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    } else if (equals(((WeakReference) r4.A04.get(i2)).get())) {
                        r4.A04.remove(i2);
                        break;
                    } else {
                        i2++;
                    }
                }
                if (r4.A04.isEmpty() && (r0 = r4.A02) != null) {
                    r0.A03();
                    r4.A05 = false;
                }
            }
            this.A01 = false;
        }
        return super.setVisible(z, z2);
    }

    public final void A01(Resources resources, String str, int i, int i2, int i3) {
        float f = ((float) resources.getDisplayMetrics().densityDpi) / ((float) i3);
        this.A00.A00(str, (int) Math.ceil((double) (((float) i) * f)), (int) Math.ceil((double) (((float) i2) * f)));
    }

    public final void draw(Canvas canvas) {
        A00();
        Bitmap bitmap = this.A00.A01.A06;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, (Rect) null, getBounds(), this.A00.A00);
        }
        if (this.A00.A01.A00 != null) {
            canvas.drawRect(getBounds(), this.A00.A01.A00);
        }
    }

    public C41831r0(AnonymousClass8MY r1) {
        this.A00 = r1;
    }

    public C41831r0(Paint paint) {
        this.A00 = new AnonymousClass8MY(paint);
    }
}
