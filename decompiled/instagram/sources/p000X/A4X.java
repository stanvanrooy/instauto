package p000X;

import com.facebook.react.bridge.queue.MessageQueueThreadImpl;
import java.util.concurrent.Callable;

/* renamed from: X.A4X */
public final class A4X implements Runnable {
    public final /* synthetic */ MessageQueueThreadImpl A00;
    public final /* synthetic */ A4W A01;
    public final /* synthetic */ Callable A02;

    public A4X(MessageQueueThreadImpl messageQueueThreadImpl, A4W a4w, Callable callable) {
        this.A00 = messageQueueThreadImpl;
        this.A01 = a4w;
        this.A02 = callable;
    }

    public final void run() {
        try {
            A4W a4w = this.A01;
            Object call = this.A02.call();
            if (a4w.A02.getCount() != 0) {
                a4w.A01 = call;
                a4w.A02.countDown();
                return;
            }
            throw new RuntimeException("Result has already been set!");
        } catch (Exception e) {
            A4W a4w2 = this.A01;
            if (a4w2.A02.getCount() != 0) {
                a4w2.A00 = e;
                a4w2.A02.countDown();
                return;
            }
            throw new RuntimeException("Result has already been set!");
        }
    }
}
