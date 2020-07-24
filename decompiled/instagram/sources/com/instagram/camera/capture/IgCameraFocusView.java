package com.instagram.camera.capture;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import p000X.AnonymousClass0P2;
import p000X.AnonymousClass1E8;
import p000X.AnonymousClass1EA;
import p000X.AnonymousClass1EG;
import p000X.AnonymousClass3UC;

public class IgCameraFocusView extends View {
    public float A00;
    public float A01;
    public PointF A02;
    public AnonymousClass1EG A03;
    public boolean A04;
    public Paint A05;
    public AnonymousClass1E8 A06;

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.A04) {
            PointF pointF = this.A02;
            canvas.drawCircle(pointF.x, pointF.y, this.A01, this.A05);
        }
    }

    public IgCameraFocusView(Context context) {
        this(context, (AttributeSet) null);
    }

    public IgCameraFocusView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IgCameraFocusView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setWillNotDraw(false);
        this.A02 = new PointF();
        Paint paint = new Paint(1);
        this.A05 = paint;
        paint.setColor(-1);
        this.A05.setStyle(Paint.Style.STROKE);
        Paint paint2 = this.A05;
        Resources resources = getResources();
        paint2.setStrokeWidth(TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        getResources();
        this.A00 = TypedValue.applyDimension(1, 30.0f, resources.getDisplayMetrics());
        this.A06 = new AnonymousClass3UC(this);
        AnonymousClass1EG A002 = AnonymousClass0P2.A00().A00();
        A002.A06(AnonymousClass1EA.A00(0.5d, 0.5d));
        A002.A07(this.A06);
        this.A03 = A002;
    }
}
