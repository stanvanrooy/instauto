package p000X;

import android.view.View;
import java.util.List;

/* renamed from: X.CX0 */
public final class CX0 implements View.OnClickListener {
    public final /* synthetic */ CWQ A00;
    public final /* synthetic */ C27956CXs A01;

    public CX0(CWQ cwq, C27956CXs cXs) {
        this.A00 = cwq;
        this.A01 = cXs;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(813744398);
        CWQ cwq = this.A00;
        C27956CXs cXs = this.A01;
        List AFS = cXs.AFS();
        C27939CXb cXb = (C27939CXb) cXs;
        C213409Id.A00(cwq.A0N.getActivity(), cwq.A0B, AFS, "footer", cXb.getId(), cXb.A00, cwq.A0A, cwq, cwq.A06, cwq.A0D, cwq.A0E, (String) null);
        AnonymousClass0Z0.A0C(1016451570, A05);
    }
}
