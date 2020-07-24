package p000X;

import android.content.Context;
import android.os.Bundle;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.instagram.common.p004ui.base.IgCheckBox;
import com.instagram.common.p004ui.base.IgTextView;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

/* renamed from: X.CKO */
public final class CKO extends C27341Hl implements AnonymousClass1HK, AnonymousClass1HM, CKM {
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
    public CKS A0B;
    public CKE A0C;
    public CKF A0D;
    public CKF A0E;
    public final C18750sM A0F = C18730sK.A00(new CL4(this));

    public final void BWe(String str) {
    }

    public final String getModuleName() {
        return "EnterBusinessInfoFragment";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public static final void A00(CKO cko) {
        IgFormField[] igFormFieldArr = new IgFormField[8];
        IgFormField igFormField = cko.A04;
        if (igFormField == null) {
            C13150hy.A03("businessName");
        }
        igFormFieldArr[0] = igFormField;
        IgFormField igFormField2 = cko.A03;
        if (igFormField2 == null) {
            C13150hy.A03("address");
        }
        igFormFieldArr[1] = igFormField2;
        IgFormField igFormField3 = cko.A05;
        if (igFormField3 == null) {
            C13150hy.A03("city");
        }
        igFormFieldArr[2] = igFormField3;
        IgFormField igFormField4 = cko.A08;
        if (igFormField4 == null) {
            C13150hy.A03("state");
        }
        igFormFieldArr[3] = igFormField4;
        IgFormField igFormField5 = cko.A0A;
        if (igFormField5 == null) {
            C13150hy.A03("zip");
        }
        igFormFieldArr[4] = igFormField5;
        IgFormField igFormField6 = cko.A07;
        if (igFormField6 == null) {
            C13150hy.A03("phone");
        }
        igFormFieldArr[5] = igFormField6;
        IgFormField igFormField7 = cko.A06;
        if (igFormField7 == null) {
            C13150hy.A03(IgReactPurchaseExperienceBridgeModule.EMAIL);
        }
        igFormFieldArr[6] = igFormField7;
        IgFormField igFormField8 = cko.A09;
        if (igFormField8 == null) {
            C13150hy.A03("taxId");
        }
        igFormFieldArr[7] = igFormField8;
        for (IgFormField A042 : AnonymousClass10L.A03(igFormFieldArr)) {
            A042.A04();
        }
        IgTextView igTextView = cko.A02;
        if (igTextView == null) {
            C13150hy.A03("termsError");
        }
        IgCheckBox igCheckBox = cko.A01;
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
        ImageView imageView = cko.A00;
        if (imageView == null) {
            C13150hy.A03("termsErrorIndicator");
        }
        IgCheckBox igCheckBox2 = cko.A01;
        if (igCheckBox2 == null) {
            C13150hy.A03("termsCheckbox");
        }
        if (!igCheckBox2.isChecked()) {
            i = 0;
        }
        imageView.setVisibility(i);
    }

    public static final void A01(CKO cko) {
        CKS cks = cko.A0B;
        if (cks == null) {
            C13150hy.A03("interactor");
        }
        IgFormField igFormField = cko.A04;
        if (igFormField == null) {
            C13150hy.A03("businessName");
        }
        String A022 = CK9.A02(igFormField);
        IgFormField igFormField2 = cko.A03;
        if (igFormField2 == null) {
            C13150hy.A03("address");
        }
        String A023 = CK9.A02(igFormField2);
        IgFormField igFormField3 = cko.A05;
        if (igFormField3 == null) {
            C13150hy.A03("city");
        }
        String A024 = CK9.A02(igFormField3);
        IgFormField igFormField4 = cko.A08;
        if (igFormField4 == null) {
            C13150hy.A03("state");
        }
        String A025 = CK9.A02(igFormField4);
        IgFormField igFormField5 = cko.A0A;
        if (igFormField5 == null) {
            C13150hy.A03("zip");
        }
        String A026 = CK9.A02(igFormField5);
        IgFormField igFormField6 = cko.A07;
        if (igFormField6 == null) {
            C13150hy.A03("phone");
        }
        String A027 = CK9.A02(igFormField6);
        IgFormField igFormField7 = cko.A06;
        if (igFormField7 == null) {
            C13150hy.A03(IgReactPurchaseExperienceBridgeModule.EMAIL);
        }
        String A028 = CK9.A02(igFormField7);
        IgFormField igFormField8 = cko.A09;
        if (igFormField8 == null) {
            C13150hy.A03("taxId");
        }
        String A029 = CK9.A02(igFormField8);
        IgCheckBox igCheckBox = cko.A01;
        if (igCheckBox == null) {
            C13150hy.A03("termsCheckbox");
        }
        boolean isChecked = igCheckBox.isChecked();
        Object A0210 = cks.A02.A02();
        if (A0210 == null) {
            C13150hy.A00();
        }
        CKX ckx = (CKX) A0210;
        ckx.A0D = A022;
        ckx.A09 = A023;
        ckx.A0B = A024;
        ckx.A0G = A025;
        ckx.A0J = A026;
        ckx.A0E = A027;
        ckx.A0C = A028;
        ckx.A0H = A029;
        CL1 cl1 = CL1.EIN;
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
            C52362Om r4 = new C52362Om(activity, (AnonymousClass0C1) this.A0F.getValue());
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
        r3.A4I(getString(C0003R.string.next), new C27622CKp(this));
    }

    public final /* bridge */ /* synthetic */ C06590Pq getSession() {
        return (AnonymousClass0C1) this.A0F.getValue();
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
        int A022 = AnonymousClass0Z0.A02(332540203);
        super.onCreate(bundle);
        C25941Az A002 = new C25921Ax((C11750fc) requireActivity(), (AnonymousClass1B1) new CKI(CLA.A00((AnonymousClass0C1) this.A0F.getValue(), new C27611CKe((AnonymousClass0C1) this.A0F.getValue())))).A00(CKS.class);
        C13150hy.A01(A002, "ViewModelProvider(\n     …ngInteractor::class.java]");
        this.A0B = (CKS) A002;
        AnonymousClass0Z0.A09(-957639794, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        int A022 = AnonymousClass0Z0.A02(1781458928);
        LayoutInflater layoutInflater2 = layoutInflater;
        C13150hy.A02(layoutInflater2, "inflater");
        View inflate = layoutInflater2.inflate(C0003R.layout.layout_enter_business_info, viewGroup, false);
        CKS cks = this.A0B;
        if (cks == null) {
            C13150hy.A03("interactor");
        }
        C13150hy.A02(this, "delegate");
        cks.A00 = this;
        C13150hy.A01(inflate, "it");
        View findViewById = inflate.findViewById(C0003R.C0005id.title);
        C13150hy.A01(findViewById, "view.findViewById<IgTextView>(R.id.title)");
        ((IgTextView) findViewById).setText(getString(C0003R.string.payout_enter_business_info_title));
        View findViewById2 = inflate.findViewById(C0003R.C0005id.description);
        C13150hy.A01(findViewById2, "view.findViewById<IgTextView>(R.id.description)");
        ((IgTextView) findViewById2).setText(getString(C0003R.string.payout_enter_business_info_description));
        ImageView imageView = (ImageView) inflate.findViewById(C0003R.C0005id.icon);
        Context context = getContext();
        if (context == null) {
            C13150hy.A00();
        }
        imageView.setImageDrawable(C019000b.A03(context, C0003R.C0004drawable.payout_business_info));
        CKS cks2 = this.A0B;
        if (cks2 == null) {
            C13150hy.A03("interactor");
        }
        CKX ckx = (CKX) cks2.A01.A02();
        View findViewById3 = inflate.findViewById(C0003R.C0005id.legal_business_name);
        IgFormField igFormField = (IgFormField) findViewById3;
        if (ckx == null || (str = ckx.A0D) == null) {
            str = "";
        }
        igFormField.setText(str);
        igFormField.setRuleChecker(new AnonymousClass50H(getString(C0003R.string.required_field)));
        C13150hy.A01(findViewById3, "view.findViewById<IgForm…quired_field)))\n        }");
        this.A04 = igFormField;
        View findViewById4 = inflate.findViewById(C0003R.C0005id.business_address);
        IgFormField igFormField2 = (IgFormField) findViewById4;
        if (ckx == null || (str2 = ckx.A09) == null) {
            str2 = "";
        }
        igFormField2.setText(str2);
        igFormField2.setInputType(112);
        String string = getString(C0003R.string.required_field);
        C13150hy.A01(string, "getString(R.string.required_field)");
        CKE cke = new CKE(string);
        this.A0C = cke;
        igFormField2.setRuleChecker(cke);
        C13150hy.A01(findViewById4, "view.findViewById<IgForm…addressChecker)\n        }");
        this.A03 = igFormField2;
        View findViewById5 = inflate.findViewById(C0003R.C0005id.city);
        IgFormField igFormField3 = (IgFormField) findViewById5;
        if (ckx == null || (str3 = ckx.A0B) == null) {
            str3 = "";
        }
        igFormField3.setText(str3);
        igFormField3.setRuleChecker(new AnonymousClass50H(getString(C0003R.string.required_field)));
        C13150hy.A01(findViewById5, "view.findViewById<IgForm…quired_field)))\n        }");
        this.A05 = igFormField3;
        View findViewById6 = inflate.findViewById(C0003R.C0005id.state);
        IgFormField igFormField4 = (IgFormField) findViewById6;
        if (ckx == null || (str4 = ckx.A0G) == null) {
            str4 = "";
        }
        igFormField4.setText(str4);
        igFormField4.setRuleChecker(new AnonymousClass50H(getString(C0003R.string.required_field)));
        C13150hy.A01(findViewById6, "view.findViewById<IgForm…quired_field)))\n        }");
        this.A08 = igFormField4;
        View findViewById7 = inflate.findViewById(C0003R.C0005id.zip);
        IgFormField igFormField5 = (IgFormField) findViewById7;
        if (ckx == null || (str5 = ckx.A0J) == null) {
            str5 = "";
        }
        igFormField5.setText(str5);
        igFormField5.setInputType(2);
        String string2 = getString(C0003R.string.required_field);
        C13150hy.A01(string2, "getString(R.string.required_field)");
        igFormField5.setRuleChecker(new CKF(string2, 5, getString(C0003R.string.payout_zip_invalid_error)));
        EditText editText = igFormField5.A00;
        C13150hy.A01(editText, "editText");
        boolean z = false;
        editText.setFilters((InputFilter[]) new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(5)});
        C13150hy.A01(findViewById7, "view.findViewById<IgForm…P_CODE_LENGTH))\n        }");
        this.A0A = igFormField5;
        View findViewById8 = inflate.findViewById(C0003R.C0005id.phone);
        IgFormField igFormField6 = (IgFormField) findViewById8;
        if (ckx == null || (str6 = ckx.A0E) == null) {
            str6 = "";
        }
        igFormField6.setText(str6);
        igFormField6.setInputType(3);
        String string3 = getString(C0003R.string.required_field);
        C13150hy.A01(string3, "getString(R.string.required_field)");
        CKF ckf = new CKF(string3, 14, getString(C0003R.string.invalid_phone_error));
        this.A0D = ckf;
        igFormField6.setRuleChecker(ckf);
        igFormField6.A05(new PhoneNumberFormattingTextWatcher());
        EditText editText2 = igFormField6.A00;
        C13150hy.A01(editText2, "editText");
        editText2.setFilters((InputFilter[]) new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(14)});
        C13150hy.A01(findViewById8, "view.findViewById<IgForm…HYPHEN_LENGTH))\n        }");
        this.A07 = igFormField6;
        View findViewById9 = inflate.findViewById(C0003R.C0005id.email);
        IgFormField igFormField7 = (IgFormField) findViewById9;
        if (ckx == null || (str7 = ckx.A0C) == null) {
            str7 = "";
        }
        igFormField7.setText(str7);
        igFormField7.setInputType(32);
        igFormField7.setRuleChecker(new B7A(igFormField7.getContext()));
        C13150hy.A01(findViewById9, "view.findViewById<IgForm…ecker(context))\n        }");
        this.A06 = igFormField7;
        IgFormField igFormField8 = (IgFormField) inflate.findViewById(C0003R.C0005id.tax_id_type);
        igFormField8.setText(getString(CK9.A01(CL1.EIN)));
        EditText editText3 = igFormField8.A00;
        C13150hy.A01(editText3, "editText");
        editText3.setFocusable(false);
        View findViewById10 = inflate.findViewById(C0003R.C0005id.tax_id_number);
        IgFormField igFormField9 = (IgFormField) findViewById10;
        if (ckx == null || (str8 = ckx.A0H) == null) {
            str8 = "";
        }
        igFormField9.setText(str8);
        igFormField9.setInputType(2);
        String string4 = getString(C0003R.string.required_field);
        C13150hy.A01(string4, "getString(R.string.required_field)");
        CKF ckf2 = new CKF(string4, 10, getString(C0003R.string.payout_tax_id_number_invalid_error));
        this.A0E = ckf2;
        igFormField9.setRuleChecker(ckf2);
        EditText editText4 = igFormField9.A00;
        C13150hy.A01(editText4, "editText");
        igFormField9.A05(new C174527cx(editText4));
        EditText editText5 = igFormField9.A00;
        C13150hy.A01(editText5, "editText");
        editText5.setFilters((InputFilter[]) new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(10)});
        C13150hy.A01(findViewById10, "view.findViewById<IgForm…HYPHEN_LENGTH))\n        }");
        this.A09 = igFormField9;
        View findViewById11 = inflate.findViewById(C0003R.C0005id.terms_checkbox);
        IgCheckBox igCheckBox = (IgCheckBox) findViewById11;
        if (ckx != null) {
            z = ckx.A0V;
        }
        igCheckBox.setChecked(z);
        C13150hy.A01(findViewById11, "view.findViewById<IgChec…tTerms ?: false\n        }");
        this.A01 = igCheckBox;
        View findViewById12 = inflate.findViewById(C0003R.C0005id.terms_error);
        C13150hy.A01(findViewById12, "view.findViewById(R.id.terms_error)");
        this.A02 = (IgTextView) findViewById12;
        View findViewById13 = inflate.findViewById(C0003R.C0005id.terms_error_indicator);
        C13150hy.A01(findViewById13, "view.findViewById(R.id.terms_error_indicator)");
        this.A00 = (ImageView) findViewById13;
        AnonymousClass0Z0.A09(-1502842620, A022);
        return inflate;
    }
}
