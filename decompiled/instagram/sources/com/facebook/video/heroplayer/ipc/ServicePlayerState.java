package com.facebook.video.heroplayer.ipc;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import p000X.Constants;
import p000X.AnonymousClass0DB;
import p000X.C50052Es;

public final class ServicePlayerState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(13);
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public final long A0G;
    public final String A0H;

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0035, code lost:
        if (p000X.C50052Es.A01(p000X.Constants.A0u).equals(r2) != false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if (p000X.C50052Es.A01(p000X.Constants.A0u).equals(r2) != false) goto L_0x001b;
     */
    public final long A00() {
        boolean z;
        long j;
        boolean z2;
        Integer num = Constants.A0C;
        String A012 = C50052Es.A01(num);
        String str = this.A0H;
        if (!A012.equals(str)) {
            z = false;
        }
        z = true;
        if (z) {
            j = this.A08;
        } else {
            j = this.A04;
        }
        if (!C50052Es.A01(num).equals(str)) {
            z2 = false;
        }
        z2 = true;
        if (z2) {
            return j;
        }
        if (j < 0) {
            AnonymousClass0DB.A0K("ServicePlayerState", "negative position=%d", Long.valueOf(j));
            return 0;
        }
        long j2 = this.A0G;
        if (j2 <= 0 || j <= j2) {
            return j;
        }
        AnonymousClass0DB.A0K("ServicePlayerState", "position=%d bigger than duration=%d", Long.valueOf(j), Long.valueOf(j2));
        return this.A0G;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A0B);
        parcel.writeInt(this.A0E ? 1 : 0);
        parcel.writeInt(this.A0F ? 1 : 0);
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeLong(this.A0G);
        parcel.writeLong(this.A04);
        parcel.writeLong(this.A08);
        parcel.writeLong(this.A06);
        parcel.writeString(this.A0H);
        parcel.writeLong(this.A09);
        parcel.writeLong(this.A0A);
        parcel.writeInt(this.A02);
        parcel.writeLong(this.A07);
        parcel.writeLong(this.A0C);
        parcel.writeLong(this.A05);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A03);
    }

    public ServicePlayerState() {
        this.A0B = 0;
        this.A0E = false;
        this.A0F = false;
        this.A0D = false;
        this.A0G = 0;
        this.A04 = 0;
        this.A08 = 0;
        this.A06 = 0;
        this.A0H = "";
        this.A09 = -1;
        this.A0A = -1;
        this.A02 = 0;
        this.A01 = 0;
        this.A07 = 0;
        this.A0C = -1;
        this.A05 = -1;
        this.A00 = 0;
        this.A03 = 0;
    }

    public ServicePlayerState(long j, boolean z, boolean z2, boolean z3, long j2, long j3, long j4, long j5, String str, long j6, long j7, int i, int i2, long j8, long j9, long j10, int i3, int i4) {
        this.A0B = j;
        this.A0E = z;
        this.A0F = z2;
        this.A0D = z3;
        this.A0G = j2;
        this.A04 = j3;
        this.A08 = j4;
        this.A06 = j5;
        this.A0H = str;
        this.A09 = j6;
        this.A0A = j7;
        this.A02 = i;
        this.A01 = i2;
        this.A07 = j8;
        this.A0C = j9;
        this.A05 = j10;
        this.A00 = i3;
        this.A03 = i4;
    }

    public ServicePlayerState(Parcel parcel) {
        this.A0B = parcel.readLong();
        boolean z = false;
        this.A0E = parcel.readInt() == 1;
        this.A0F = parcel.readInt() == 1;
        this.A0D = parcel.readInt() == 1 ? true : z;
        this.A0G = parcel.readLong();
        this.A04 = parcel.readLong();
        this.A08 = parcel.readLong();
        this.A06 = parcel.readLong();
        this.A0H = parcel.readString();
        this.A09 = parcel.readLong();
        this.A0A = parcel.readLong();
        this.A02 = parcel.readInt();
        this.A07 = parcel.readLong();
        this.A0C = parcel.readLong();
        this.A05 = parcel.readLong();
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A03 = parcel.readInt();
    }
}
