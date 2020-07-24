package p000X;

import android.os.Handler;

/* renamed from: X.DJl */
public final class DJl implements Runnable {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ C88453sR A01;
    public final /* synthetic */ DK8 A02;
    public final /* synthetic */ C88443sQ A03;

    public DJl(C88453sR r1, DK8 dk8, C88443sQ r3, Handler handler) {
        this.A01 = r1;
        this.A02 = dk8;
        this.A03 = r3;
        this.A00 = handler;
    }

    public final void run() {
        C88453sR r4 = this.A01;
        C88443sQ r3 = this.A03;
        Handler handler = this.A00;
        if (r4.A02 == null) {
            C88453sR.A02(r3, handler, "removeOutput", "Audio pipeline should not be null");
            return;
        }
        r4.A0B.A0C("audiopipeline_removing_output");
        r4.A0H = null;
        C88453sR.A01(r3, handler, r4.A02.stopInput(), "Error when stopping session");
    }
}
