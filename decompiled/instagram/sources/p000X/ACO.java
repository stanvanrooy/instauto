package p000X;

import android.view.Choreographer;

/* renamed from: X.ACO */
public final class ACO implements Choreographer.FrameCallback {
    public final /* synthetic */ ACP A00;

    public ACO(ACP acp) {
        this.A00 = acp;
    }

    public final void doFrame(long j) {
        this.A00.A00(j);
    }
}
