package com.instagram.igtv.uploadflow.reactions.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import p000X.AnonymousClass79P;
import p000X.C13150hy;
import p000X.C1666779c;

public final class IGTVReactionsSettings implements Parcelable {
    public static final C1666779c A02 = new C1666779c();
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(343);
    public final AnonymousClass79P A00;
    public final boolean A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IGTVReactionsSettings)) {
            return false;
        }
        IGTVReactionsSettings iGTVReactionsSettings = (IGTVReactionsSettings) obj;
        return this.A01 == iGTVReactionsSettings.A01 && C13150hy.A05(this.A00, iGTVReactionsSettings.A00);
    }

    public final int hashCode() {
        boolean z = this.A01;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        AnonymousClass79P r0 = this.A00;
        return i + (r0 != null ? r0.hashCode() : 0);
    }

    public final String toString() {
        return "IGTVReactionsSettings(allowReactions=" + this.A01 + ", selectedPrompt=" + this.A00 + ")";
    }

    public IGTVReactionsSettings(boolean z, AnonymousClass79P r3) {
        C13150hy.A02(r3, "selectedPrompt");
        this.A01 = z;
        this.A00 = r3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C13150hy.A02(parcel, "dest");
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeString(this.A00.A00);
        parcel.writeInt(this.A00.A01 ? 1 : 0);
    }
}
