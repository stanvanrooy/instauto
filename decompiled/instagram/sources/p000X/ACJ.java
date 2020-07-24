package p000X;

import android.view.Choreographer;

/* renamed from: X.ACJ */
public final class ACJ {
    public static ACJ A01;
    public Choreographer A00 = Choreographer.getInstance();

    public final void A00(ACP acp) {
        if (acp.A00 == null) {
            acp.A00 = new ACO(acp);
        }
        this.A00.postFrameCallback(acp.A00);
    }
}
