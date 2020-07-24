package p000X;

import com.facebook.C0003R;
import com.instagram.igds.components.form.IgFormField;

/* renamed from: X.CK9 */
public final class CK9 {
    public static final int A00(CL0 cl0) {
        C13150hy.A02(cl0, "businessType");
        switch (C27632CKz.A00[cl0.ordinal()]) {
            case 1:
                return C0003R.string.payout_business_type_individual;
            case 2:
                return C0003R.string.payout_business_type_partnership;
            case 3:
                return C0003R.string.payout_business_type_joint_venture;
            case 4:
                return C0003R.string.payout_business_type_llc;
            case 5:
                return C0003R.string.payout_business_type_public_corp;
            case 6:
                return C0003R.string.payout_business_type_private_corp;
            default:
                throw new C191608Hd();
        }
    }

    public static final int A01(CL1 cl1) {
        C13150hy.A02(cl1, "taxIDType");
        int i = C27632CKz.A01[cl1.ordinal()];
        if (i == 1) {
            return C0003R.string.payout_tax_id_type_ein;
        }
        if (i == 2) {
            return C0003R.string.payout_tax_id_type_ssn;
        }
        throw new C191608Hd();
    }

    public static final String A02(IgFormField igFormField) {
        C13150hy.A02(igFormField, "formField");
        String obj = igFormField.getText().toString();
        if (obj != null) {
            String obj2 = C63262p9.A04(obj).toString();
            boolean z = false;
            if (obj2.length() > 0) {
                z = true;
            }
            if (!z) {
                return null;
            }
            return obj2;
        }
        throw new C183227s6(C193418Ps.$const$string(127));
    }
}
