package p000X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;

/* renamed from: X.0Oy  reason: invalid class name and case insensitive filesystem */
public final class C06410Oy extends BitmapDrawable {
    public final /* synthetic */ Bitmap A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C06410Oy(Resources resources, Bitmap bitmap, Bitmap bitmap2) {
        super(resources, bitmap);
        this.A00 = bitmap2;
    }

    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.scale(-1.0f, 1.0f, (float) (this.A00.getWidth() >> 1), (float) (this.A00.getHeight() >> 1));
        super.draw(canvas);
        canvas.restore();
    }
}
