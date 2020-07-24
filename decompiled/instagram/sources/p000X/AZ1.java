package p000X;

import org.webrtc.EglBase;

/* renamed from: X.AZ1 */
public final /* synthetic */ class AZ1 implements Runnable {
    public final /* synthetic */ C23700AYl A00;
    public final /* synthetic */ C208658xY A01;
    public final /* synthetic */ EglBase.Context A02;

    public /* synthetic */ AZ1(C208658xY r1, EglBase.Context context, C23700AYl aYl) {
        this.A01 = r1;
        this.A02 = context;
        this.A00 = aYl;
    }

    public final void run() {
        C208658xY r2 = this.A01;
        EglBase.Context context = this.A02;
        C23700AYl aYl = this.A00;
        try {
            r2.A02(context);
        } catch (RuntimeException e) {
            C23691AYc.A00(aYl, e.toString());
        }
    }
}
