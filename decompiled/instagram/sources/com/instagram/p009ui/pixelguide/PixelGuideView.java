package com.instagram.p009ui.pixelguide;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.C0003R;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0Z0;
import p000X.C06220Of;
import p000X.C176567gQ;
import p000X.C176577gR;
import p000X.C176587gS;

/* renamed from: com.instagram.ui.pixelguide.PixelGuideView */
public class PixelGuideView extends View {
    public int A00;
    public int A01;
    public int A02;
    public Paint A03;
    public Paint A04;
    public Rect A05;
    public C176577gR A06;
    public String A07;
    public int A08;
    public int A09;
    public int A0A;

    private void A00() {
        int i;
        Paint paint = new Paint();
        this.A04 = paint;
        paint.setColor(587137024);
        Context context = getContext();
        this.A07 = AnonymousClass000.A04("Device Density: ", C06220Of.A0B(context).density);
        this.A00 = getLayoutDirection();
        Paint paint2 = new Paint(1);
        this.A03 = paint2;
        Resources resources = getResources();
        paint2.setTextSize((float) resources.getDimensionPixelSize(C0003R.dimen.font_medium_xlarge));
        Paint paint3 = this.A03;
        getResources();
        paint3.setColor(C176587gS.A00(resources, C0003R.color.green_5, (Resources.Theme) null));
        Rect rect = new Rect();
        this.A05 = rect;
        Paint paint4 = this.A03;
        String str = this.A07;
        paint4.getTextBounds(str, 0, str.length(), rect);
        this.A02 = this.A05.height();
        boolean z = false;
        if (this.A00 == 0) {
            z = true;
        }
        if (z) {
            getResources();
            i = C0003R.dimen.pixel_grid_padding;
        } else {
            getResources();
            i = C0003R.dimen.row_padding_large;
        }
        this.A01 = resources.getDimensionPixelSize(i);
        getContext();
        this.A06 = new C176567gQ((int) C06220Of.A03(context, 8));
    }

    public final void onDraw(Canvas canvas) {
        int i = this.A09;
        if (i != 0) {
            this.A06.ACd(canvas, i, this.A08);
            canvas.drawText(this.A07, (float) this.A0A, (float) this.A02, this.A03);
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5;
        int A062 = AnonymousClass0Z0.A06(855974320);
        super.onSizeChanged(i, i2, i3, i4);
        this.A09 = i;
        this.A08 = i2;
        boolean z = false;
        if (this.A00 == 0) {
            z = true;
        }
        if (z) {
            i5 = (i - this.A05.width()) - this.A01;
        } else {
            i5 = this.A01;
        }
        this.A0A = i5;
        AnonymousClass0Z0.A0D(370788972, A062);
    }

    public PixelGuideView(Context context) {
        super(context);
        A00();
    }

    public PixelGuideView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public PixelGuideView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }
}
