package p000X;

import android.content.Context;

/* renamed from: X.BLG */
public final class BLG implements BL3 {
    public final BLL Bv9(Context context, String str, BLM blm) {
        BLL bll = new BLL();
        bll.A00 = blm.APA(context, str);
        int Bv5 = blm.Bv5(context, str, true);
        bll.A01 = Bv5;
        int i = bll.A00;
        if (i == 0 && Bv5 == 0) {
            bll.A02 = 0;
            return bll;
        } else if (Bv5 >= i) {
            bll.A02 = 1;
            return bll;
        } else {
            bll.A02 = -1;
            return bll;
        }
    }
}
