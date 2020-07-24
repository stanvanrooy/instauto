package com.instagram.music.common.config;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.music.common.model.MusicAssetModel;
import java.io.IOException;
import java.io.StringWriter;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0IY;
import p000X.AnonymousClass8BP;
import p000X.C12890hY;
import p000X.C13460iZ;
import p000X.C34561ew;
import p000X.C44311vw;

public class MusicAttributionConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(430);
    public MusicAssetModel A00;
    public AnonymousClass8BP A01;
    public final int A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;
    public final String A07;

    public final int describeContents() {
        return 0;
    }

    public final MusicAssetModel A00(AnonymousClass0C1 r3) {
        if (this.A00 == null) {
            if (TextUtils.isEmpty(this.A07)) {
                return null;
            }
            try {
                this.A00 = C44311vw.parseFromJson(AnonymousClass0IY.A00(r3, this.A07));
            } catch (IOException unused) {
                return null;
            }
        }
        return this.A00;
    }

    public final AnonymousClass8BP A01(AnonymousClass0C1 r4) {
        MusicAssetModel A002;
        if (this.A01 == null && (A002 = A00(r4)) != null) {
            AnonymousClass8BP r1 = new AnonymousClass8BP();
            r1.A09 = A002.A07;
            r1.A05 = A002.A04;
            r1.A0A = A002.A0A;
            r1.A08 = A002.A06;
            r1.A01 = A002.A01;
            r1.A02 = A002.A02;
            r1.A0B = A002.A09;
            r1.A00 = A002.A00;
            r1.A06 = A002.A05;
            r1.A0C = A002.A0B;
            r1.A0E = A002.A0E;
            r1.A0D = A002.A0D;
            AnonymousClass8BP.A00(r1);
            this.A01 = r1;
        }
        return this.A01;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A07);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A02);
    }

    public MusicAttributionConfig(Context context, C34561ew r6, String str) {
        this.A03 = str;
        String str2 = null;
        if (r6 != null) {
            try {
                MusicAssetModel A002 = MusicAssetModel.A00(context, r6);
                StringWriter stringWriter = new StringWriter();
                C13460iZ A052 = C12890hY.A00.A05(stringWriter);
                C44311vw.A00(A052, A002);
                A052.close();
                str2 = stringWriter.toString();
            } catch (IOException unused) {
            }
            this.A07 = str2;
            this.A06 = r6.A0R;
            this.A04 = r6.A0H;
            this.A05 = r6.A0Q;
            this.A02 = r6.A07.intValue();
            return;
        }
        this.A07 = null;
        this.A06 = false;
        this.A04 = null;
        this.A05 = false;
        this.A02 = 0;
    }

    public MusicAttributionConfig(Parcel parcel) {
        this.A07 = parcel.readString();
        this.A03 = parcel.readString();
        boolean z = false;
        this.A06 = parcel.readInt() == 1;
        this.A04 = parcel.readString();
        this.A05 = parcel.readInt() == 1 ? true : z;
        this.A02 = parcel.readInt();
    }

    public MusicAttributionConfig(MusicAssetModel musicAssetModel, boolean z, String str, boolean z2, int i) {
        String str2;
        try {
            StringWriter stringWriter = new StringWriter();
            C13460iZ A052 = C12890hY.A00.A05(stringWriter);
            C44311vw.A00(A052, musicAssetModel);
            A052.close();
            str2 = stringWriter.toString();
        } catch (IOException unused) {
            str2 = null;
        }
        this.A07 = str2;
        this.A03 = null;
        this.A06 = z;
        this.A04 = str;
        this.A05 = z2;
        this.A02 = i;
    }
}
