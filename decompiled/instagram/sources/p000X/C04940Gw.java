package p000X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.profilo.ipc.TraceContext;

/* renamed from: X.0Gw  reason: invalid class name and case insensitive filesystem */
public final class C04940Gw implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new TraceContext.TraceConfigExtras(parcel);
    }

    public final Object[] newArray(int i) {
        return new TraceContext.TraceConfigExtras[i];
    }
}
