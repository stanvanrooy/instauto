package com.instagram.creation.capture.quickcapture.postcreation;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.List;
import p000X.AnonymousClass0a4;
import p000X.C140455zU;

public class IngestSessionShim implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(301);
    public final boolean A00;
    public final String[] A01;

    public static IngestSessionShim A00(List list) {
        boolean z = ((C140455zU) list.get(0)).A01;
        int size = list.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            boolean z2 = false;
            if (z == ((C140455zU) list.get(i)).A01) {
                z2 = true;
            }
            AnonymousClass0a4.A09(z2);
            strArr[i] = ((C140455zU) list.get(i)).A00;
        }
        return new IngestSessionShim(strArr, z);
    }

    public final int describeContents() {
        return 0;
    }

    public final String[] A01() {
        AnonymousClass0a4.A0B(this.A00, "Keys should be non-null. Is an isLegacy guard missing?");
        return this.A01;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01.length);
        parcel.writeStringArray(this.A01);
        parcel.writeInt(this.A00 ? 1 : 0);
    }

    public IngestSessionShim(Parcel parcel) {
        String[] strArr = new String[parcel.readInt()];
        this.A01 = strArr;
        parcel.readStringArray(strArr);
        this.A00 = parcel.readInt() != 1 ? false : true;
    }

    public IngestSessionShim(String[] strArr, boolean z) {
        this.A01 = strArr;
        this.A00 = z;
    }
}
