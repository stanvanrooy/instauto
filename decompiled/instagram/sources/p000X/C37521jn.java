package p000X;

import android.os.MessageQueue;

/* renamed from: X.1jn  reason: invalid class name and case insensitive filesystem */
public final class C37521jn implements MessageQueue.IdleHandler {
    public final /* synthetic */ C27581Ik A00;

    public C37521jn(C27581Ik r1) {
        this.A00 = r1;
    }

    public final boolean queueIdle() {
        Integer num;
        this.A00.A0A("NETWORK_FEED_UI_RENDER_END");
        C27581Ik r2 = this.A00;
        if (r2.A00 == Constants.A0Y) {
            num = Constants.A14;
        } else {
            num = Constants.A12;
        }
        r2.A00 = num;
        C27581Ik.A00(r2);
        return false;
    }
}
