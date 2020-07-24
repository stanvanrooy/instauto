package p000X;

import com.instagram.p009ui.widget.drawing.p055gl.GLDrawingView;

/* renamed from: X.DO5 */
public final class DO5 implements Runnable {
    public final /* synthetic */ GLDrawingView A00;
    public final /* synthetic */ C83113jV A01;
    public final /* synthetic */ C28550Ciq A02;

    public DO5(GLDrawingView gLDrawingView, C28550Ciq ciq, C83113jV r3) {
        this.A00 = gLDrawingView;
        this.A02 = ciq;
        this.A01 = r3;
    }

    public final void run() {
        this.A00.A06.A08(this.A02);
        this.A00.A04();
        this.A01.B1a();
    }
}
