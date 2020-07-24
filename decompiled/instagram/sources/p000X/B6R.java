package p000X;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p024v4.media.session.MediaSessionCompat$Token;
import com.facebook.redex.PCreatorEmptyBase;

/* renamed from: X.B6R */
public final class B6R extends PCreatorEmptyBase implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        Object readStrongBinder;
        if (Build.VERSION.SDK_INT >= 21) {
            readStrongBinder = parcel.readParcelable((ClassLoader) null);
        } else {
            readStrongBinder = parcel.readStrongBinder();
        }
        return new MediaSessionCompat$Token(readStrongBinder);
    }

    public final Object[] newArray(int i) {
        return new MediaSessionCompat$Token[i];
    }
}
