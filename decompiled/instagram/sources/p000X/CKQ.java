package p000X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.instagram.common.p004ui.base.IgCheckBox;
import com.instagram.common.p004ui.base.IgTextView;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

/* renamed from: X.CKQ */
public final class CKQ extends C27341Hl implements AnonymousClass1HK, AnonymousClass1HM, CKM {
    public ImageView A00;
    public IgCheckBox A01;
    public IgTextView A02;
    public IgFormField A03;
    public IgFormField A04;
    public IgFormField A05;
    public IgFormField A06;
    public IgFormField A07;
    public IgFormField A08;
    public IgFormField A09;
    public IgFormField A0A;
    public IgFormField A0B;
    public IgFormField A0C;
    public IgFormField A0D;
    public CKS A0E;
    public CKE A0F;
    public CKF A0G;
    public CKF A0H;
    public final C18750sM A0I = C18730sK.A00(new CL5(this));

    public final void BWe(String str) {
    }

    public final String getModuleName() {
        return "EnterIndividualInfoFragment";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public static final void A00(CKQ ckq) {
        IgFormField[] igFormFieldArr = new IgFormField[11];
        IgFormField igFormField = ckq.A07;
        if (igFormField == null) {
            C13150hy.A03("firstName");
        }
        igFormFieldArr[0] = igFormField;
        IgFormField igFormField2 = ckq.A09;
        if (igFormField2 == null) {
            C13150hy.A03("middleName");
        }
        igFormFieldArr[1] = igFormField2;
        IgFormField igFormField3 = ckq.A08;
        if (igFormField3 == null) {
            C13150hy.A03("lastName");
        }
        igFormFieldArr[2] = igFormField3;
        IgFormField igFormField4 = ckq.A05;
        if (igFormField4 == null) {
            C13150hy.A03("dateOfBirth");
        }
        igFormFieldArr[3] = igFormField4;
        IgFormField igFormField5 = ckq.A03;
        if (igFormField5 == null) {
            C13150hy.A03("address");
        }
        igFormFieldArr[4] = igFormField5;
        IgFormField igFormField6 = ckq.A04;
        if (igFormField6 == null) {
            C13150hy.A03("city");
        }
        igFormFieldArr[5] = igFormField6;
        IgFormField igFormField7 = ckq.A0B;
        if (igFormField7 == null) {
            C13150hy.A03("state");
        }
        igFormFieldArr[6] = igFormField7;
        IgFormField igFormField8 = ckq.A0D;
        if (igFormField8 == null) {
            C13150hy.A03("zip");
        }
        igFormFieldArr[7] = igFormField8;
        IgFormField igFormField9 = ckq.A0A;
        if (igFormField9 == null) {
            C13150hy.A03("phone");
        }
        igFormFieldArr[8] = igFormField9;
        IgFormField igFormField10 = ckq.A06;
        if (igFormField10 == null) {
            C13150hy.A03(IgReactPurchaseExperienceBridgeModule.EMAIL);
        }
        igFormFieldArr[9] = igFormField10;
        IgFormField igFormField11 = ckq.A0C;
        if (igFormField11 == null) {
            C13150hy.A03("taxId");
        }
        igFormFieldArr[10] = igFormField11;
        for (IgFormField A042 : AnonymousClass10L.A03(igFormFieldArr)) {
            A042.A04();
        }
        IgTextView igTextView = ckq.A02;
        if (igTextView == null) {
            C13150hy.A03("termsError");
        }
        IgCheckBox igCheckBox = ckq.A01;
        if (igCheckBox == null) {
            C13150hy.A03("termsCheckbox");
        }
        boolean isChecked = igCheckBox.isChecked();
        int i = 8;
        int i2 = 0;
        if (isChecked) {
            i2 = 8;
        }
        igTextView.setVisibility(i2);
        ImageView imageView = ckq.A00;
        if (imageView == null) {
            C13150hy.A03("termsErrorIndicator");
        }
        IgCheckBox igCheckBox2 = ckq.A01;
        if (igCheckBox2 == null) {
            C13150hy.A03("termsCheckbox");
        }
        if (!igCheckBox2.isChecked()) {
            i = 0;
        }
        imageView.setVisibility(i);
    }

    public static final void A01(CKQ ckq) {
        StringBuilder sb;
        CKS cks = ckq.A0E;
        if (cks == null) {
            C13150hy.A03("interactor");
        }
        IgFormField igFormField = ckq.A07;
        if (igFormField == null) {
            C13150hy.A03("firstName");
        }
        String A022 = CK9.A02(igFormField);
        IgFormField igFormField2 = ckq.A09;
        if (igFormField2 == null) {
            C13150hy.A03("middleName");
        }
        String A023 = CK9.A02(igFormField2);
        IgFormField igFormField3 = ckq.A08;
        if (igFormField3 == null) {
            C13150hy.A03("lastName");
        }
        String A024 = CK9.A02(igFormField3);
        IgFormField igFormField4 = ckq.A05;
        if (igFormField4 == null) {
            C13150hy.A03("dateOfBirth");
        }
        String A025 = CK9.A02(igFormField4);
        IgFormField igFormField5 = ckq.A03;
        if (igFormField5 == null) {
            C13150hy.A03("address");
        }
        String A026 = CK9.A02(igFormField5);
        IgFormField igFormField6 = ckq.A04;
        if (igFormField6 == null) {
            C13150hy.A03("city");
        }
        String A027 = CK9.A02(igFormField6);
        IgFormField igFormField7 = ckq.A0B;
        if (igFormField7 == null) {
            C13150hy.A03("state");
        }
        String A028 = CK9.A02(igFormField7);
        IgFormField igFormField8 = ckq.A0D;
        if (igFormField8 == null) {
            C13150hy.A03("zip");
        }
        String A029 = CK9.A02(igFormField8);
        IgFormField igFormField9 = ckq.A0A;
        if (igFormField9 == null) {
            C13150hy.A03("phone");
        }
        String A0210 = CK9.A02(igFormField9);
        IgFormField igFormField10 = ckq.A06;
        if (igFormField10 == null) {
            C13150hy.A03(IgReactPurchaseExperienceBridgeModule.EMAIL);
        }
        String A0211 = CK9.A02(igFormField10);
        IgFormField igFormField11 = ckq.A0C;
        if (igFormField11 == null) {
            C13150hy.A03("taxId");
        }
        String A0212 = CK9.A02(igFormField11);
        IgCheckBox igCheckBox = ckq.A01;
        if (igCheckBox == null) {
            C13150hy.A03("termsCheckbox");
        }
        boolean isChecked = igCheckBox.isChecked();
        Object A0213 = cks.A02.A02();
        if (A0213 == null) {
            C13150hy.A00();
        }
        CKX ckx = (CKX) A0213;
        if (A023 != null) {
            sb = new StringBuilder();
            sb.append(A022);
            sb.append(' ');
            sb.append(A023);
        } else {
            sb = new StringBuilder();
            sb.append(A022);
        }
        sb.append(' ');
        sb.append(A024);
        ckx.A0D = sb.toString();
        ckx.A0Q = A022;
        ckx.A0S = A023;
        ckx.A0R = A024;
        ckx.A0P = A025;
        ckx.A09 = A026;
        ckx.A0M = A026;
        ckx.A0B = A027;
        ckx.A0O = A027;
        ckx.A0G = A028;
        ckx.A0T = A028;
        ckx.A0J = A029;
        ckx.A0U = A029;
        ckx.A0E = A0210;
        ckx.A0C = A0211;
        ckx.A0H = A0212;
        CL1 cl1 = CL1.SSN;
        C13150hy.A02(cl1, "<set-?>");
        ckx.A04 = cl1;
        ckx.A0V = isChecked;
    }

    public final void BeA(AnonymousClass1HD r6) {
        if (r6 != null) {
            FragmentActivity activity = getActivity();
            if (activity == null) {
                C13150hy.A00();
            }
            C52362Om r4 = new C52362Om(activity, (AnonymousClass0C1) this.A0I.getValue());
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
        r3.A4I(getString(C0003R.string.next), new C27623CKq(this));
    }

    public final /* bridge */ /* synthetic */ C06590Pq getSession() {
        return (AnonymousClass0C1) this.A0I.getValue();
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
        int A022 = AnonymousClass0Z0.A02(351886068);
        super.onCreate(bundle);
        C25941Az A002 = new C25921Ax((C11750fc) requireActivity(), (AnonymousClass1B1) new CKI(CLA.A00((AnonymousClass0C1) this.A0I.getValue(), new C27611CKe((AnonymousClass0C1) this.A0I.getValue())))).A00(CKS.class);
        C13150hy.A01(A002, "ViewModelProvider(\n     …ngInteractor::class.java]");
        this.A0E = (CKS) A002;
        AnonymousClass0Z0.A09(1489746894, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(74561540);
        C13150hy.A02(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C0003R.layout.layout_enter_individual_info, viewGroup, false);
        C13150hy.A01(inflate, "it");
        View findViewById = inflate.findViewById(C0003R.C0005id.title);
        C13150hy.A01(findViewById, "view.findViewById<IgTextView>(R.id.title)");
        ((IgTextView) findViewById).setText(getString(C0003R.string.payout_enter_your_info_title));
        View findViewById2 = inflate.findViewById(C0003R.C0005id.description);
        C13150hy.A01(findViewById2, "view.findViewById<IgTextView>(R.id.description)");
        ((IgTextView) findViewById2).setText(getString(C0003R.string.payout_enter_your_info_description));
        ImageView imageView = (ImageView) inflate.findViewById(C0003R.C0005id.icon);
        Context context = getContext();
        if (context == null) {
            C13150hy.A00();
        }
        imageView.setImageDrawable(C019000b.A03(context, C0003R.C0004drawable.payout_id_card));
        CKS cks = this.A0E;
        if (cks == null) {
            C13150hy.A03("interactor");
        }
        C13150hy.A02(this, "delegate");
        cks.A00 = this;
        CKS cks2 = this.A0E;
        if (cks2 == null) {
            C13150hy.A03("interactor");
        }
        cks2.A01.A05(this, new CKP(inflate, this));
        AnonymousClass0Z0.A09(-374280136, A022);
        return inflate;
    }
}
