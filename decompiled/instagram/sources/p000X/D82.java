package p000X;

import com.google.android.exoplayer2.Format;

/* renamed from: X.D82 */
public final class D82 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Format A01;
    public final /* synthetic */ D7B A02;

    public D82(D7B d7b, int i, Format format) {
        this.A02 = d7b;
        this.A00 = i;
        this.A01 = format;
    }

    public final void run() {
        this.A02.A01.AzK(this.A00, this.A01);
    }
}
