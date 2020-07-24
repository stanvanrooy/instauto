package p000X;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import com.facebook.react.modules.location.LocationModule;

/* renamed from: X.AC0 */
public final class AC0 implements LocationListener {
    public final /* synthetic */ AC2 A00;

    public final void onProviderDisabled(String str) {
    }

    public final void onProviderEnabled(String str) {
    }

    public final void onStatusChanged(String str, int i, Bundle bundle) {
    }

    public AC0(AC2 ac2) {
        this.A00 = ac2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0069  */
    public final void onLocationChanged(Location location) {
        boolean z;
        boolean z2;
        synchronized (this.A00) {
            AC2 ac2 = this.A00;
            if (!ac2.A01) {
                Location location2 = ac2.A00;
                if (location2 != null) {
                    long time = location.getTime() - location2.getTime();
                    boolean z3 = false;
                    if (time > 120000) {
                        z3 = true;
                    }
                    boolean z4 = false;
                    if (time < -120000) {
                        z4 = true;
                    }
                    boolean z5 = false;
                    if (time > 0) {
                        z5 = true;
                    }
                    if (!z3) {
                        if (!z4) {
                            int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
                            boolean z6 = false;
                            if (accuracy > 0) {
                                z6 = true;
                            }
                            boolean z7 = false;
                            if (accuracy < 0) {
                                z7 = true;
                            }
                            boolean z8 = false;
                            if (accuracy > 200) {
                                z8 = true;
                            }
                            String provider = location.getProvider();
                            String provider2 = location2.getProvider();
                            if (provider == null) {
                                z2 = false;
                                if (provider2 == null) {
                                    z2 = true;
                                }
                            } else {
                                z2 = provider.equals(provider2);
                            }
                            if (!z7 && (!z5 || z6)) {
                                if (z5 && !z8 && z2) {
                                }
                            }
                        }
                        z = false;
                        if (z) {
                            this.A00.A07.invoke(LocationModule.locationToMap(location));
                            AC2 ac22 = this.A00;
                            AnonymousClass0ZA.A08(ac22.A05, ac22.A08);
                            AC2 ac23 = this.A00;
                            ac23.A01 = true;
                            AnonymousClass0ZD.A01(ac23.A04, ac23.A03);
                        }
                    }
                }
                z = true;
                if (z) {
                }
            }
            this.A00.A00 = location;
        }
    }
}
