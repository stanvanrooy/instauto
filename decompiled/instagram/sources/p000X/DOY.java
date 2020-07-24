package p000X;

import android.os.Handler;

/* renamed from: X.DOY */
public final class DOY {
    public long A00 = 0;
    public long A01 = 0;
    public Handler A02;
    public AnonymousClass89a A03;
    public final Runnable A04 = new DOX(this);

    public static synchronized void A00(DOY doy) {
        synchronized (doy) {
            Handler handler = doy.A02;
            if (handler != null) {
                AnonymousClass0ZA.A07(handler, (Object) null);
            }
            BCI.A01(doy.A02, false, true);
            doy.A02 = null;
        }
    }
}
