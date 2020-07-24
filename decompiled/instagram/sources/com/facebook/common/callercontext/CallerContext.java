package com.facebook.common.callercontext;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.Arrays;
import p000X.C204808pb;
import p000X.C228299sA;

public class CallerContext implements Parcelable {
    public static final CallerContext A05 = new CallerContext();
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(45);
    public final ContextChain A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CallerContext)) {
            return false;
        }
        CallerContext callerContext = (CallerContext) obj;
        return C204808pb.A00(this.A02, callerContext.A02) && C204808pb.A00(this.A01, callerContext.A01) && C204808pb.A00(this.A03, callerContext.A03) && C204808pb.A00(this.A04, callerContext.A04) && C204808pb.A00(this.A00, callerContext.A00);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, this.A01, this.A03, this.A04, this.A00});
    }

    public final String toString() {
        C228299sA r2 = new C228299sA(getClass().getSimpleName());
        C228299sA.A00(r2, "Calling Class Name", this.A02);
        C228299sA.A00(r2, "Analytics Tag", this.A01);
        C228299sA.A00(r2, "Feature tag", this.A03);
        C228299sA.A00(r2, "Module Analytics Tag", this.A04);
        C228299sA.A00(r2, "Context Chain", this.A00);
        return r2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A01);
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A00, i);
    }

    public CallerContext() {
        this.A02 = null;
        this.A01 = null;
        this.A04 = null;
        this.A03 = null;
        this.A00 = null;
    }

    public CallerContext(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A01 = parcel.readString();
        this.A04 = parcel.readString();
        this.A00 = (ContextChain) parcel.readParcelable(ContextChain.class.getClassLoader());
    }
}
