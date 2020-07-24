package p000X;

/* renamed from: X.AY8 */
public final /* synthetic */ class AY8 implements Runnable {
    public final /* synthetic */ AWN A00;
    public final /* synthetic */ Runnable A01;

    public /* synthetic */ AY8(Runnable runnable, AWN awn) {
        this.A01 = runnable;
        this.A00 = awn;
    }

    public final void run() {
        Runnable runnable = this.A01;
        AWN awn = this.A00;
        try {
            runnable.run();
            AWN.A00(awn);
        } catch (Exception e) {
            AWN.A01(awn, e);
        } catch (Error e2) {
            AWN.A01(awn, new RuntimeException(e2));
        }
    }
}
