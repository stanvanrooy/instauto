package p000X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.shapes.OvalShape;

/* renamed from: X.A7I */
public final class A7I extends OvalShape {
    public int A00;
    public Paint A01 = new Paint();
    public A7D A02;

    private void A00(int i) {
        float f = (float) (i / 2);
        this.A01.setShader(new RadialGradient(f, f, (float) this.A00, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP));
    }

    public final void draw(Canvas canvas, Paint paint) {
        int width = this.A02.getWidth() >> 1;
        float f = (float) width;
        float height = (float) (this.A02.getHeight() >> 1);
        canvas.drawCircle(f, height, f, this.A01);
        canvas.drawCircle(f, height, (float) (width - this.A00), paint);
    }

    public A7I(A7D a7d, int i) {
        this.A02 = a7d;
        this.A00 = i;
        A00((int) rect().width());
    }

    public final void onResize(float f, float f2) {
        super.onResize(f, f2);
        A00((int) f);
    }
}
