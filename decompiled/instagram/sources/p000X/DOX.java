package p000X;

import android.os.Handler;
import android.os.SystemClock;
import com.instagram.arlink.fragment.ArLinkScanControllerImpl;

/* renamed from: X.DOX */
public final class DOX implements Runnable {
    public final /* synthetic */ DOY A00;

    public DOX(DOY doy) {
        this.A00 = doy;
    }

    public final void run() {
        boolean z = false;
        if (SystemClock.uptimeMillis() - this.A00.A00 > ArLinkScanControllerImpl.ERROR_DELAY_MS) {
            z = true;
        }
        if (z) {
            String $const$string = AnonymousClass40t.$const$string(11);
            AnonymousClass0DB.A0J($const$string, "Freeze Detected - we did not receive input frames for over %d ms", 5000);
            DOY doy = this.A00;
            doy.A01 = 1 + doy.A01;
            if (doy.A03 != null) {
                AnonymousClass0DB.A0D($const$string, "Freeze detected");
            }
        }
        DOY doy2 = this.A00;
        Handler handler = doy2.A02;
        if (handler != null) {
            AnonymousClass0ZA.A09(handler, doy2.A04, ArLinkScanControllerImpl.ERROR_DELAY_MS, -1878802638);
        }
    }
}
