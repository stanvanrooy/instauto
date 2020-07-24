package p000X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1n2  reason: invalid class name and case insensitive filesystem */
public final class C39511n2 extends Drawable implements Drawable.Callback {
    public Bitmap A00;
    public boolean A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final Paint A06;
    public final Integer A07;
    public final List A08;
    public final List A09;
    public final List A0A;

    public final int getOpacity() {
        return -3;
    }

    public final void invalidateDrawable(Drawable drawable) {
        this.A01 = true;
        invalidateSelf();
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    public static void A00(List list, List list2) {
        ArrayList arrayList = new ArrayList(list2);
        list2.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            list2.add(arrayList.get(((Integer) it.next()).intValue()));
        }
    }

    public final int getIntrinsicHeight() {
        return this.A02;
    }

    public final int getIntrinsicWidth() {
        return this.A05;
    }

    public final void setAlpha(int i) {
        for (Drawable alpha : this.A08) {
            alpha.setAlpha(i);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        for (Drawable colorFilter2 : this.A08) {
            colorFilter2.setColorFilter(colorFilter);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0040  */
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (this.A01) {
            Bitmap bitmap = this.A00;
            if (bitmap != null) {
                if (bitmap.getWidth() == bounds.width() && this.A00.getHeight() == bounds.height()) {
                    this.A00.eraseColor(0);
                    Canvas canvas2 = new Canvas(this.A00);
                    float f = ((float) (this.A04 - this.A03)) / 2.0f;
                    for (int i = 0; i < this.A08.size(); i++) {
                        int intValue = ((Integer) this.A09.get(i)).intValue();
                        int intValue2 = ((Integer) this.A0A.get(i)).intValue();
                        canvas2.save();
                        int i2 = C44631wV.A00[this.A07.intValue()];
                        if (i2 != 1) {
                            float f2 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                            if (i2 == 2) {
                                if (i != this.A08.size() - 1) {
                                    f2 = f;
                                }
                                canvas2.translate(f2, (float) intValue2);
                            } else if (i2 == 3) {
                                float f3 = (float) intValue;
                                if (i != this.A08.size() - 1) {
                                    f2 = f;
                                }
                                canvas2.translate(f3, f2);
                            }
                        } else {
                            canvas2.translate((float) intValue, (float) intValue2);
                        }
                        ((Drawable) this.A08.get(i)).draw(canvas2);
                        canvas2.restore();
                    }
                } else {
                    this.A00.recycle();
                }
            }
            this.A00 = Bitmap.createBitmap(bounds.width(), bounds.height(), Bitmap.Config.ARGB_8888);
            Canvas canvas22 = new Canvas(this.A00);
            float f4 = ((float) (this.A04 - this.A03)) / 2.0f;
            while (i < this.A08.size()) {
            }
        }
        canvas.drawBitmap(this.A00, (float) bounds.left, (float) bounds.top, this.A06);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public C39511n2(Context context, List list, int i, float f, boolean z, Integer num) {
        this(context, r2, i, i, r5, f, num);
        int size;
        List list2 = list;
        if (z) {
            size = 0;
        } else {
            size = list.size() - 1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ef, code lost:
        if (r7 < 0) goto L_0x00f1;
     */
    public C39511n2(Context context, List list, int i, int i2, int i3, float f, Integer num) {
        int i4;
        int i5;
        int i6;
        this.A08 = new ArrayList();
        this.A09 = new ArrayList();
        this.A0A = new ArrayList();
        this.A06 = new Paint(3);
        this.A01 = true;
        int i7 = i;
        this.A04 = i7;
        int i8 = i2;
        this.A03 = i8;
        Integer num2 = num;
        this.A07 = num2;
        List list2 = list;
        if (C06400Ox.A02(context)) {
            Collections.reverse(list2);
            i4 = (list2.size() - 1) - i3;
        } else {
            i4 = i3;
        }
        this.A08.addAll(list2);
        int i9 = 0;
        if (!list2.isEmpty()) {
            float f2 = ((float) i8) * (-f);
            int i10 = 0;
            i6 = 0;
            i5 = 0;
            int i11 = 0;
            int i12 = 0;
            while (i10 < list2.size()) {
                Drawable drawable = (Drawable) list2.get(i10);
                drawable.setCallback(this);
                int i13 = i10 == i4 ? i7 : i8;
                drawable.setBounds(i9, i9, i13, i13);
                this.A09.add(Integer.valueOf(i11));
                this.A0A.add(Integer.valueOf(i12));
                switch (num2.intValue()) {
                    case 0:
                        i6 = i11 + drawable.getBounds().width();
                        i5 = Math.max(i5, drawable.getBounds().height());
                        continue;
                    case 1:
                        i6 = i11 + drawable.getBounds().width();
                        break;
                    case 2:
                        i6 = Math.max(i6, drawable.getBounds().width());
                        break;
                }
                i5 = i12 + drawable.getBounds().height();
                i11 = Math.round(((float) (i11 + drawable.getBounds().width())) + f2);
                i12 = Math.round(((float) (i12 + drawable.getBounds().height())) + f2);
                i10++;
                i9 = 0;
            }
            int size = list2.size();
            boolean z = size > i4 ? true : z;
            z = false;
            AnonymousClass0a4.A09(z);
            ArrayList arrayList = new ArrayList(size);
            for (int i14 = 0; i14 < i4; i14++) {
                arrayList.add(Integer.valueOf(i14));
            }
            for (int i15 = size - 1; i15 > i4; i15--) {
                arrayList.add(Integer.valueOf(i15));
            }
            arrayList.add(Integer.valueOf(i4));
            A00(arrayList, this.A08);
            A00(arrayList, this.A0A);
            A00(arrayList, this.A09);
        } else {
            i6 = 0;
            i5 = 0;
        }
        this.A02 = i5;
        this.A05 = i6;
    }
}
