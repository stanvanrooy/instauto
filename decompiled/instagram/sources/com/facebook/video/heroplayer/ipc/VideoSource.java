package com.facebook.video.heroplayer.ipc;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import java.util.HashMap;
import java.util.Map;
import p000X.C40751pB;
import p000X.C40771pE;

public final class VideoSource implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(17);
    public long A00;
    public long A01;
    public Uri A02;
    public Uri A03;
    public VideoProtocolProps A04;
    public C40771pE A05;
    public C40751pB A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public Map A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoSource)) {
            return false;
        }
        VideoSource videoSource = (VideoSource) obj;
        if (this.A06 == videoSource.A06) {
            Uri uri = this.A03;
            Uri uri2 = videoSource.A03;
            if (uri == uri2 || (uri != null && uri.equals(uri2))) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                String str = this.A0D;
                String str2 = videoSource.A0D;
                if (str == str2 || (str != null && str.equals(str2))) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    C40771pE r1 = this.A05;
                    C40771pE r0 = videoSource.A05;
                    if (r1 == r0 || (r1 != null && r1.equals(r0))) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean A00() {
        String str = this.A0C;
        if (str != null) {
            return str.equals("av01");
        }
        String str2 = this.A07;
        if (str2 == null || !str2.contains("codecs=\"av01")) {
            return false;
        }
        return true;
    }

    public final boolean A01() {
        if (this.A06 == C40751pB.DASH_LIVE) {
            return true;
        }
        return false;
    }

    public final boolean A02() {
        VideoProtocolProps videoProtocolProps;
        String str;
        boolean z = false;
        if (this.A06 == C40751pB.VIDEO_PROTOCOL_LIVE) {
            z = true;
        }
        if (!z || (videoProtocolProps = this.A04) == null || (str = videoProtocolProps.A00) == null || str.isEmpty()) {
            return false;
        }
        return true;
    }

    public final boolean A03() {
        String str = this.A0C;
        if (str != null) {
            return str.equals("vp9");
        }
        String str2 = this.A07;
        if (str2 == null || !str2.contains("codecs=\"vp")) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.A06.hashCode() * 31;
        String str = this.A0D;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        Uri uri = this.A03;
        if (uri != null) {
            i2 = uri.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        Object valueOf;
        StringBuilder sb = new StringBuilder("Type: ");
        sb.append(this.A06);
        String str = this.A0D;
        if (str != null) {
            sb.append("\n\tId: ");
            sb.append(str);
        }
        Uri uri = this.A03;
        if (uri != null) {
            sb.append("\n\tUri: ");
            sb.append(uri);
        }
        String str2 = this.A08;
        if (str2 != null) {
            sb.append("\n\tOrigin: ");
            sb.append(str2);
        }
        String str3 = this.A09;
        if (str3 != null) {
            sb.append("\n\tSubOrigin: ");
            sb.append(str3);
        }
        sb.append("\n\tDashMPD: ");
        String str4 = this.A07;
        if (str4 == null) {
            valueOf = "NULL";
        } else {
            valueOf = Integer.valueOf(str4.length());
        }
        sb.append(valueOf);
        String str5 = this.A0C;
        if (str5 != null) {
            sb.append("\n\tCodec: ");
            sb.append(str5);
        }
        Uri uri2 = this.A02;
        if (uri2 != null) {
            sb.append("\n\tSubtitle: ");
            sb.append(uri2);
        }
        sb.append("\n\tliveLatency: ");
        sb.append(this.A00);
        sb.append("\n\tliveLatencyTolerance: ");
        sb.append(this.A01);
        sb.append("\n\tisSpherical: ");
        sb.append(this.A0J);
        sb.append("\n\tisSponsored: ");
        sb.append(this.A0K);
        sb.append("\n\tisAdBreak: ");
        sb.append(this.A0F);
        sb.append("\n\tisLiveTraceEnabled: ");
        sb.append(this.A0I);
        sb.append("\n\trenderMode: ");
        sb.append(this.A0A);
        sb.append("\n\tisBroadcast: ");
        sb.append(this.A0H);
        sb.append("\n\tcontentType: ");
        sb.append(this.A05);
        sb.append("\n\tisAudioDataListenerEnabled: ");
        sb.append(this.A0G);
        sb.append("\n\tmVideoProtocolProps: ");
        sb.append(this.A04);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A03, 0);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A07);
        parcel.writeString(this.A0C);
        parcel.writeParcelable(this.A02, 0);
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        parcel.writeString(this.A06.name());
        parcel.writeLong(this.A00);
        parcel.writeLong(this.A01);
        parcel.writeString(this.A0B);
        parcel.writeInt(this.A0E.size());
        for (Map.Entry entry : this.A0E.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
        parcel.writeByte(this.A0J ? (byte) 1 : 0);
        parcel.writeByte(this.A0K ? (byte) 1 : 0);
        parcel.writeByte(this.A0F ? (byte) 1 : 0);
        parcel.writeByte(this.A0I ? (byte) 1 : 0);
        parcel.writeString(this.A0A);
        parcel.writeByte(this.A0H ? (byte) 1 : 0);
        parcel.writeString(this.A05.name());
        parcel.writeByte(this.A0G ? (byte) 1 : 0);
        if (this.A04 == null) {
            parcel.writeByte((byte) 1);
            return;
        }
        parcel.writeByte((byte) 0);
        this.A04.writeToParcel(parcel, i);
    }

    public VideoSource() {
    }

    public VideoSource(Uri uri, String str, String str2, String str3, Uri uri2, String str4, String str5, C40751pB r11, String str6, boolean z, boolean z2, boolean z3, boolean z4, Map map, String str7, C40771pE r19) {
        this.A03 = uri;
        this.A0D = str;
        this.A07 = str2;
        this.A0C = str3;
        this.A02 = uri2;
        this.A08 = str4;
        this.A09 = str5;
        this.A06 = r11;
        this.A00 = -1;
        this.A01 = -1;
        this.A0B = str6;
        this.A0E = map;
        this.A0J = z;
        this.A0K = z2;
        this.A0F = false;
        this.A0I = z3;
        this.A0G = z4;
        this.A0A = str7;
        this.A0H = false;
        this.A05 = r19;
        this.A04 = null;
    }

    public VideoSource(Parcel parcel) {
        ClassLoader classLoader = VideoSource.class.getClassLoader();
        this.A03 = (Uri) parcel.readParcelable(classLoader);
        this.A0D = parcel.readString();
        this.A07 = parcel.readString();
        this.A0C = parcel.readString();
        this.A02 = (Uri) parcel.readParcelable(classLoader);
        this.A08 = parcel.readString();
        this.A09 = parcel.readString();
        this.A06 = C40751pB.valueOf(parcel.readString());
        this.A00 = parcel.readLong();
        this.A01 = parcel.readLong();
        this.A0B = parcel.readString();
        int readInt = parcel.readInt();
        this.A0E = new HashMap();
        boolean z = false;
        for (int i = 0; i < readInt; i++) {
            this.A0E.put(parcel.readString(), parcel.readString());
        }
        this.A0J = parcel.readByte() == 1;
        this.A0K = parcel.readByte() == 1;
        this.A0F = parcel.readByte() == 1;
        this.A0I = parcel.readByte() == 1;
        this.A0A = parcel.readString();
        this.A0H = parcel.readByte() == 1;
        this.A05 = C40771pE.valueOf(parcel.readString());
        this.A0G = parcel.readByte() == 1 ? true : z;
        if (parcel.readByte() == 1) {
            this.A04 = null;
        } else {
            this.A04 = (VideoProtocolProps) VideoProtocolProps.CREATOR.createFromParcel(parcel);
        }
    }
}
