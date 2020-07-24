package p000X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.facebook.C0003R;

/* renamed from: X.CMG */
public final class CMG extends C27341Hl implements AnonymousClass1HK, C51312Ke {
    public AnonymousClass2RT A00;
    public CML A01;
    public CMH A02;
    public CMD A03;
    public String A04;
    public String A05;
    public ListView A06;
    public AnonymousClass0C1 A07;
    public String A08;
    public final AnonymousClass2RQ A09 = new CMI(this);
    public final CMT A0A = new CMT(this);

    public final void AtV() {
    }

    public final void AtY(int i, int i2) {
    }

    public final boolean AhU() {
        ListView listView = this.A06;
        if (listView == null || !listView.canScrollVertically(-1)) {
            return true;
        }
        return false;
    }

    public final boolean onBackPressed() {
        CMD cmd = this.A03;
        if (cmd != null) {
            return cmd.A00();
        }
        return false;
    }

    public final String getModuleName() {
        return this.A08;
    }

    public final C06590Pq getSession() {
        return this.A07;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(478814653);
        super.onCreate(bundle);
        this.A07 = AnonymousClass0J1.A06(this.mArguments);
        String string = this.mArguments.getString("extra_surface_name");
        AnonymousClass11J.A00(string);
        this.A05 = string;
        this.A04 = this.mArguments.getString("extra_entity_id");
        String string2 = this.mArguments.getString("extra_analytics_module");
        AnonymousClass11J.A00(string2);
        this.A08 = string2;
        String string3 = this.mArguments.getString("extra_category_id");
        AnonymousClass11J.A00(string3);
        CML cml = (CML) CMM.A00(this.A07).A00.get(string3);
        AnonymousClass11J.A00(cml);
        this.A01 = cml;
        this.A00 = new AnonymousClass2RT(getActivity(), this.A07, AnonymousClass1L8.A00(this), this, this.A09);
        AnonymousClass0Z0.A09(1022308117, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(1856498687);
        View inflate = layoutInflater.inflate(C0003R.layout.category_selection_fragment, viewGroup, false);
        AnonymousClass0Z0.A09(2019236375, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0Z0.A02(-1760512810);
        super.onDestroy();
        this.A03 = null;
        AnonymousClass0Z0.A09(1553105055, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0Z0.A02(349553083);
        super.onResume();
        CML cml = this.A01;
        boolean z = false;
        if (cml.A00.intValue() == cml.A05.size()) {
            z = true;
        }
        if (!z) {
            CMH cmh = this.A02;
            cmh.A01 = true;
            CMH.A00(cmh);
            AnonymousClass2RT r2 = this.A00;
            CMQ cmq = new CMQ();
            cmq.A01 = this.A01.A01;
            cmq.A04 = this.A05;
            cmq.A02 = this.A04;
            cmq.A03 = "2";
            r2.A00(cmq);
        }
        AnonymousClass0Z0.A09(-2028367234, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        CMH cmh = new CMH(getActivity(), this.A0A);
        this.A02 = cmh;
        CML cml = this.A01;
        AnonymousClass11J.A00(cml);
        cmh.A00 = cml;
        CMH.A00(cmh);
        ListView listView = (ListView) view.findViewById(C0003R.C0005id.list_view);
        this.A06 = listView;
        listView.setAdapter(this.A02);
    }
}
