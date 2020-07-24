package p000X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.facebook.C0003R;
import com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout;
import com.instagram.shopping.fragment.moreproducts.ShoppingMoreProductsFragment;
import java.util.ArrayList;

/* renamed from: X.CIJ */
public final class CIJ extends C27341Hl implements C27371Ho, C51312Ke {
    public AnonymousClass1HD A00;
    public AnonymousClass1HD A01;
    public AnonymousClass1NJ A02;
    public CIL A03;
    public AnonymousClass0C1 A04;
    public CIN A05;
    public String A06;
    public String A07;
    public final C11200ea A08 = new CIM(this);

    public final boolean Ago() {
        return true;
    }

    public final boolean Ahq() {
        return false;
    }

    public final void AtV() {
    }

    public final void AtY(int i, int i2) {
    }

    public final boolean AhU() {
        AnonymousClass1HD r0;
        CIL cil = this.A03;
        if (cil == null || cil.A01.getSelectedIndex() == 0) {
            r0 = this.A01;
        } else {
            r0 = this.A00;
        }
        return ((C51312Ke) r0).AhU();
    }

    public final String getModuleName() {
        return this.A06;
    }

    public final C06590Pq getSession() {
        return this.A04;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-491262796);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        AnonymousClass11J.A00(bundle2);
        this.A04 = AnonymousClass0J1.A06(bundle2);
        this.A07 = AnonymousClass30T.A01(bundle2);
        this.A06 = bundle2.getString("prior_module_name");
        AnonymousClass1NJ A023 = AnonymousClass1PZ.A00(this.A04).A02(bundle2.getString("media_id"));
        AnonymousClass11J.A00(A023);
        this.A02 = A023;
        AnonymousClass1HD A032 = C17510qM.A00.A0V().A03(this.A04, this, A023, this.A07);
        this.A01 = A032;
        if (A032 instanceof ShoppingMoreProductsFragment) {
            ((ShoppingMoreProductsFragment) A032).A03 = new CIP(this);
        }
        C17510qM.A00.A0V();
        AnonymousClass0C1 r5 = this.A04;
        AnonymousClass1NJ r6 = this.A02;
        String str = this.A07;
        Bundle bundle3 = new Bundle();
        bundle3.putString("media_id", r6.getId());
        bundle3.putString("media_owner_id", r6.A0c(r5).getId());
        bundle3.putSerializable("media_type", r6.APx());
        bundle3.putString("prior_module", getModuleName());
        bundle3.putBoolean(AnonymousClass40t.$const$string(295), false);
        bundle3.putParcelableArrayList(AnonymousClass0C5.$const$string(294), r6.A10());
        bundle3.putString("IgSessionManager.SESSION_TOKEN_KEY", r5.getToken());
        bundle3.putString(AnonymousClass0C5.$const$string(12), str);
        C151646e3 r0 = new C151646e3();
        r0.setArguments(bundle3);
        this.A00 = r0;
        C23300zv.A00(this.A04).A02(AnonymousClass3AO.class, this.A08);
        AnonymousClass0Z0.A09(1334759329, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-1941644205);
        View inflate = layoutInflater.inflate(C0003R.layout.combined_tags_list_fragment, viewGroup, false);
        AnonymousClass0Z0.A09(-325488370, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0Z0.A02(1545342455);
        super.onDestroy();
        C23300zv.A00(this.A04).A03(AnonymousClass3AO.class, this.A08);
        AnonymousClass0Z0.A09(359291777, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ViewPager viewPager = (ViewPager) view.findViewById(C0003R.C0005id.view_pager);
        viewPager.A0K(new CIK(this, this));
        IgSegmentedTabLayout igSegmentedTabLayout = (IgSegmentedTabLayout) view.findViewById(C0003R.C0005id.view_switcher);
        Context context = getContext();
        igSegmentedTabLayout.setBackgroundColor(C019000b.A00(context, AnonymousClass1BA.A03(context, C0003R.attr.elevatedBackgroundColor)));
        this.A03 = new CIL(this, getChildFragmentManager(), viewPager, igSegmentedTabLayout);
        ArrayList arrayList = new ArrayList();
        arrayList.add(CIO.PRODUCTS);
        arrayList.add(CIO.PEOPLE);
        CIL cil = this.A03;
        cil.A03.clear();
        cil.A03.addAll(arrayList);
        CIT cit = cil.A01.A02;
        cit.removeAllViews();
        cit.A02 = -1;
        cit.A00 = -1;
        for (CIO cio : cil.A03) {
            cil.A01.A01(new C220559et(-1, cil.A02.getContext().getString(cio.A00), false), (View.OnClickListener) null);
        }
        cil.notifyDataSetChanged();
        if (cil.A03.isEmpty()) {
            return;
        }
        if (0 < cil.getCount()) {
            cil.A01.setSelectedIndex(0);
            cil.A00.setCurrentItem(0);
            return;
        }
        throw new IllegalArgumentException(AnonymousClass000.A05("Cannot set tab position to invalid position = ", 0));
    }
}
