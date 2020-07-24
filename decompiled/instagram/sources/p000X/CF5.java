package p000X;

import com.facebook.C0003R;
import com.instagram.base.activity.BaseFragmentActivity;

/* renamed from: X.CF5 */
public final class CF5 implements C23810Abe {
    public final /* synthetic */ BaseFragmentActivity A00;
    public final /* synthetic */ CD5 A01;

    public CF5(CD5 cd5, BaseFragmentActivity baseFragmentActivity) {
        this.A01 = cd5;
        this.A00 = baseFragmentActivity;
    }

    public final void BTH() {
        CCZ.A01(C27398CBr.ERROR, "promote_no_permissions", this.A01.A07);
        AnonymousClass5F9.A00(this.A00, C0003R.string.something_went_wrong);
    }

    public final void BYA(String str) {
        CCZ.A00(C27398CBr.ERROR, "promote_no_permissions", this.A01.A07);
        BY5.A04(this.A00, "promote_no_permissions", this.A01.A07);
    }

    public final void BYB() {
        BY5.A02(this.A00, "promote_no_permissions", C27398CBr.ERROR, this.A01.A07);
    }
}
