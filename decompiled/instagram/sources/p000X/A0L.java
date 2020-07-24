package p000X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.A0L */
public final class A0L extends View {
    public float A00 = Float.NaN;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public Path A05;
    public RectF A06;
    public float[] A07;
    public int[] A08 = {0, 0};
    public Rect A09;
    public final Paint A0A = new Paint();

    public A0L(Context context) {
        super(context);
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.A0A.setShader(new LinearGradient(((float) getWidth()) * this.A03, ((float) getHeight()) * this.A04, ((float) getWidth()) * this.A01, ((float) getHeight()) * this.A02, this.A08, this.A07, Shader.TileMode.CLAMP));
        float f = this.A00;
        if (C230349zs.A00(f)) {
            if (this.A09 == null) {
                this.A09 = new Rect();
            }
            getDrawingRect(this.A09);
            canvas.clipRect(this.A09);
            canvas.drawPaint(this.A0A);
            return;
        }
        if (!C230349zs.A00(f)) {
            if (this.A05 == null) {
                this.A05 = new Path();
            }
            if (this.A06 == null) {
                this.A06 = new RectF();
            }
            this.A05.reset();
            this.A06.set(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, (float) getWidth(), (float) getHeight());
            Path path = this.A05;
            RectF rectF = this.A06;
            float f2 = this.A00;
            path.addRoundRect(rectF, new float[]{f2, f2, f2, f2, f2, f2, f2, f2}, Path.Direction.CW);
        }
        canvas.drawPath(this.A05, this.A0A);
    }
}
