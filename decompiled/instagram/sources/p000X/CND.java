package p000X;

import com.instagram.shopping.model.productsource.ProductSourceOverrideState;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.CND */
public final class CND implements C27729COx {
    public final /* synthetic */ CNB A00;

    public final void BCl(String str) {
    }

    public CND(CNB cnb) {
        this.A00 = cnb;
    }

    public final void B47(boolean z, String str, Throwable th) {
        this.A00.A0A.setRefreshing(false);
        CP8 cp8 = this.A00.A03;
        cp8.A00 = Constants.A0N;
        cp8.notifyDataSetChanged();
        CNB cnb = this.A00;
        if (cnb.A0G) {
            cnb.A04.A03(cnb.A07, false, (Integer) null, str, Boolean.valueOf(z), (Boolean) null);
            return;
        }
        if (th != null) {
            CNJ cnj = cnb.A04;
            String message = th.getMessage();
            C37141jB A002 = CNJ.A00(cnj, "instagram_shopping_product_tagging_load_failure");
            A002.A3R = message;
            CNJ.A01(cnj.A01, A002);
        } else {
            CNJ cnj2 = cnb.A04;
            C37141jB A003 = CNJ.A00(cnj2, "instagram_shopping_product_tagging_load_failure");
            A003.A3R = null;
            CNJ.A01(cnj2.A01, A003);
        }
        this.A00.A0G = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0069, code lost:
        if ("recently added".equalsIgnoreCase(r2.A01) == false) goto L_0x006b;
     */
    public final void B8V(List list, boolean z, boolean z2, String str) {
        Integer num;
        int A002;
        boolean z3;
        int A003;
        this.A00.A0A.setRefreshing(false);
        if (!z || !list.isEmpty()) {
            if (z) {
                CP8 cp8 = this.A00.A03;
                cp8.A00 = Constants.ZERO;
                cp8.A03.clear();
                cp8.notifyDataSetChanged();
            }
            CP8 cp82 = this.A00.A03;
            if (!z2 || list.isEmpty()) {
                num = Constants.ONE;
            } else {
                num = Constants.A0Y;
            }
            cp82.A00 = num;
            cp82.A03.addAll(list);
            cp82.notifyDataSetChanged();
        } else {
            CP8 cp83 = this.A00.A03;
            cp83.A00 = Constants.A0C;
            cp83.notifyDataSetChanged();
        }
        CNB cnb = this.A00;
        if (cnb.A0G) {
            CNJ cnj = cnb.A04;
            C27671CMp cMp = cnb.A07;
            CP8 cp84 = cnb.A03;
            Integer num2 = cp84.A00;
            if (num2 == Constants.ONE || num2 == Constants.A0Y) {
                A003 = CNL.A00(cp84.A03);
            } else {
                A003 = 0;
            }
            cnj.A03(cMp, true, Integer.valueOf(A003), str, Boolean.valueOf(z), Boolean.valueOf(z2));
        } else {
            CNJ cnj2 = cnb.A04;
            CP8 cp85 = cnb.A03;
            Integer num3 = cp85.A00;
            if (num3 == Constants.ONE || num3 == Constants.A0Y) {
                A002 = CNL.A00(cp85.A03);
            } else {
                A002 = 0;
            }
            cnj2.A04(Integer.valueOf(A002), Boolean.valueOf(z), Boolean.valueOf(z2));
            this.A00.A0G = true;
        }
        CNB cnb2 = this.A00;
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            C27702CNw cNw = (C27702CNw) it.next();
            if (!"product_list_header".equalsIgnoreCase(cNw.A03)) {
                z3 = true;
            }
            z3 = false;
            if (z3) {
                i++;
            }
        }
        cnb2.A00 = i;
    }

    public final void BPf(C27690CNk cNk, boolean z, String str) {
        CNB.A01(this.A00, cNk.A00);
        CNB cnb = this.A00;
        ProductSourceOverrideState productSourceOverrideState = cnb.A08;
        cnb.A08 = new ProductSourceOverrideState(productSourceOverrideState.A01, productSourceOverrideState.A02, cNk.A00);
        B8V(cNk.A01.A02, z, cNk.Abr(), str);
    }

    public final boolean isEmpty() {
        if (this.A00.A03.getItemCount() == 0) {
            return true;
        }
        return false;
    }
}
