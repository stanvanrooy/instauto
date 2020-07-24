package com.facebook.video.heroplayer.ipc;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import p000X.Constants;
import p000X.C40781pF;

public final class VideoPlayRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(15);
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public C40781pF A04;
    public VideoSource A05;
    public Integer A06;
    public String A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public final float A0H;
    public final int A0I;
    public final int A0J;
    public final int A0K;
    public final VideoPlayContextualSetting A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;

    public final int describeContents() {
        return 0;
    }

    public final boolean A00() {
        return this.A05.A01();
    }

    public final boolean equals(Object obj) {
        VideoSource videoSource = this.A05;
        if (videoSource.A0D == null || !(obj instanceof VideoPlayRequest) || !videoSource.equals(((VideoPlayRequest) obj).A05)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A05.hashCode() * 31;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        this.A05.writeToParcel(parcel, i);
        parcel.writeString(this.A07);
        parcel.writeString(this.A04.name());
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeInt(this.A0F ? 1 : 0);
        parcel.writeInt(this.A0G ? 1 : 0);
        switch (this.A06.intValue()) {
            case 1:
                i2 = 1;
                break;
            case 2:
                i2 = 2;
                break;
            case 3:
                i2 = 3;
                break;
            case 4:
                i2 = 4;
                break;
            default:
                i2 = 0;
                break;
        }
        parcel.writeInt(i2);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A0N ? 1 : 0);
        this.A0L.writeToParcel(parcel, i);
        parcel.writeInt(this.A0K);
        parcel.writeInt(this.A0J);
        parcel.writeInt(this.A0O ? 1 : 0);
        parcel.writeInt(this.A0P ? 1 : 0);
        parcel.writeInt(this.A0M ? 1 : 0);
        parcel.writeFloat(this.A0H);
        parcel.writeInt(this.A0I);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A0R ? 1 : 0);
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeInt(this.A0Q ? 1 : 0);
        parcel.writeInt(this.A0E ? 1 : 0);
        parcel.writeLong(this.A03);
    }

    public VideoPlayRequest(Parcel parcel) {
        this.A05 = (VideoSource) VideoSource.CREATOR.createFromParcel(parcel);
        this.A07 = parcel.readString();
        this.A04 = C40781pF.valueOf(parcel.readString());
        this.A00 = parcel.readInt();
        boolean z = false;
        this.A0C = parcel.readInt() == 1;
        this.A0A = parcel.readInt() == 1;
        this.A0F = parcel.readInt() == 1;
        this.A0G = parcel.readInt() == 1;
        this.A06 = Constants.ZERO(5)[parcel.readInt()];
        this.A01 = parcel.readInt();
        this.A09 = parcel.readInt() == 1;
        this.A02 = parcel.readInt();
        this.A0N = parcel.readInt() == 1;
        this.A0L = (VideoPlayContextualSetting) VideoPlayContextualSetting.CREATOR.createFromParcel(parcel);
        this.A0K = parcel.readInt();
        this.A0J = parcel.readInt();
        this.A0O = parcel.readInt() == 1;
        this.A0P = parcel.readInt() == 1;
        this.A0M = parcel.readInt() == 1;
        this.A0H = parcel.readFloat();
        this.A0I = parcel.readInt();
        this.A08 = parcel.readInt() == 1;
        this.A0R = parcel.readInt() == 1;
        this.A0D = parcel.readInt() == 1;
        this.A0B = parcel.readInt() == 1;
        this.A0Q = parcel.readInt() == 1;
        this.A0E = parcel.readInt() == 1 ? true : z;
        this.A03 = parcel.readLong();
    }

    public VideoPlayRequest(VideoSource videoSource, C40781pF r5, int i, boolean z, Integer num, int i2, int i3, VideoPlayContextualSetting videoPlayContextualSetting, int i4, boolean z2) {
        this.A05 = videoSource;
        this.A07 = "IgHeroPlayer";
        this.A04 = r5;
        this.A00 = i;
        this.A0C = false;
        this.A0A = false;
        this.A0F = z;
        this.A0G = true;
        this.A06 = num;
        this.A01 = i2;
        this.A09 = false;
        this.A02 = i3;
        this.A0N = false;
        this.A0L = videoPlayContextualSetting;
        this.A0K = -1;
        this.A0J = i4;
        this.A0O = false;
        this.A0P = false;
        this.A0M = z2;
        this.A0H = 1.0f;
        this.A0I = 1;
        this.A0R = false;
        this.A0D = false;
        this.A0B = false;
        this.A0Q = false;
        this.A0E = false;
        this.A03 = 0;
    }
}
