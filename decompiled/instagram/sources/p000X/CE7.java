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
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.CE7 */
public final class CE7 extends C27341Hl implements C27516CGg {
    public EditText A00;
    public TextView A01;
    public RecyclerView A02;
    public RecyclerView A03;
    public CD8 A04;
    public CEL A05;
    public CEG A06;
    public CD3 A07;
    public CDA A08;
    public List A09;
    public TextView A0A;
    public AnonymousClass0C1 A0B;
    public final TextWatcher A0C = new CEF(this);
    public final C27517CGh A0D = new CE9(this);
    public final CGZ A0E = new CGZ(this);
    public final CF1 A0F = new CF1();

    public final String getModuleName() {
        return "promote_create_audience_locations_regional";
    }

    public static void A00(CE7 ce7) {
        if (!AnonymousClass0OX.A00(ce7.A09)) {
            ce7.A0A.setVisibility(0);
            TextView textView = ce7.A0A;
            Object[] objArr = new Object[1];
            Context context = ce7.getContext();
            AnonymousClass0a4.A06(context);
            List<C27473CEp> list = ce7.A09;
            ArrayList arrayList = new ArrayList();
            for (C27473CEp cEp : list) {
                arrayList.add(cEp.A05);
            }
            objArr[0] = C180587nL.A00(context, context.getResources().getConfiguration().locale, arrayList);
            textView.setText(ce7.getString(C0003R.string.ad_geo_location_overlapping_error_message, objArr));
            return;
        }
        ce7.A0A.setVisibility(8);
    }

    public static void A01(CE7 ce7, List list) {
        if (ce7.A00.getText().length() == 0) {
            ce7.A01.setVisibility(0);
            ce7.A03.setVisibility(0);
            CEL cel = ce7.A05;
            ArrayList arrayList = new ArrayList();
            AnonymousClass0a4.A06(arrayList);
            cel.A01 = arrayList;
            cel.notifyDataSetChanged();
            return;
        }
        ce7.A01.setVisibility(8);
        ce7.A03.setVisibility(8);
        CEL cel2 = ce7.A05;
        AnonymousClass0a4.A06(list);
        cel2.A01 = list;
        cel2.notifyDataSetChanged();
    }

    public final void BGX(CDA cda, Integer num) {
        if (num == Constants.A12) {
            ArrayList arrayList = new ArrayList(this.A07.A08.A01());
            if (!CDX.A03(arrayList) && !AnonymousClass0OX.A00(this.A09)) {
                arrayList.removeAll(this.A09);
                this.A09 = null;
                this.A08.A0B(this.A07, arrayList);
            }
        }
    }

    public final C06590Pq getSession() {
        return this.A0B;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(875642340);
        View inflate = layoutInflater.inflate(C0003R.layout.promote_create_audience_locations_regional_view, viewGroup, false);
        AnonymousClass0Z0.A09(-202946310, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(762708562);
        this.A08.A0D(this);
        super.onDestroyView();
        AnonymousClass0Z0.A09(-837946533, A022);
    }

    public final void onSetUserVisibleHint(boolean z, boolean z2) {
        super.onSetUserVisibleHint(z, z2);
        CDA cda = this.A08;
        if (cda != null && z) {
            CDA.A00(cda, Constants.A14);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        AnonymousClass0a4.A06(activity);
        CD3 AT6 = ((C945346y) activity).AT6();
        this.A07 = AT6;
        AnonymousClass0a4.A06(activity);
        this.A08 = ((CC9) activity).AT7();
        AnonymousClass0C1 r1 = AT6.A0Q;
        this.A0B = r1;
        this.A04 = new CD8(r1, activity, this);
        this.A00 = (EditText) view.findViewById(C0003R.C0005id.search_bar_edit_text);
        this.A01 = (TextView) view.findViewById(C0003R.C0005id.search_empty_state_text_view);
        this.A03 = (RecyclerView) view.findViewById(C0003R.C0005id.selected_locations_recycler_view);
        this.A02 = (RecyclerView) view.findViewById(C0003R.C0005id.typeahead_recycler_view);
        CEL cel = new CEL(this.A0D);
        this.A05 = cel;
        this.A02.setAdapter(cel);
        CEG ceg = new CEG(this.A07, this.A08, this.A0E);
        this.A06 = ceg;
        this.A03.setAdapter(ceg);
        this.A00.setHint(C0003R.string.promote_create_audience_locations_search_hint);
        this.A00.addTextChangedListener(this.A0C);
        this.A01.setText(C0003R.string.promote_create_audience_locations_search_empty_state);
        A01(this, new ArrayList());
        this.A09 = new ArrayList();
        this.A0A = (TextView) view.findViewById(C0003R.C0005id.overlapping_location_warning_text);
        if (this.mUserVisibleHint) {
            CDA.A00(this.A08, Constants.A14);
        }
        this.A08.A0C(this);
    }
}
