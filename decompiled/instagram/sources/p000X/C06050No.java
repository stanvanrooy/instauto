package p000X;

import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.util.gradient.BackgroundGradientColors;

/* renamed from: X.0No  reason: invalid class name and case insensitive filesystem */
public final class C06050No implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new BackgroundGradientColors(parcel);
    }

    public final Object[] newArray(int i) {
        return new BackgroundGradientColors[i];
    }
}
