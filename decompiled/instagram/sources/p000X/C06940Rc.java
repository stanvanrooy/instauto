package p000X;

import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.analytics.intf.AnalyticsEventEntry;

/* renamed from: X.0Rc  reason: invalid class name and case insensitive filesystem */
public final class C06940Rc implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new AnalyticsEventEntry(parcel);
    }

    public final Object[] newArray(int i) {
        return new AnalyticsEventEntry[i];
    }
}
