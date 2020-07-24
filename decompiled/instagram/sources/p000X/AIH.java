package p000X;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: X.AIH */
public final class AIH implements Parcelable.ClassLoaderCreator {
    public final Object[] newArray(int i) {
        return new BottomSheetBehavior.SavedState[i];
    }

    public final Object createFromParcel(Parcel parcel) {
        return new BottomSheetBehavior.SavedState(parcel, (ClassLoader) null);
    }

    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new BottomSheetBehavior.SavedState(parcel, classLoader);
    }
}
