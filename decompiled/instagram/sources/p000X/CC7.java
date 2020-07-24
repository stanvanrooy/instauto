package p000X;

import com.facebook.C0003R;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.CC7 */
public enum CC7 {
    A06(NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED, -1),
    CREDIT("CREDIT", C0003R.string.promote_special_requirement_bottom_sheet_credit_title),
    EMPLOYMENT("EMPLOYMENT", C0003R.string.promote_special_requirement_bottom_sheet_employment_title),
    HOUSING("HOUSING", C0003R.string.promote_special_requirement_bottom_sheet_housing_title),
    POLITICAL("ISSUES_ELECTIONS_POLITICS", C0003R.string.promote_special_requirement_bottom_sheet_political_title);
    
    public final int A00;
    public final String A01;

    /* access modifiers changed from: public */
    CC7(String str, int i) {
        this.A01 = str;
        this.A00 = i;
    }
}
