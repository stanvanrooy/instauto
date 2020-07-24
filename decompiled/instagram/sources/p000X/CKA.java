package p000X;

import com.instagram.igds.components.button.IgButton;
import com.instagram.igds.components.form.IgFormField;

/* renamed from: X.CKA */
public final class CKA implements AnonymousClass1N6 {
    public final /* synthetic */ CK5 A00;

    public CKA(CK5 ck5) {
        this.A00 = ck5;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        CKX ckx = (CKX) obj;
        CKE cke = this.A00.A00.A0A;
        if (cke == null) {
            C13150hy.A03("routingNumberChecker");
        }
        cke.A00 = ckx.A08;
        IgFormField igFormField = this.A00.A00.A08;
        if (igFormField == null) {
            C13150hy.A03("routingNumber");
        }
        igFormField.A04();
        IgButton igButton = this.A00.A00.A04;
        if (igButton == null) {
            C13150hy.A03("button");
        }
        igButton.setEnabled(!ckx.A0W);
        IgButton igButton2 = this.A00.A00.A04;
        if (igButton2 == null) {
            C13150hy.A03("button");
        }
        igButton2.setLoading(ckx.A0W);
    }
}
