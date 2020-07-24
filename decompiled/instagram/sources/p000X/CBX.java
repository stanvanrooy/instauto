package p000X;

/* renamed from: X.CBX */
public final class CBX implements Runnable {
    public final /* synthetic */ CC4 A00;
    public final /* synthetic */ C16180oA A01;

    public CBX(CC4 cc4, C16180oA r2) {
        this.A00 = cc4;
        this.A01 = r2;
    }

    public final void run() {
        this.A01.A00.edit().putBoolean("has_seen_hec_appeal_tooltip", true).apply();
        this.A00.A0G.A05();
    }
}
