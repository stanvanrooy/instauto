package p000X;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentState;

/* renamed from: X.00g  reason: invalid class name and case insensitive filesystem */
public final class C019300g implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new FragmentState(parcel);
    }

    public final Object[] newArray(int i) {
        return new FragmentState[i];
    }
}
