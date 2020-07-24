package p000X;

import android.app.Activity;
import com.instagram.pendingmedia.model.PendingMedia;
import com.instagram.pendingmedia.store.PendingMediaStore;
import java.util.List;

/* renamed from: X.1Ru  reason: invalid class name and case insensitive filesystem */
public final class C29921Ru extends C27291Hg {
    public final Activity A00;
    public final C29881Rq A01;
    public final AnonymousClass0C1 A02;

    public final void BJx() {
        List A05 = PendingMediaStore.A01(this.A02).A05();
        if (!A05.isEmpty()) {
            PendingMedia pendingMedia = (PendingMedia) A05.get(A05.size() - 1);
            if (pendingMedia.A3A && pendingMedia.A1g != null && this.A02.A06.A1o == Constants.ONE) {
                C12670hC.A06(new AnonymousClass6QO(this, pendingMedia), 200);
            }
        }
    }

    public C29921Ru(Activity activity, AnonymousClass0C1 r2, C29881Rq r3) {
        this.A00 = activity;
        this.A02 = r2;
        this.A01 = r3;
    }
}
