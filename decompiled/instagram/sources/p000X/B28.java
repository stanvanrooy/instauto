package p000X;

/* renamed from: X.B28 */
public final class B28 implements Runnable {
    public final /* synthetic */ AV6 A00;
    public final /* synthetic */ B29 A01;
    public final /* synthetic */ String A02;

    public B28(B29 b29, AV6 av6, String str) {
        this.A01 = b29;
        this.A00 = av6;
        this.A02 = str;
    }

    public final void run() {
        this.A01.A00.A06.setText(this.A00.getTitle());
        this.A01.A00.A05.setText(this.A02);
        this.A01.A00.A06.setVisibility(0);
        this.A01.A00.A05.setVisibility(0);
        this.A01.A00.A04.setVisibility(8);
    }
}
