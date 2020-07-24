package p000X;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.BackStackState;

/* renamed from: X.00c  reason: invalid class name and case insensitive filesystem */
public final class C019100c implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new BackStackState(parcel);
    }

    public final Object[] newArray(int i) {
        return new BackStackState[i];
    }
}
