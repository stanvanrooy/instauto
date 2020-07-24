package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Comparator;
import p000X.C120125Dh;
import p000X.C228479tj;
import p000X.C228529v7;

public class DetectedActivity extends AbstractSafeParcelable {
    public static final int[] A02 = {0, 1, 2, 3, 7, 8, 16, 17};
    public static final Comparator A03 = new C228529v7();
    public static final int[] A04 = {9, 10};
    public static final int[] A05 = {0, 1, 2, 4, 5, 6, 7, 8, 10, 11, 12, 13, 14, 16, 17, 18, 19};
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(217);
    public int A00;
    public int A01;

    public DetectedActivity(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                DetectedActivity detectedActivity = (DetectedActivity) obj;
                if (!(this.A00 == detectedActivity.A00 && this.A01 == detectedActivity.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A00), Integer.valueOf(this.A01)});
    }

    public final String toString() {
        String str;
        int i = this.A00;
        if (i > 19 || i < 0) {
            i = 4;
        }
        if (i == 0) {
            str = "IN_VEHICLE";
        } else if (i == 1) {
            str = "ON_BICYCLE";
        } else if (i == 2) {
            str = "ON_FOOT";
        } else if (i == 3) {
            str = "STILL";
        } else if (i == 4) {
            str = NetInfoModule.CONNECTION_TYPE_UNKNOWN_DEPRECATED;
        } else if (i == 5) {
            str = "TILTING";
        } else if (i == 7) {
            str = "WALKING";
        } else if (i != 8) {
            switch (i) {
                case 16:
                    str = "IN_ROAD_VEHICLE";
                    break;
                case C120125Dh.VIEW_TYPE_CUSTOM_ITEM:
                    str = "IN_RAIL_VEHICLE";
                    break;
                case 18:
                    str = "IN_TWO_WHEELER_VEHICLE";
                    break;
                case 19:
                    str = "IN_FOUR_WHEELER_VEHICLE";
                    break;
                default:
                    str = Integer.toString(i);
                    break;
            }
        } else {
            str = "RUNNING";
        }
        int i2 = this.A01;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 48);
        sb.append("DetectedActivity [type=");
        sb.append(str);
        sb.append(", confidence=");
        sb.append(i2);
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A04(parcel, 1, this.A00);
        C228479tj.A04(parcel, 2, this.A01);
        C228479tj.A02(parcel, A002);
    }
}
