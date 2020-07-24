package p000X;

import android.os.SystemClock;
import com.facebook.react.bridge.queue.MessageQueueThreadImpl;

/* renamed from: X.A4a */
public final class A4a implements Runnable {
    public final /* synthetic */ MessageQueueThreadImpl A00;

    public A4a(MessageQueueThreadImpl messageQueueThreadImpl) {
        this.A00 = messageQueueThreadImpl;
    }

    public final void run() {
        SystemClock.uptimeMillis();
        SystemClock.currentThreadTimeMillis();
    }
}
