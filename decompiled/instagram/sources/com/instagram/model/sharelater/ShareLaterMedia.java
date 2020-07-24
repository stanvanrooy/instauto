package com.instagram.model.sharelater;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.mediatype.IgShareLaterMedia;
import com.instagram.model.mediatype.MediaType;
import com.instagram.model.venue.Venue;
import p000X.Constants;
import p000X.AnonymousClass1NJ;
import p000X.instagramComment;
import p000X.C37171jE;

public class ShareLaterMedia implements IgShareLaterMedia {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(366);
    public ImageUrl A00;
    public MediaType A01;
    public String A02;
    public String A03;
    public Venue A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;

    public final boolean Abe() {
        return false;
    }

    public final boolean ApG() {
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A01.A00);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A04, i);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeBooleanArray(new boolean[]{this.A0B, this.A06, this.A0A, this.A05, this.A09});
        parcel.writeInt(this.A08 ? 1 : 0);
    }

    public final C37171jE AGF() {
        return C37171jE.DEFAULT;
    }

    public final boolean Abg() {
        return this.A07;
    }

    public final boolean Ae9() {
        return this.A05;
    }

    public final boolean AfQ() {
        return this.A06;
    }

    public final boolean Agk() {
        return this.A09;
    }

    public final boolean AiE() {
        return this.A0A;
    }

    public final boolean AiF() {
        return this.A0B;
    }

    public final void Bi7(boolean z) {
        this.A05 = z;
    }

    public final void Bi8(boolean z) {
        this.A06 = z;
    }

    public final void BiE(boolean z) {
        this.A09 = z;
    }

    public final void BiH(boolean z) {
        this.A0A = z;
    }

    public final void BiI(boolean z) {
        this.A0B = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003c, code lost:
        if (r3.A0h() == null) goto L_0x003e;
     */
    public ShareLaterMedia(AnonymousClass1NJ r3, ImageUrl imageUrl) {
        boolean z;
        instagramComment r0 = r3.A0K;
        if (r0 != null) {
            this.A02 = r0.commentText;
        }
        this.A03 = r3.getId();
        this.A01 = r3.APx();
        this.A00 = imageUrl;
        this.A04 = r3.A0z;
        int i = 0;
        while (true) {
            if (i >= r3.A07()) {
                z = false;
                break;
            } else if (r3.A0P(i).AiO()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        this.A07 = z;
        boolean z2 = r3.A0g() != null ? true : z2;
        z2 = false;
        this.A08 = z2;
    }

    public ShareLaterMedia(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A01 = MediaType.A00(parcel.readInt());
        this.A00 = (ImageUrl) parcel.readParcelable(ImageUrl.class.getClassLoader());
        this.A04 = (Venue) parcel.readParcelable(Venue.class.getClassLoader());
        boolean z = false;
        this.A07 = parcel.readInt() == 1;
        boolean[] zArr = new boolean[Constants.ZERO(5).length];
        parcel.readBooleanArray(zArr);
        this.A0B = zArr[Constants.ZERO.intValue()];
        this.A06 = zArr[Constants.ONE.intValue()];
        this.A0A = zArr[Constants.A0C.intValue()];
        this.A05 = zArr[Constants.A0N.intValue()];
        this.A09 = zArr[Constants.A0Y.intValue()];
        this.A08 = parcel.readInt() != 0 ? true : z;
    }
}
