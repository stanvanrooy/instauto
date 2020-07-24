package com.google.android.material.stateful;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;
import p000X.ADF;
import p000X.AnonymousClass00N;

public class ExtendableSavedState extends AbsSavedState {
    public static final Parcelable.Creator CREATOR = new ADF();
    public final AnonymousClass00N A00;

    public final String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.A00 + "}";
    }

    public ExtendableSavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.A00 = new AnonymousClass00N(readInt);
        for (int i = 0; i < readInt; i++) {
            this.A00.put(strArr[i], bundleArr[i]);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int size = this.A00.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i2 = 0; i2 < size; i2++) {
            AnonymousClass00N r1 = this.A00;
            strArr[i2] = (String) r1.A06(i2);
            bundleArr[i2] = (Bundle) r1.A08(i2);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }
}
