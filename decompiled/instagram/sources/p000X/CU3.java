package p000X;

import android.content.DialogInterface;

/* renamed from: X.CU3 */
public final class CU3 implements DialogInterface.OnClickListener {
    public final /* synthetic */ C27857CTx A00;

    public CU3(C27857CTx cTx) {
        this.A00 = cTx;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C27858CTy cTy = this.A00.A02;
        CU8 cu8 = new CU8(cTy.A00.A02("iab_history_hide_alert_cancel"));
        cu8.A08("iab_history_session_id", cTy.A01);
        cu8.A01();
    }
}
