package p000X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.1Mk  reason: invalid class name and case insensitive filesystem */
public final class C28611Mk implements C17860qv {
    public C17710qg A00;
    public C43791v5 A01;
    public C28711Mu A02;
    public C28711Mu A03;
    public final CountDownLatch A04 = new CountDownLatch(1);
    public final C17920r1 A05;
    public final C17880qx A06;

    public final String getName() {
        return this.A06.getName();
    }

    public final int getRunnableId() {
        return this.A06.getRunnableId();
    }

    public final void onFinish() {
        if (this.A04.getCount() > 0) {
            AnonymousClass0QD.A01("HttpRequestConnectTask", "onFinish could not be called before the task is finished");
        }
        this.A05.onFinish();
        C28711Mu r1 = this.A02;
        if (r1 != null) {
            this.A05.onSuccess(r1);
            return;
        }
        C43791v5 r12 = this.A01;
        if (r12 != null) {
            this.A05.onFail(r12);
        }
    }

    public final void onStart() {
        this.A05.onStart();
    }

    public final void run() {
        try {
            this.A04.await();
        } catch (InterruptedException unused) {
        }
        C28711Mu r1 = this.A03;
        if (r1 != null) {
            this.A05.onSuccessInBackground(r1);
            return;
        }
        C17710qg r12 = this.A00;
        if (r12 != null) {
            this.A05.onFailInBackground(r12);
        }
    }

    public C28611Mk(C17880qx r3, C17920r1 r4) {
        this.A05 = r4;
        this.A06 = r3;
        r3.A00(new C28621Ml(this));
    }
}
