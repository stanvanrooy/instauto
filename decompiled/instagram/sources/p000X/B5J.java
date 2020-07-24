package p000X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.B5J */
public final class B5J implements C2095190p {
    public CountDownLatch A00 = new CountDownLatch(1);
    public boolean A01 = true;

    public final synchronized void B8Z(boolean z) {
        this.A01 = z;
        this.A00.countDown();
    }
}
