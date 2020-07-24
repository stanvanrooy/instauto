package p000X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import com.instagram.common.p004ui.base.IgTextView;
import com.instagram.igds.components.form.IgFormField;

/* renamed from: X.CKT */
public final class CKT extends C27341Hl implements AnonymousClass1HK, AnonymousClass1HM {
    public IgFormField A00;
    public CKS A01;
    public final C18750sM A02 = C18730sK.A00(new CL7(this));

    public final String getModuleName() {
        return "SetUpPayoutAccountFragment";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public static final void A00(CKT ckt) {
        C52362Om r2 = new C52362Om(ckt.getActivity(), (AnonymousClass0C1) ckt.A02.getValue());
        C18640sB.A00().A00();
        r2.A02 = new CK6();
        r2.A02();
    }

    public final void configureActionBar(AnonymousClass1EX r3) {
        C13150hy.A02(r3, "configurer");
        r3.BlI(C0003R.string.payout_setup_payout_account);
        r3.Bo6(true);
        r3.A4I(getString(C0003R.string.next), new CKZ(this));
    }

    public final /* bridge */ /* synthetic */ C06590Pq getSession() {
        return (AnonymousClass0C1) this.A02.getValue();
    }

    public final boolean onBackPressed() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return true;
        }
        new Intent().putExtra(C193418Ps.$const$string(2), false);
        activity.setResult(-1);
        activity.finish();
        activity.overridePendingTransition(C0003R.anim.left_in, C0003R.anim.right_out);
        return true;
    }

    public final void onCreate(Bundle bundle) {
        String str;
        CLB clb;
        int A022 = AnonymousClass0Z0.A02(1587710321);
        super.onCreate(bundle);
        C25941Az A002 = new C25921Ax((C11750fc) requireActivity(), (AnonymousClass1B1) new CKI(CLA.A00((AnonymousClass0C1) this.A02.getValue(), new C27611CKe((AnonymousClass0C1) this.A02.getValue())))).A00(CKS.class);
        C13150hy.A01(A002, "ViewModelProvider(\n     …ngInteractor::class.java]");
        this.A01 = (CKS) A002;
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            str = bundle2.getString(C193418Ps.$const$string(1));
        } else {
            str = null;
        }
        if (str != null) {
            CKS cks = this.A01;
            if (cks == null) {
                C13150hy.A03("interactor");
            }
            C13150hy.A02(str, "productType");
            Object A023 = cks.A02.A02();
            if (A023 == null) {
                C13150hy.A00();
            }
            CKX ckx = (CKX) A023;
            if (C13150hy.A05(str, C207348v6.A00(Constants.ONE))) {
                clb = CLB.LVI;
            } else {
                clb = CLB.IGT;
            }
            ckx.A03 = clb;
        }
        AnonymousClass0Z0.A09(-1978211998, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-1669847408);
        C13150hy.A02(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C0003R.layout.layout_setup_payout_account, viewGroup, false);
        C13150hy.A01(inflate, "it");
        ((ImageView) inflate.findViewById(C0003R.C0005id.icon)).setImageResource(C0003R.C0004drawable.instagram_app_instagram_outline_24);
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
        IgFormField igFormField = (IgFormField) inflate.findViewById(C0003R.C0005id.country);
        if (igFormField != null) {
            CKS cks = this.A01;
            if (cks == null) {
                C13150hy.A03("interactor");
            }
            cks.A01.A05(this, new CL9(igFormField));
            EditText editText = igFormField.A00;
            C13150hy.A01(editText, "it.editText");
            editText.setFocusable(false);
        }
        View findViewById3 = inflate.findViewById(C0003R.C0005id.business_type);
        IgFormField igFormField2 = (IgFormField) findViewById3;
        CKS cks2 = this.A01;
        if (cks2 == null) {
            C13150hy.A03("interactor");
        }
        cks2.A01.A05(this, new C27630CKx(igFormField2, this));
        C13150hy.A01(igFormField2, "it");
        EditText editText2 = igFormField2.A00;
        C13150hy.A01(editText2, "it.editText");
        editText2.setFocusable(false);
        EditText editText3 = igFormField2.A00;
        C13150hy.A01(editText3, "it.editText");
        editText3.setClickable(true);
        igFormField2.A00.setOnClickListener(new CLD(this));
        igFormField2.setRuleChecker(new AnonymousClass50H(getString(C0003R.string.required_field)));
        igFormField2.setOnClickListener(new CLE(this));
        C13150hy.A01(findViewById3, "view.findViewById<IgForm…peSelection() }\n        }");
        this.A00 = igFormField2;
        AnonymousClass0Z0.A09(415765212, A022);
        return inflate;
    }
}
