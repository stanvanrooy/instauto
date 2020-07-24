package com.instagram.pendingmedia.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import com.instagram.model.direct.DirectThreadKey;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import p000X.AnonymousClass0a4;

public class GroupUserStoryTarget implements UserStoryTarget {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(75);
    public DirectThreadKey A00;
    public String A01;
    public String A02;
    public List A03;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            GroupUserStoryTarget groupUserStoryTarget = (GroupUserStoryTarget) obj;
            if (!Objects.equals(this.A02, groupUserStoryTarget.A02) || !Objects.equals(this.A03, groupUserStoryTarget.A03) || !Objects.equals(this.A01, groupUserStoryTarget.A01) || !Objects.equals(this.A00, groupUserStoryTarget.A00)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.A02, this.A03, this.A01, this.A00});
    }

    public final String A00() {
        String str = this.A00.A00;
        AnonymousClass0a4.A06(str);
        return str;
    }

    public final String AZE() {
        return this.A02;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeTypedList(this.A03);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
    }

    public GroupUserStoryTarget() {
    }

    public GroupUserStoryTarget(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A03 = parcel.createTypedArrayList(PendingRecipient.CREATOR);
        this.A01 = parcel.readString();
        this.A00 = (DirectThreadKey) parcel.readParcelable(DirectThreadKey.class.getClassLoader());
    }

    public GroupUserStoryTarget(List list, String str, String str2) {
        this.A02 = "GROUP";
        this.A03 = list;
        this.A01 = str;
        this.A00 = new DirectThreadKey(str2, (Collection) list);
    }
}
