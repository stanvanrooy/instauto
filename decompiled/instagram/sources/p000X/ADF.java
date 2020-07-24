package p000X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.stateful.ExtendableSavedState;

/* renamed from: X.ADF */
public final class ADF implements Parcelable.ClassLoaderCreator {
    public final Object[] newArray(int i) {
        return new ExtendableSavedState[i];
    }

    public final Object createFromParcel(Parcel parcel) {
        return new ExtendableSavedState(parcel, (ClassLoader) null);
    }

    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new ExtendableSavedState(parcel, classLoader);
    }
}
