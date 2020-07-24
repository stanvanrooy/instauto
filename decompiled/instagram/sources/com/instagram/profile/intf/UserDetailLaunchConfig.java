package com.instagram.profile.intf;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import com.instagram.discovery.filters.intf.FilterConfig;
import com.instagram.sponsored.analytics.SourceModelInfoParams;
import java.util.ArrayList;
import p000X.C52902Qq;

public class UserDetailLaunchConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(79);
    public final FilterConfig A00;
    public final AutoLaunchReelParams A01;
    public final UserDetailEntryInfo A02;
    public final SourceModelInfoParams A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final ArrayList A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A06);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A0O ? 1 : 0);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A09);
        int i2 = 0;
        if (this.A0G != null) {
            i2 = 1;
        }
        parcel.writeInt(i2);
        ArrayList arrayList = this.A0G;
        if (arrayList != null) {
            parcel.writeStringList(arrayList);
        }
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A03, i);
        parcel.writeInt(this.A0I ? 1 : 0);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A0J ? 1 : 0);
        parcel.writeParcelable(this.A02, i);
        parcel.writeInt(this.A0H ? 1 : 0);
        parcel.writeString(this.A0C);
        parcel.writeInt(this.A0M ? 1 : 0);
        parcel.writeInt(this.A0L ? 1 : 0);
        parcel.writeInt(this.A0K ? 1 : 0);
        parcel.writeInt(this.A0N ? 1 : 0);
        parcel.writeString(this.A04);
    }

    public UserDetailLaunchConfig(C52902Qq r2) {
        this.A0F = r2.A0F;
        this.A0E = r2.A0E;
        this.A0D = r2.A0D;
        this.A06 = r2.A06;
        this.A01 = r2.A01;
        this.A0O = r2.A0O;
        this.A0A = r2.A0A;
        this.A07 = r2.A07;
        this.A08 = r2.A08;
        this.A0B = r2.A0B;
        this.A09 = r2.A09;
        this.A0G = r2.A0G;
        this.A00 = r2.A00;
        this.A03 = r2.A03;
        this.A0I = r2.A0I;
        this.A05 = r2.A05;
        this.A0J = r2.A0J;
        this.A02 = r2.A02;
        this.A0H = r2.A0H;
        this.A0C = r2.A0C;
        this.A0M = r2.A0N;
        this.A0L = r2.A0L;
        this.A0K = r2.A0K;
        this.A0N = r2.A0M;
        this.A04 = r2.A04;
    }

    public UserDetailLaunchConfig(Parcel parcel) {
        this.A0F = parcel.readString();
        this.A0E = parcel.readString();
        this.A0D = parcel.readString();
        this.A06 = parcel.readString();
        this.A01 = (AutoLaunchReelParams) parcel.readParcelable(AutoLaunchReelParams.class.getClassLoader());
        boolean z = false;
        this.A0O = parcel.readInt() == 1;
        this.A0A = parcel.readString();
        this.A07 = parcel.readString();
        this.A08 = parcel.readString();
        this.A0B = parcel.readString();
        this.A09 = parcel.readString();
        if (parcel.readInt() == 1) {
            ArrayList arrayList = new ArrayList();
            this.A0G = arrayList;
            parcel.readStringList(arrayList);
        } else {
            this.A0G = null;
        }
        this.A00 = (FilterConfig) parcel.readParcelable(FilterConfig.class.getClassLoader());
        this.A03 = (SourceModelInfoParams) parcel.readParcelable(SourceModelInfoParams.class.getClassLoader());
        this.A0I = parcel.readInt() == 1;
        this.A05 = parcel.readString();
        this.A0J = parcel.readInt() == 1;
        this.A02 = (UserDetailEntryInfo) parcel.readParcelable(UserDetailEntryInfo.class.getClassLoader());
        this.A0H = parcel.readInt() == 1;
        this.A0C = parcel.readString();
        this.A0M = parcel.readInt() == 1;
        this.A0L = parcel.readInt() == 1;
        this.A0K = parcel.readInt() == 1;
        this.A0N = parcel.readInt() == 1 ? true : z;
        this.A04 = parcel.readString();
    }
}
