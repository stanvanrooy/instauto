package com.fbpay.hub.form.cell.label;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.fbpay.hub.form.cell.CellParams;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import p000X.AnonymousClass0a4;
import p000X.C26481BmJ;
import p000X.C26537BnE;

public class LabelCellParams extends CellParams {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(107);
    public final int A00;
    public final ImmutableList A01;
    public final String A02;

    public class LinkParams implements Parcelable {
        public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(108);
        public final int A00;
        public final String A01;
        public final String A02;

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.A00);
            parcel.writeString(this.A01);
            parcel.writeString(this.A02);
        }

        public LinkParams(int i, String str, String str2) {
            this.A00 = i;
            this.A01 = str;
            this.A02 = str2;
        }

        public LinkParams(Parcel parcel) {
            this.A00 = parcel.readInt();
            String readString = parcel.readString();
            AnonymousClass0a4.A06(readString);
            this.A01 = readString;
            String readString2 = parcel.readString();
            AnonymousClass0a4.A06(readString2);
            this.A02 = readString2;
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeList(this.A01);
    }

    public LabelCellParams(C26481BmJ bmJ) {
        super((C26537BnE) bmJ);
        this.A02 = null;
        this.A00 = bmJ.A00;
        this.A01 = bmJ.A01;
    }

    public LabelCellParams(Parcel parcel) {
        super(parcel);
        this.A02 = parcel.readString();
        this.A00 = parcel.readInt();
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, LinkParams.class.getClassLoader());
        this.A01 = ImmutableList.A09(arrayList);
    }
}
