package p000X;

import android.graphics.Bitmap;
import com.instagram.p009ui.widget.drawing.p055gl.GLDrawingView;

/* renamed from: X.DO4 */
public final class DO4 implements Runnable {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ GLDrawingView A01;

    public DO4(GLDrawingView gLDrawingView, Bitmap bitmap) {
        this.A01 = gLDrawingView;
        this.A00 = bitmap;
    }

    public final void run() {
        this.A01.A06.A07(this.A00);
        this.A01.A04();
    }
}
