package p000X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.C0003R;
import com.google.common.collect.ImmutableList;

/* renamed from: X.CE6 */
public final class CE6 extends C27341Hl implements AnonymousClass1HM {
    public EditText A00;
    public TextView A01;
    public RecyclerView A02;
    public RecyclerView A03;
    public CD8 A04;
    public C27469CEl A05;
    public CEZ A06;
    public CD3 A07;
    public CDA A08;
    public C26915Bue A09;
    public CDW A0A;
    public AnonymousClass0C1 A0B;
    public final TextWatcher A0C = new CEE(this);
    public final C27512CGc A0D = new C27512CGc(this);
    public final C27511CGb A0E = new C27511CGb(this);
    public final CF1 A0F = new CF1();

    public final String getModuleName() {
        return "promote_create_audience_interest";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public static void A00(CE6 ce6) {
        CDW cdw = ce6.A0A;
        C27452CDu cDu = ce6.A07.A08;
        String str = cDu.A02;
        String str2 = cDu.A03;
        int i = cDu.A01;
        int i2 = cDu.A00;
        ImmutableList A002 = cDu.A00();
        ImmutableList A012 = cDu.A01();
        cDu.A02();
        ImmutableList A092 = ImmutableList.A09(ce6.A05.A02);
        C27452CDu cDu2 = new C27452CDu();
        cDu2.A02 = str;
        cDu2.A03 = str2;
        cDu2.A01 = i;
        cDu2.A00 = i2;
        cDu2.A04 = A002;
        cDu2.A05 = A012;
        cDu2.A06 = A092;
        cdw.A03(cDu2);
    }

    public static void A01(CE6 ce6) {
        TextView textView = ce6.A01;
        int i = 8;
        if (ce6.A00.getText().length() == 0) {
            i = 0;
        }
        textView.setVisibility(i);
    }

    public final void configureActionBar(AnonymousClass1EX r5) {
        r5.BlI(C0003R.string.promote_create_audience_interest_fragment_title);
        r5.Bg9(C0003R.C0004drawable.instagram_arrow_back_24);
        r5.Bo6(true);
        Context context = getContext();
        AnonymousClass0a4.A06(context);
        C26915Bue bue = new C26915Bue(context, r5);
        this.A09 = bue;
        bue.A00(Constants.A12, new CEA(this));
        this.A09.A01(true);
    }

    public final C06590Pq getSession() {
        return this.A0B;
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        FragmentActivity activity = getActivity();
        AnonymousClass0a4.A06(activity);
        CD3 AT6 = ((C945346y) activity).AT6();
        this.A07 = AT6;
        AnonymousClass0a4.A06(activity);
        this.A08 = ((CC9) activity).AT7();
        AnonymousClass0C1 r1 = AT6.A0Q;
        this.A0B = r1;
        this.A04 = new CD8(r1, activity, this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-381281180);
        View inflate = layoutInflater.inflate(C0003R.layout.promote_create_audience_interest_view, viewGroup, false);
        AnonymousClass0Z0.A09(-284304989, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(1660940792);
        super.onDestroyView();
        CDW cdw = this.A0A;
        cdw.A08.A00();
        cdw.A00 = C27493CFj.A01;
        CCZ.A03(this.A07, C27398CBr.INTERESTS_SELECTION);
        AnonymousClass0Z0.A09(-2114358183, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C27398CBr cBr = C27398CBr.INTERESTS_SELECTION;
        this.A0A = new CDW(cBr, view.findViewById(C0003R.C0005id.audience_potential_reach_view), this.A07, this.A04);
        this.A00 = (EditText) view.findViewById(C0003R.C0005id.search_bar_edit_text);
        this.A01 = (TextView) view.findViewById(C0003R.C0005id.search_empty_state_text_view);
        this.A02 = (RecyclerView) view.findViewById(C0003R.C0005id.typeahead_recycler_view);
        this.A03 = (RecyclerView) view.findViewById(C0003R.C0005id.selected_suggested_interests_recycler_view);
        this.A00.setHint(C0003R.string.promote_create_audience_interest_search_hint);
        this.A00.addTextChangedListener(this.A0C);
        this.A01.setText(C0003R.string.promote_create_audience_interest_search_empty_state);
        CEZ cez = new CEZ(this.A0D);
        this.A06 = cez;
        this.A02.setAdapter(cez);
        CD3 cd3 = this.A07;
        Context context = getContext();
        AnonymousClass0a4.A06(context);
        this.A05 = new C27469CEl(cd3, context, this.A0E, this.A04);
        if (!AnonymousClass0OX.A00(this.A07.A08.A02())) {
            C27469CEl cEl = this.A05;
            ImmutableList A022 = this.A07.A08.A02();
            cEl.A02.clear();
            cEl.A02.addAll(A022);
            C27469CEl.A00(cEl);
            cEl.A00.A06(AnonymousClass17A.A01(cEl.A02, new C27490CFg(cEl)), cEl.A01);
        }
        this.A03.setAdapter(this.A05);
        A01(this);
        A00(this);
        CCZ.A04(this.A07, cBr);
    }
}
