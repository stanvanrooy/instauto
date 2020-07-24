package p000X;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: X.00a  reason: invalid class name and case insensitive filesystem */
public final class C018900a implements Executor {
    public final Handler A00;

    public final void execute(Runnable runnable) {
        if (!AnonymousClass0ZA.A0E(this.A00, runnable, -1030072849)) {
            throw new RejectedExecutionException(this.A00 + " is shutting down");
        }
    }

    public C018900a(Handler handler) {
        this.A00 = handler;
    }
}
