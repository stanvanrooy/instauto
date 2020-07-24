package p000X;

import java.util.concurrent.Executor;

/* renamed from: X.08m  reason: invalid class name and case insensitive filesystem */
public final class C037908m implements Executor {
    public final void execute(Runnable runnable) {
        new Thread(runnable).start();
    }
}
