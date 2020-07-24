package com.instagram.p009ui.widget.mediapicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import com.instagram.common.gallery.Medium;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import p000X.AnonymousClass3XG;

/* renamed from: com.instagram.ui.widget.mediapicker.Folder */
public class Folder implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(88);
    public List A00;
    public final int A01;
    public final String A02;
    public final Set A03 = new TreeSet(new AnonymousClass3XG(this));
    public final Set A04 = new HashSet();

    public final int describeContents() {
        return 0;
    }

    public final List A00() {
        if (this.A00 == null) {
            this.A00 = new ArrayList(this.A03);
        }
        return this.A00;
    }

    public final void A01(Medium medium) {
        this.A03.add(medium);
        this.A04.add(Integer.valueOf(medium.A05));
        this.A00 = null;
    }

    public final boolean A02() {
        return this.A03.isEmpty();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01);
        parcel.writeString(this.A02);
        parcel.writeTypedList(new ArrayList(this.A03));
    }

    public Folder(int i, String str) {
        this.A01 = i;
        this.A02 = str;
    }

    public Folder(Parcel parcel) {
        this.A01 = parcel.readInt();
        this.A02 = parcel.readString();
        this.A03.addAll(parcel.createTypedArrayList(Medium.CREATOR));
    }
}
