package p000X;

import android.os.SystemClock;

/* renamed from: X.BPV */
public final class BPV implements C25584BQq {
    public final /* synthetic */ C25575BQh A00;

    public BPV(C25575BQh bQh) {
        this.A00 = bQh;
    }

    public final C25521BOf ADg() {
        return this.A00.A02(((float) SystemClock.elapsedRealtime()) / 1000.0f);
    }
}
