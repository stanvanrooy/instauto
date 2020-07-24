package p000X;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.location.LocationModule;

/* renamed from: X.AC1 */
public final class AC1 implements LocationListener {
    public final /* synthetic */ LocationModule A00;

    public final void onProviderDisabled(String str) {
    }

    public final void onProviderEnabled(String str) {
    }

    public AC1(LocationModule locationModule) {
        this.A00 = locationModule;
    }

    public final void onLocationChanged(Location location) {
        A44 reactApplicationContextIfActiveOrWarn = this.A00.getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContextIfActiveOrWarn.A01(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("geolocationDidChange", LocationModule.locationToMap(location));
        }
    }

    public final void onStatusChanged(String str, int i, Bundle bundle) {
        LocationModule locationModule;
        int i2;
        StringBuilder sb;
        String str2;
        if (i == 0) {
            locationModule = this.A00;
            i2 = 2;
            sb = new StringBuilder();
            sb.append("Provider ");
            sb.append(str);
            str2 = " is out of service.";
        } else if (i == 1) {
            locationModule = this.A00;
            i2 = 3;
            sb = new StringBuilder();
            sb.append("Provider ");
            sb.append(str);
            str2 = " is temporarily unavailable.";
        } else {
            return;
        }
        sb.append(str2);
        LocationModule.emitError(locationModule, i2, sb.toString());
    }
}
