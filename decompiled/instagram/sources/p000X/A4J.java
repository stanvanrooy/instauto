package p000X;

/* renamed from: X.A4J */
public final class A4J implements Runnable {
    public final /* synthetic */ A4F A00;

    public A4J(A4F a4f) {
        this.A00 = a4f;
    }

    public final void run() {
        C23076A4w a4w = this.A00.A00.mTurboModuleManagerJSIModule;
        if (a4w != null) {
            a4w.onCatalystInstanceDestroy();
        }
        this.A00.A00.getReactQueueConfiguration().A02.runOnQueue(new A4c(this));
    }
}
