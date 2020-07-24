package com.instagram.bugreporter;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1EM;
import p000X.C06220Of;

public class BugReporterDrawingView extends View {
    public float A00;
    public float A01;
    public Bitmap A02;
    public Bitmap A03;
    public Canvas A04;
    public Paint A05;
    public Paint A06;
    public Rect A07;
    public float A08;
    public int A09;
    public final Path A0A;
    public final Path A0B;

    private void A00() {
        Bitmap bitmap = this.A02;
        if (bitmap != null) {
            bitmap.recycle();
            this.A02 = null;
            this.A04 = null;
        }
        this.A0A.reset();
    }

    public final void onDraw(Canvas canvas) {
        Bitmap bitmap;
        if (this.A07.width() > 0 && this.A07.height() > 0 && (bitmap = this.A02) != null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.A07, this.A05);
        }
    }

    public static void A01(BugReporterDrawingView bugReporterDrawingView) {
        int paddingLeft;
        int paddingRight;
        int paddingTop;
        int paddingBottom;
        int width = (bugReporterDrawingView.getWidth() - bugReporterDrawingView.getPaddingLeft()) - bugReporterDrawingView.getPaddingRight();
        int height = (bugReporterDrawingView.getHeight() - bugReporterDrawingView.getPaddingTop()) - bugReporterDrawingView.getPaddingBottom();
        Bitmap bitmap = bugReporterDrawingView.A03;
        if (bitmap == null || width <= 0 || height <= 0) {
            paddingLeft = bugReporterDrawingView.getPaddingLeft();
            paddingRight = bugReporterDrawingView.getPaddingRight();
            paddingTop = bugReporterDrawingView.getPaddingTop();
            paddingBottom = bugReporterDrawingView.getPaddingBottom();
        } else {
            int width2 = bitmap.getWidth();
            float f = (float) width2;
            float height2 = (float) bugReporterDrawingView.A03.getHeight();
            float min = Math.min(((float) width) / f, ((float) height) / height2);
            int ceil = (int) Math.ceil((double) (f * min));
            int i = (width - ceil) >> 1;
            int ceil2 = (height - ((int) Math.ceil((double) (height2 * min)))) >> 1;
            paddingLeft = bugReporterDrawingView.getPaddingLeft() + i;
            paddingRight = (bugReporterDrawingView.getWidth() - bugReporterDrawingView.getPaddingRight()) - i;
            paddingTop = bugReporterDrawingView.getPaddingTop() + ceil2;
            paddingBottom = (bugReporterDrawingView.getHeight() - bugReporterDrawingView.getPaddingBottom()) - ceil2;
        }
        Rect rect = new Rect(paddingLeft, paddingTop, paddingRight, paddingBottom);
        bugReporterDrawingView.A07 = rect;
        int width3 = rect.width();
        int height3 = bugReporterDrawingView.A07.height();
        if (width3 <= 0 || height3 <= 0) {
            bugReporterDrawingView.A00();
            return;
        }
        bugReporterDrawingView.A00();
        Bitmap createBitmap = Bitmap.createBitmap(width3, height3, Bitmap.Config.ARGB_8888);
        bugReporterDrawingView.A02 = createBitmap;
        Canvas canvas = new Canvas(createBitmap);
        bugReporterDrawingView.A04 = canvas;
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        if (bugReporterDrawingView.A03 != null) {
            bugReporterDrawingView.A04.drawBitmap(bugReporterDrawingView.A03, (Rect) null, new Rect(0, 0, width3, height3), bugReporterDrawingView.A05);
        }
        Matrix matrix = new Matrix();
        Rect rect2 = bugReporterDrawingView.A07;
        matrix.postTranslate((float) (-rect2.left), (float) (-rect2.top));
        bugReporterDrawingView.A04.setMatrix(matrix);
    }

    public final void finalize() {
        A00();
        super.finalize();
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0Z0.A06(115765338);
        A01(this);
        AnonymousClass0Z0.A0D(816755891, A062);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int A052 = AnonymousClass0Z0.A05(-765808055);
        if (this.A07.width() <= 0 || this.A07.height() <= 0) {
            i = -454054701;
        } else {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.A00 = motionEvent.getX();
                float y = motionEvent.getY();
                this.A01 = y;
                Path path = this.A0A;
                float f = this.A00;
                path.addRect(f, y, f + 0.1f, y + 0.1f, Path.Direction.CW);
                this.A04.drawPoint(this.A00, this.A01, this.A06);
                invalidate();
            } else if (actionMasked == 1) {
                this.A0A.moveTo(this.A00, this.A01);
                this.A0A.lineTo(motionEvent.getX(), motionEvent.getY());
                this.A04.drawLine(this.A00, this.A01, motionEvent.getX(), motionEvent.getY(), this.A06);
                invalidate();
            } else if (actionMasked != 2) {
                i = -1347218969;
            } else {
                this.A0B.reset();
                this.A0B.moveTo(this.A00, this.A01);
                int historySize = motionEvent.getHistorySize();
                for (int i2 = 0; i2 < historySize; i2++) {
                    float historicalX = motionEvent.getHistoricalX(i2);
                    float historicalY = motionEvent.getHistoricalY(i2);
                    float f2 = this.A00;
                    float f3 = (historicalX + f2) / 2.0f;
                    float f4 = this.A01;
                    float f5 = (historicalY + f4) / 2.0f;
                    this.A0B.quadTo(f2, f4, f3, f5);
                    this.A00 = f3;
                    this.A01 = f5;
                }
                float x = motionEvent.getX();
                float y2 = motionEvent.getY();
                float f6 = this.A00;
                float f7 = (x + f6) / 2.0f;
                float f8 = this.A01;
                float f9 = (y2 + f8) / 2.0f;
                this.A0B.quadTo(f6, f8, f7, f9);
                this.A00 = f7;
                this.A01 = f9;
                this.A0A.addPath(this.A0B);
                this.A04.drawPath(this.A0B, this.A06);
                invalidate();
            }
            AnonymousClass0Z0.A0C(2082926856, A052);
            return true;
        }
        AnonymousClass0Z0.A0C(i, A052);
        return false;
    }

    public BugReporterDrawingView(Context context) {
        this(context, (AttributeSet) null);
    }

    public BugReporterDrawingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BugReporterDrawingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0A = new Path();
        this.A0B = new Path();
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AnonymousClass1EM.A0U);
        getContext();
        this.A08 = obtainStyledAttributes.getDimension(1, C06220Of.A03(context2, 12));
        this.A09 = obtainStyledAttributes.getColor(0, -16777216);
        obtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.A06 = paint;
        paint.setAntiAlias(true);
        this.A06.setColor(this.A09);
        this.A06.setStyle(Paint.Style.STROKE);
        this.A06.setStrokeJoin(Paint.Join.ROUND);
        this.A06.setStrokeWidth(this.A08);
        this.A06.setStrokeCap(Paint.Cap.ROUND);
        Paint paint2 = new Paint();
        this.A05 = paint2;
        paint2.setAntiAlias(true);
        this.A05.setDither(true);
        this.A05.setFilterBitmap(true);
    }
}
