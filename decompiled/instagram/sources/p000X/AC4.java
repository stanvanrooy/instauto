package p000X;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;

/* renamed from: X.AC4 */
public final class AC4 implements LocationListener {
    public static final String[] A04 = {AnonymousClass0C5.$const$string(25), "android.permission.ACCESS_FINE_LOCATION"};
    public Location A00;
    public ACT A01;
    public final LocationManager A02;
    public final Context A03;

    public static boolean A00(Location location, Location location2) {
        boolean equals;
        if (location != null) {
            if (location2 != null) {
                long time = location.getTime() - location2.getTime();
                if (time <= 120000) {
                    if (time >= -120000) {
                        boolean z = false;
                        if (time > 0) {
                            z = true;
                        }
                        int accuracy = (int) (location.getAccuracy() - location2.getAccuracy());
                        boolean z2 = false;
                        if (accuracy <= 0) {
                            z2 = true;
                        }
                        boolean z3 = false;
                        if (accuracy > 200) {
                            z3 = true;
                        }
                        String provider = location.getProvider();
                        String provider2 = location2.getProvider();
                        if (provider == null) {
                            equals = false;
                            if (provider2 == null) {
                                equals = true;
                            }
                        } else {
                            equals = provider.equals(provider2);
                        }
                        if (z2 || (z && !z3 && equals)) {
                            return true;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void onProviderDisabled(String str) {
    }

    public final void onProviderEnabled(String str) {
    }

    public final void onStatusChanged(String str, int i, Bundle bundle) {
    }

    public final void onLocationChanged(Location location) {
        if (A00(location, this.A00)) {
            this.A00 = location;
            ACT act = this.A01;
            if (act != null) {
                act.A00.A05();
            }
        }
    }

    public AC4(Context context) {
        this.A03 = context;
        this.A02 = (LocationManager) context.getSystemService("location");
    }
}
