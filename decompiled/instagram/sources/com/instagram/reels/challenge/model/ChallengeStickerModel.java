package com.instagram.reels.challenge.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.Spannable;
import android.text.TextUtils;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.common.typedurl.ImageUrl;
import p000X.C13150hy;
import p000X.C170037Ou;

public final class ChallengeStickerModel implements Parcelable {
    public static final PCreatorEBaseShape1S0000000_I1 CREATOR = new PCreatorEBaseShape1S0000000_I1(449);
    public float A00;
    public int A01;
    public Spannable A02;
    public ImageUrl A03;
    public C170037Ou A04;
    public String A05;
    public String A06;
    public String A07;
    public boolean A08;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChallengeStickerModel)) {
            return false;
        }
        ChallengeStickerModel challengeStickerModel = (ChallengeStickerModel) obj;
        return C13150hy.A05(this.A07, challengeStickerModel.A07) && Float.compare(this.A00, challengeStickerModel.A00) == 0 && C13150hy.A05(this.A04, challengeStickerModel.A04) && C13150hy.A05(this.A02, challengeStickerModel.A02) && this.A01 == challengeStickerModel.A01 && C13150hy.A05(this.A05, challengeStickerModel.A05) && C13150hy.A05(this.A06, challengeStickerModel.A06) && C13150hy.A05(this.A03, challengeStickerModel.A03) && this.A08 == challengeStickerModel.A08;
    }

    public final int hashCode() {
        String str = this.A07;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + Float.floatToIntBits(this.A00)) * 31;
        C170037Ou r0 = this.A04;
        int hashCode2 = (hashCode + (r0 != null ? r0.hashCode() : 0)) * 31;
        Spannable spannable = this.A02;
        int hashCode3 = (((hashCode2 + (spannable != null ? spannable.hashCode() : 0)) * 31) + this.A01) * 31;
        String str2 = this.A05;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.A06;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        ImageUrl imageUrl = this.A03;
        if (imageUrl != null) {
            i = imageUrl.hashCode();
        }
        int i2 = (hashCode5 + i) * 31;
        boolean z = this.A08;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public final String toString() {
        return "ChallengeStickerModel(title=" + this.A07 + ", titleTextSize=" + this.A00 + ", titleStyle=" + this.A04 + ", subtitle=" + this.A02 + ", subtitleTextColour=" + this.A01 + ", nominatorUserId=" + this.A05 + ", nominatorUsername=" + this.A06 + ", nominatorProfilePicUrl=" + this.A03 + ", isTitleEditable=" + this.A08 + ")";
    }

    public ChallengeStickerModel(String str, float f, C170037Ou r4, Spannable spannable, int i, String str2, String str3, ImageUrl imageUrl, boolean z) {
        C13150hy.A02(str, DialogModule.KEY_TITLE);
        C13150hy.A02(r4, "titleStyle");
        C13150hy.A02(spannable, "subtitle");
        this.A07 = str;
        this.A00 = f;
        this.A04 = r4;
        this.A02 = spannable;
        this.A01 = i;
        this.A05 = str2;
        this.A06 = str3;
        this.A03 = imageUrl;
        this.A08 = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (parcel != null) {
            parcel.writeString(this.A07);
            parcel.writeFloat(this.A00);
            parcel.writeInt(this.A04.ordinal());
            TextUtils.writeToParcel(this.A02, parcel, i);
            parcel.writeInt(this.A01);
            parcel.writeString(this.A05);
            parcel.writeString(this.A06);
            parcel.writeParcelable(this.A03, i);
            int i2 = 0;
            if (this.A08) {
                i2 = 1;
            }
            parcel.writeByte((byte) i2);
        }
    }
}
