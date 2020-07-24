package p000X;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p024v4.media.session.MediaSessionCompat$QueueItem;
import com.facebook.redex.PCreatorEmptyBase;

/* renamed from: X.BAr */
public final class BAr extends PCreatorEmptyBase implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new MediaSessionCompat$QueueItem(parcel);
    }

    public final Object[] newArray(int i) {
        return new MediaSessionCompat$QueueItem[i];
    }
}
