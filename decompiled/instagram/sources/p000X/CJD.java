package p000X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0003R;
import com.instagram.igds.components.bottombutton.IgBottomButtonLayout;

/* renamed from: X.CJD */
public final class CJD extends AnonymousClass2NN implements C51312Ke {
    public View.OnClickListener A00;
    public AnonymousClass2TI A01;
    public C13300iJ A02;
    public C27578CIx A03;
    public String A04;
    public IgBottomButtonLayout A05;
    public AnonymousClass0C1 A06;
    public C27572CIq A07;
    public CJZ A08;
    public String A09;

    public final boolean AhU() {
        return true;
    }

    public final void AtV() {
    }

    public final String getModuleName() {
        return "escalation_bottom_sheet";
    }

    public final void AtY(int i, int i2) {
        IgBottomButtonLayout igBottomButtonLayout = this.A05;
        if (igBottomButtonLayout != null) {
            igBottomButtonLayout.setTranslationY((float) ((-i) - i2));
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        super.onViewCreated(view2, bundle);
        CJC cjc = this.A03.A00;
        this.A01.A0C(cjc.A07.A00);
        CJZ cjz = this.A08;
        String str = cjc.A0C;
        C25963BdH bdH = cjc.A06;
        C25963BdH bdH2 = cjc.A03;
        cjz.A02 = str;
        cjz.A01 = bdH;
        cjz.A00 = bdH2;
        cjz.clear();
        String str2 = cjz.A02;
        if (str2 != null) {
            cjz.addModel((Object) null, new C27602CJv((Integer) null, str2, (Integer) null, Integer.valueOf(C0003R.dimen.process_education_image_height), Integer.valueOf(C0003R.dimen.row_padding), Integer.valueOf(C0003R.dimen.bottom_sheet_zero_padding), (Integer) null), cjz.A03);
        }
        C25963BdH bdH3 = cjz.A01;
        if (bdH3 != null) {
            cjz.addModel(bdH3.A00, new C27563CIf(true, (Integer) null, (Integer) null, (Integer) null, (Integer) null), cjz.A05);
        }
        C25963BdH bdH4 = cjz.A00;
        if (bdH4 != null) {
            cjz.addModel(bdH4.A00, new C27563CIf(true, Integer.valueOf(C0003R.dimen.bottom_sheet_zero_padding), (Integer) null, (Integer) null, (Integer) null), cjz.A04);
        }
        cjz.updateListView();
        IgBottomButtonLayout igBottomButtonLayout = (IgBottomButtonLayout) view2.findViewById(C0003R.C0005id.frx_report_action_button);
        this.A05 = igBottomButtonLayout;
        C27577CIw cIw = cjc.A01;
        if (cIw != null && igBottomButtonLayout != null) {
            C06220Of.A0L(getListView(), getResources().getDimensionPixelSize(C0003R.dimen.bottom_button_layout_height));
            this.A05.setPrimaryAction(cIw.A01.A00, this.A00);
            this.A05.setPrimaryButtonEnabled(true);
            this.A05.setVisibility(0);
            this.A07.A0E(this.A04, this.A02, this.A09, cIw.A00.name());
        }
    }

    public final C06590Pq getSession() {
        return this.A06;
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int A022 = AnonymousClass0Z0.A02(-1806303807);
        super.onCreate(bundle);
        if (bundle != null) {
            AnonymousClass6NI.A04(getActivity());
            i = -1606392583;
        } else {
            Bundle bundle2 = this.mArguments;
            AnonymousClass0a4.A06(bundle2);
            AnonymousClass0C1 A062 = AnonymousClass0J1.A06(bundle2);
            this.A06 = A062;
            this.A07 = C27572CIq.A00(A062);
            this.A09 = bundle2.getString("ReportingConstants.ARG_CONTENT_ID");
            CJZ cjz = new CJZ(getContext());
            this.A08 = cjz;
            setListAdapter(cjz);
            this.A07.A07(this, this.A04, this.A02, this.A09);
            i = 1531108612;
        }
        AnonymousClass0Z0.A09(i, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-1862588506);
        View inflate = layoutInflater.inflate(C0003R.layout.frx_report_fragment, viewGroup, false);
        AnonymousClass0Z0.A09(-19444060, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(-1082939479);
        super.onDestroyView();
        this.A05 = null;
        AnonymousClass0Z0.A09(-1917892195, A022);
    }
}
