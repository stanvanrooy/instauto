package p000X;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.CU0 */
public final class CU0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C27857CTx A01;
    public final /* synthetic */ AnonymousClass0C1 A02;
    public final /* synthetic */ String A03;

    public CU0(C27857CTx cTx, FragmentActivity fragmentActivity, AnonymousClass0C1 r3, String str) {
        this.A01 = cTx;
        this.A00 = fragmentActivity;
        this.A02 = r3;
        this.A03 = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C27858CTy cTy = this.A01.A02;
        CUC cuc = new CUC(cTy.A00.A02("iab_history_data_policy_launch"));
        cuc.A08("iab_history_session_id", cTy.A01);
        cuc.A01();
        AnonymousClass270.A07(this.A00, this.A02, AnonymousClass40t.$const$string(25), AnonymousClass2UD.IAB_HISTORY, this.A03, (Long) null);
    }
}
