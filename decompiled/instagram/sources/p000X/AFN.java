package p000X;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.SearchView;

/* renamed from: X.AFN */
public final class AFN implements Parcelable.ClassLoaderCreator {
    public final Object[] newArray(int i) {
        return new SearchView.SavedState[i];
    }

    public final Object createFromParcel(Parcel parcel) {
        return new SearchView.SavedState(parcel, (ClassLoader) null);
    }

    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new SearchView.SavedState(parcel, classLoader);
    }
}
