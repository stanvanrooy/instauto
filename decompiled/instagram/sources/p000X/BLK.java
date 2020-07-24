package p000X;

import android.content.Context;

/* renamed from: X.BLK */
public final class BLK implements BL3 {
    public final BLL Bv9(Context context, String str, BLM blm) {
        BLL bll = new BLL();
        int Bv5 = blm.Bv5(context, str, true);
        bll.A01 = Bv5;
        if (Bv5 != 0) {
            bll.A02 = 1;
        } else {
            int APA = blm.APA(context, str);
            bll.A00 = APA;
            if (APA != 0) {
                bll.A02 = -1;
                return bll;
            }
        }
        return bll;
    }
}
