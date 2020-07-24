package com.facebook.common.callercontext;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import p000X.AnonymousClass000;

public class ContextChain implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(46);
    public String A00;
    public final int A01;
    public final ContextChain A02;
    public final String A03;
    public final String A04;

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        if (this.A00 == null) {
            this.A00 = AnonymousClass000.A0J(this.A04, ":", this.A03);
            ContextChain contextChain = this.A02;
            if (contextChain != null) {
                this.A00 = AnonymousClass000.A03(contextChain.toString(), '/', this.A00);
            }
        }
        return this.A00;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A01);
        parcel.writeParcelable(this.A02, i);
    }

    public ContextChain(Parcel parcel) {
        this.A04 = parcel.readString();
        this.A03 = parcel.readString();
        this.A01 = parcel.readInt();
        this.A02 = (ContextChain) parcel.readParcelable(ContextChain.class.getClassLoader());
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final int hashCode() {
        return super.hashCode();
    }
}
