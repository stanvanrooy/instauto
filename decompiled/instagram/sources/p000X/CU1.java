package p000X;

import android.content.DialogInterface;

/* renamed from: X.CU1 */
public final class CU1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ C27857CTx A00;
    public final /* synthetic */ C27853CTt A01;

    public CU1(C27857CTx cTx, C27853CTt cTt) {
        this.A00 = cTx;
        this.A01 = cTt;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C27858CTy cTy = this.A00.A02;
        CU7 cu7 = new CU7(cTy.A00.A02("iab_history_hide_alert_hide"));
        cu7.A08("iab_history_session_id", cTy.A01);
        cu7.A01();
        C27853CTt cTt = this.A01;
        if (!cTt.A08) {
            C151456dk.A01(cTt.A05, (String) null, true, cTt, cTt);
        }
    }
}
