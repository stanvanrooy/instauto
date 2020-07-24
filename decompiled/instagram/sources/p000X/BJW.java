package p000X;

/* renamed from: X.BJW */
public final class BJW implements Runnable {
    public final /* synthetic */ C25410BIl A00;
    public final /* synthetic */ String A01;

    public BJW(C25410BIl bIl, String str) {
        this.A00 = bIl;
        this.A01 = str;
    }

    public final void run() {
        this.A00.A00.onFail(C43791v5.A01(new RuntimeException(this.A01)));
    }
}
