package p000X;

import android.os.MessageQueue;

/* renamed from: X.1pZ  reason: invalid class name and case insensitive filesystem */
public final class C40981pZ implements MessageQueue.IdleHandler {
    public final /* synthetic */ C27581Ik A00;

    public C40981pZ(C27581Ik r1) {
        this.A00 = r1;
    }

    public final boolean queueIdle() {
        this.A00.A0A("NETWORK_STORIES_TRAY_UI_RENDER_END");
        C27581Ik r1 = this.A00;
        r1.A01 = Constants.A12;
        C27581Ik.A00(r1);
        return false;
    }
}
