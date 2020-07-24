package p000X;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.p024v4.p042os.ResultReceiver;
import com.facebook.redex.PCreatorEmptyBase;

/* renamed from: X.B4C */
public final class B4C extends PCreatorEmptyBase implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        return new ResultReceiver(parcel);
    }

    public final Object[] newArray(int i) {
        return new ResultReceiver[i];
    }
}
