package com.facebook.react.modules.location;

import android.app.ActivityManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import com.facebook.fbreact.specs.NativeLocationObserverSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.instagram.react.views.maps.IgStaticMapViewManager;
import p000X.A44;
import p000X.ABZ;
import p000X.AC1;
import p000X.AC2;
import p000X.AnonymousClass0ZA;
import p000X.AnonymousClass0ZD;
import p000X.C019000b;
import p000X.C228259s1;
import p000X.C23041A0r;
import p000X.C23043A0y;
import p000X.C23192ABy;

@ReactModule(name = "LocationObserver")
public class LocationModule extends NativeLocationObserverSpec {
    public static final String NAME = "LocationObserver";
    public static final float RCT_DEFAULT_LOCATION_ACCURACY = 100.0f;
    public final LocationListener mLocationListener = new AC1(this);
    public String mWatchedProvider;

    public void addListener(String str) {
    }

    public String getName() {
        return NAME;
    }

    public void removeListeners(double d) {
    }

    public void requestAuthorization() {
    }

    public void setConfiguration(C23043A0y a0y) {
    }

    private String getValidProvider(LocationManager locationManager, boolean z) {
        String str;
        String str2 = "network";
        if (z) {
            str2 = "gps";
        }
        if (!locationManager.isProviderEnabled(str)) {
            boolean equals = str.equals("gps");
            str = "gps";
            if (equals) {
                str = "network";
            }
            if (!locationManager.isProviderEnabled(str)) {
                return null;
            }
        }
        int A01 = C019000b.A01(getReactApplicationContext(), "android.permission.ACCESS_FINE_LOCATION");
        if (!str.equals("gps") || A01 == 0) {
            return str;
        }
        return null;
    }

    public static boolean isAppInBackground() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        if (runningAppProcessInfo.importance != 100) {
            return true;
        }
        return false;
    }

    public static void throwLocationPermissionMissing(SecurityException securityException) {
        throw new SecurityException("Looks like the app doesn't have the permission to access location.\nAdd the following line to your app's AndroidManifest.xml:\n<uses-permission android:name=\"android.permission.ACCESS_FINE_LOCATION\" />", securityException);
    }

    public void startObserving(C23043A0y a0y) {
        if (!"gps".equals(this.mWatchedProvider)) {
            C23192ABy A00 = C23192ABy.A00(a0y);
            try {
                LocationManager locationManager = (LocationManager) getReactApplicationContext().getSystemService("location");
                String validProvider = getValidProvider(locationManager, A00.A03);
                if (validProvider == null) {
                    emitError(this, 2, "No location provider available.");
                    return;
                }
                if (!validProvider.equals(this.mWatchedProvider)) {
                    AnonymousClass0ZD.A01(locationManager, this.mLocationListener);
                    if (isAppInBackground()) {
                        emitError(this, 2, "Cannot retrieve position while app is backgrounded.");
                        return;
                    }
                    AnonymousClass0ZD.A02(locationManager, validProvider, 1000, A00.A01, this.mLocationListener);
                }
                this.mWatchedProvider = validProvider;
            } catch (SecurityException e) {
                throwLocationPermissionMissing(e);
            }
        }
    }

    public LocationModule(A44 a44) {
        super(a44);
    }

    public static void emitError(LocationModule locationModule, int i, String str) {
        A44 reactApplicationContextIfActiveOrWarn = locationModule.getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContextIfActiveOrWarn.A01(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("geolocationError", ABZ.A00(i, str));
        }
    }

    public static C228259s1 locationToMap(Location location) {
        C228259s1 A03 = C23041A0r.A03();
        C228259s1 A032 = C23041A0r.A03();
        A032.putDouble(IgStaticMapViewManager.LATITUDE_KEY, location.getLatitude());
        A032.putDouble(IgStaticMapViewManager.LONGITUDE_KEY, location.getLongitude());
        A032.putDouble("altitude", location.getAltitude());
        A032.putDouble("accuracy", (double) location.getAccuracy());
        A032.putDouble("heading", (double) location.getBearing());
        A032.putDouble("speed", (double) location.getSpeed());
        A03.putMap("coords", A032);
        A03.putDouble("timestamp", (double) location.getTime());
        A03.putBoolean("mocked", location.isFromMockProvider());
        return A03;
    }

    public void getCurrentPosition(C23043A0y a0y, Callback callback, Callback callback2) {
        Object[] objArr;
        C23192ABy A00 = C23192ABy.A00(a0y);
        try {
            LocationManager locationManager = (LocationManager) getReactApplicationContext().getSystemService("location");
            String validProvider = getValidProvider(locationManager, A00.A03);
            Callback callback3 = callback2;
            if (validProvider == null) {
                objArr = new Object[]{ABZ.A00(2, "No location provider available.")};
            } else if (isAppInBackground()) {
                objArr = new Object[]{ABZ.A00(2, "Cannot retrieve position while app is backgrounded.")};
            } else {
                Location A002 = AnonymousClass0ZD.A00(locationManager, validProvider);
                Callback callback4 = callback;
                if (A002 == null || ((double) (System.currentTimeMillis() - A002.getTime())) >= A00.A00) {
                    AC2 ac2 = new AC2(locationManager, validProvider, A00.A02, callback4, callback3);
                    if (isAppInBackground()) {
                        ac2.A06.invoke(ABZ.A00(2, "Cannot retrieve position while app is backgrounded."));
                        return;
                    }
                    ac2.A00 = A002;
                    AnonymousClass0ZD.A02(ac2.A04, ac2.A09, 100, 1.0f, ac2.A03);
                    AnonymousClass0ZA.A09(ac2.A05, ac2.A08, ac2.A02, -560823428);
                    return;
                }
                callback4.invoke(locationToMap(A002));
                return;
            }
            callback3.invoke(objArr);
        } catch (SecurityException e) {
            throwLocationPermissionMissing(e);
        }
    }

    public void stopObserving() {
        AnonymousClass0ZD.A01((LocationManager) getReactApplicationContext().getSystemService("location"), this.mLocationListener);
        this.mWatchedProvider = null;
    }
}
