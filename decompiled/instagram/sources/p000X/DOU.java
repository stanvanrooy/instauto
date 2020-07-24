package p000X;

/* renamed from: X.DOU */
public final class DOU {
    public Object A00;
    public final BSA A01;
    public final Runnable A02 = new DOV(this);
    public final /* synthetic */ DOW A03;

    public static synchronized void A00(DOU dou) {
        long j;
        synchronized (dou) {
            if (dou.A03.A02.A03 != null) {
                DOW dow = dou.A03;
                long j2 = dow.A00;
                if (j2 == Long.MIN_VALUE) {
                    if (dow.A02.A02.size() > 10) {
                        j = 60000;
                    } else {
                        j = 0;
                    }
                    DOW dow2 = dou.A03;
                    dow2.A00 = (j - (((long) dou.A01.A00) * 1000)) + dow2.A02.A00.A01.now();
                } else {
                    j = (j2 + (((long) dou.A01.A00) * 1000)) - dow.A02.A00.A01.now();
                }
                AnonymousClass272 r3 = dou.A03.A02.A01;
                Runnable runnable = dou.A02;
                r3.A00(runnable, Math.max(0, j));
                dou.A00 = runnable;
            }
        }
    }

    public DOU(DOW dow, BSA bsa) {
        this.A03 = dow;
        this.A01 = bsa;
        A00(this);
    }
}
