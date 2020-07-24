package p000X;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

/* renamed from: X.22c  reason: invalid class name and case insensitive filesystem */
public final class C470622c implements LocationListener {
    public final /* synthetic */ AnonymousClass22Z A00;

    public final void onProviderDisabled(String str) {
    }

    public final void onProviderEnabled(String str) {
    }

    public final void onStatusChanged(String str, int i, Bundle bundle) {
    }

    public C470622c(AnonymousClass22Z r1) {
        this.A00 = r1;
    }

    public final void onLocationChanged(Location location) {
        long j;
        C44121vd fixedLocation = this.A00.getFixedLocation(location);
        if (fixedLocation != null) {
            this.A00.A08(fixedLocation);
            AnonymousClass22Z r4 = this.A00;
            String str = r4.A04;
            String str2 = r4.A01;
            if (fixedLocation == null || fixedLocation.A02() == null) {
                j = Long.MIN_VALUE;
            } else {
                j = r4.A07.now() - fixedLocation.A02().longValue();
            }
            Long valueOf = Long.valueOf(j);
            AnonymousClass26W r42 = r4.A0D;
            if (r42 != null) {
                r42.A00("AndroidPlatformFbLocationManager", "onLocationChanged", str, str2, "AndroidPlatformLocationProvider", false, valueOf);
            }
        }
    }
}
