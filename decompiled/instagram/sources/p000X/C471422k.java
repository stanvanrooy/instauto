package p000X;

import android.location.LocationManager;
import android.os.Looper;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.22k  reason: invalid class name and case insensitive filesystem */
public final class C471422k implements Runnable {
    public final /* synthetic */ AnonymousClass22Z A00;
    public final /* synthetic */ Set A01;

    public C471422k(AnonymousClass22Z r1, Set set) {
        this.A00 = r1;
        this.A01 = set;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004a, code lost:
        if (r1 == false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004e, code lost:
        if (r0 != false) goto L_0x0050;
     */
    public final void run() {
        boolean z;
        AnonymousClass26V r0;
        synchronized (this.A00) {
            if (this.A00.A05.get()) {
                Iterator it = this.A01.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String str = (String) it.next();
                    AnonymousClass22Z r1 = this.A00;
                    if (!r1.A00.A09 && (r0 = r1.A0C) != null && !r0.A01()) {
                        this.A00.A04();
                        break;
                    }
                    AnonymousClass22Z r2 = this.A00;
                    if (r2.A0H.A04()) {
                        synchronized (r2) {
                            C470822e r02 = r2.A02;
                            if (r02 != null) {
                                boolean z2 = r02.A0A;
                                z = true;
                            }
                            z = false;
                        }
                    }
                    AnonymousClass22Z r3 = this.A00;
                    C470822e r22 = r3.A00;
                    if (r22.A02 != 1) {
                        r3.A01 = "ContinuousSubscription";
                        AnonymousClass0ZD.A02(r3.A02, str, r22.A04, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, r3.A03);
                    }
                    AnonymousClass22Z r12 = this.A00;
                    r12.A01 = "SingleSubscription";
                    LocationManager locationManager = r12.A02;
                    C470622c r23 = r12.A03;
                    if (C44101vb.A08()) {
                        C44101vb.A07(locationManager, str, r23);
                    } else {
                        locationManager.requestSingleUpdate(str, r23, (Looper) null);
                    }
                }
            }
        }
    }
}
