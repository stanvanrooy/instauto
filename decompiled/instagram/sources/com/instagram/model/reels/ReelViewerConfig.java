package com.instagram.model.reels;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import java.util.List;
import p000X.C30511Ud;
import p000X.C65322su;

public class ReelViewerConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(64);
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final List A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final boolean A0X;

    public final int describeContents() {
        return 0;
    }

    public static ReelViewerConfig A00() {
        return new ReelViewerConfig(new C30511Ud());
    }

    public final boolean A01() {
        if (this.A0X || this.A0O) {
            return true;
        }
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.A06);
        parcel.writeByte(this.A0D ? (byte) 1 : 0);
        parcel.writeByte(this.A0I ? (byte) 1 : 0);
        parcel.writeByte(this.A0W ? (byte) 1 : 0);
        parcel.writeByte(this.A0H ? (byte) 1 : 0);
        parcel.writeByte(this.A0M ? (byte) 1 : 0);
        parcel.writeByte(this.A0G ? (byte) 1 : 0);
        parcel.writeByte(this.A0F ? (byte) 1 : 0);
        parcel.writeByte(this.A0E ? (byte) 1 : 0);
        parcel.writeByte(this.A0A ? (byte) 1 : 0);
        parcel.writeByte(this.A0C ? (byte) 1 : 0);
        parcel.writeByte(this.A0L ? (byte) 1 : 0);
        parcel.writeByte(this.A0K ? (byte) 1 : 0);
        parcel.writeByte(this.A0J ? (byte) 1 : 0);
        parcel.writeByte(this.A08 ? (byte) 1 : 0);
        parcel.writeByte(this.A0V ? (byte) 1 : 0);
        parcel.writeByte(this.A0U ? (byte) 1 : 0);
        parcel.writeByte(this.A0B ? (byte) 1 : 0);
        parcel.writeByte(this.A0N ? (byte) 1 : 0);
        parcel.writeByte(this.A07 ? (byte) 1 : 0);
        parcel.writeByte(this.A0X ? (byte) 1 : 0);
        parcel.writeByte(this.A0O ? (byte) 1 : 0);
        parcel.writeByte(this.A0R ? (byte) 1 : 0);
        parcel.writeByte(this.A09 ? (byte) 1 : 0);
        parcel.writeByte(this.A0S ? (byte) 1 : 0);
        parcel.writeByte(this.A0P ? (byte) 1 : 0);
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A04);
        parcel.writeFloat(this.A02);
        parcel.writeFloat(this.A03);
        parcel.writeFloat(this.A00);
        parcel.writeFloat(this.A05);
        parcel.writeByte(this.A0T ? (byte) 1 : 0);
        parcel.writeByte(this.A0Q ? (byte) 1 : 0);
    }

    public ReelViewerConfig(C30511Ud r2) {
        this.A06 = r2.A06;
        this.A0D = false;
        this.A0I = false;
        this.A0W = false;
        this.A0H = false;
        this.A0M = false;
        this.A0G = false;
        this.A0F = false;
        this.A0E = false;
        this.A0A = false;
        this.A0C = false;
        this.A0L = false;
        this.A0K = false;
        this.A0J = false;
        this.A08 = false;
        this.A0V = false;
        this.A0U = false;
        this.A0B = false;
        this.A0N = false;
        this.A07 = false;
        this.A0X = r2.A09;
        this.A0O = r2.A0A;
        this.A0R = r2.A0C;
        this.A09 = r2.A07;
        this.A0S = r2.A0D;
        this.A0P = r2.A08;
        this.A01 = r2.A01;
        this.A04 = r2.A04;
        this.A02 = r2.A02;
        this.A03 = r2.A03;
        this.A00 = r2.A00;
        this.A05 = r2.A05;
        this.A0T = r2.A0E;
        this.A0Q = r2.A0B;
    }

    public ReelViewerConfig(Parcel parcel) {
        this.A06 = parcel.readArrayList(C65322su.class.getClassLoader());
        boolean z = true;
        this.A0D = parcel.readByte() != 0;
        this.A0I = parcel.readByte() != 0;
        this.A0W = parcel.readByte() != 0;
        this.A0H = parcel.readByte() != 0;
        this.A0M = parcel.readByte() != 0;
        this.A0G = parcel.readByte() != 0;
        this.A0F = parcel.readByte() != 0;
        this.A0E = parcel.readByte() != 0;
        this.A0A = parcel.readByte() != 0;
        this.A0C = parcel.readByte() != 0;
        this.A0L = parcel.readByte() != 0;
        this.A0K = parcel.readByte() != 0;
        this.A0J = parcel.readByte() != 0;
        this.A08 = parcel.readByte() != 0;
        this.A0V = parcel.readByte() != 0;
        this.A0U = parcel.readByte() != 0;
        this.A0B = parcel.readByte() != 0;
        this.A0N = parcel.readByte() != 0;
        this.A07 = parcel.readByte() != 0;
        this.A0X = parcel.readByte() != 0;
        this.A0O = parcel.readByte() != 0;
        this.A0R = parcel.readByte() != 0;
        this.A09 = parcel.readByte() != 0;
        this.A0S = parcel.readByte() != 0;
        this.A0P = parcel.readByte() != 0;
        this.A01 = parcel.readFloat();
        this.A04 = parcel.readFloat();
        this.A02 = parcel.readFloat();
        this.A03 = parcel.readFloat();
        this.A00 = parcel.readFloat();
        this.A05 = parcel.readFloat();
        this.A0T = parcel.readByte() != 0;
        this.A0Q = parcel.readByte() == 0 ? false : z;
    }
}
