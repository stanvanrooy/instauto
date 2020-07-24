package p000X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.p004ui.base.IgCheckBox;
import com.instagram.common.p004ui.base.IgTextView;
import com.instagram.igds.components.button.IgButton;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.modal.ModalActivity;
import java.util.UUID;

/* renamed from: X.CK4 */
public final class CK4 extends C27341Hl implements AnonymousClass1HK, AnonymousClass1HM, CKM {
    public static final CKH A0E = new CKH();
    public View A00;
    public IgCheckBox A01;
    public IgCheckBox A02;
    public IgTextView A03;
    public IgButton A04;
    public IgFormField A05;
    public IgFormField A06;
    public IgFormField A07;
    public IgFormField A08;
    public CKS A09;
    public CKE A0A;
    public Boolean A0B;
    public boolean A0C;
    public final C18750sM A0D = C18730sK.A00(new C25876BbO(this));

    public final String getModuleName() {
        return "PayoutMethodFragment";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public static final void A00(CK4 ck4) {
        IgCheckBox igCheckBox;
        IgCheckBox igCheckBox2;
        Boolean bool = ck4.A0B;
        if (bool == null) {
            IgButton igButton = ck4.A04;
            if (igButton == null) {
                C13150hy.A03("button");
            }
            igButton.setText(ck4.getString(C0003R.string.payout_link_bank_button));
            IgTextView igTextView = ck4.A03;
            if (igTextView == null) {
                C13150hy.A03("footer");
            }
            igTextView.setText(ck4.getString(C0003R.string.payout_link_bank_footer));
            IgButton igButton2 = ck4.A04;
            if (igButton2 == null) {
                C13150hy.A03("button");
            }
            igButton2.setEnabled(false);
            View view = ck4.A00;
            if (view == null) {
                C13150hy.A03("bankForm");
            }
            view.setVisibility(8);
        } else if (C13150hy.A05(bool, true)) {
            IgButton igButton3 = ck4.A04;
            if (igButton3 == null) {
                C13150hy.A03("button");
            }
            igButton3.setText(ck4.getString(C0003R.string.payout_link_bank_button));
            IgButton igButton4 = ck4.A04;
            if (igButton4 == null) {
                C13150hy.A03("button");
            }
            igButton4.setEnabled(true);
            IgTextView igTextView2 = ck4.A03;
            if (igTextView2 == null) {
                C13150hy.A03("footer");
            }
            igTextView2.setText(ck4.getString(C0003R.string.payout_link_bank_footer));
            IgCheckBox igCheckBox3 = ck4.A01;
            if (igCheckBox3 == null) {
                C13150hy.A03("bankCheckbox");
            }
            igCheckBox3.setChecked(true);
            if (ck4.A0C && (igCheckBox2 = ck4.A02) != null) {
                igCheckBox2.setChecked(false);
            }
            View view2 = ck4.A00;
            if (view2 == null) {
                C13150hy.A03("bankForm");
            }
            view2.setVisibility(0);
            View view3 = ck4.A00;
            if (view3 == null) {
                C13150hy.A03("bankForm");
            }
            view3.animate().alpha(1.0f).setDuration(200);
            IgButton igButton5 = ck4.A04;
            if (igButton5 == null) {
                C13150hy.A03("button");
            }
            igButton5.setOnClickListener(new CK5(ck4));
        } else if (C13150hy.A05(bool, false)) {
            IgButton igButton6 = ck4.A04;
            if (igButton6 == null) {
                C13150hy.A03("button");
            }
            igButton6.setText(ck4.getString(C0003R.string.payout_link_payal_button));
            IgButton igButton7 = ck4.A04;
            if (igButton7 == null) {
                C13150hy.A03("button");
            }
            igButton7.setEnabled(true);
            IgTextView igTextView3 = ck4.A03;
            if (igTextView3 == null) {
                C13150hy.A03("footer");
            }
            igTextView3.setText(ck4.getString(C0003R.string.payout_link_payal_footer));
            IgCheckBox igCheckBox4 = ck4.A01;
            if (igCheckBox4 == null) {
                C13150hy.A03("bankCheckbox");
            }
            igCheckBox4.setChecked(false);
            if (ck4.A0C && (igCheckBox = ck4.A02) != null) {
                igCheckBox.setChecked(true);
            }
            View view4 = ck4.A00;
            if (view4 == null) {
                C13150hy.A03("bankForm");
            }
            view4.animate().alpha(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER).setDuration(200).setListener(new C25875BbN(ck4));
            IgButton igButton8 = ck4.A04;
            if (igButton8 == null) {
                C13150hy.A03("button");
            }
            igButton8.setOnClickListener(new CK7(ck4));
        }
    }

    public final void BWe(String str) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(AnonymousClass0C5.$const$string(1), new C53742Uc(str).A00());
        new C59032gv((AnonymousClass0C1) this.A0D.getValue(), ModalActivity.class, "payout_paypal_auth", bundle, getActivity()).A07(this, 3);
    }

    public final void configureActionBar(AnonymousClass1EX r2) {
        C13150hy.A02(r2, "configurer");
        r2.BlI(C0003R.string.payout_setup_payout_account);
        r2.Bo6(true);
    }

    public final /* bridge */ /* synthetic */ C06590Pq getSession() {
        return (AnonymousClass0C1) this.A0D.getValue();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        Intent intent2 = intent;
        super.onActivityResult(i, i2, intent2);
        if (i == 3 && intent != null && i2 == -1) {
            if (C13150hy.A05(AnonymousClass40t.$const$string(55), intent2.getStringExtra(AnonymousClass40t.$const$string(56)))) {
                String stringExtra = intent2.getStringExtra("code");
                String stringExtra2 = intent2.getStringExtra("state");
                CKS cks = this.A09;
                if (cks == null) {
                    C13150hy.A03("interactor");
                }
                String A042 = ((AnonymousClass0C1) this.A0D.getValue()).A04();
                C13150hy.A01(A042, "userSession.userId");
                C13150hy.A01(stringExtra, "authToken");
                C13150hy.A01(stringExtra2, "state");
                C13150hy.A02(A042, "userId");
                C13150hy.A02(stringExtra, "authToken");
                C13150hy.A02(stringExtra2, "state");
                C27691Iv r2 = cks.A03;
                C27613CKg cKg = cks.A04;
                C13150hy.A02(A042, "userId");
                C13150hy.A02(stringExtra, "authToken");
                C13150hy.A02(stringExtra2, "state");
                C27611CKe cKe = cKg.A00;
                C13150hy.A02(A042, "userId");
                C13150hy.A02(stringExtra, "authToken");
                C13150hy.A02(stringExtra2, "state");
                String uuid = UUID.randomUUID().toString();
                C13150hy.A01(uuid, C193418Ps.$const$string(5));
                String A0R = AnonymousClass000.A0R("{\"params\": {\"client_mutation_id\": \"", uuid, "\", \"actor_id\": \"", A042, "\", \"paypal_authorization_code\": \"", stringExtra, "\", \"nonce\": \"", stringExtra2, "\"}}");
                AnonymousClass25V A002 = AnonymousClass25V.A00(cKe.A00);
                A002.A03(new C25088Azm(A0R));
                A002.A04(Constants.ZERO);
                C17850qu A022 = A002.A02(Constants.ONE);
                C13150hy.A01(A022, "GraphQLApi.Builder\n     …pi.IGGraphQLProxy.IG_WWW)");
                C27791Jf A003 = C64482rY.A00(A022);
                C13150hy.A01(A003, "RxRequest.observeRequest…serId, authToken, state))");
                r2.A02(A003.A0G(C27731Iz.A01), new CKL(cks));
            }
        }
    }

    public final void BeA(AnonymousClass1HD r5) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Intent intent = new Intent();
            intent.putExtra(C193418Ps.$const$string(2), true);
            activity.setResult(-1, intent);
            activity.finish();
            activity.overridePendingTransition(C0003R.anim.right_in, C0003R.anim.left_out);
        }
    }

    public final void Bog(int i) {
        AnonymousClass5F9.A02(getContext(), getString(i));
    }

    public final boolean onBackPressed() {
        getParentFragmentManager().A0W();
        return true;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(349035153);
        super.onCreate(bundle);
        Boolean bool = (Boolean) AnonymousClass0L6.A02((AnonymousClass0C1) this.A0D.getValue(), AnonymousClass0L7.PAYOUT_ONBOARDING_PAYPAL_KILLSWITCH, "enabled", false, (AnonymousClass04H) null);
        C13150hy.A01(bool, "L.ig_payout_onboarding_p…getAndExpose(userSession)");
        boolean booleanValue = bool.booleanValue();
        this.A0C = booleanValue;
        boolean z = null;
        if (!booleanValue) {
            z = true;
        }
        this.A0B = z;
        C25941Az A002 = new C25921Ax((C11750fc) requireActivity(), (AnonymousClass1B1) new CKI(CLA.A00((AnonymousClass0C1) this.A0D.getValue(), new C27611CKe((AnonymousClass0C1) this.A0D.getValue())))).A00(CKS.class);
        C13150hy.A01(A002, "ViewModelProvider(\n     …ngInteractor::class.java]");
        this.A09 = (CKS) A002;
        AnonymousClass0Z0.A09(454082815, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        CKC ckc;
        int A022 = AnonymousClass0Z0.A02(-1383000704);
        LayoutInflater layoutInflater2 = layoutInflater;
        C13150hy.A02(layoutInflater2, "inflater");
        View inflate = layoutInflater2.inflate(C0003R.layout.layout_payout_method, viewGroup, false);
        C13150hy.A01(inflate, "this");
        ((ImageView) inflate.findViewById(C0003R.C0005id.icon)).setImageResource(C0003R.C0004drawable.instagram_app_instagram_outline_24);
        View findViewById = inflate.findViewById(C0003R.C0005id.title);
        C13150hy.A01(findViewById, "findViewById<IgTextView>(R.id.title)");
        ((IgTextView) findViewById).setText(getString(C0003R.string.payout_method_title));
        View findViewById2 = inflate.findViewById(C0003R.C0005id.description);
        C13150hy.A01(findViewById2, "findViewById<IgTextView>(R.id.description)");
        ((IgTextView) findViewById2).setText(getString(C0003R.string.payout_method_description));
        ImageView imageView = (ImageView) inflate.findViewById(C0003R.C0005id.icon);
        Context context = inflate.getContext();
        if (context == null) {
            C13150hy.A00();
        }
        imageView.setImageDrawable(C019000b.A03(context, C0003R.C0004drawable.payout_add_bank));
        View findViewById3 = inflate.findViewById(C0003R.C0005id.bank_row);
        View findViewById4 = findViewById3.findViewById(C0003R.C0005id.title);
        C13150hy.A01(findViewById4, "it.findViewById<IgTextView>(R.id.title)");
        ((IgTextView) findViewById4).setText(getString(C0003R.string.payout_link_bank));
        View findViewById5 = findViewById3.findViewById(C0003R.C0005id.checkbox);
        IgCheckBox igCheckBox = (IgCheckBox) findViewById5;
        if (this.A0C) {
            C13150hy.A01(igCheckBox, "checkbox");
            igCheckBox.setEnabled(true);
            igCheckBox.setChecked(C13150hy.A05(this.A0B, true));
            igCheckBox.setChecked(C13150hy.A05(this.A0B, true));
            igCheckBox.setOnCheckedChangeListener(new CK2(this));
        } else {
            C13150hy.A01(igCheckBox, "checkbox");
            igCheckBox.setEnabled(false);
        }
        C13150hy.A01(findViewById5, "it.findViewById<IgCheckB…            }\n          }");
        this.A01 = igCheckBox;
        View findViewById6 = inflate.findViewById(C0003R.C0005id.bank_form);
        if (findViewById6 == null) {
            C13150hy.A00();
        }
        CKS cks = this.A09;
        if (cks == null) {
            C13150hy.A03("interactor");
        }
        CKX ckx = (CKX) cks.A01.A02();
        View findViewById7 = findViewById6.findViewById(C0003R.C0005id.bank_country);
        IgFormField igFormField = (IgFormField) findViewById7;
        if (ckx == null || (ckc = ckx.A01) == null || (str = ckc.A00) == null) {
            str = "";
        }
        igFormField.setText(str);
        EditText editText = igFormField.A00;
        C13150hy.A01(editText, "editText");
        editText.setFocusable(false);
        C13150hy.A01(findViewById7, "findViewById<IgFormField…e = false\n              }");
        this.A07 = igFormField;
        View findViewById8 = findViewById6.findViewById(C0003R.C0005id.account_holder_name);
        IgFormField igFormField2 = (IgFormField) findViewById8;
        if (ckx == null || (str2 = ckx.A05) == null) {
            str2 = "";
        }
        igFormField2.setText(str2);
        igFormField2.setRuleChecker(new AnonymousClass50H(getString(C0003R.string.required_field)));
        C13150hy.A01(findViewById8, "findViewById<IgFormField…_field)))\n              }");
        this.A05 = igFormField2;
        View findViewById9 = findViewById6.findViewById(C0003R.C0005id.routing_number);
        IgFormField igFormField3 = (IgFormField) findViewById9;
        if (ckx == null || (str3 = ckx.A07) == null) {
            str3 = "";
        }
        igFormField3.setText(str3);
        igFormField3.setInputType(2);
        EditText editText2 = igFormField3.A00;
        C13150hy.A01(editText2, "editText");
        editText2.setFilters((InputFilter[]) new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(9)});
        String string = getString(C0003R.string.required_field);
        C13150hy.A01(string, "getString(R.string.required_field)");
        CKE cke = new CKE(string);
        this.A0A = cke;
        igFormField3.setRuleChecker(cke);
        C13150hy.A01(findViewById9, "findViewById<IgFormField…rChecker)\n              }");
        this.A08 = igFormField3;
        View findViewById10 = findViewById6.findViewById(C0003R.C0005id.account_number);
        IgFormField igFormField4 = (IgFormField) findViewById10;
        if (ckx == null || (str4 = ckx.A06) == null) {
            str4 = "";
        }
        igFormField4.setText(str4);
        igFormField4.setInputType(2);
        igFormField4.setRuleChecker(new AnonymousClass50H(getString(C0003R.string.required_field)));
        C13150hy.A01(findViewById10, "findViewById<IgFormField…_field)))\n              }");
        this.A06 = igFormField4;
        this.A00 = findViewById6;
        if (this.A0C) {
            View findViewById11 = inflate.findViewById(C0003R.C0005id.paypal_row);
            View findViewById12 = findViewById11.findViewById(C0003R.C0005id.title);
            C13150hy.A01(findViewById12, "it.findViewById<IgTextView>(R.id.title)");
            ((IgTextView) findViewById12).setText(getString(C0003R.string.payout_link_paypal));
            IgCheckBox igCheckBox2 = (IgCheckBox) findViewById11.findViewById(C0003R.C0005id.checkbox);
            C13150hy.A01(igCheckBox2, "checkbox");
            Boolean bool = this.A0B;
            boolean z = true;
            if (bool == null || !(!C13150hy.A05(bool, true))) {
                z = false;
            }
            igCheckBox2.setChecked(z);
            igCheckBox2.setOnCheckedChangeListener(new CK3(this));
            this.A02 = igCheckBox2;
        } else {
            View findViewById13 = inflate.findViewById(C0003R.C0005id.paypal_row);
            C13150hy.A01(findViewById13, "view.findViewById<View>(R.id.paypal_row)");
            findViewById13.setVisibility(8);
        }
        View findViewById14 = inflate.findViewById(C0003R.C0005id.button);
        C13150hy.A01(findViewById14, "view.findViewById(R.id.button)");
        this.A04 = (IgButton) findViewById14;
        View findViewById15 = inflate.findViewById(C0003R.C0005id.footer);
        C13150hy.A01(findViewById15, "view.findViewById(R.id.footer)");
        this.A03 = (IgTextView) findViewById15;
        CKS cks2 = this.A09;
        if (cks2 == null) {
            C13150hy.A03("interactor");
        }
        C13150hy.A02(this, "delegate");
        cks2.A00 = this;
        A00(this);
        AnonymousClass0Z0.A09(-633337342, A022);
        return inflate;
    }
}
