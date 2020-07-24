package com.facebook.cameracore.ardelivery.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import java.io.Serializable;
import java.util.Arrays;
import p000X.AnonymousClass17M;

public class ARCapabilityMinVersionModeling implements Parcelable, Serializable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(4);
    public VersionedCapability mCapability;
    public int mMinVersion;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            ARCapabilityMinVersionModeling aRCapabilityMinVersionModeling = (ARCapabilityMinVersionModeling) obj;
            if (!AnonymousClass17M.A00(this.mCapability, aRCapabilityMinVersionModeling.mCapability) || !AnonymousClass17M.A00(Integer.valueOf(this.mMinVersion), Integer.valueOf(aRCapabilityMinVersionModeling.mMinVersion))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.mCapability, Integer.valueOf(this.mMinVersion)});
    }

    public int getCapabilityXplatValue() {
        return this.mCapability.getXplatValue();
    }

    public String toString() {
        return "capability: " + this.mCapability + ", minVersion:" + this.mMinVersion;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mCapability.ordinal());
        parcel.writeInt(this.mMinVersion);
    }

    public int getMinVersion() {
        return this.mMinVersion;
    }

    public ARCapabilityMinVersionModeling() {
    }

    public ARCapabilityMinVersionModeling(Parcel parcel) {
        this.mCapability = VersionedCapability.values()[parcel.readInt()];
        this.mMinVersion = parcel.readInt();
    }

    public ARCapabilityMinVersionModeling(VersionedCapability versionedCapability, int i) {
        this.mCapability = versionedCapability;
        this.mMinVersion = i;
    }
}
