package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import p000X.C228479tj;
import p000X.C228599vI;

public class Configuration extends AbstractSafeParcelable implements Comparable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(220);
    public final int A00;
    public final Map A01 = new TreeMap();
    public final zzi[] A02;
    public final String[] A03;

    public Configuration(int i, zzi[] zziArr, String[] strArr) {
        this.A00 = i;
        this.A02 = zziArr;
        for (zzi zzi : zziArr) {
            this.A01.put(zzi.A01, zzi);
        }
        this.A03 = strArr;
        if (strArr != null) {
            Arrays.sort(strArr);
        }
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return this.A00 - ((Configuration) obj).A00;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Configuration) {
            Configuration configuration = (Configuration) obj;
            return this.A00 == configuration.A00 && C228599vI.A00(this.A01, configuration.A01) && Arrays.equals(this.A03, configuration.A03);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Configuration(");
        sb.append(this.A00);
        sb.append(", ");
        sb.append("(");
        for (zzi append : this.A01.values()) {
            sb.append(append);
            sb.append(", ");
        }
        sb.append(")");
        sb.append(", ");
        sb.append("(");
        String[] strArr = this.A03;
        if (strArr != null) {
            for (String append2 : strArr) {
                sb.append(append2);
                sb.append(", ");
            }
        } else {
            sb.append("null");
        }
        sb.append(")");
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A04(parcel, 2, this.A00);
        C228479tj.A0F(parcel, 3, this.A02, i);
        C228479tj.A0G(parcel, 4, this.A03);
        C228479tj.A02(parcel, A002);
    }
}
