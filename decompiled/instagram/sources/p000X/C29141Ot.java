package p000X;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.1Ot  reason: invalid class name and case insensitive filesystem */
public final class C29141Ot implements View.OnClickListener {
    public final /* synthetic */ C27321Hj A00;

    public C29141Ot(C27321Hj r1) {
        this.A00 = r1;
    }

    public final void onClick(View view) {
        C150816ch r2;
        int A05 = AnonymousClass0Z0.A05(1217827986);
        C29331Pm r0 = this.A00.A0I.A0T;
        synchronized (r0.A03) {
            C150786ce r5 = r0.A00;
            if (r5 != null) {
                Iterator it = r5.A02.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    r2 = (C150816ch) it.next();
                    if (!r2.A01.equals(r5.A00)) {
                        break;
                    }
                }
            }
            r2 = null;
        }
        C150816ch r52 = r2;
        if (r2 != null) {
            C53722Ua A0S = AnonymousClass2UZ.A00().A0S();
            A0S.A02 = "Older_Feed";
            A0S.A03 = r2.A04;
            ArrayList arrayList = new ArrayList();
            for (AnonymousClass1NG A052 : r52.A05) {
                AnonymousClass1NJ A053 = A052.A05();
                if (A053 != null) {
                    arrayList.add(A053.getId());
                }
            }
            A0S.A08 = arrayList;
            A0S.A05 = "feed_contextual_older";
            A0S.A06 = r52.A02;
            A0S.A07 = this.A00.A1V.AVo();
            A0S.A0A = true;
            AnonymousClass1HD A002 = A0S.A00();
            C27321Hj r02 = this.A00;
            C52362Om r22 = new C52362Om(r02.getActivity(), r02.A0V);
            r22.A02 = A002;
            r22.A0B = true;
            r22.A02();
        }
        AnonymousClass0Z0.A0C(-954082289, A05);
    }
}
