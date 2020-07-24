package com.instagram.feed.media;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import com.instagram.model.shopping.ProductItemWithAR;
import java.util.List;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass17M;

public class CreativeConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(43);
    public AttributionUser A00;
    public EffectPreview A01;
    public ProductItemWithAR A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public List A07;

    public final int describeContents() {
        return 0;
    }

    public final String A00() {
        if (AnonymousClass17M.A00(this.A03, "superzoomV3") || AnonymousClass17M.A00(this.A03, "superzoom") || AnonymousClass17M.A00(this.A03, "focus")) {
            return this.A03;
        }
        return this.A04;
    }

    public final void A01(boolean z) {
        String str;
        EffectPreview effectPreview = this.A01;
        if (effectPreview != null) {
            if (z) {
                str = "SAVED";
            } else {
                str = "NOT_SAVED";
            }
            effectPreview.A08 = str;
        }
    }

    public final boolean A02() {
        if (AnonymousClass17M.A00(this.A03, "superzoom") || AnonymousClass17M.A00(this.A03, "focus") || AnonymousClass17M.A00(this.A03, "superzoomV3")) {
            return true;
        }
        return false;
    }

    public final boolean A03() {
        String str;
        StringBuilder sb;
        AttributionUser attributionUser = this.A00;
        if (attributionUser == null && this.A01 == null) {
            str = "CreativeConfig";
            sb = new StringBuilder("Attribution invalid due to missing top level attribution user and effect preview for effect ID: ");
            sb.append(this.A04);
        } else {
            EffectPreview effectPreview = this.A01;
            if (effectPreview != null) {
                attributionUser = effectPreview.A00;
            }
            if (attributionUser == null) {
                str = "CreativeConfig";
                sb = new StringBuilder("Attribution invalid due to missing attribution user for effect ID: ");
                sb.append(this.A04);
            } else if (attributionUser.A02 == null) {
                str = "CreativeConfig";
                sb = new StringBuilder("Attribution invalid due to missing attribution user name for effect ID: ");
                sb.append(this.A04);
            } else if (attributionUser.A01 == null) {
                str = "CreativeConfig";
                sb = new StringBuilder("Attribution invalid due to missing attribution user ID for effect ID: ");
                sb.append(this.A04);
            } else if (AnonymousClass17M.A00(this.A03, "hands_free") || AnonymousClass17M.A00(this.A03, "multicam")) {
                return false;
            } else {
                if (!AnonymousClass17M.A00(this.A03, "boomerang") && !AnonymousClass17M.A00(this.A03, "layout") && !AnonymousClass17M.A00(this.A03, "photobooth")) {
                    String str2 = this.A04;
                    if (str2 == null || str2.isEmpty()) {
                        str = "CreativeConfig";
                        sb = new StringBuilder("Attribution invalid due to missing effect ID. Camera Format: ");
                        sb.append(this.A03);
                    } else {
                        EffectPreview effectPreview2 = this.A01;
                        if (effectPreview2.A05 == null) {
                            str = "CreativeConfig";
                            sb = new StringBuilder("Effect invalid due to missing effect name for effect ID: ");
                            sb.append(str2);
                        } else {
                            ThumbnailImage thumbnailImage = effectPreview2.A02;
                            if (thumbnailImage == null || thumbnailImage.A00 == null) {
                                str = "CreativeConfig";
                                sb = new StringBuilder("Attribution invalid due to missing thumbnail image for effect ID: ");
                                sb.append(str2);
                            }
                        }
                    }
                }
                return true;
            }
        }
        AnonymousClass0QD.A01(str, sb.toString());
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A00, i);
        parcel.writeTypedList(this.A07);
    }

    public CreativeConfig() {
    }

    public CreativeConfig(Parcel parcel) {
        this.A03 = parcel.readString();
        this.A02 = (ProductItemWithAR) parcel.readParcelable(ProductItemWithAR.class.getClassLoader());
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
        this.A06 = parcel.readString();
        this.A01 = (EffectPreview) parcel.readParcelable(EffectPreview.class.getClassLoader());
        this.A00 = (AttributionUser) parcel.readParcelable(AttributionUser.class.getClassLoader());
        this.A07 = parcel.createTypedArrayList(EffectConfig.CREATOR);
    }
}
