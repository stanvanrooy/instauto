package p000X;

import android.content.Context;
import android.graphics.Bitmap;
import android.location.Address;
import android.location.Geocoder;
import com.instagram.common.gallery.Medium;
import java.io.IOException;
import java.util.List;

/* renamed from: X.BUV */
public final class BUV implements BUi {
    public final Geocoder A00;

    public final boolean Ape() {
        return false;
    }

    public final String getName() {
        return "LocationFeatureScanner";
    }

    public final int getVersion() {
        return 1;
    }

    public final boolean Bec(Medium medium, BUT but, Bitmap bitmap) {
        Medium medium2 = medium;
        double d = medium2.A01;
        double[] dArr = {medium2.A00, d};
        try {
            List<Address> fromLocation = this.A00.getFromLocation(dArr[0], d, 1);
            if (!fromLocation.isEmpty()) {
                Address address = fromLocation.get(0);
                BUT but2 = but;
                but2.A02 = Double.valueOf(dArr[0]);
                but2.A03 = Double.valueOf(dArr[1]);
                but2.A0F = address.getFeatureName();
                but2.A0H = address.getLocality();
                but2.A0I = address.getSubAdminArea();
                but2.A0E = address.getCountryName();
                address.getLocality();
                address.getFeatureName();
            }
            return true;
        } catch (IllegalArgumentException e) {
            AnonymousClass0DB.A0G("LocationFeatureScanner", "invalid arguments passed to geocoder latlng: " + dArr[0] + "," + dArr[1], e);
            return true;
        } catch (IOException e2) {
            AnonymousClass0DB.A0G("LocationFeatureScanner", "geocoding failed", e2);
            return false;
        } catch (Exception e3) {
            AnonymousClass0DB.A0G("LocationFeatureScanner", "geocoding failed", e3);
            AnonymousClass0QD.A0A("LocationFeatureScanner#exception", e3);
            return true;
        }
    }

    public BUV(Context context) {
        this.A00 = new Geocoder(context);
    }
}
