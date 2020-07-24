package com.instagram.bloks.hosting;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p000X.AnonymousClass2DG;
import p000X.C06590Pq;
import p000X.C146586Oj;
import p000X.C49672Dd;
import p000X.C53772Uh;

public class IgBloksScreenConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(21);
    public int A00;
    public C146586Oj A01;
    public AnonymousClass2DG A02;
    public AnonymousClass2DG A03;
    public C49672Dd A04;
    public C06590Pq A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public Integer A09;
    public Integer A0A;
    public Integer A0B;
    public Integer A0C;
    public Integer A0D;
    public String A0E;
    public String A0F;
    public HashMap A0G;
    public HashMap A0H;
    public List A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public String A0P;
    public HashMap A0Q;
    public final Set A0R;

    public final int describeContents() {
        return 0;
    }

    public static Integer A00(Parcel parcel) {
        return (Integer) parcel.readValue(IgBloksScreenConfig.class.getClassLoader());
    }

    public static Object A01(IgBloksScreenConfig igBloksScreenConfig, C53772Uh r2, Integer num) {
        if (num == null) {
            return null;
        }
        igBloksScreenConfig.A0R.add(num);
        return r2.A01.get(num.intValue());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A0P);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0E);
        parcel.writeSerializable(this.A0Q);
        parcel.writeSerializable(this.A0H);
        parcel.writeSerializable(this.A0G);
        parcel.writeValue(this.A0C);
        parcel.writeValue(this.A0A);
        parcel.writeValue(this.A0B);
        parcel.writeInt(this.A0N ? 1 : 0);
        parcel.writeInt(this.A0K ? 1 : 0);
        parcel.writeInt(this.A0M ? 1 : 0);
        parcel.writeInt(this.A0L ? 1 : 0);
        parcel.writeInt(this.A0O ? 1 : 0);
        parcel.writeValue(this.A09);
        parcel.writeValue(this.A06);
        parcel.writeValue(this.A08);
        parcel.writeValue(this.A07);
        parcel.writeValue(this.A0D);
        parcel.writeInt(this.A0J ? 1 : 0);
        parcel.writeValue(Integer.valueOf(this.A00));
    }

    public IgBloksScreenConfig() {
        this.A00 = 16;
        this.A0N = false;
        this.A0K = false;
        this.A0M = true;
        this.A0L = false;
        this.A0O = true;
        this.A0R = new HashSet();
    }

    public IgBloksScreenConfig(Parcel parcel) {
        this.A00 = 16;
        boolean z = false;
        this.A0N = false;
        this.A0K = false;
        this.A0M = true;
        this.A0L = false;
        this.A0O = true;
        this.A0R = new HashSet();
        this.A0P = parcel.readString();
        this.A0F = parcel.readString();
        this.A0E = parcel.readString();
        this.A0Q = (HashMap) parcel.readSerializable();
        this.A0H = (HashMap) parcel.readSerializable();
        this.A0G = (HashMap) parcel.readSerializable();
        this.A0C = A00(parcel);
        this.A0A = A00(parcel);
        this.A0B = A00(parcel);
        this.A0N = parcel.readInt() == 1;
        this.A0K = parcel.readInt() == 1;
        this.A0M = parcel.readInt() == 1;
        this.A0L = parcel.readInt() == 1;
        this.A0O = parcel.readInt() == 1;
        this.A09 = A00(parcel);
        this.A06 = A00(parcel);
        this.A08 = A00(parcel);
        this.A07 = A00(parcel);
        this.A0D = A00(parcel);
        this.A0J = parcel.readInt() == 1 ? true : z;
        this.A00 = parcel.readInt();
    }
}
