package com.facebook.video.heroplayer.ipc;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import p000X.C39751nS;
import p000X.C41961rG;

public class PrefetchTaskQueueExitEvent extends C41961rG implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(96);
    public final VideoPrefetchRequest A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
    }

    public PrefetchTaskQueueExitEvent(Parcel parcel) {
        super(C39751nS.PREFETCH_TASK_QUEUE_EXIT);
        this.A00 = (VideoPrefetchRequest) parcel.readParcelable(VideoPrefetchRequest.class.getClassLoader());
    }

    public PrefetchTaskQueueExitEvent(VideoPrefetchRequest videoPrefetchRequest) {
        super(C39751nS.PREFETCH_TASK_QUEUE_EXIT);
        this.A00 = videoPrefetchRequest;
    }
}
