package p000X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* renamed from: X.AJW */
public final class AJW extends Drawable {
    public final /* synthetic */ C25690BVj A00;

    public final int getOpacity() {
        return -1;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public AJW(C25690BVj bVj) {
        this.A00 = bVj;
    }

    public final void draw(Canvas canvas) {
        C25690BVj bVj = this.A00;
        if (bVj.A05 == null) {
            bVj.A05 = bVj.getInfoGlyph();
        }
        C25690BVj bVj2 = this.A00;
        Drawable drawable = bVj2.A05;
        if (drawable != null) {
            drawable.setBounds(bVj2.A0H);
            canvas.drawCircle((float) this.A00.A0H.centerX(), (float) this.A00.A0H.centerY(), (float) (this.A00.A0H.width() >> 1), this.A00.A0G);
            this.A00.A05.setAlpha(76);
            this.A00.A05.draw(canvas);
        }
    }
}
