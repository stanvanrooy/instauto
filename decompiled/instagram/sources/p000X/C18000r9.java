package p000X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.wellbeing.locationtransparency.fragment.LocationTransparencyUserProfile;

/* renamed from: X.0r9  reason: invalid class name and case insensitive filesystem */
public final class C18000r9 extends C18010rA {
    public final C140115ys A00() {
        return new C140115ys();
    }

    public final void A01(C13300iJ r9, FragmentActivity fragmentActivity, boolean z) {
        LocationTransparencyUserProfile locationTransparencyUserProfile;
        LocationTransparencyUserProfile locationTransparencyUserProfile2;
        String id = r9.getId();
        String AZn = r9.AZn();
        String AMN = r9.AMN();
        ImageUrl ASv = r9.ASv();
        String str = r9.A2Y;
        boolean z2 = r9.A2z;
        boolean z3 = r9.A30;
        if (str != null) {
            locationTransparencyUserProfile = new LocationTransparencyUserProfile(id, AZn, AMN, ASv, str, z2, z3);
            locationTransparencyUserProfile2 = locationTransparencyUserProfile;
        } else {
            locationTransparencyUserProfile = null;
            locationTransparencyUserProfile2 = null;
        }
        if (locationTransparencyUserProfile != null) {
            C18010rA.A00.A00();
            C140535zc r2 = new C140535zc();
            Bundle bundle = new Bundle();
            bundle.putParcelable("LOCATION_TRANSPARENCY_USER_PROFILE", locationTransparencyUserProfile2);
            bundle.putBoolean("LOCATION_TRANSPARENCY_IS_FROM_PROFILE", z);
            r2.setArguments(bundle);
            C31221Wz A01 = C31201Wx.A01(fragmentActivity);
            if (A01 != null) {
                A01.A0F(r2);
            }
        }
    }
}
