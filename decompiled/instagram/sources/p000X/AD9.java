package p000X;

import com.instagram.common.task.LazyObservableTask;

/* renamed from: X.AD9 */
public final class AD9 implements Runnable {
    public final /* synthetic */ LazyObservableTask A00;

    public AD9(LazyObservableTask lazyObservableTask) {
        this.A00 = lazyObservableTask;
    }

    public final void run() {
        this.A00.A00.onStart();
        this.A00.A01.countDown();
    }
}
