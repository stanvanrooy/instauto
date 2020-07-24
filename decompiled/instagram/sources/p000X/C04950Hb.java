package p000X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.push.fbns.ipc.FbnsAIDLRequest;

/* renamed from: X.0Hb  reason: invalid class name and case insensitive filesystem */
public final class C04950Hb implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new FbnsAIDLRequest(parcel);
    }

    public final Object[] newArray(int i) {
        return new FbnsAIDLRequest[i];
    }
}
