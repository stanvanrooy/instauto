package com.instagram.pendingmedia.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.Objects;

public class EventUserStoryTarget implements UserStoryTarget {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(446);
    public long A00;
    public String A01;
    public String A02;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            EventUserStoryTarget eventUserStoryTarget = (EventUserStoryTarget) obj;
            if (this.A00 != eventUserStoryTarget.A00 || !this.A02.equals(eventUserStoryTarget.A02) || !this.A01.equals(eventUserStoryTarget.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.A02, this.A01, Long.valueOf(this.A00)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeLong(this.A00);
    }

    public final String AZE() {
        return this.A02;
    }

    public EventUserStoryTarget() {
    }

    public EventUserStoryTarget(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        this.A00 = parcel.readLong();
    }

    public EventUserStoryTarget(String str, long j) {
        this.A02 = "EVENT";
        this.A01 = str;
        this.A00 = j;
    }
}
