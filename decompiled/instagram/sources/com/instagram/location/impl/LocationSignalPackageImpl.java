package com.instagram.location.impl;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.location.signalpackage.parcelable.ParcelableLocationSignalPackage;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.location.intf.LocationSignalPackage;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Collections;
import p000X.C12890hY;
import p000X.C13460iZ;
import p000X.C200268hj;
import p000X.C44121vd;
import p000X.C54512Xq;
import p000X.C56492ca;
import p000X.C56582cj;
import p000X.C56612cm;
import p000X.C56632co;

public class LocationSignalPackageImpl implements LocationSignalPackage {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(347);
    public final C54512Xq A00;

    public final int describeContents() {
        return 0;
    }

    public final Location APE() {
        C44121vd r0 = this.A00.A01;
        if (r0 != null) {
            return new Location(r0.A00);
        }
        return null;
    }

    public final String BrQ() {
        C56582cj A02 = C56492ca.A02((String) null, Collections.singletonList(this.A00), (String) null, (Integer) null, (Boolean) null);
        C200268hj r3 = new C200268hj(A02.A01, A02.A03);
        try {
            StringWriter stringWriter = new StringWriter();
            C13460iZ A05 = C12890hY.A00.A05(stringWriter);
            A05.A0T();
            if (r3.A01 != null) {
                A05.A0d("wifi_info");
                C56612cm.A00(A05, r3.A01);
            }
            if (r3.A00 != null) {
                A05.A0d("bluetooth_info");
                C56632co.A00(A05, r3.A00);
            }
            A05.A0Q();
            A05.close();
            return stringWriter.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((LocationSignalPackageImpl) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(ParcelableLocationSignalPackage.A00(this.A00), 0);
    }

    public LocationSignalPackageImpl(C54512Xq r1) {
        this.A00 = r1;
    }
}
