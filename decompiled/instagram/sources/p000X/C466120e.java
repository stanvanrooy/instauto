package p000X;

/* renamed from: X.20e  reason: invalid class name and case insensitive filesystem */
public final class C466120e implements Runnable {
    public final /* synthetic */ AnonymousClass1HD A00;
    public final /* synthetic */ C31711Zp A01;

    public C466120e(AnonymousClass1HD r1, C31711Zp r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        if (!this.A00.isResumed()) {
            AnonymousClass0QD.A01("AYSF_H_SCROLL_UNIT", "Fragment is not resumed in maybeAnimateNewBadge(...) method.");
        } else {
            C29411Pu.A01(this.A01);
        }
    }
}
