package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;
import p000X.AnonymousClass0a2;
import p000X.C228479tj;

public class ActivityTransitionResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(216);
    public final List A00;

    public ActivityTransitionResult(List list) {
        AnonymousClass0a2.A03(list, "transitionEvents list can't be null.");
        if (!list.isEmpty()) {
            for (int i = 1; i < list.size(); i++) {
                boolean z = false;
                if (((ActivityTransitionEvent) list.get(i)).A02 >= ((ActivityTransitionEvent) list.get(i - 1)).A02) {
                    z = true;
                }
                AnonymousClass0a2.A06(z);
            }
        }
        this.A00 = Collections.unmodifiableList(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((ActivityTransitionResult) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A0C(parcel, 1, this.A00, false);
        C228479tj.A02(parcel, A002);
    }
}
