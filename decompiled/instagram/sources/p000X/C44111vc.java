package p000X;

import android.location.Location;

/* renamed from: X.1vc  reason: invalid class name and case insensitive filesystem */
public final class C44111vc {
    public static boolean A00(Location location) {
        if (location == null || location.getTime() == 0 || ((location.getLatitude() == 0.0d && location.getLongitude() == 0.0d) || !location.hasAccuracy())) {
            return false;
        }
        return true;
    }
}
