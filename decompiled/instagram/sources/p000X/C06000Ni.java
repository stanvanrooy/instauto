package p000X;

import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.util.gradient.TextModeGradientColors;

/* renamed from: X.0Ni  reason: invalid class name and case insensitive filesystem */
public final class C06000Ni implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new TextModeGradientColors(parcel);
    }

    public final Object[] newArray(int i) {
        return new TextModeGradientColors[i];
    }
}
