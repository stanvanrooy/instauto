package p000X;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManagerState;

/* renamed from: X.00e  reason: invalid class name and case insensitive filesystem */
public final class C019200e implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new FragmentManagerState(parcel);
    }

    public final Object[] newArray(int i) {
        return new FragmentManagerState[i];
    }
}
