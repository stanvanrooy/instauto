package p000X;

/* renamed from: X.AQ9 */
public final class AQ9 implements AVL {
    public final /* synthetic */ AQ5 A00;

    public final void BBA(int i) {
    }

    public AQ9(AQ5 aq5) {
        this.A00 = aq5;
    }

    public final void Ath(ARK ark, ARA ara) {
        AQ5 aq5 = this.A00;
        if (ark == aq5.A0B) {
            aq5.A0D(ara.A00, new C23588ASm(ara.A01, (String) null, ara));
        } else {
            AnonymousClass0DB.A0H("IgLiveStreamingController", "Unexpected error from another LiveStreamingSession.", ara);
        }
    }

    public final void Ay6(Integer num) {
        C12670hC.A04(new AO8(this.A00, num));
        this.A00.A0E(APC.CONNECTION_QUALITY);
    }

    public final void B1h() {
        AQ5 aq5 = this.A00;
        if (!AQ5.A07(aq5)) {
            long j = aq5.A03;
            AVQ avq = aq5.A0E;
            if (avq != null) {
                j += avq.AYh();
            }
            C23674AXl aXl = aq5.A0C;
            if (aXl != null) {
                j += aXl.AYh();
            }
            aq5.A0R.A02 = j;
            C12670hC.A04(new AR8(aq5, j));
            C23724Aa8 aa8 = aq5.A07;
            aa8.A03 = j;
            C23724Aa8.A01(aa8);
        }
    }

    public final void B6I(ARK ark) {
        AQ5 aq5 = this.A00;
        if (ark == aq5.A0B) {
            aq5.A0R.A0C = true;
            if (aq5.A0K) {
                aq5.A0K = false;
                AQ5.A03(aq5, C23486AOi.CONNECTION);
            }
        }
    }

    public final void BAM(ARK ark, String str) {
        AQ5 aq5 = this.A00;
        if (ark == aq5.A0B) {
            aq5.A0R.A0C = false;
            if (!aq5.A0K) {
                aq5.A0K = true;
                AQ5.A05(aq5, APC.LOST_CONNECTION, true, str, (AWN) null);
            }
        }
    }
}
