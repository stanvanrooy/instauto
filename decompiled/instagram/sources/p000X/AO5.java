package p000X;

/* renamed from: X.AO5 */
public final class AO5 implements Runnable {
    public final /* synthetic */ APC A00;
    public final /* synthetic */ AQ5 A01;

    public AO5(AQ5 aq5, APC apc) {
        this.A01 = aq5;
        this.A00 = apc;
    }

    public final void run() {
        String str;
        C23470ANr aNr = this.A01.A09;
        if (aNr != null) {
            APC apc = this.A00;
            Integer num = aNr.A0A;
            Integer num2 = Constants.A0Y;
            if (num != num2 && !C23501AOx.A01(num)) {
                if (C23470ANr.A02(aNr)) {
                    AO0 ao0 = aNr.A0a;
                    switch (apc.ordinal()) {
                        case 1:
                            num2 = Constants.ONE;
                            break;
                        case 2:
                            break;
                        case 4:
                            num2 = Constants.A0N;
                            break;
                        default:
                            num2 = Constants.ZERO;
                            break;
                    }
                    if (ao0.A05 != null && ao0.A00 < 0) {
                        ao0.A01 = Constants.A0u;
                        ao0.A00 = System.currentTimeMillis();
                        C06270Ok A002 = C06270Ok.A00();
                        switch (num2.intValue()) {
                            case 1:
                                str = "backgrounding";
                                break;
                            case 2:
                                str = "about_to_finish";
                                break;
                            case 3:
                                str = "lost_connection";
                                break;
                            case 4:
                                str = "live_swap";
                                break;
                            case 5:
                                str = "connection_quality";
                                break;
                            default:
                                str = "unknown";
                                break;
                        }
                        A002.A09("reason", str);
                        AO0.A00(ao0, "INTERRUPT", "WARNING", A002);
                    }
                }
                C23467ANo aNo = aNr.A08;
                if (aNo != null) {
                    C476624x.A09(true, aNo.A0H.A04.A0D.A01());
                    aNo.A09.Acc();
                    aNo.A09.A02(false);
                    aNo.A0F.A04();
                    aNo.A0H.A04.A05.setEnabled(false);
                }
            }
        }
    }
}
