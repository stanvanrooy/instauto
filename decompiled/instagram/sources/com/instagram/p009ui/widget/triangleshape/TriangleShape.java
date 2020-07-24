package com.instagram.p009ui.widget.triangleshape;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1EM;
import p000X.AnonymousClass7RG;
import p000X.C06220Of;

/* renamed from: com.instagram.ui.widget.triangleshape.TriangleShape */
public class TriangleShape extends View {
    public int A00;
    public Paint A01;
    public Paint A02;
    public Path A03;
    public Path A04;
    public View A05 = this;
    public AnonymousClass7RG A06 = AnonymousClass7RG.NORTH;
    public int[] A07;

    private void A00(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AnonymousClass1EM.A3u);
        int color = obtainStyledAttributes.getColor(1, -1);
        this.A00 = obtainStyledAttributes.getColor(2, 0);
        if (!TextUtils.isEmpty(obtainStyledAttributes.getString(0))) {
            this.A06 = (AnonymousClass7RG) AnonymousClass7RG.A01.get(obtainStyledAttributes.getInt(0, 0));
        }
        obtainStyledAttributes.recycle();
        this.A07 = new int[2];
        Paint paint = new Paint(1);
        this.A01 = paint;
        paint.setColor(color);
        this.A01.setStyle(Paint.Style.FILL_AND_STROKE);
        Paint paint2 = new Paint(1);
        this.A02 = paint2;
        paint2.setColor(this.A00);
        this.A02.setStyle(Paint.Style.STROKE);
        this.A02.setStrokeWidth(1.0f);
        Path path = new Path();
        this.A03 = path;
        Path.FillType fillType = Path.FillType.EVEN_ODD;
        path.setFillType(fillType);
        Path path2 = new Path();
        this.A04 = path2;
        path2.setFillType(fillType);
    }

    public final void draw(Canvas canvas) {
        int A032 = AnonymousClass0Z0.A03(-1455847097);
        int height = getHeight();
        this.A05.getLocationInWindow(this.A07);
        int width = this.A07[0] + ((int) ((((float) this.A05.getWidth()) * this.A05.getScaleX()) / 2.0f));
        getLocationInWindow(this.A07);
        int i = width - this.A07[0];
        this.A03.reset();
        this.A04.reset();
        if (this.A06 == AnonymousClass7RG.SOUTH) {
            float f = (float) (i - height);
            this.A03.moveTo(f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            float f2 = (float) (i + height);
            this.A03.lineTo(f2, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            float f3 = (float) i;
            float f4 = (float) height;
            this.A03.lineTo(f3, f4);
            if (this.A00 != 0) {
                this.A04.moveTo(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                this.A04.lineTo(f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                this.A04.lineTo(f3, f4);
                this.A04.lineTo(f2, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                this.A04.lineTo((float) C06220Of.A09(getContext()), BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            }
        } else {
            float f5 = (float) (i - height);
            float f6 = (float) height;
            this.A03.moveTo(f5, f6);
            float f7 = (float) (height + i);
            this.A03.lineTo(f7, f6);
            float f8 = (float) i;
            this.A03.lineTo(f8, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            if (this.A00 != 0) {
                this.A04.moveTo(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, f6);
                this.A04.lineTo(f5, f6);
                this.A04.lineTo(f8, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                this.A04.lineTo(f7, f6);
                this.A04.lineTo((float) C06220Of.A09(getContext()), f6);
            }
        }
        this.A03.close();
        canvas.drawPath(this.A03, this.A01);
        canvas.drawPath(this.A04, this.A02);
        AnonymousClass0Z0.A0A(-238294174, A032);
    }

    public void setDirection(AnonymousClass7RG r1) {
        this.A06 = r1;
    }

    public void setNotchCenterXOn(View view) {
        this.A05 = view;
    }

    public TriangleShape(Context context) {
        super(context);
        A00((AttributeSet) null);
    }

    public TriangleShape(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(attributeSet);
    }

    public TriangleShape(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(attributeSet);
    }
}
