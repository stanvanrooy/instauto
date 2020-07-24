package com.facebook.video.heroplayer.ipc;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import p000X.Constants;
import p000X.C40781pF;
import p000X.C41931rD;

public final class VideoPrefetchRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(16);
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public C40781pF A07;
    public VideoPlayContextualSetting A08;
    public VideoSource A09;
    public Integer A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public boolean A0E;
    public boolean A0F;

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("VideoPrefetchRequest");
        sb.append("\nmCacheKey: ");
        sb.append(this.A0B);
        sb.append("\nmPrefetchOffset: ");
        sb.append(this.A05);
        sb.append("\nmPrefetchBytes: ");
        sb.append(this.A02);
        sb.append("\nmStreamType: ");
        sb.append(this.A03);
        sb.append("\nmQueueBehavior: ");
        Integer num = this.A0A;
        if (num != null) {
            str = C41931rD.A00(num);
        } else {
            str = "null";
        }
        sb.append(str);
        sb.append("\nmAtomSize: ");
        sb.append(this.A00);
        sb.append("\nmBitRate: ");
        sb.append(this.A01);
        sb.append("\nmQualityLabel: ");
        sb.append(this.A0D);
        sb.append("\nmVideoDurationMs: ");
        sb.append(this.A04);
        sb.append("\nmPrefetchSource: ");
        sb.append(this.A0C);
        sb.append("\nmVideoStatus: ");
        sb.append(this.A07.name());
        sb.append("\nVideoPrefetchRequest.VideoSource");
        sb.append("\n");
        sb.append(this.A09.toString());
        sb.append("\nmTargetContentReadyTimeMs: ");
        sb.append(this.A06);
        sb.append("\nmIsAudioOn: ");
        sb.append(this.A0E);
        sb.append("\nmShouldForceHighPriority: ");
        sb.append(this.A0F);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        this.A09.writeToParcel(parcel, i);
        parcel.writeString(this.A0B);
        parcel.writeLong(this.A05);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A0D);
        parcel.writeInt(this.A04);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A07.name());
        parcel.writeString(C41931rD.A00(this.A0A));
        this.A08.writeToParcel(parcel, i);
        parcel.writeLong(this.A06);
        parcel.writeByte(this.A0E ? (byte) 1 : 0);
        parcel.writeByte(this.A0F ? (byte) 1 : 0);
    }

    public VideoPrefetchRequest(Parcel parcel) {
        Integer num;
        this.A09 = (VideoSource) VideoSource.CREATOR.createFromParcel(parcel);
        this.A0B = parcel.readString();
        this.A05 = parcel.readLong();
        this.A02 = parcel.readInt();
        this.A03 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A0D = parcel.readString();
        this.A04 = parcel.readInt();
        this.A0C = parcel.readString();
        this.A07 = C40781pF.valueOf(parcel.readString());
        String readString = parcel.readString();
        if (readString.equals("Unspecified")) {
            num = Constants.ZERO;
        } else if (readString.equals("Front")) {
            num = Constants.ONE;
        } else if (readString.equals("Back")) {
            num = Constants.A0C;
        } else if (readString.equals("LowPriority")) {
            num = Constants.A0N;
        } else {
            throw new IllegalArgumentException(readString);
        }
        this.A0A = num;
        this.A08 = (VideoPlayContextualSetting) VideoPlayContextualSetting.CREATOR.createFromParcel(parcel);
        this.A06 = parcel.readLong();
        boolean z = true;
        this.A0E = parcel.readByte() != 0;
        this.A0F = parcel.readByte() == 0 ? false : z;
    }

    public VideoPrefetchRequest(VideoPrefetchRequest videoPrefetchRequest) {
        this.A09 = videoPrefetchRequest.A09;
        this.A0B = videoPrefetchRequest.A0B;
        this.A05 = videoPrefetchRequest.A05;
        this.A02 = videoPrefetchRequest.A02;
        this.A03 = videoPrefetchRequest.A03;
        this.A00 = videoPrefetchRequest.A00;
        this.A01 = videoPrefetchRequest.A01;
        this.A0D = videoPrefetchRequest.A0D;
        this.A04 = videoPrefetchRequest.A04;
        this.A0C = videoPrefetchRequest.A0C;
        this.A07 = videoPrefetchRequest.A07;
        this.A0A = videoPrefetchRequest.A0A;
        this.A08 = videoPrefetchRequest.A08;
        this.A06 = videoPrefetchRequest.A06;
        this.A0E = videoPrefetchRequest.A0E;
        this.A0F = videoPrefetchRequest.A0F;
    }

    public VideoPrefetchRequest(VideoSource videoSource, String str, int i, int i2, int i3, int i4, String str2, int i5, String str3, C40781pF r12, Integer num, VideoPlayContextualSetting videoPlayContextualSetting, long j, boolean z, boolean z2) {
        this.A09 = videoSource;
        this.A0B = str;
        this.A05 = 0;
        this.A02 = i;
        this.A03 = i2;
        this.A00 = i3;
        this.A01 = i4;
        this.A0D = str2;
        this.A04 = i5;
        this.A0C = str3;
        this.A07 = r12;
        this.A0A = num;
        this.A08 = videoPlayContextualSetting;
        this.A06 = j;
        this.A0E = z;
        this.A0F = z2;
    }
}
