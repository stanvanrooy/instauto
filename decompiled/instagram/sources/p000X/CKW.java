package p000X;

import android.text.InputFilter;
import android.view.View;
import android.widget.EditText;
import com.facebook.C0003R;
import com.instagram.igds.components.form.IgFormField;

/* renamed from: X.CKW */
public final class CKW implements AnonymousClass1N6 {
    public final /* synthetic */ View A00;
    public final /* synthetic */ CKR A01;

    public CKW(View view, CKR ckr) {
        this.A00 = view;
        this.A01 = ckr;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        CKX ckx = (CKX) obj;
        CKR ckr = this.A01;
        View view = this.A00;
        C13150hy.A01(view, "it");
        C13150hy.A01(ckx, "viewModel");
        View findViewById = view.findViewById(C0003R.C0005id.first_name);
        IgFormField igFormField = (IgFormField) findViewById;
        String str = ckx.A0Q;
        if (str == null) {
            str = "";
        }
        igFormField.setText(str);
        igFormField.setRuleChecker(new AnonymousClass50H(ckr.getString(C0003R.string.required_field)));
        C13150hy.A01(findViewById, "view.findViewById<IgForm…ired_field)))\n          }");
        ckr.A03 = igFormField;
        View findViewById2 = view.findViewById(C0003R.C0005id.middle_name);
        IgFormField igFormField2 = (IgFormField) findViewById2;
        String str2 = ckx.A0S;
        if (str2 == null) {
            str2 = "";
        }
        igFormField2.setText(str2);
        C13150hy.A01(findViewById2, "view.findViewById<IgForm…(ownerMiddleName ?: \"\") }");
        ckr.A05 = igFormField2;
        View findViewById3 = view.findViewById(C0003R.C0005id.last_name);
        IgFormField igFormField3 = (IgFormField) findViewById3;
        String str3 = ckx.A0R;
        if (str3 == null) {
            str3 = "";
        }
        igFormField3.setText(str3);
        igFormField3.setRuleChecker(new AnonymousClass50H(ckr.getString(C0003R.string.required_field)));
        C13150hy.A01(findViewById3, "view.findViewById<IgForm…ired_field)))\n          }");
        ckr.A04 = igFormField3;
        View findViewById4 = view.findViewById(C0003R.C0005id.date_of_birth);
        IgFormField igFormField4 = (IgFormField) findViewById4;
        String str4 = ckx.A0P;
        if (str4 == null) {
            str4 = "";
        }
        igFormField4.setText(str4);
        igFormField4.setRuleChecker(new AnonymousClass50H(ckr.getString(C0003R.string.required_field)));
        EditText editText = igFormField4.A00;
        C13150hy.A01(editText, "editText");
        editText.setFocusable(false);
        EditText editText2 = igFormField4.A00;
        C13150hy.A01(editText2, "editText");
        editText2.setClickable(true);
        igFormField4.A00.setOnClickListener(new C27617CKk(ckx, ckr, view));
        C13150hy.A01(findViewById4, "view.findViewById<IgForm…            }\n          }");
        ckr.A02 = igFormField4;
        View findViewById5 = view.findViewById(C0003R.C0005id.address);
        IgFormField igFormField5 = (IgFormField) findViewById5;
        String str5 = ckx.A0M;
        if (str5 == null) {
            str5 = "";
        }
        igFormField5.setText(str5);
        String string = ckr.getString(C0003R.string.required_field);
        C13150hy.A01(string, "getString(R.string.required_field)");
        CKE cke = new CKE(string);
        ckr.A09 = cke;
        igFormField5.setRuleChecker(cke);
        C13150hy.A01(findViewById5, "view.findViewById<IgForm…dressChecker)\n          }");
        ckr.A00 = igFormField5;
        View findViewById6 = view.findViewById(C0003R.C0005id.city);
        IgFormField igFormField6 = (IgFormField) findViewById6;
        String str6 = ckx.A0O;
        if (str6 == null) {
            str6 = "";
        }
        igFormField6.setText(str6);
        igFormField6.setRuleChecker(new AnonymousClass50H(ckr.getString(C0003R.string.required_field)));
        C13150hy.A01(findViewById6, "view.findViewById<IgForm…ired_field)))\n          }");
        ckr.A01 = igFormField6;
        View findViewById7 = view.findViewById(C0003R.C0005id.state);
        IgFormField igFormField7 = (IgFormField) findViewById7;
        String str7 = ckx.A0T;
        if (str7 == null) {
            str7 = "";
        }
        igFormField7.setText(str7);
        igFormField7.setRuleChecker(new AnonymousClass50H(ckr.getString(C0003R.string.required_field)));
        C13150hy.A01(findViewById7, "view.findViewById<IgForm…ired_field)))\n          }");
        ckr.A06 = igFormField7;
        View findViewById8 = view.findViewById(C0003R.C0005id.zip);
        IgFormField igFormField8 = (IgFormField) findViewById8;
        String str8 = ckx.A0U;
        if (str8 == null) {
            str8 = "";
        }
        igFormField8.setText(str8);
        igFormField8.setInputType(2);
        igFormField8.setRuleChecker(new AnonymousClass50H(ckr.getString(C0003R.string.required_field)));
        EditText editText3 = igFormField8.A00;
        C13150hy.A01(editText3, "editText");
        editText3.setFilters((InputFilter[]) new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(5)});
        C13150hy.A01(findViewById8, "view.findViewById<IgForm…CODE_LENGTH))\n          }");
        ckr.A07 = igFormField8;
    }
}
