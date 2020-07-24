package p000X;

import android.content.Context;

/* renamed from: X.BLF */
public final class BLF implements BL3 {
    public final BLL Bv9(Context context, String str, BLM blm) {
        BLL bll = new BLL();
        int APA = blm.APA(context, str);
        bll.A00 = APA;
        if (APA != 0) {
            bll.A01 = blm.Bv5(context, str, false);
        } else {
            bll.A01 = blm.Bv5(context, str, true);
        }
        int i = bll.A00;
        if (i == 0 && bll.A01 == 0) {
            bll.A02 = 0;
            return bll;
        } else if (bll.A01 >= i) {
            bll.A02 = 1;
            return bll;
        } else {
            bll.A02 = -1;
            return bll;
        }
    }
}
