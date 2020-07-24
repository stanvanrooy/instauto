package p000X;

import android.os.MessageQueue;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.0g4  reason: invalid class name and case insensitive filesystem */
public final class C12030g4 implements C12040g5 {
    public final MessageQueue A00;
    public final C12020g3 A01;
    public final Queue A02 = new ConcurrentLinkedQueue();

    public final void BeH() {
        this.A00.addIdleHandler(new C42221rw(this));
    }

    public final void Bqh(AnonymousClass0O9 r2) {
        this.A02.add(r2);
    }

    public boolean doNext() {
        Runnable runnable = (Runnable) this.A02.poll();
        if (runnable != null) {
            runnable.run();
        }
        if (this.A02.isEmpty() || this.A01.Agl()) {
            return false;
        }
        return true;
    }

    public C12030g4(C12020g3 r2, MessageQueue messageQueue) {
        this.A01 = r2;
        this.A00 = messageQueue;
    }
}
