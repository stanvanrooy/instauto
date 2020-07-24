package p000X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.instagram.common.p004ui.base.IgTextView;
import com.instagram.igds.components.form.IgFormField;

/* renamed from: X.CKR */
public final class CKR extends C27341Hl implements AnonymousClass1HK, AnonymousClass1HM, CKM {
    public IgFormField A00;
    public IgFormField A01;
    public IgFormField A02;
    public IgFormField A03;
    public IgFormField A04;
    public IgFormField A05;
    public IgFormField A06;
    public IgFormField A07;
    public CKS A08;
    public CKE A09;
    public final C18750sM A0A = C18730sK.A00(new CL6(this));

    public final void BWe(String str) {
    }

    public final String getModuleName() {
        return "OwnerInfoFragment";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public static final void A00(CKR ckr) {
        IgFormField[] igFormFieldArr = new IgFormField[8];
        IgFormField igFormField = ckr.A03;
        if (igFormField == null) {
            C13150hy.A03("firstName");
        }
        igFormFieldArr[0] = igFormField;
        IgFormField igFormField2 = ckr.A05;
        if (igFormField2 == null) {
            C13150hy.A03("middleName");
        }
        igFormFieldArr[1] = igFormField2;
        IgFormField igFormField3 = ckr.A04;
        if (igFormField3 == null) {
            C13150hy.A03("lastName");
        }
        igFormFieldArr[2] = igFormField3;
        IgFormField igFormField4 = ckr.A02;
        if (igFormField4 == null) {
            C13150hy.A03("dateOfBirth");
        }
        igFormFieldArr[3] = igFormField4;
        IgFormField igFormField5 = ckr.A00;
        if (igFormField5 == null) {
            C13150hy.A03("address");
        }
        igFormFieldArr[4] = igFormField5;
        IgFormField igFormField6 = ckr.A01;
        if (igFormField6 == null) {
            C13150hy.A03("city");
        }
        igFormFieldArr[5] = igFormField6;
        IgFormField igFormField7 = ckr.A06;
        if (igFormField7 == null) {
            C13150hy.A03("state");
        }
        igFormFieldArr[6] = igFormField7;
        IgFormField igFormField8 = ckr.A07;
        if (igFormField8 == null) {
            C13150hy.A03("zip");
        }
        igFormFieldArr[7] = igFormField8;
        for (IgFormField A042 : AnonymousClass10L.A03(igFormFieldArr)) {
            A042.A04();
        }
    }

    public static final void A01(CKR ckr) {
        CKS cks = ckr.A08;
        if (cks == null) {
            C13150hy.A03("interactor");
        }
        IgFormField igFormField = ckr.A03;
        if (igFormField == null) {
            C13150hy.A03("firstName");
        }
        String A022 = CK9.A02(igFormField);
        IgFormField igFormField2 = ckr.A05;
        if (igFormField2 == null) {
            C13150hy.A03("middleName");
        }
        String A023 = CK9.A02(igFormField2);
        IgFormField igFormField3 = ckr.A04;
        if (igFormField3 == null) {
            C13150hy.A03("lastName");
        }
        String A024 = CK9.A02(igFormField3);
        IgFormField igFormField4 = ckr.A02;
        if (igFormField4 == null) {
            C13150hy.A03("dateOfBirth");
        }
        String A025 = CK9.A02(igFormField4);
        IgFormField igFormField5 = ckr.A00;
        if (igFormField5 == null) {
            C13150hy.A03("address");
        }
        String A026 = CK9.A02(igFormField5);
        IgFormField igFormField6 = ckr.A01;
        if (igFormField6 == null) {
            C13150hy.A03("city");
        }
        String A027 = CK9.A02(igFormField6);
        IgFormField igFormField7 = ckr.A06;
        if (igFormField7 == null) {
            C13150hy.A03("state");
        }
        String A028 = CK9.A02(igFormField7);
        IgFormField igFormField8 = ckr.A07;
        if (igFormField8 == null) {
            C13150hy.A03("zip");
        }
        String A029 = CK9.A02(igFormField8);
        Object A0210 = cks.A02.A02();
        if (A0210 == null) {
            C13150hy.A00();
        }
        CKX ckx = (CKX) A0210;
        ckx.A0Q = A022;
        ckx.A0S = A023;
        ckx.A0R = A024;
        ckx.A0P = A025;
        ckx.A0M = A026;
        ckx.A0O = A027;
        ckx.A0T = A028;
        ckx.A0U = A029;
    }

    public final void BeA(AnonymousClass1HD r6) {
        if (r6 != null) {
            FragmentActivity activity = getActivity();
            if (activity == null) {
                C13150hy.A00();
            }
            C52362Om r4 = new C52362Om(activity, (AnonymousClass0C1) this.A0A.getValue());
            r4.A0B = true;
            r4.A02 = r6;
            r4.A05(C0003R.anim.right_in, C0003R.anim.left_out, C0003R.anim.left_in, C0003R.anim.right_out);
            r4.A02();
        }
    }

    public final void configureActionBar(AnonymousClass1EX r3) {
        C13150hy.A02(r3, "configurer");
        r3.BlI(C0003R.string.payout_setup_payout_account);
        r3.Bo6(true);
        r3.A4I(getString(C0003R.string.next), new CKY(this));
    }

    public final /* bridge */ /* synthetic */ C06590Pq getSession() {
        return (AnonymousClass0C1) this.A0A.getValue();
    }

    public final void Bog(int i) {
        AnonymousClass5F9.A02(getContext(), getString(i));
    }

    public final boolean onBackPressed() {
        A01(this);
        AnonymousClass1AM parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager == null) {
            return true;
        }
        parentFragmentManager.A0W();
        return true;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-874421541);
        super.onCreate(bundle);
        C25941Az A002 = new C25921Ax((C11750fc) requireActivity(), (AnonymousClass1B1) new CKI(CLA.A00((AnonymousClass0C1) this.A0A.getValue(), new C27611CKe((AnonymousClass0C1) this.A0A.getValue())))).A00(CKS.class);
        C13150hy.A01(A002, "ViewModelProvider(\n     …ngInteractor::class.java]");
        this.A08 = (CKS) A002;
        AnonymousClass0Z0.A09(-113501148, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-1130943365);
        C13150hy.A02(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C0003R.layout.layout_owner_info, viewGroup, false);
        C13150hy.A01(inflate, "it");
        ((ImageView) inflate.findViewById(C0003R.C0005id.icon)).setImageResource(C0003R.C0004drawable.instagram_app_instagram_outline_24);
        View findViewById = inflate.findViewById(C0003R.C0005id.title);
        C13150hy.A01(findViewById, "view.findViewById<IgTextView>(R.id.title)");
        ((IgTextView) findViewById).setText(getString(C0003R.string.payout_confirm_legal_owner_title));
        View findViewById2 = inflate.findViewById(C0003R.C0005id.description);
        C13150hy.A01(findViewById2, "view.findViewById<IgTextView>(R.id.description)");
        ((IgTextView) findViewById2).setText(getString(C0003R.string.payout_confirm_legal_owner_description));
        ImageView imageView = (ImageView) inflate.findViewById(C0003R.C0005id.icon);
        Context context = getContext();
        if (context == null) {
            C13150hy.A00();
        }
        imageView.setImageDrawable(C019000b.A03(context, C0003R.C0004drawable.payout_id_card));
        CKS cks = this.A08;
        if (cks == null) {
            C13150hy.A03("interactor");
        }
        C13150hy.A02(this, "delegate");
        cks.A00 = this;
        CKS cks2 = this.A08;
        if (cks2 == null) {
            C13150hy.A03("interactor");
        }
        cks2.A01.A05(this, new CKW(inflate, this));
        AnonymousClass0Z0.A09(-578373691, A022);
        return inflate;
    }
}
