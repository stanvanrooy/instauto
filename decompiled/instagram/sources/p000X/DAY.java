package p000X;

import android.util.Log;

/* renamed from: X.DAY */
public final class DAY implements Runnable {
    public final /* synthetic */ DAN A00;
    public final /* synthetic */ D39 A01;

    public DAY(DAN dan, D39 d39) {
        this.A00 = dan;
        this.A01 = d39;
    }

    public final void run() {
        try {
            DAN.A0D(this.A01);
        } catch (D3Z e) {
            Log.e("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
            throw new RuntimeException(e);
        }
    }
}
