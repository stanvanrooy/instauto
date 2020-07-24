package p000X;

import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.analytics.intf.AnalyticsEventDebugInfo;

/* renamed from: X.0Rg  reason: invalid class name and case insensitive filesystem */
public final class C06970Rg implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new AnalyticsEventDebugInfo(parcel);
    }

    public final Object[] newArray(int i) {
        return new AnalyticsEventDebugInfo[i];
    }
}
