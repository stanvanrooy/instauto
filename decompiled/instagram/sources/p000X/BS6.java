package p000X;

/* renamed from: X.BS6 */
public final class BS6 implements Runnable {
    public final /* synthetic */ C62372nb A00;

    public BS6(C62372nb r1) {
        this.A00 = r1;
    }

    public final void run() {
        C62372nb.A02(this.A00, C07450Td.SERVICE_STOP);
        this.A00.A02.quit();
        this.A00.A0D.A0F.A04();
    }
}
