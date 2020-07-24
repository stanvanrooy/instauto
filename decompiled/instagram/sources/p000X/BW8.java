package p000X;

import java.util.concurrent.ThreadFactory;

/* renamed from: X.BW8 */
public final class BW8 implements ThreadFactory {
    public final /* synthetic */ String A00;

    public BW8(String str) {
        this.A00 = str;
    }

    public final Thread newThread(Runnable runnable) {
        return new BW5(runnable, this.A00);
    }
}
