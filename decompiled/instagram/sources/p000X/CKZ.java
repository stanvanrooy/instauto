package p000X;

import android.view.View;
import com.facebook.C0003R;
import com.instagram.igds.components.form.IgFormField;

/* renamed from: X.CKZ */
public final class CKZ implements View.OnClickListener {
    public final /* synthetic */ CKT A00;

    public CKZ(CKT ckt) {
        this.A00 = ckt;
    }

    public final void onClick(View view) {
        CL0 cl0;
        int A05 = AnonymousClass0Z0.A05(-448868753);
        IgFormField igFormField = this.A00.A00;
        if (igFormField == null) {
            C13150hy.A03("businessTypeField");
        }
        igFormField.A04();
        CKT ckt = this.A00;
        CKS cks = ckt.A01;
        if (cks == null) {
            C13150hy.A03("interactor");
        }
        CKX ckx = (CKX) cks.A01.A02();
        AnonymousClass1HD r0 = null;
        if (ckx != null) {
            cl0 = ckx.A00;
        } else {
            cl0 = null;
        }
        if (cl0 != null) {
            if (CLC.A00[cl0.ordinal()] != 1) {
                C18640sB.A00().A00();
                r0 = new CKO();
            } else {
                C18640sB.A00().A00();
                r0 = new CKQ();
            }
        }
        if (r0 != null) {
            C52362Om r5 = new C52362Om(ckt.getActivity(), (AnonymousClass0C1) ckt.A02.getValue());
            r5.A0B = true;
            r5.A02 = r0;
            r5.A05(C0003R.anim.right_in, C0003R.anim.left_out, C0003R.anim.left_in, C0003R.anim.right_out);
            r5.A02();
        }
        AnonymousClass0Z0.A0C(2050791854, A05);
    }
}
