package p000X;

/* renamed from: X.DS0 */
public final class DS0 implements DS4 {
    public final /* synthetic */ C30140DRw A00;

    public final void BGC(float f) {
    }

    public final void onStart() {
    }

    public DS0(C30140DRw dRw) {
        this.A00 = dRw;
    }

    public final void Auf() {
        C30140DRw dRw = this.A00;
        if (((DS5) dRw.A01.get(this)) != null) {
            C30140DRw.A00(dRw, this, new C45421xr("Cancellation", true, (Exception) null));
        }
    }

    public final void Axm(C203728na r4) {
        C30140DRw dRw = this.A00;
        DS5 ds5 = (DS5) dRw.A01.get(this);
        if (ds5 != null) {
            ds5.A02 = r4;
            ds5.A00 = null;
            ds5.A03 = true;
            synchronized (ds5) {
                ds5.notify();
            }
            dRw.A01.remove(this);
        }
    }

    public final void B40(C45421xr r2) {
        C30140DRw.A00(this.A00, this, r2);
    }
}
