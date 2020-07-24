package p000X;

import android.content.Context;
import android.view.View;

/* renamed from: X.CJ7 */
public final class CJ7 implements View.OnClickListener {
    public final /* synthetic */ CJ4 A00;
    public final /* synthetic */ C27577CIw A01;

    public CJ7(CJ4 cj4, C27577CIw cIw) {
        this.A00 = cj4;
        this.A01 = cIw;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(1578203007);
        CJ4 cj4 = this.A00;
        C27577CIw cIw = this.A01;
        CJ5 cj5 = cj4.A05;
        AnonymousClass0a4.A06(cj5);
        Context requireContext = cj4.requireContext();
        cj5.A05.A0D(cj5.A02, cj5.A04, cj5.A0D, cIw.A00.name());
        String str = cIw.A02;
        String str2 = str;
        if (str != null) {
            AnonymousClass0a4.A06(requireContext);
            AnonymousClass6NI.A07(requireContext, cj5.A03, str2, (String) null);
        } else {
            CJ5.A03(cj5, cj4, requireContext, cj5.A01, cj5.A02, cj5.A00, cIw.A00);
        }
        AnonymousClass0Z0.A0C(-119374092, A05);
    }
}
