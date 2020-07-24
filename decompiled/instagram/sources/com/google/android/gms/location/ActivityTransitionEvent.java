package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0a2;
import p000X.C228479tj;

public class ActivityTransitionEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(214);
    public final int A00;
    public final int A01;
    public final long A02;

    public ActivityTransitionEvent(int i, int i2, long j) {
        boolean z = false;
        for (int i3 : DetectedActivity.A02) {
            if (i3 == i) {
                z = true;
            }
        }
        if (!z) {
            StringBuilder sb = new StringBuilder(81);
            sb.append(i);
            sb.append(" is not a valid DetectedActivity supported by Activity Transition API.");
            Log.w("DetectedActivity", sb.toString());
        }
        boolean z2 = true;
        z2 = (i2 < 0 || i2 > 1) ? false : z2;
        StringBuilder sb2 = new StringBuilder(41);
        sb2.append("Transition type ");
        sb2.append(i2);
        sb2.append(" is not valid.");
        AnonymousClass0a2.A08(z2, sb2.toString());
        this.A00 = i;
        this.A01 = i2;
        this.A02 = j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ActivityTransitionEvent) {
                ActivityTransitionEvent activityTransitionEvent = (ActivityTransitionEvent) obj;
                if (!(this.A00 == activityTransitionEvent.A00 && this.A01 == activityTransitionEvent.A01 && this.A02 == activityTransitionEvent.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A00), Integer.valueOf(this.A01), Long.valueOf(this.A02)});
    }

    public final String toString() {
        int i = this.A00;
        StringBuilder sb = new StringBuilder(24);
        sb.append("ActivityType ");
        sb.append(i);
        String sb2 = sb.toString();
        int i2 = this.A01;
        StringBuilder sb3 = new StringBuilder(26);
        sb3.append("TransitionType ");
        sb3.append(i2);
        String sb4 = sb3.toString();
        long j = this.A02;
        StringBuilder sb5 = new StringBuilder(41);
        sb5.append("ElapsedRealTimeNanos ");
        sb5.append(j);
        return AnonymousClass000.A0O(sb2, " ", sb4, " ", sb5.toString());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A04(parcel, 1, this.A00);
        C228479tj.A04(parcel, 2, this.A01);
        C228479tj.A06(parcel, 3, this.A02);
        C228479tj.A02(parcel, A002);
    }
}
