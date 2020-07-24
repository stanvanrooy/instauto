package p000X;

import java.util.concurrent.Callable;

/* renamed from: X.1vt  reason: invalid class name and case insensitive filesystem */
public abstract class C44281vt extends C44291vu implements Callable, C17860qv {
    public C17780qn A00;

    public final String getName() {
        return "SimpleListenableTask";
    }

    public void onFinish() {
        if (!this.A00.A0A()) {
            A02(this.A00.A07());
        } else {
            A01(this.A00.A06());
        }
    }

    public void onStart() {
        this.A00 = C17780qn.A00(-15, this);
    }

    public final void run() {
        this.A00.run();
    }
}
