package p000X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.CBQ */
public final class CBQ implements AnonymousClass0Q6 {
    public final /* synthetic */ CBO A00;

    public CBQ(CBO cbo) {
        this.A00 = cbo;
    }

    public final void onAppBackgrounded() {
        int A03 = AnonymousClass0Z0.A03(-936863195);
        AnonymousClass07T r8 = this.A00.A00;
        synchronized (r8) {
            int size = r8.A01.size();
            if (size != 0) {
                List unmodifiableList = Collections.unmodifiableList(new ArrayList(r8.A05));
                for (int i = 0; i < size; i++) {
                    r8.A04.Bp4("CameraLeakListener:LEFT_OPEN_IN_BACKGROUND", new AnonymousClass07R(unmodifiableList, Constants.ZERO, (Throwable) r8.A01.valueAt(i)));
                }
            }
        }
        AnonymousClass0Z0.A0A(-1718021212, A03);
    }

    public final void onAppForegrounded() {
        AnonymousClass0Z0.A0A(-1143644945, AnonymousClass0Z0.A03(2013870803));
    }
}
