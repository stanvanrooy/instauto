package com.instagram.music.common.model;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.C0003R;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import com.instagram.common.typedurl.ImageUrl;
import java.io.IOException;
import java.util.ArrayList;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass8BP;
import p000X.C13300iJ;
import p000X.C32001aN;
import p000X.C32011aO;
import p000X.C34561ew;

public class MusicAssetModel implements Parcelable, C32001aN {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(73);
    public int A00;
    public ImageUrl A01;
    public ImageUrl A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public ArrayList A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public C32011aO A0G;

    public final int describeContents() {
        return 0;
    }

    public static MusicAssetModel A00(Context context, C34561ew r4) {
        MusicAssetModel musicAssetModel = new MusicAssetModel();
        musicAssetModel.A07 = r4.A0J;
        musicAssetModel.A04 = r4.A0C;
        musicAssetModel.A09 = r4.A0K;
        musicAssetModel.A05 = r4.A0E;
        musicAssetModel.A0B = r4.A0L;
        musicAssetModel.A0E = r4.A0O;
        musicAssetModel.A0D = r4.A0N;
        musicAssetModel.A00 = r4.A00;
        musicAssetModel.A03 = r4.A0B;
        musicAssetModel.A0C = r4.A0M;
        if (r4.A0P) {
            musicAssetModel.A0A = context.getString(C0003R.string.original_audio_label);
            C13300iJ r1 = r4.A06;
            musicAssetModel.A06 = r1.AZn();
            ImageUrl imageUrl = r1.A05;
            if (imageUrl == null) {
                imageUrl = r1.ASv();
            }
            musicAssetModel.A01 = imageUrl;
            musicAssetModel.A02 = r1.ASv();
            musicAssetModel.A0F = true;
            musicAssetModel.A08 = r4.A0G;
        } else {
            musicAssetModel.A0A = r4.A0I;
            musicAssetModel.A06 = r4.A0F;
            musicAssetModel.A01 = r4.A01;
            musicAssetModel.A02 = r4.A02;
            musicAssetModel.A0F = false;
        }
        A02(musicAssetModel);
        return musicAssetModel;
    }

    public static MusicAssetModel A01(AnonymousClass8BP r2) {
        MusicAssetModel musicAssetModel = new MusicAssetModel();
        musicAssetModel.A07 = r2.A09;
        musicAssetModel.A04 = r2.A05;
        musicAssetModel.A09 = r2.A0B;
        musicAssetModel.A05 = r2.A06;
        musicAssetModel.A0B = r2.A0C;
        musicAssetModel.A0A = r2.A0A;
        musicAssetModel.A06 = r2.A08;
        musicAssetModel.A01 = r2.A01;
        musicAssetModel.A02 = r2.A02;
        musicAssetModel.A00 = r2.A00;
        musicAssetModel.A0E = r2.A0E;
        musicAssetModel.A0D = r2.A0D;
        musicAssetModel.A03 = r2.A04;
        A02(musicAssetModel);
        return musicAssetModel;
    }

    public static void A02(MusicAssetModel musicAssetModel) {
        String str = musicAssetModel.A09;
        if (str == null && musicAssetModel.A05 == null) {
            AnonymousClass0QD.A02("MusicAssetModel", String.format("Progressive Download Url and Dash Manifest cannot both be null for music asset id: %s", new Object[]{musicAssetModel.A07}));
        } else {
            musicAssetModel.A0G = new C32011aO(str, musicAssetModel.A05);
        }
        if (musicAssetModel.A00 <= 0) {
            musicAssetModel.A00 = 15000;
            AnonymousClass0QD.A01("MusicAssetModel", String.format("MusicAssetModel has invalid mTrackDurationInMs for music asset id: %s", new Object[]{musicAssetModel.A07}));
        }
    }

    public final int A03() {
        ArrayList arrayList = this.A0B;
        if (arrayList == null || arrayList.size() <= 0) {
            return 0;
        }
        return ((Integer) this.A0B.get(0)).intValue();
    }

    public final C32011aO AQV() {
        return this.A0G;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A07);
        parcel.writeString(this.A04);
        parcel.writeString(this.A09);
        parcel.writeString(this.A05);
        parcel.writeList(this.A0B);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A06);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A0E ? 1 : 0);
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeInt(this.A0F ? 1 : 0);
        parcel.writeString(this.A08);
    }

    public MusicAssetModel() {
    }

    public MusicAssetModel(Parcel parcel) {
        this.A07 = parcel.readString();
        this.A04 = parcel.readString();
        this.A09 = parcel.readString();
        this.A05 = parcel.readString();
        this.A0B = parcel.readArrayList(Integer.class.getClassLoader());
        this.A0A = parcel.readString();
        this.A06 = parcel.readString();
        Class<ImageUrl> cls = ImageUrl.class;
        this.A01 = (ImageUrl) parcel.readParcelable(cls.getClassLoader());
        this.A02 = (ImageUrl) parcel.readParcelable(cls.getClassLoader());
        this.A00 = parcel.readInt();
        boolean z = false;
        this.A0E = parcel.readInt() == 1;
        this.A0D = parcel.readInt() == 1;
        this.A0F = parcel.readInt() == 1 ? true : z;
        this.A08 = parcel.readString();
        try {
            A02(this);
        } catch (IOException e) {
            AnonymousClass0QD.A0A("MusicAssetModel", e);
        }
    }
}
