package com.instagram.pendingmedia.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Objects;

public class AllUserStoryTarget implements UserStoryTarget {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(443);
    public String A00;
    public List A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AllUserStoryTarget allUserStoryTarget = (AllUserStoryTarget) obj;
            if (this.A01 != allUserStoryTarget.A01 || !this.A00.equals(allUserStoryTarget.A00)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.A00, this.A01});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeList(this.A01);
    }

    public final String AZE() {
        return this.A00;
    }

    public AllUserStoryTarget() {
    }

    public AllUserStoryTarget(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A01 = parcel.readArrayList(AllUserStoryTarget.class.getClassLoader());
    }

    public AllUserStoryTarget(List list) {
        this.A00 = "ALL_WITH_BLACKLIST";
        if (list != null) {
            this.A01 = ImmutableList.A09(list);
        }
    }
}
