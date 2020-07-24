package com.facebook.common.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.Arrays;
import java.util.Iterator;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass8OO;

public class ParcelablePair extends Pair implements Iterable, Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(58);

    public final int describeContents() {
        return 0;
    }

    public Object[] A00() {
        if (!(this instanceof Triplet)) {
            return new Object[]{this.first, this.second};
        }
        Triplet triplet = (Triplet) this;
        if (!(triplet instanceof Quartet)) {
            return new Object[]{triplet.first, triplet.second, triplet.A00};
        }
        Quartet quartet = (Quartet) triplet;
        return new Object[]{quartet.first, quartet.second, quartet.A00, quartet.A00};
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ParcelablePair)) {
            return false;
        }
        return Arrays.equals(A00(), ((ParcelablePair) obj).A00());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.first);
        parcel.writeValue(this.second);
    }

    public final int hashCode() {
        return Arrays.hashCode(A00());
    }

    public final Iterator iterator() {
        Object[] A00 = A00();
        int length = A00.length;
        boolean z = false;
        if (length >= 0) {
            z = true;
        }
        AnonymousClass0a4.A09(z);
        AnonymousClass0a4.A05(0, 0 + length, length);
        AnonymousClass0a4.A04(0, length);
        if (length == 0) {
            return AnonymousClass8OO.A01;
        }
        return new AnonymousClass8OO(A00, length);
    }

    public final String toString() {
        return AnonymousClass000.A0E(getClass().getSimpleName(), Arrays.toString(A00()));
    }

    public ParcelablePair(Object obj, Object obj2) {
        super(obj, obj2);
    }
}
