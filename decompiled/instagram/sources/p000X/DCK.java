package p000X;

import com.google.android.exoplayer2.Format;
import java.util.ArrayList;

/* renamed from: X.DCK */
public final class DCK {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04 = -1;
    public Format A05;
    public Format A06;
    public ArrayList A07;
    public boolean A08;
    public final DCM A09 = new DCM(DC7.class);
    public final /* synthetic */ DCE A0A;

    public DCK(DCE dce) {
        this.A0A = dce;
    }

    public final void A00() {
        if (this.A08) {
            this.A07 = null;
            this.A08 = false;
            this.A02 = 0;
            this.A01 = 0;
        }
    }
}
