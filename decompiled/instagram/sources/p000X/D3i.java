package p000X;

import com.facebook.video.heroplayer.service.WarmUpPlayerListener;

/* renamed from: X.D3i */
public final class D3i implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ WarmUpPlayerListener A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    public D3i(WarmUpPlayerListener warmUpPlayerListener, String str, boolean z, long j) {
        this.A01 = warmUpPlayerListener;
        this.A02 = str;
        this.A03 = z;
        this.A00 = j;
    }

    public final void run() {
        this.A01.A00.AzH(this.A02, this.A03, this.A00);
    }
}
