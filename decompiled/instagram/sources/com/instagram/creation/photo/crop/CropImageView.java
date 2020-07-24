package com.instagram.creation.photo.crop;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import p000X.AnonymousClass8G5;
import p000X.C183137rx;
import p000X.C183297sD;
import p000X.C183347sI;
import p000X.C183357sK;
import p000X.C183407sP;
import p000X.C183447sU;
import p000X.C183557sg;

public class CropImageView extends C183297sD {
    public RectF A00;
    public AnonymousClass8G5 A01;
    public C183137rx A02;
    public C183557sg A03;
    public C183357sK A04;
    public boolean A05;
    public Point A06;
    public Rect A07;
    public RectF A08;
    public boolean A09;
    public final C183447sU A0A;

    public static void A02(CropImageView cropImageView, boolean z) {
        boolean z2;
        C183357sK r0 = cropImageView.A04;
        if (r0 != null) {
            C183407sP r1 = r0.A04;
            boolean z3 = false;
            if (r1 != null) {
                z3 = true;
            }
            if (z3) {
                cropImageView.A0A.cancel();
                if (!z) {
                    C183447sU r3 = cropImageView.A0A;
                    r3.A01.A0A.setStartTime(-1);
                    r3.A01.A0A.setStartOffset(500);
                    r3.A01.A0A.setDuration(250);
                    cropImageView.startAnimation(cropImageView.A0A);
                    return;
                }
                C183407sP r02 = cropImageView.A04.A04;
                if (r02 != null) {
                    z2 = r02.A04(1.0f);
                } else {
                    z2 = false;
                }
                if (z2) {
                    cropImageView.invalidate();
                }
            }
        }
    }

    public final void A08(boolean z) {
        if (z != this.A09) {
            this.A09 = z;
            super.A08(z);
            A02(this, !this.A09);
        }
    }

    public final void A09() {
        if (this.A05) {
            AnonymousClass8G5 r1 = new AnonymousClass8G5();
            this.A01 = r1;
            r1.A00 = 1.0f;
            setOnTouchListener(r1);
            this.A01.A01 = new C183347sI(this);
        }
    }

    public void setHighlightView(C183357sK r1) {
        this.A04 = r1;
        invalidate();
    }

    public C183357sK getHighlightView() {
        return this.A04;
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        C183557sg r6 = this.A03;
        if (r6 != null) {
            boolean z = false;
            if (((double) (C183297sD.A00(this, getImageMatrix()) / C183297sD.A00(this, this.A0D))) >= 1.0d) {
                z = true;
            }
            r6.B1S(z);
        }
        if (this.A04 != null) {
            this.A08.set(this.A00);
            getImageMatrix().mapRect(this.A08);
            Rect rect = this.A07;
            RectF rectF = this.A08;
            rect.left = Math.max(Math.round(rectF.left), 0);
            rect.top = Math.max(Math.round(rectF.top), 0);
            rect.right = Math.min(Math.round(rectF.right), getWidth());
            this.A07.bottom = Math.min(Math.round(this.A08.bottom), getHeight());
            C183137rx r2 = this.A02;
            if (r2 != null) {
                r2.AMZ(this.A07, this.A06);
                C183357sK r3 = this.A04;
                Rect rect2 = this.A07;
                Point point = this.A06;
                r3.A00(rect2, point.x, point.y);
            } else {
                this.A04.A00(this.A07, 3, 3);
            }
            C183357sK r4 = this.A04;
            Path path = r4.A00;
            if (path != null) {
                canvas.drawPath(path, r4.A05);
            } else {
                r4.A03.getDrawingRect(r4.A02);
                Rect rect3 = r4.A02;
                rect3.bottom = Math.round((float) r4.A01.top);
                canvas.drawRect(rect3, r4.A05);
                r4.A03.getDrawingRect(r4.A02);
                Rect rect4 = r4.A02;
                rect4.top = Math.round((float) r4.A01.bottom);
                canvas.drawRect(rect4, r4.A05);
                Rect rect5 = r4.A02;
                int i = rect5.left;
                Rect rect6 = r4.A01;
                boolean z2 = true;
                boolean z3 = false;
                if (i < rect6.left) {
                    z3 = true;
                }
                if (rect5.right <= rect6.right) {
                    z2 = false;
                }
                if (z3) {
                    r4.A03.getDrawingRect(rect5);
                    Rect rect7 = r4.A02;
                    Rect rect8 = r4.A01;
                    rect7.top = Math.round((float) rect8.top);
                    rect7.bottom = Math.round((float) rect8.bottom);
                    rect7.right = Math.round((float) rect8.left);
                    canvas.drawRect(rect7, r4.A05);
                }
                if (z2) {
                    r4.A03.getDrawingRect(r4.A02);
                    Rect rect9 = r4.A02;
                    Rect rect10 = r4.A01;
                    rect9.top = Math.round((float) rect10.top);
                    rect9.bottom = Math.round((float) rect10.bottom);
                    rect9.left = Math.round((float) rect10.right);
                    canvas.drawRect(rect9, r4.A05);
                }
            }
            C183407sP r0 = r4.A04;
            if (r0 != null) {
                r0.A02(canvas);
            }
        }
    }

    public void setGridLinesNumberProvider(C183137rx r1) {
        this.A02 = r1;
    }

    public void setListener(C183557sg r1) {
        this.A03 = r1;
    }

    public void setTouchEnabled(boolean z) {
        this.A05 = z;
    }

    public CropImageView(Context context) {
        this(context, (AttributeSet) null);
    }

    public CropImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A08 = new RectF();
        this.A07 = new Rect();
        this.A06 = new Point(1, 1);
        this.A0A = new C183447sU(this);
        this.A09 = true;
        this.A05 = true;
    }
}
