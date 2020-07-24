package p000X;

import android.telephony.PhoneNumberFormattingTextWatcher;
import android.text.InputFilter;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import com.facebook.C0003R;
import com.instagram.common.p004ui.base.IgCheckBox;
import com.instagram.common.p004ui.base.IgTextView;
import com.instagram.igds.components.form.IgFormField;

/* renamed from: X.CKP */
public final class CKP implements AnonymousClass1N6 {
    public final /* synthetic */ View A00;
    public final /* synthetic */ CKQ A01;

    public CKP(View view, CKQ ckq) {
        this.A00 = view;
        this.A01 = ckq;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        CKX ckx = (CKX) obj;
        CKQ ckq = this.A01;
        View view = this.A00;
        C13150hy.A01(view, "it");
        C13150hy.A01(ckx, "viewModel");
        View findViewById = view.findViewById(C0003R.C0005id.legal_first_name);
        IgFormField igFormField = (IgFormField) findViewById;
        String str = ckx.A0Q;
        if (str == null) {
            str = "";
        }
        igFormField.setText(str);
        igFormField.setRuleChecker(new AnonymousClass50H(ckq.getString(C0003R.string.required_field)));
        C13150hy.A01(findViewById, "view.findViewById<IgForm…ired_field)))\n          }");
        ckq.A07 = igFormField;
        View findViewById2 = view.findViewById(C0003R.C0005id.legal_middle_name);
        IgFormField igFormField2 = (IgFormField) findViewById2;
        String str2 = ckx.A0S;
        if (str2 == null) {
            str2 = "";
        }
        igFormField2.setText(str2);
        C13150hy.A01(findViewById2, "view.findViewById<IgForm…leName ?: \"\")\n          }");
        ckq.A09 = igFormField2;
        View findViewById3 = view.findViewById(C0003R.C0005id.legal_last_name);
        IgFormField igFormField3 = (IgFormField) findViewById3;
        String str3 = ckx.A0R;
        if (str3 == null) {
            str3 = "";
        }
        igFormField3.setText(str3);
        igFormField3.setRuleChecker(new AnonymousClass50H(ckq.getString(C0003R.string.required_field)));
        C13150hy.A01(findViewById3, "view.findViewById<IgForm…ired_field)))\n          }");
        ckq.A08 = igFormField3;
        View findViewById4 = view.findViewById(C0003R.C0005id.date_of_birth);
        IgFormField igFormField4 = (IgFormField) findViewById4;
        String str4 = ckx.A0P;
        if (str4 == null) {
            str4 = "";
        }
        igFormField4.setText(str4);
        igFormField4.setRuleChecker(new AnonymousClass50H(ckq.getString(C0003R.string.required_field)));
        EditText editText = igFormField4.A00;
        C13150hy.A01(editText, "editText");
        editText.setFocusable(false);
        EditText editText2 = igFormField4.A00;
        C13150hy.A01(editText2, "editText");
        editText2.setClickable(true);
        igFormField4.A00.setOnClickListener(new C27616CKj(ckx, ckq, view));
        C13150hy.A01(findViewById4, "view.findViewById<IgForm…            }\n          }");
        ckq.A05 = igFormField4;
        View findViewById5 = view.findViewById(C0003R.C0005id.primary_address);
        IgFormField igFormField5 = (IgFormField) findViewById5;
        String str5 = ckx.A09;
        if (str5 == null) {
            str5 = "";
        }
        igFormField5.setText(str5);
        igFormField5.setInputType(112);
        String string = ckq.getString(C0003R.string.required_field);
        C13150hy.A01(string, "getString(R.string.required_field)");
        CKE cke = new CKE(string);
        ckq.A0F = cke;
        igFormField5.setRuleChecker(cke);
        C13150hy.A01(findViewById5, "view.findViewById<IgForm…dressChecker)\n          }");
        ckq.A03 = igFormField5;
        View findViewById6 = view.findViewById(C0003R.C0005id.city);
        IgFormField igFormField6 = (IgFormField) findViewById6;
        String str6 = ckx.A0B;
        if (str6 == null) {
            str6 = "";
        }
        igFormField6.setText(str6);
        igFormField6.setRuleChecker(new AnonymousClass50H(ckq.getString(C0003R.string.required_field)));
        C13150hy.A01(findViewById6, "view.findViewById<IgForm…ired_field)))\n          }");
        ckq.A04 = igFormField6;
        View findViewById7 = view.findViewById(C0003R.C0005id.state);
        IgFormField igFormField7 = (IgFormField) findViewById7;
        String str7 = ckx.A0G;
        if (str7 == null) {
            str7 = "";
        }
        igFormField7.setText(str7);
        igFormField7.setRuleChecker(new AnonymousClass50H(ckq.getString(C0003R.string.required_field)));
        C13150hy.A01(findViewById7, "view.findViewById<IgForm…ired_field)))\n          }");
        ckq.A0B = igFormField7;
        View findViewById8 = view.findViewById(C0003R.C0005id.zip);
        IgFormField igFormField8 = (IgFormField) findViewById8;
        String str8 = ckx.A0J;
        if (str8 == null) {
            str8 = "";
        }
        igFormField8.setText(str8);
        igFormField8.setInputType(2);
        String string2 = ckq.getString(C0003R.string.required_field);
        C13150hy.A01(string2, "getString(R.string.required_field)");
        igFormField8.setRuleChecker(new CKF(string2, 5, ckq.getString(C0003R.string.payout_zip_invalid_error)));
        EditText editText3 = igFormField8.A00;
        C13150hy.A01(editText3, "editText");
        editText3.setFilters((InputFilter[]) new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(5)});
        C13150hy.A01(findViewById8, "view.findViewById<IgForm…CODE_LENGTH))\n          }");
        ckq.A0D = igFormField8;
        View findViewById9 = view.findViewById(C0003R.C0005id.phone);
        IgFormField igFormField9 = (IgFormField) findViewById9;
        String str9 = ckx.A0E;
        if (str9 == null) {
            str9 = "";
        }
        igFormField9.setText(str9);
        igFormField9.setInputType(3);
        String string3 = ckq.getString(C0003R.string.required_field);
        C13150hy.A01(string3, "getString(R.string.required_field)");
        CKF ckf = new CKF(string3, 14, ckq.getString(C0003R.string.invalid_phone_error));
        ckq.A0G = ckf;
        igFormField9.setRuleChecker(ckf);
        igFormField9.A05(new PhoneNumberFormattingTextWatcher());
        EditText editText4 = igFormField9.A00;
        C13150hy.A01(editText4, "editText");
        editText4.setFilters((InputFilter[]) new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(14)});
        C13150hy.A01(findViewById9, "view.findViewById<IgForm…PHEN_LENGTH))\n          }");
        ckq.A0A = igFormField9;
        View findViewById10 = view.findViewById(C0003R.C0005id.email);
        IgFormField igFormField10 = (IgFormField) findViewById10;
        String str10 = ckx.A0C;
        if (str10 == null) {
            str10 = "";
        }
        igFormField10.setText(str10);
        igFormField10.setInputType(32);
        igFormField10.setRuleChecker(new B7A(igFormField10.getContext()));
        C13150hy.A01(findViewById10, "view.findViewById<IgForm…ker(context))\n          }");
        ckq.A06 = igFormField10;
        IgFormField igFormField11 = (IgFormField) view.findViewById(C0003R.C0005id.tax_id_type);
        igFormField11.setText(ckq.getString(CK9.A01(CL1.SSN)));
        EditText editText5 = igFormField11.A00;
        C13150hy.A01(editText5, "editText");
        editText5.setFocusable(false);
        View findViewById11 = view.findViewById(C0003R.C0005id.tax_id_number);
        IgFormField igFormField12 = (IgFormField) findViewById11;
        String str11 = ckx.A0H;
        if (str11 == null) {
            str11 = "";
        }
        igFormField12.setText(str11);
        igFormField12.setInputType(2);
        String string4 = ckq.getString(C0003R.string.required_field);
        C13150hy.A01(string4, "getString(R.string.required_field)");
        CKF ckf2 = new CKF(string4, 11, ckq.getString(C0003R.string.payout_tax_id_number_invalid_error));
        ckq.A0H = ckf2;
        igFormField12.setRuleChecker(ckf2);
        EditText editText6 = igFormField12.A00;
        C13150hy.A01(editText6, "editText");
        igFormField12.A05(new C174537cy(editText6));
        EditText editText7 = igFormField12.A00;
        C13150hy.A01(editText7, "editText");
        editText7.setFilters((InputFilter[]) new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(11)});
        C13150hy.A01(findViewById11, "view.findViewById<IgForm…PHEN_LENGTH))\n          }");
        ckq.A0C = igFormField12;
        View findViewById12 = view.findViewById(C0003R.C0005id.terms_checkbox);
        IgCheckBox igCheckBox = (IgCheckBox) findViewById12;
        igCheckBox.setChecked(ckx.A0V);
        C13150hy.A01(findViewById12, "view.findViewById<IgChec…isChecked = acceptTerms }");
        ckq.A01 = igCheckBox;
        View findViewById13 = view.findViewById(C0003R.C0005id.terms_error);
        C13150hy.A01(findViewById13, "view.findViewById(R.id.terms_error)");
        ckq.A02 = (IgTextView) findViewById13;
        View findViewById14 = view.findViewById(C0003R.C0005id.terms_error_indicator);
        C13150hy.A01(findViewById14, "view.findViewById(R.id.terms_error_indicator)");
        ckq.A00 = (ImageView) findViewById14;
    }
}
