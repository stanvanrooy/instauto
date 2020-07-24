package p000X;

/* renamed from: X.BKG */
public final class BKG implements Runnable {
    public final /* synthetic */ C25410BIl A00;
    public final /* synthetic */ String A01;

    public BKG(C25410BIl bIl, String str) {
        this.A00 = bIl;
        this.A01 = str;
    }

    public final void run() {
        this.A00.A00.onSuccess(this.A01);
    }
}
