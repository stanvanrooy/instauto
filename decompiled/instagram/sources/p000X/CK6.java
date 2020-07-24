package p000X;

import android.os.Bundle;
import com.facebook.C0003R;
import java.util.ArrayList;

/* renamed from: X.CK6 */
public final class CK6 extends C101214Yy implements AnonymousClass1HM {
    public static final CKG A03 = new CKG();
    public int A00;
    public CKS A01;
    public final C18750sM A02 = C18730sK.A00(new CKB(this));

    public final String getModuleName() {
        return "BusinessTypeSelectionFragment";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public final void configureActionBar(AnonymousClass1EX r3) {
        C13150hy.A02(r3, "configurer");
        r3.BlI(C0003R.string.payout_select_business_type);
        r3.Bo6(true);
        r3.A4I(getString(C0003R.string.done), new CK8(this));
    }

    public final /* bridge */ /* synthetic */ C06590Pq getSession() {
        return (AnonymousClass0C1) this.A02.getValue();
    }

    public final void onCreate(Bundle bundle) {
        int i;
        CKX ckx;
        CL0 cl0;
        int A022 = AnonymousClass0Z0.A02(-2061874841);
        super.onCreate(bundle);
        C25941Az A002 = new C25921Ax((C11750fc) requireActivity(), (AnonymousClass1B1) new CKI(CLA.A00((AnonymousClass0C1) this.A02.getValue(), new C27611CKe((AnonymousClass0C1) this.A02.getValue())))).A00(CKS.class);
        C13150hy.A01(A002, "ViewModelProvider(\n     …ngInteractor::class.java]");
        CKS cks = (CKS) A002;
        this.A01 = cks;
        if (cks == null) {
            C13150hy.A03("interactor");
        }
        AnonymousClass1HR r0 = cks.A01;
        if (r0 == null || (ckx = (CKX) r0.A02()) == null || (cl0 = ckx.A00) == null) {
            i = 0;
        } else {
            i = cl0.ordinal();
        }
        this.A00 = i;
        C120235Dv[] r5 = new C120235Dv[1];
        ArrayList arrayList = new ArrayList();
        for (CL0 cl02 : CL0.values()) {
            arrayList.add(new C120245Dw(String.valueOf(cl02.ordinal()), getString(CK9.A00(cl02))));
        }
        r5[0] = new C120235Dv(arrayList, String.valueOf(this.A00), new CKD(this));
        C13150hy.A02(r5, "elements");
        setItems(new ArrayList(new C233510a(r5)));
        AnonymousClass0Z0.A09(-599746237, A022);
    }
}
