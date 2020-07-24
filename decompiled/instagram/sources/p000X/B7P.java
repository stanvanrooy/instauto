package p000X;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState$SavedState;

/* renamed from: X.B7P */
public final class B7P implements Parcelable.ClassLoaderCreator {
    public final Object[] newArray(int i) {
        return new AppCompatDelegateImpl$PanelFeatureState$SavedState[i];
    }

    public final Object createFromParcel(Parcel parcel) {
        AppCompatDelegateImpl$PanelFeatureState$SavedState appCompatDelegateImpl$PanelFeatureState$SavedState = new AppCompatDelegateImpl$PanelFeatureState$SavedState();
        appCompatDelegateImpl$PanelFeatureState$SavedState.A00 = parcel.readInt();
        boolean z = true;
        if (parcel.readInt() != 1) {
            z = false;
        }
        appCompatDelegateImpl$PanelFeatureState$SavedState.A02 = z;
        if (z) {
            appCompatDelegateImpl$PanelFeatureState$SavedState.A01 = parcel.readBundle((ClassLoader) null);
        }
        return appCompatDelegateImpl$PanelFeatureState$SavedState;
    }

    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        AppCompatDelegateImpl$PanelFeatureState$SavedState appCompatDelegateImpl$PanelFeatureState$SavedState = new AppCompatDelegateImpl$PanelFeatureState$SavedState();
        appCompatDelegateImpl$PanelFeatureState$SavedState.A00 = parcel.readInt();
        boolean z = true;
        if (parcel.readInt() != 1) {
            z = false;
        }
        appCompatDelegateImpl$PanelFeatureState$SavedState.A02 = z;
        if (z) {
            appCompatDelegateImpl$PanelFeatureState$SavedState.A01 = parcel.readBundle(classLoader);
        }
        return appCompatDelegateImpl$PanelFeatureState$SavedState;
    }
}
