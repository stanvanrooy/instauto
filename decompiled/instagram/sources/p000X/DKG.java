package p000X;

import java.util.Map;

/* renamed from: X.DKG */
public final class DKG implements Runnable {
    public final /* synthetic */ C88443sQ A00;
    public final /* synthetic */ Exception A01;
    public final /* synthetic */ Map A02;

    public DKG(C88443sQ r1, Exception exc, Map map) {
        this.A00 = r1;
        this.A01 = exc;
        this.A02 = map;
    }

    public final void run() {
        this.A00.B2h(this.A01, this.A02);
    }
}
