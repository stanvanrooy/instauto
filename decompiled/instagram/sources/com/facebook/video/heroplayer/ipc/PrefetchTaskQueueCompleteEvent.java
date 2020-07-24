package com.facebook.video.heroplayer.ipc;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import p000X.C39751nS;
import p000X.C41961rG;

public class PrefetchTaskQueueCompleteEvent extends C41961rG implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(95);
    public final VideoPrefetchRequest A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
    }

    public PrefetchTaskQueueCompleteEvent(Parcel parcel) {
        super(C39751nS.PREFETCH_TASK_QUEUE_COMPLETE);
        this.A00 = (VideoPrefetchRequest) parcel.readParcelable(VideoPrefetchRequest.class.getClassLoader());
    }

    public PrefetchTaskQueueCompleteEvent(VideoPrefetchRequest videoPrefetchRequest) {
        super(C39751nS.PREFETCH_TASK_QUEUE_COMPLETE);
        this.A00 = videoPrefetchRequest;
    }
}
