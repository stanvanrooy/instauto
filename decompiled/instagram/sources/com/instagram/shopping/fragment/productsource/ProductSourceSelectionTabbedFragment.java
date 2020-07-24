package com.instagram.shopping.fragment.productsource;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.facebook.C0003R;
import com.instagram.p009ui.widget.fixedtabbar.FixedTabBar;
import java.util.ArrayList;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1AM;
import p000X.AnonymousClass1EX;
import p000X.AnonymousClass1HD;
import p000X.AnonymousClass1HK;
import p000X.AnonymousClass1HM;
import p000X.AnonymousClass2NF;
import p000X.AnonymousClass3DK;
import p000X.AnonymousClass3DN;
import p000X.C06590Pq;
import p000X.C17510qM;
import p000X.C26441Dh;
import p000X.C27341Hl;
import p000X.C27665CMj;
import p000X.C27682CNb;
import p000X.C52382Oo;
import p000X.C53502Ta;
import p000X.C53822Um;
import p000X.CNZ;

public class ProductSourceSelectionTabbedFragment extends C27341Hl implements AnonymousClass1HK, AnonymousClass1HM, AnonymousClass2NF {
    public C53502Ta A00;
    public AnonymousClass0C1 A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public AnonymousClass3DK mTabbedFragmentController;

    public final String getModuleName() {
        return "product_source_selection";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public final void onPageScrollStateChanged(int i) {
    }

    public final /* bridge */ /* synthetic */ AnonymousClass1HD AAG(Object obj) {
        AnonymousClass1HD r3;
        C53502Ta r5 = (C53502Ta) obj;
        switch (r5.ordinal()) {
            case 0:
                C17510qM.A00.A0V();
                r3 = new C53822Um();
                break;
            case 1:
                C17510qM.A00.A0V();
                r3 = new CNZ();
                break;
            case 2:
                C17510qM.A00.A0V();
                r3 = new C27682CNb();
                break;
            default:
                throw new IllegalArgumentException(AnonymousClass000.A0E("Invalid tab for product source selection: ", r5.toString()));
        }
        Bundle bundle = this.mArguments;
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBoolean("is_tabbed", true);
        C53502Ta r0 = this.A00;
        if (r0 != null) {
            bundle.putString("initial_tab", r0.toString());
        }
        r3.setArguments(bundle);
        return r3;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass3DN AB4(Object obj) {
        int i;
        String string;
        Resources resources = getResources();
        switch (((C53502Ta) obj).ordinal()) {
            case 0:
                i = C0003R.string.product_source_selection_catalogs_tab_title;
                break;
            case 1:
                i = C0003R.string.product_source_selection_brands_tab_title;
                break;
            case 2:
                i = C0003R.string.product_source_selection_collections_tab_title;
                break;
            default:
                string = null;
                break;
        }
        string = resources.getString(i);
        return new AnonymousClass3DN(-1, -1, -1, -1, (Drawable) null, -1, false, string, (View) null);
    }

    public final /* bridge */ /* synthetic */ void BQo(Object obj) {
        C53502Ta r4 = (C53502Ta) obj;
        if (isResumed() && r4 != this.A00) {
            C26441Dh.A00(this.A01).A07(this, this.mFragmentManager.A0I(), getModuleName());
            ((C52382Oo) this.mTabbedFragmentController.A02(this.A00)).BDV();
            this.A00 = r4;
            C26441Dh.A00(this.A01).A06(this);
            ((C52382Oo) this.mTabbedFragmentController.A02(this.A00)).BDh();
        }
    }

    public final boolean onBackPressed() {
        AnonymousClass1HD A012 = this.mTabbedFragmentController.A01();
        if (!(A012 instanceof AnonymousClass1HK) || !((AnonymousClass1HK) A012).onBackPressed()) {
            return false;
        }
        return true;
    }

    public final void configureActionBar(AnonymousClass1EX r2) {
        r2.BlI(C0003R.string.product_source_selection_title);
        r2.Bo6(true);
    }

    public final C06590Pq getSession() {
        return this.A01;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(634643220);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A01 = AnonymousClass0J1.A06(requireArguments);
        this.A02 = requireArguments.getBoolean("show_brands_tab");
        this.A04 = requireArguments.getBoolean("show_collections_tab");
        this.A03 = requireArguments.getBoolean("show_catalogs_tab");
        AnonymousClass0Z0.A09(-161087022, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-670259224);
        View inflate = layoutInflater.inflate(C0003R.layout.product_source_selection_tabbed_fragment, viewGroup, false);
        AnonymousClass0Z0.A09(-1652118593, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(2001112915);
        super.onDestroyView();
        this.mTabbedFragmentController = null;
        AnonymousClass0Z0.A09(-1561799197, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        AnonymousClass1AM childFragmentManager = getChildFragmentManager();
        ViewPager viewPager = (ViewPager) view.findViewById(C0003R.C0005id.tabs_viewpager);
        FixedTabBar fixedTabBar = (FixedTabBar) view.findViewById(C0003R.C0005id.fixed_tabbar_view);
        ArrayList arrayList = new ArrayList();
        if (this.A02) {
            arrayList.add(C53502Ta.BRAND);
        }
        if (this.A04) {
            arrayList.add(C53502Ta.COLLECTION);
        }
        if (this.A03) {
            arrayList.add(C53502Ta.CATALOG);
        }
        this.mTabbedFragmentController = new AnonymousClass3DK(this, childFragmentManager, viewPager, fixedTabBar, arrayList);
        C53502Ta A022 = C27665CMj.A02(this.A01);
        this.A00 = A022;
        this.mTabbedFragmentController.A03(A022);
    }

    public final void BDg(Object obj, int i, float f, float f2) {
    }
}
