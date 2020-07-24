package p000X;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment$SavedState;

/* renamed from: X.B42 */
public final class B42 implements Parcelable.ClassLoaderCreator {
    public final Object[] newArray(int i) {
        return new Fragment$SavedState[i];
    }

    public final Object createFromParcel(Parcel parcel) {
        return new Fragment$SavedState(parcel, (ClassLoader) null);
    }

    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new Fragment$SavedState(parcel, classLoader);
    }
}
