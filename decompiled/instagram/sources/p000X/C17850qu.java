package p000X;

/* renamed from: X.0qu  reason: invalid class name and case insensitive filesystem */
public final class C17850qu implements C17860qv {
    public C17920r1 A00;
    public final C17740qj A01;
    public final C17780qn A02;
    public final String A03;

    public final void A00() {
        C17740qj r0 = this.A01;
        if (r0 != null) {
            r0.A00();
        } else {
            AnonymousClass0QD.A02("HttpRequestTask_cancel", "Attempted to cancel without a CancellationTokenSource");
        }
    }

    public final String getName() {
        return this.A03;
    }

    public final int getRunnableId() {
        return this.A02.mRunnableId;
    }

    public final void onFinish() {
        C17920r1 r1;
        C43791v5 r0;
        C17920r1 r02 = this.A00;
        if (r02 != null) {
            r02.onFinish();
            if (!this.A02.A0A()) {
                C28711Mu r2 = (C28711Mu) this.A02.A07();
                if (r2.isOk()) {
                    this.A00.onSuccess(r2);
                    return;
                } else {
                    r1 = this.A00;
                    r0 = C43791v5.A00(r2);
                }
            } else {
                r1 = this.A00;
                r0 = C43791v5.A01(this.A02.A06());
            }
            r1.onFail(r0);
        }
    }

    public final void onStart() {
        C17920r1 r0 = this.A00;
        if (r0 != null) {
            r0.onStart();
        }
    }

    public final void run() {
        this.A02.run();
        if (this.A00 == null) {
            return;
        }
        if (!this.A02.A0A()) {
            C28711Mu r2 = (C28711Mu) this.A02.A07();
            if (r2.isOk()) {
                this.A00.onSuccessInBackground(r2);
            } else {
                this.A00.onFailInBackground(C17710qg.A01(r2));
            }
        } else {
            this.A00.onFailInBackground(C17700qf.A00);
        }
    }

    public final String toString() {
        return this.A02.toString();
    }

    public C17850qu(C17780qn r4) {
        this(r4, (C17740qj) null, "HttpRequest", "path undefined");
    }

    public C17850qu(C17780qn r4, C17740qj r5, String str, String str2) {
        this.A02 = r4;
        this.A01 = r5;
        this.A03 = AnonymousClass000.A0J(str, " ", str2.split("\\?")[0]);
    }
}
