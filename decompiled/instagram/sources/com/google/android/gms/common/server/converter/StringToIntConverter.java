package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import p000X.C228479tj;
import p000X.C228649vO;

public final class StringToIntConverter extends AbstractSafeParcelable implements C228649vO {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(177);
    public final SparseArray A00;
    public final HashMap A01;
    public final int A02;

    public final class zaa extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(178);
        public final int A00;
        public final String A01;
        public final int A02;

        public final void writeToParcel(Parcel parcel, int i) {
            int A002 = C228479tj.A00(parcel);
            C228479tj.A04(parcel, 1, this.A02);
            C228479tj.A0A(parcel, 2, this.A01, false);
            C228479tj.A04(parcel, 3, this.A00);
            C228479tj.A02(parcel, A002);
        }

        public zaa(int i, String str, int i2) {
            this.A02 = i;
            this.A01 = str;
            this.A00 = i2;
        }

        public zaa(String str, int i) {
            this.A02 = 1;
            this.A01 = str;
            this.A00 = i;
        }
    }

    public final /* synthetic */ Object A9q(Object obj) {
        String str = (String) this.A00.get(((Integer) obj).intValue());
        if (str != null || !this.A01.containsKey("gms_unknown")) {
            return str;
        }
        return "gms_unknown";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A04(parcel, 1, this.A02);
        ArrayList arrayList = new ArrayList();
        for (String str : this.A01.keySet()) {
            arrayList.add(new zaa(str, ((Integer) this.A01.get(str)).intValue()));
        }
        C228479tj.A0C(parcel, 2, arrayList, false);
        C228479tj.A02(parcel, A002);
    }

    public StringToIntConverter() {
        this.A02 = 1;
        this.A01 = new HashMap();
        this.A00 = new SparseArray();
    }

    public StringToIntConverter(int i, ArrayList arrayList) {
        this.A02 = i;
        this.A01 = new HashMap();
        this.A00 = new SparseArray();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            zaa zaa2 = (zaa) obj;
            String str = zaa2.A01;
            int i3 = zaa2.A00;
            this.A01.put(str, Integer.valueOf(i3));
            this.A00.put(i3, str);
        }
    }
}
