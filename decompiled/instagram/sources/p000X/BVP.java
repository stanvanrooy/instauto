package p000X;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.fbpay.hub.form.cell.label.LabelCellParams;

/* renamed from: X.BVP */
public final class BVP implements View.OnClickListener {
    public final /* synthetic */ BVQ A00;

    public BVP(BVQ bvq) {
        this.A00 = bvq;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(-153595791);
        BVO bvo = this.A00.A00;
        C25466BMa bMa = bvo.A01;
        Context context = bvo.getContext();
        String str = ((LabelCellParams.LinkParams) bMa.A02.get(0)).A02;
        Intent intent = new Intent("android.intent.action.VIEW");
        AnonymousClass0a4.A06(str);
        AnonymousClass0XM.A00().A06().A04(intent.setData(C08480Xf.A00(str)), context);
        AnonymousClass0Z0.A0C(-1723882788, A05);
    }
}
