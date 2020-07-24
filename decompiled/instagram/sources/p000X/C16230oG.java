package p000X;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.provider.Settings;
import java.util.concurrent.Future;

/* renamed from: X.0oG  reason: invalid class name and case insensitive filesystem */
public abstract class C16230oG {
    public static C16230oG A00;

    public abstract void cancelSignalPackageRequest(AnonymousClass0C1 r1, C107994l3 r2);

    public abstract C16250oI getFragmentFactory();

    public abstract Location getLastLocation(AnonymousClass0C1 r1);

    public abstract Location getLastLocation(AnonymousClass0C1 r1, long j);

    public abstract Location getLastLocation(AnonymousClass0C1 r1, long j, float f);

    public abstract Location getLastLocation(AnonymousClass0C1 r1, long j, float f, boolean z);

    public abstract boolean isAccurateEnough(Location location);

    public abstract boolean isAccurateEnough(Location location, long j, float f);

    public abstract boolean isLocationValid(Location location);

    public abstract Future prefetchLocation(AnonymousClass0C1 r1, String str);

    public abstract void removeLocationUpdates(AnonymousClass0C1 r1, AnonymousClass22V r2);

    public abstract void requestLocationSignalPackage(AnonymousClass0C1 r1, C107994l3 r2, String str);

    public abstract void requestLocationSignalPackage(AnonymousClass0C1 r1, Activity activity, C107994l3 r3, C200238hf r4, String str);

    public abstract void requestLocationUpdates(AnonymousClass0C1 r1, AnonymousClass22V r2, String str);

    public abstract void requestLocationUpdates(AnonymousClass0C1 r1, Activity activity, AnonymousClass22V r3, C200238hf r4, String str);

    public abstract void setupForegroundCollection(AnonymousClass0C1 r1);

    public abstract void setupPlaceSignatureCollection(AnonymousClass0C1 r1);

    public static C16230oG getInstance() {
        return A00;
    }

    public static void maybeSetupLocationServices(AnonymousClass0C1 r2, boolean z, boolean z2) {
        if (z || z2) {
            Looper.myQueue().addIdleHandler(new AnonymousClass1H0(z, r2, z2));
        }
    }

    public static Location performIntegrityChecks(Location location) {
        if (location == null || !location.isFromMockProvider()) {
            return location;
        }
        return null;
    }

    public static Future prefetchLocationLazy(AnonymousClass0C1 r5, String str) {
        AnonymousClass22R r4 = new AnonymousClass22R();
        C12810hQ.A03(new AnonymousClass22T(r4, r5, str), 209, 4, false, false);
        return r4;
    }

    public static boolean isLocationEnabled(Context context) {
        int i;
        context.getApplicationContext();
        try {
            i = Settings.Secure.getInt(context.getContentResolver(), "location_mode");
        } catch (Settings.SettingNotFoundException unused) {
            i = 0;
        }
        if (i != 0) {
            return true;
        }
        return false;
    }

    public static boolean isLocationPermitted(Context context) {
        return C35251g3.A07(context.getApplicationContext(), "android.permission.ACCESS_FINE_LOCATION");
    }

    public static void setInstance(C16230oG r0) {
        A00 = r0;
    }
}
