package com.instagram.guides.intf;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass6VD;
import p000X.C159836rw;

public final class GuideGridFragmentConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(339);
    public final AnonymousClass6VD A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    public final int describeContents() {
        return 0;
    }

    private void A00() {
        AnonymousClass0a4.A06(this.A00);
        boolean z = true;
        boolean z2 = false;
        if (this.A02 != null) {
            z2 = true;
        }
        boolean z3 = false;
        if (this.A03 != null) {
            z3 = true;
        }
        AnonymousClass0a4.A09(z2 ^ z3);
        if (this.A01 == null && this.A04) {
            z = false;
        }
        AnonymousClass0a4.A09(z);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeInt(this.A05 ? 1 : 0);
    }

    public GuideGridFragmentConfig(C159836rw r2) {
        this.A00 = r2.A00;
        this.A01 = r2.A01;
        this.A03 = r2.A03;
        this.A02 = r2.A02;
        this.A04 = r2.A04;
        this.A05 = r2.A05;
        A00();
    }

    public GuideGridFragmentConfig(Parcel parcel) {
        this.A00 = (AnonymousClass6VD) AnonymousClass6VD.A01.get(parcel.readString());
        this.A01 = parcel.readString();
        this.A03 = parcel.readString();
        this.A02 = parcel.readString();
        boolean z = false;
        this.A04 = parcel.readInt() == 1;
        this.A05 = parcel.readInt() == 1 ? true : z;
        A00();
    }
}
