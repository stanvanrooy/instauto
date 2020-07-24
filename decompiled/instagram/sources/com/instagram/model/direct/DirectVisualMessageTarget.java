package com.instagram.model.direct;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.pendingmedia.model.PendingRecipient;
import java.util.Comparator;
import java.util.List;
import p000X.AnonymousClass4UM;

public class DirectVisualMessageTarget implements Parcelable {
    public static final Comparator A04 = new AnonymousClass4UM();
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(356);
    public String A00;
    public String A01;
    public List A02;
    public boolean A03;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DirectVisualMessageTarget)) {
            return false;
        }
        DirectVisualMessageTarget directVisualMessageTarget = (DirectVisualMessageTarget) obj;
        String str = directVisualMessageTarget.A00;
        String str2 = this.A00;
        if (str2 != null && str != null) {
            return str2.equals(str);
        }
        if (directVisualMessageTarget.A03 == this.A03) {
            List list = this.A02;
            if (list != null) {
                if (list.equals(directVisualMessageTarget.A02)) {
                    return true;
                }
            } else if (directVisualMessageTarget.A02 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int i2 = ((this.A03 ? 1 : 0) + false) * 31;
        List list = this.A02;
        if (list != null) {
            i = list.hashCode();
        }
        return i2 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.A02);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeByte(this.A03 ? (byte) 1 : 0);
    }

    public DirectVisualMessageTarget() {
    }

    public DirectVisualMessageTarget(Parcel parcel) {
        this.A02 = parcel.createTypedArrayList(PendingRecipient.CREATOR);
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
        this.A03 = parcel.readByte() != 0;
    }
}
