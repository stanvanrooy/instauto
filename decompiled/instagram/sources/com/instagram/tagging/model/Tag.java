package com.instagram.tagging.model;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.Map;
import p000X.C27738CPh;

public abstract class Tag implements Parcelable {
    public PointF A00;

    public abstract PointF A00();

    public abstract C27738CPh A01();

    public abstract TaggableModel A02();

    public abstract String A04();

    public abstract String A05();

    public abstract void A07(TaggableModel taggableModel);

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Tag)) {
            return false;
        }
        return ((Tag) obj).A03().equals(A03());
    }

    public String A03() {
        return A02().getId();
    }

    public Map A06() {
        return Collections.emptyMap();
    }

    public int hashCode() {
        return (A03().hashCode() * 31) + getClass().hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(A02(), i);
        parcel.writeParcelable(this.A00, i);
    }

    public Tag() {
    }

    public Tag(Parcel parcel, ClassLoader classLoader) {
        A07((TaggableModel) parcel.readParcelable(classLoader));
        this.A00 = (PointF) parcel.readParcelable(classLoader);
    }
}
