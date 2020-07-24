package com.instagram.discovery.related.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.common.typedurl.ImageUrl;
import p000X.AnonymousClass000;
import p000X.Constants;

public class RelatedItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(327);
    public Integer A00;
    public int A01;
    public ImageUrl A02;
    public String A03;
    public String A04;
    public String A05;

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0042, code lost:
        if (r4.equals("hashtag") == false) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004c, code lost:
        if (r4.equals("user") == false) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        if (r4.equals("location") == false) goto L_0x0024;
     */
    public final Integer A00() {
        char c;
        Integer num;
        if (this.A00 == null) {
            String str = this.A04;
            int hashCode = str.hashCode();
            if (hashCode == 3599307) {
                c = 2;
            } else if (hashCode == 697547724) {
                c = 0;
            } else if (hashCode == 1901043637) {
                c = 1;
            }
            c = 65535;
            if (c == 0) {
                num = Constants.ZERO;
            } else if (c == 1) {
                num = Constants.ONE;
            } else if (c != 2) {
                num = Constants.A0N;
            } else {
                num = Constants.A0C;
            }
            this.A00 = num;
        }
        return this.A00;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A02, i);
        parcel.writeInt(this.A01);
    }

    public final String A01() {
        if (A00().intValue() != 0) {
            return this.A05;
        }
        return AnonymousClass000.A0E("#", this.A05);
    }

    public RelatedItem() {
    }

    public RelatedItem(Parcel parcel) {
        this.A03 = parcel.readString();
        this.A05 = parcel.readString();
        this.A04 = parcel.readString();
        this.A02 = (ImageUrl) parcel.readParcelable(ImageUrl.class.getClassLoader());
        this.A01 = parcel.readInt();
    }
}
