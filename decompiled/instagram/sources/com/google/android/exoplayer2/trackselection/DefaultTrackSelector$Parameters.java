package com.google.android.exoplayer2.trackselection;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p000X.C25948Bd0;

public final class DefaultTrackSelector$Parameters implements Parcelable {
    public static final DefaultTrackSelector$Parameters A0J = new DefaultTrackSelector$Parameters(new SparseArray(), new SparseBooleanArray(), (String) null, (String) null, false, 0, false, false, true, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, true, true, Integer.MAX_VALUE, Integer.MAX_VALUE, true, 0, false);
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(151);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final SparseArray A07;
    public final SparseBooleanArray A08;
    public final String A09;
    public final String A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a3  */
    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DefaultTrackSelector$Parameters defaultTrackSelector$Parameters = (DefaultTrackSelector$Parameters) obj;
        if (this.A0H != defaultTrackSelector$Parameters.A0H || this.A00 != defaultTrackSelector$Parameters.A00 || this.A0G != defaultTrackSelector$Parameters.A0G || this.A0C != defaultTrackSelector$Parameters.A0C || this.A0D != defaultTrackSelector$Parameters.A0D || this.A03 != defaultTrackSelector$Parameters.A03 || this.A02 != defaultTrackSelector$Parameters.A02 || this.A0F != defaultTrackSelector$Parameters.A0F || this.A0E != defaultTrackSelector$Parameters.A0E || this.A0I != defaultTrackSelector$Parameters.A0I || this.A06 != defaultTrackSelector$Parameters.A06 || this.A05 != defaultTrackSelector$Parameters.A05 || this.A01 != defaultTrackSelector$Parameters.A01 || this.A04 != defaultTrackSelector$Parameters.A04 || this.A0B != defaultTrackSelector$Parameters.A0B || !TextUtils.equals(this.A09, defaultTrackSelector$Parameters.A09) || !TextUtils.equals(this.A0A, defaultTrackSelector$Parameters.A0A)) {
            return false;
        }
        SparseBooleanArray sparseBooleanArray = this.A08;
        SparseBooleanArray sparseBooleanArray2 = defaultTrackSelector$Parameters.A08;
        int size = sparseBooleanArray.size();
        if (sparseBooleanArray2.size() == size) {
            int i = 0;
            while (true) {
                if (i < size) {
                    if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                        break;
                    }
                    i++;
                } else {
                    z = true;
                    break;
                }
            }
            if (z) {
                return false;
            }
            SparseArray sparseArray = this.A07;
            SparseArray sparseArray2 = defaultTrackSelector$Parameters.A07;
            int size2 = sparseArray.size();
            if (sparseArray2.size() == size2) {
                int i2 = 0;
                while (true) {
                    if (i2 < size2) {
                        int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                        if (indexOfKey < 0) {
                            break;
                        }
                        Map map = (Map) sparseArray.valueAt(i2);
                        Map map2 = (Map) sparseArray2.valueAt(indexOfKey);
                        if (map2.size() == map.size()) {
                            Iterator it = map.entrySet().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z3 = true;
                                    break;
                                }
                                Map.Entry entry = (Map.Entry) it.next();
                                TrackGroupArray trackGroupArray = (TrackGroupArray) entry.getKey();
                                if (map2.containsKey(trackGroupArray)) {
                                    if (!C25948Bd0.A0D(entry.getValue(), map2.get(trackGroupArray))) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                        z3 = false;
                        if (!z3) {
                            break;
                        }
                        i2++;
                    } else {
                        z2 = true;
                        break;
                    }
                }
            }
            z2 = false;
            return z2;
        }
        z = false;
        if (z) {
        }
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((((((((this.A0H ? 1 : 0) * true) + this.A00) * 31) + (this.A0G ? 1 : 0)) * 31) + (this.A0C ? 1 : 0)) * 31) + (this.A0D ? 1 : 0)) * 31) + this.A03) * 31) + this.A02) * 31) + (this.A0F ? 1 : 0)) * 31) + (this.A0E ? 1 : 0)) * 31) + (this.A0I ? 1 : 0)) * 31) + this.A06) * 31) + this.A05) * 31) + this.A01) * 31) + this.A04) * 31) + (this.A0B ? 1 : 0)) * 31) + this.A09.hashCode()) * 31) + this.A0A.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        SparseArray sparseArray = this.A07;
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            int keyAt = sparseArray.keyAt(i2);
            Map map = (Map) sparseArray.valueAt(i2);
            int size2 = map.size();
            parcel.writeInt(keyAt);
            parcel.writeInt(size2);
            for (Map.Entry entry : map.entrySet()) {
                parcel.writeParcelable((Parcelable) entry.getKey(), 0);
                parcel.writeParcelable((Parcelable) entry.getValue(), 0);
            }
        }
        parcel.writeSparseBooleanArray(this.A08);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0A);
        parcel.writeInt(this.A0H ? 1 : 0);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A0G ? 1 : 0);
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A0F ? 1 : 0);
        parcel.writeInt(this.A0E ? 1 : 0);
        parcel.writeInt(this.A06);
        parcel.writeInt(this.A05);
        parcel.writeInt(this.A0I ? 1 : 0);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A0B ? 1 : 0);
    }

    public DefaultTrackSelector$Parameters(Parcel parcel) {
        int readInt = parcel.readInt();
        SparseArray sparseArray = new SparseArray(readInt);
        for (int i = 0; i < readInt; i++) {
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            HashMap hashMap = new HashMap(readInt3);
            for (int i2 = 0; i2 < readInt3; i2++) {
                hashMap.put((TrackGroupArray) parcel.readParcelable(TrackGroupArray.class.getClassLoader()), (DefaultTrackSelector$SelectionOverride) parcel.readParcelable(DefaultTrackSelector$SelectionOverride.class.getClassLoader()));
            }
            sparseArray.put(readInt2, hashMap);
        }
        this.A07 = sparseArray;
        this.A08 = parcel.readSparseBooleanArray();
        this.A09 = parcel.readString();
        this.A0A = parcel.readString();
        this.A0H = C25948Bd0.A0C(parcel);
        this.A00 = parcel.readInt();
        this.A0G = C25948Bd0.A0C(parcel);
        this.A0C = C25948Bd0.A0C(parcel);
        this.A0D = C25948Bd0.A0C(parcel);
        this.A03 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A0F = C25948Bd0.A0C(parcel);
        this.A0E = C25948Bd0.A0C(parcel);
        this.A06 = parcel.readInt();
        this.A05 = parcel.readInt();
        this.A0I = C25948Bd0.A0C(parcel);
        this.A04 = parcel.readInt();
        this.A0B = C25948Bd0.A0C(parcel);
    }

    public DefaultTrackSelector$Parameters(SparseArray sparseArray, SparseBooleanArray sparseBooleanArray, String str, String str2, boolean z, int i, boolean z2, boolean z3, boolean z4, int i2, int i3, int i4, boolean z5, boolean z6, int i5, int i6, boolean z7, int i7, boolean z8) {
        this.A07 = sparseArray;
        this.A08 = sparseBooleanArray;
        this.A09 = C25948Bd0.A08(str);
        this.A0A = C25948Bd0.A08(str2);
        this.A0H = z;
        this.A00 = i;
        this.A0G = z2;
        this.A0C = z3;
        this.A0D = z4;
        this.A03 = i2;
        this.A02 = i3;
        this.A01 = i4;
        this.A0F = z5;
        this.A0E = z6;
        this.A06 = i5;
        this.A05 = i6;
        this.A0I = z7;
        this.A04 = i7;
        this.A0B = z8;
    }
}
