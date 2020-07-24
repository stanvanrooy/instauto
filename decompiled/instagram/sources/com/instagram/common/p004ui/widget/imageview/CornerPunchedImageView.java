package com.instagram.common.p004ui.widget.imageview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Region;
import android.util.AttributeSet;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1EM;
import p000X.C06400Ox;

/* renamed from: com.instagram.common.ui.widget.imageview.CornerPunchedImageView */
public class CornerPunchedImageView extends CircularImageView {
    public boolean A00;
    public int A01;
    public int A02;
    public int A03;
    public Path A04;
    public boolean A05;
    public final String A06;

    private void A00() {
        Path path = new Path();
        this.A04 = path;
        path.setFillType(Path.FillType.EVEN_ODD);
        int[] punchCenter = getPunchCenter();
        int i = this.A03;
        if (i == -1) {
            i = getWidth() >> 1;
        }
        this.A04.addCircle((float) (punchCenter[0] + this.A01), (float) (punchCenter[1] + this.A02), (float) i, Path.Direction.CW);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004a, code lost:
        if (r0 == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0055, code lost:
        if (r0 == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005f, code lost:
        if (r0 == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0069, code lost:
        if (r0 == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0073, code lost:
        if (r0 == false) goto L_0x001a;
     */
    private int[] getPunchCenter() {
        int i;
        int width;
        char c;
        int height;
        if (this.A05) {
            i = getWidth();
        } else {
            i = 0;
        }
        if (this.A05) {
            width = 0;
        } else {
            width = getWidth();
        }
        String str = this.A06;
        switch (str.hashCode()) {
            case -1698351794:
                boolean equals = str.equals("bottom_start");
                c = 1;
                break;
            case -1682225977:
                boolean equals2 = str.equals("bottom_end");
                c = 0;
                break;
            case -1364013995:
                boolean equals3 = str.equals("center");
                c = 2;
                break;
            case -1139554575:
                boolean equals4 = str.equals("top_end");
                c = 3;
                break;
            case 117822712:
                boolean equals5 = str.equals("top_start");
                c = 4;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            height = getHeight();
            i = width;
        } else if (c == 1) {
            height = getHeight();
        } else if (c != 2) {
            if (c == 3) {
                i = width;
            }
            height = 0;
        } else {
            i = getWidth() / 2;
            height = getHeight() / 2;
        }
        return new int[]{i, height};
    }

    public final void onDraw(Canvas canvas) {
        if (this.A00) {
            canvas.clipPath(this.A04, Region.Op.DIFFERENCE);
        }
        super.onDraw(canvas);
    }

    public void setPunchOffsetX(int i) {
        this.A01 = i;
        A00();
        invalidate();
    }

    public void setPunchOffsetY(int i) {
        this.A02 = i;
        A00();
        invalidate();
    }

    public void setPunchRadius(int i) {
        this.A03 = i;
        A00();
        invalidate();
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0Z0.A06(1748021324);
        super.onSizeChanged(i, i2, i3, i4);
        A00();
        AnonymousClass0Z0.A0D(-2079388974, A062);
    }

    public CornerPunchedImageView(Context context) {
        this(context, (AttributeSet) null);
    }

    public CornerPunchedImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CornerPunchedImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        this.A05 = C06400Ox.A02(context);
        this.A00 = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass1EM.A12);
        this.A03 = obtainStyledAttributes.getDimensionPixelSize(3, -1);
        this.A06 = obtainStyledAttributes.getString(0);
        this.A01 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.A02 = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        if (this.A05) {
            i2 = -this.A01;
        } else {
            i2 = this.A01;
        }
        this.A01 = i2;
        obtainStyledAttributes.recycle();
        A00();
    }
}
