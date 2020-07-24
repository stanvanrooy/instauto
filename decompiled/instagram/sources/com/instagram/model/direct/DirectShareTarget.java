package com.instagram.model.direct;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.pendingmedia.model.PendingRecipient;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p000X.AnonymousClass000;
import p000X.Constants;
import p000X.C13390iS;

public class DirectShareTarget implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(355);
    public DirectThreadKey A00;
    public String A01;
    public List A02;
    public boolean A03;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DirectShareTarget directShareTarget = (DirectShareTarget) obj;
        String str = directShareTarget.A00.A00;
        String str2 = this.A00.A00;
        if (str2 == null || str == null) {
            return directShareTarget.A03 == this.A03 && this.A02.containsAll(directShareTarget.A02) && directShareTarget.A02.containsAll(this.A02);
        }
        return str2.equals(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r5.A02.isEmpty() == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        if (r5.A03 == false) goto L_0x001b;
     */
    public final Integer A00(String str) {
        boolean z;
        boolean z2;
        if (this.A03) {
            z = true;
        }
        z = false;
        if (!z) {
            if (!A06()) {
                z2 = true;
            }
            z2 = false;
            if (!z2) {
                return Constants.A0Y;
            }
            if (this.A02.size() == 1) {
                PendingRecipient pendingRecipient = (PendingRecipient) this.A02.get(0);
                int ANw = pendingRecipient.ANw();
                if (ANw != 0) {
                    if (ANw != 1) {
                        throw new IllegalStateException(AnonymousClass000.A05("Unknow Interop User Type: ", ANw));
                    } else if (pendingRecipient.A05.booleanValue()) {
                        return Constants.A0C;
                    } else {
                        return Constants.A0N;
                    }
                } else if (!(!TextUtils.isEmpty(A01())) && pendingRecipient.A02 != C13390iS.FollowStatusFollowing && !pendingRecipient.getId().equals(str)) {
                    return Constants.ONE;
                }
            } else {
                throw new IllegalStateException("Unknow Thread Interop Type");
            }
        }
        return Constants.ZERO;
    }

    public final String A01() {
        return this.A00.A00;
    }

    public final List A03() {
        ArrayList arrayList = new ArrayList();
        for (PendingRecipient id : this.A02) {
            arrayList.add(id.getId());
        }
        return arrayList;
    }

    public final List A04() {
        ArrayList arrayList = new ArrayList();
        for (PendingRecipient id : this.A02) {
            arrayList.add(Long.valueOf(Long.parseLong(id.getId())));
        }
        return arrayList;
    }

    public final List A05() {
        return Collections.unmodifiableList(this.A02);
    }

    public final boolean A06() {
        if (this.A02.size() <= 1) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int i2 = (this.A03 ? 1 : 0) + false;
        for (PendingRecipient hashCode : this.A02) {
            i ^= hashCode.hashCode();
        }
        return (i2 * 31) + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.A02);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
        parcel.writeByte(this.A03 ? (byte) 1 : 0);
    }

    public final String A02() {
        String A012 = A01();
        if (!TextUtils.isEmpty(A012)) {
            return A012;
        }
        if (this.A02.size() == 1) {
            return ((PendingRecipient) this.A02.get(0)).getId();
        }
        return String.valueOf(hashCode());
    }

    public final boolean A07(String str) {
        switch (A00(str).intValue()) {
            case 2:
            case 3:
                return true;
            default:
                return false;
        }
    }

    public DirectShareTarget() {
    }

    public DirectShareTarget(Parcel parcel) {
        this.A02 = parcel.createTypedArrayList(PendingRecipient.CREATOR);
        this.A01 = parcel.readString();
        this.A00 = (DirectThreadKey) parcel.readParcelable(DirectThreadKey.class.getClassLoader());
        this.A03 = parcel.readByte() != 0;
    }

    public DirectShareTarget(List list, String str, String str2, boolean z) {
        this.A02 = list;
        this.A01 = str2;
        this.A03 = z;
        this.A00 = new DirectThreadKey(str, (Collection) list);
    }
}
