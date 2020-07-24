package p000X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.profilo.ipc.TraceContext;

/* renamed from: X.0Gv  reason: invalid class name and case insensitive filesystem */
public final class C04930Gv implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new TraceContext(parcel);
    }

    public final Object[] newArray(int i) {
        return new TraceContext[i];
    }
}
