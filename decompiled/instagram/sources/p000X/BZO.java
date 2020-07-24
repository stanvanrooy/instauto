package p000X;

import android.os.Handler;
import android.os.Message;
import com.facebook.C0003R;

/* renamed from: X.BZO */
public final class BZO extends Handler {
    public final /* synthetic */ C28227CdU A00;

    public BZO(C28227CdU cdU) {
        this.A00 = cdU;
    }

    public final void handleMessage(Message message) {
        C28227CdU cdU = this.A00;
        if (cdU.isResumed() && message.what == 0) {
            AnonymousClass5F9.A03(this.A00.getActivity(), cdU.getString(C0003R.string.failed_to_detect_location), 0);
            C28227CdU.A00(this.A00);
        }
    }
}
