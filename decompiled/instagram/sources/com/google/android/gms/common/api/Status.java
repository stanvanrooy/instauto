package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import p000X.C138515vO;
import p000X.C228479tj;
import p000X.C228489tz;
import p000X.C228589vH;
import p000X.C228839vu;
import p000X.C229229x8;

public final class Status extends AbstractSafeParcelable implements C138515vO, ReflectedParcelable {
    public static final Status A04 = new Status(16);
    public static final Status A05 = new Status(18);
    public static final Status A06 = new Status(8);
    public static final Status A07 = new Status(14);
    public static final Status A08 = new Status(0);
    public static final Status A09 = new Status(15);
    public static final Status A0A = new Status(17);
    public static final Parcelable.Creator CREATOR = new C228839vu();
    public final int A00;
    public final PendingIntent A01;
    public final String A02;
    public final int A03;

    public final Status AWn() {
        return this;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A03), Integer.valueOf(this.A00), this.A02, this.A01});
    }

    public final void A00(Activity activity, int i) {
        PendingIntent pendingIntent = this.A01;
        boolean z = false;
        if (pendingIntent != null) {
            z = true;
        }
        if (z) {
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i, (Intent) null, 0, 0, 0);
        }
    }

    public final boolean A01() {
        if (this.A00 <= 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Status) {
            Status status = (Status) obj;
            if (this.A03 != status.A03 || this.A00 != status.A00 || !C228589vH.A00(this.A02, status.A02) || !C228589vH.A00(this.A01, status.A01)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        C228489tz r2 = new C228489tz(this);
        String str = this.A02;
        if (str == null) {
            str = C229229x8.A00(this.A00);
        }
        r2.A00("statusCode", str);
        r2.A00("resolution", this.A01);
        return r2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A04(parcel, 1, this.A00);
        C228479tj.A0A(parcel, 2, this.A02, false);
        C228479tj.A09(parcel, 3, this.A01, i, false);
        C228479tj.A04(parcel, 1000, this.A03);
        C228479tj.A02(parcel, A002);
    }

    public Status(int i) {
        this(i, (String) null);
    }

    public Status(int i, int i2, String str, PendingIntent pendingIntent) {
        this.A03 = i;
        this.A00 = i2;
        this.A02 = str;
        this.A01 = pendingIntent;
    }

    public Status(int i, String str) {
        this(1, i, str, (PendingIntent) null);
    }
}
