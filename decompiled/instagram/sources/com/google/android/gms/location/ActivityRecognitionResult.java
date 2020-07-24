package com.google.android.gms.location;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;
import p000X.AnonymousClass0a2;
import p000X.C228479tj;
import p000X.C228539v8;
import p000X.C228589vH;

public class ActivityRecognitionResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C228539v8();
    public int A00;
    public long A01;
    public long A02;
    public Bundle A03;
    public List A04;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r5.size() <= 0) goto L_0x000d;
     */
    public ActivityRecognitionResult(List list, long j, long j2, int i, Bundle bundle) {
        boolean z = true;
        boolean z2 = list != null ? true : z2;
        z2 = false;
        AnonymousClass0a2.A08(z2, "Must have at least 1 detected activity");
        AnonymousClass0a2.A08((j <= 0 || j2 <= 0) ? false : z, "Must set times");
        this.A04 = list;
        this.A01 = j;
        this.A02 = j2;
        this.A00 = i;
        this.A03 = bundle;
    }

    public static boolean A00(Bundle bundle, Bundle bundle2) {
        if (!(bundle == null && bundle2 == null)) {
            if ((bundle != null || bundle2 == null) && ((bundle == null || bundle2 != null) && bundle.size() == bundle2.size())) {
                for (String str : bundle.keySet()) {
                    if (bundle2.containsKey(str)) {
                        if (bundle.get(str) != null) {
                            if (!(bundle.get(str) instanceof Bundle ? A00(bundle.getBundle(str), bundle2.getBundle(str)) : bundle.get(str).equals(bundle2.get(str)))) {
                                return false;
                            }
                        } else if (bundle2.get(str) != null) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) obj;
                if (!(this.A01 == activityRecognitionResult.A01 && this.A02 == activityRecognitionResult.A02 && this.A00 == activityRecognitionResult.A00 && C228589vH.A00(this.A04, activityRecognitionResult.A04) && A00(this.A03, activityRecognitionResult.A03))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.A01), Long.valueOf(this.A02), Integer.valueOf(this.A00), this.A04, this.A03});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.A04);
        long j = this.A01;
        long j2 = this.A02;
        StringBuilder sb = new StringBuilder(valueOf.length() + 124);
        sb.append("ActivityRecognitionResult [probableActivities=");
        sb.append(valueOf);
        sb.append(", timeMillis=");
        sb.append(j);
        sb.append(", elapsedRealtimeMillis=");
        sb.append(j2);
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A0C(parcel, 1, this.A04, false);
        C228479tj.A06(parcel, 2, this.A01);
        C228479tj.A06(parcel, 3, this.A02);
        C228479tj.A04(parcel, 4, this.A00);
        C228479tj.A07(parcel, 5, this.A03);
        C228479tj.A02(parcel, A002);
    }
}
