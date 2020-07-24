package com.google.android.gms.internal.vision;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000X.C228479tj;
import p000X.C228899w5;

public final class zzag extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C228899w5();
    public final Rect A00;

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A09(parcel, 2, this.A00, i, false);
        C228479tj.A02(parcel, A002);
    }

    public zzag() {
        this.A00 = new Rect();
    }

    public zzag(Rect rect) {
        this.A00 = rect;
    }
}
