package p000X;

import android.content.Intent;

/* renamed from: X.BMZ */
public final class BMZ implements C25468BMc {
    public final /* synthetic */ C26426BlJ A00;

    public BMZ(C26426BlJ blJ) {
        this.A00 = blJ;
    }

    public final void B9B(BVN bvn) {
        Intent intent = new Intent("android.intent.action.VIEW");
        String str = bvn.A02;
        AnonymousClass11J.A00(str);
        AnonymousClass0XM.A00().A06().A04(intent.setData(C08480Xf.A00(str)), this.A00.A00.requireActivity());
    }
}
