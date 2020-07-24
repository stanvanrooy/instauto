package p000X;

/* renamed from: X.DQm */
public enum DQm implements AnonymousClass1KN {
    INSTANCE;

    public final int BdM(int i) {
        return i & 2;
    }

    public final void clear() {
    }

    public final void dispose() {
    }

    public final boolean isEmpty() {
        return true;
    }

    public final Object poll() {
        return null;
    }

    public static void A00(C27841Jk r1) {
        r1.BPT(INSTANCE);
        r1.onComplete();
    }

    public static void A01(Throwable th, C27841Jk r2) {
        r2.BPT(INSTANCE);
        r2.B2m(th);
    }

    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
