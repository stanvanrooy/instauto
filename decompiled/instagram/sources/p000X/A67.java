package p000X;

import android.view.View;
import com.facebook.react.views.view.ReactViewManager;

/* renamed from: X.A67 */
public final class A67 implements View.OnClickListener {
    public final /* synthetic */ C23081A5s A00;
    public final /* synthetic */ ReactViewManager A01;

    public A67(ReactViewManager reactViewManager, C23081A5s a5s) {
        this.A01 = reactViewManager;
        this.A00 = a5s;
    }

    public final void onClick(View view) {
        int i;
        int A05 = AnonymousClass0Z0.A05(1185996696);
        C23081A5s a5s = this.A00;
        A9C A02 = A3W.A02((A3N) a5s.getContext(), a5s.getId());
        if (A02 == null) {
            i = -1004794363;
        } else {
            A02.ACG(new A68(this.A00.getId()));
            i = -132083526;
        }
        AnonymousClass0Z0.A0C(i, A05);
    }
}
