package p000X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.CY4 */
public class CY4 {
    public int A00 = -1;
    public CY8 A01 = CY8.A05;
    public Integer A02 = Constants.ZERO;
    public List A03 = new ArrayList();

    public CY3 A00() {
        if (!(this instanceof C27949CXl)) {
            return new CY3(this.A01, this.A02, this.A03, this.A00);
        }
        C27949CXl cXl = (C27949CXl) this;
        return new CYC(cXl.A01, cXl.A02, cXl.A03, cXl.A00, cXl.A00);
    }

    public CY4(CYB cyb, List list) {
        Integer num;
        if (cyb != null) {
            if (!TextUtils.isEmpty(cyb.A02)) {
                this.A00 = CYI.A00(cyb.A02);
            }
            Integer num2 = cyb.A01;
            if (num2 != null) {
                switch (num2.intValue()) {
                    case 1:
                        num = Constants.ZERO;
                        break;
                    case 2:
                        num = Constants.ONE;
                        break;
                    case 3:
                        num = Constants.A0C;
                        break;
                }
                this.A02 = num;
            }
            CY8 cy8 = this.A01;
            CY7 cy7 = cy8.A03;
            CY7 cy72 = cy8.A00;
            CY7 cy73 = cy8.A02;
            CY7 cy74 = cy8.A01;
            if (!TextUtils.isEmpty(cyb.A06)) {
                cy7 = new CY7(Constants.A0C, Float.valueOf(cyb.A06).floatValue());
            }
            if (!TextUtils.isEmpty(cyb.A03)) {
                cy72 = new CY7(Constants.A0C, Float.valueOf(cyb.A03).floatValue());
            }
            if (!TextUtils.isEmpty(cyb.A04)) {
                cy74 = new CY7(Constants.A0C, Float.valueOf(cyb.A04).floatValue());
            }
            if (!TextUtils.isEmpty(cyb.A05)) {
                cy73 = new CY7(Constants.A0C, Float.valueOf(cyb.A05).floatValue());
            }
            this.A01 = new CY8(cy74, cy7, cy73, cy72);
        }
        if (!AnonymousClass0OX.A00(list)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.A03.add((CY9) CY9.A01.get(((CYA) it.next()).toString()));
            }
        }
    }
}
