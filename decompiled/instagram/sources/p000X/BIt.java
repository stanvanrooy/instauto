package p000X;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.BIt */
public final class BIt implements C25437BKa {
    public final /* synthetic */ BK9 A00;
    public final /* synthetic */ BIW A01;
    public final /* synthetic */ AtomicReference A02;

    public final void Ay8(int i) {
    }

    public BIt(BIW biw, AtomicReference atomicReference, BK9 bk9) {
        this.A01 = biw;
        this.A02 = atomicReference;
        this.A00 = bk9;
    }

    public final void Ay0(Bundle bundle) {
        BIW biw = this.A01;
        BIG big = (BIG) this.A02.get();
        C25422BJd.A02.Buj(big).A04(new BIN(biw, this.A00, true, big));
    }
}
