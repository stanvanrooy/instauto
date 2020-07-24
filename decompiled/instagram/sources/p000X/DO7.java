package p000X;

import com.instagram.p009ui.widget.drawing.p055gl.GLDrawingView;

/* renamed from: X.DO7 */
public final class DO7 implements Runnable {
    public final /* synthetic */ GLDrawingView A00;
    public final /* synthetic */ Runnable A01;

    public DO7(GLDrawingView gLDrawingView, Runnable runnable) {
        this.A00 = gLDrawingView;
        this.A01 = runnable;
    }

    public final void run() {
        this.A00.A06.A06();
        this.A00.A04();
        Runnable runnable = this.A01;
        if (runnable != null) {
            this.A00.post(runnable);
        }
    }
}
