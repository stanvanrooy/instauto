package com.facebook.location.signalpackage.parcelable;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.common.collect.ImmutableList;
import java.util.List;
import p000X.AnonymousClass178;
import p000X.C228989wS;
import p000X.C228999wU;

public class ParcelableActivityRecognitionResult extends C228999wU implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(79);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C228999wU)) {
            C228999wU r8 = (C228999wU) obj;
            if (this.A01 == r8.A01 && this.A00 == r8.A00) {
                List list = this.A02;
                if (list != null) {
                    return list.equals(r8.A02);
                }
                return r8.A02 == null;
            }
        }
        return false;
    }

    public static ParcelableActivityRecognitionResult A00(C228999wU r7) {
        ImmutableList A02;
        if (r7 == null) {
            return null;
        }
        List list = r7.A02;
        if (list == null) {
            A02 = null;
        } else {
            A02 = AnonymousClass178.A00(list).A01(new C228989wS()).A02();
        }
        return new ParcelableActivityRecognitionResult(A02, r7.A01, r7.A00);
    }

    public final int hashCode() {
        int i;
        long j = this.A01;
        long j2 = this.A00;
        int i2 = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        List list = this.A02;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        return i2 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        ImmutableList A02;
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
        List list = this.A02;
        if (list == null) {
            A02 = null;
        } else {
            A02 = AnonymousClass178.A00(list).A01(new C228989wS()).A02();
        }
        parcel.writeTypedList(A02);
    }

    public ParcelableActivityRecognitionResult(List list, long j, long j2) {
        super(list, j, j2);
    }
}
