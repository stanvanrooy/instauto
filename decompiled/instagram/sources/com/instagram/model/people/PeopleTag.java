package com.instagram.model.people;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.memorydump.MemoryDumpUploadJob;
import com.instagram.tagging.model.Tag;
import com.instagram.tagging.model.TaggableModel;
import p000X.C13300iJ;
import p000X.C27738CPh;

public class PeopleTag extends Tag {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(61);
    public UserInfo A00;

    public class UserInfo implements TaggableModel {
        public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(62);
        public ImageUrl A00;
        public String A01;
        public String A02;
        public String A03;

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                UserInfo userInfo = (UserInfo) obj;
                if (!TextUtils.equals(this.A03, userInfo.A03) || !TextUtils.equals(this.A02, userInfo.A02)) {
                    return false;
                }
            }
            return true;
        }

        public final String getId() {
            return this.A02;
        }

        public final int hashCode() {
            return (this.A02.hashCode() * 31) + this.A03.hashCode();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.A02);
            parcel.writeString(this.A03);
            parcel.writeString(this.A01);
            parcel.writeParcelable(this.A00, i);
        }

        public final void Bhx(String str) {
            this.A02 = str;
        }

        public UserInfo() {
        }

        public UserInfo(C13300iJ r2) {
            this.A03 = r2.AZn();
            this.A02 = r2.getId();
            this.A01 = r2.AMN();
            this.A00 = r2.ASv();
        }

        public UserInfo(Parcel parcel) {
            this.A02 = parcel.readString();
            this.A03 = parcel.readString();
            this.A01 = parcel.readString();
            this.A00 = (ImageUrl) parcel.readParcelable(ImageUrl.class.getClassLoader());
        }
    }

    public final String A04() {
        return MemoryDumpUploadJob.EXTRA_USER_ID;
    }

    public final PointF A00() {
        return this.A00;
    }

    public final C27738CPh A01() {
        return C27738CPh.PEOPLE;
    }

    public final /* bridge */ /* synthetic */ TaggableModel A02() {
        return this.A00;
    }

    public final String A05() {
        return this.A00.A03;
    }

    public final /* bridge */ /* synthetic */ void A07(TaggableModel taggableModel) {
        this.A00 = (UserInfo) taggableModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((PeopleTag) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public PeopleTag() {
        this.A00 = new UserInfo();
    }

    public PeopleTag(C13300iJ r2) {
        this.A00 = new UserInfo(r2);
    }

    public PeopleTag(C13300iJ r2, PointF pointF) {
        this.A00 = pointF;
        this.A00 = new UserInfo(r2);
    }

    public PeopleTag(Parcel parcel) {
        super(parcel, UserInfo.class.getClassLoader());
    }
}
