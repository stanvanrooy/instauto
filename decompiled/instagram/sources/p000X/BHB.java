package p000X;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;

/* renamed from: X.BHB */
public final class BHB implements BHS {
    public final /* synthetic */ BHH A00;
    public final /* synthetic */ BHO A01;
    public final /* synthetic */ BHM A02;
    public final /* synthetic */ B57 A03;

    public BHB(BHH bhh, B57 b57, BHO bho, BHM bhm) {
        this.A00 = bhh;
        this.A03 = b57;
        this.A01 = bho;
        this.A02 = bhm;
    }

    public final void AxX(Status status) {
        if (status.A01()) {
            this.A03.A01(this.A01.A9m(this.A00.A02(0, TimeUnit.MILLISECONDS)));
            return;
        }
        B57 b57 = this.A03;
        b57.A00.A0H(this.A02.Buz(status));
    }
}
