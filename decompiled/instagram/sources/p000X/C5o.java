package p000X;

import com.facebook.msys.mci.Execution;

/* renamed from: X.C5o */
public final class C5o implements Runnable {
    public final /* synthetic */ int A00;

    public C5o(int i) {
        this.A00 = i;
    }

    public final void run() {
        Execution.nativeStartExecutor(this.A00);
    }
}
