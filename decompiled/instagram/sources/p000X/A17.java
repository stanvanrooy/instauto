package p000X;

import android.os.Handler;
import android.os.Message;
import android.view.View;

/* renamed from: X.A17 */
public final class A17 extends Handler {
    public final /* synthetic */ C23044A0z A00;

    public A17(C23044A0z a0z) {
        this.A00 = a0z;
    }

    public final void handleMessage(Message message) {
        ((View) message.obj).sendAccessibilityEvent(4);
    }
}
