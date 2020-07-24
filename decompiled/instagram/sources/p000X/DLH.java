package p000X;

import android.media.MediaFormat;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: X.DLH */
public final class DLH {
    public CountDownLatch A00;
    public final DLI A01;
    public final C29998DKz A02;
    public final C29998DKz A03;
    public final DPA A04;
    public final String A05;
    public volatile boolean A06;
    public volatile boolean A07;

    public static synchronized void A01(DLH dlh) {
        C29998DKz dKz;
        MediaFormat ARM;
        MediaFormat ARM2;
        synchronized (dlh) {
            if (!dlh.A06 && !dlh.A07 && ((dKz = dlh.A02) == null || dKz.ARM() != null)) {
                C29998DKz dKz2 = dlh.A03;
                if (dKz2 == null || dKz2.ARM() != null) {
                    dlh.A01.A9N(dlh.A05);
                    C29998DKz dKz3 = dlh.A02;
                    if (!(dKz3 == null || (ARM2 = dKz3.ARM()) == null)) {
                        dlh.A01.Bg2(ARM2);
                    }
                    C29998DKz dKz4 = dlh.A03;
                    if (!(dKz4 == null || (ARM = dKz4.ARM()) == null)) {
                        dlh.A01.Bll(ARM);
                    }
                    dlh.A01.BjK(0);
                    dlh.A01.start();
                    dlh.A06 = true;
                }
            }
        }
    }

    public static void A00(DLH dlh) {
        CountDownLatch countDownLatch = dlh.A00;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            DPA dpa = dlh.A04;
            if (dpa != null) {
                dpa.A00.A08.A0L(true);
            }
            dlh.A00.await(2, TimeUnit.SECONDS);
            DPA dpa2 = dlh.A04;
            if (dpa2 != null) {
                dpa2.A00.A08.A0L(false);
            }
        }
    }

    public DLH(String str, DLI dli, C29998DKz dKz, C29998DKz dKz2, Boolean bool, DPA dpa) {
        this.A01 = dli;
        this.A05 = str;
        this.A02 = dKz;
        this.A03 = dKz2;
        boolean booleanValue = bool != null ? true ^ bool.booleanValue() : true;
        if (!(dKz == null || dKz2 == null || !booleanValue)) {
            this.A00 = new CountDownLatch(2);
        }
        this.A04 = dpa;
    }
}
