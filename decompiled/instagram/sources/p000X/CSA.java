package p000X;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.C0003R;
import com.instagram.igds.components.search.InlineSearchBox;
import com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout;

/* renamed from: X.CSA */
public final class CSA extends C27341Hl implements C27371Ho, AnonymousClass1HM {
    public InlineSearchBox A00;
    public AnonymousClass0C1 A01;
    public CSP A02;
    public CSM A03;
    public CTH A04;
    public CSB A05;
    public CS8 A06;
    public String A07;
    public RecyclerView A08;
    public RecyclerView A09;
    public IgSegmentedTabLayout A0A;
    public Integer A0B = Constants.ZERO;
    public boolean A0C;
    public final C256319p A0D = new CS6(this);
    public final AnonymousClass662 A0E = new CTT(this);
    public final CS4 A0F = new C27829CSv(this);
    public final CRB A0G = new CT8(this);
    public final CS3 A0H = new CT7(this);
    public final C27839CTf A0I = new CTB(this);
    public final CTW A0J = new CTW(this);
    public final CTV A0K = new CTV(this);
    public final CS9 A0L = new CS9(this);
    public final CSC A0M = new CSC(this);

    public final boolean Ago() {
        return true;
    }

    public final boolean Ahq() {
        return false;
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        Integer num;
        super.onViewCreated(view, bundle);
        this.A03 = new CSM(requireContext(), this.A0J, this.A0I, this.A0H, this.A0F, this.A0C);
        View findViewById = view.findViewById(C0003R.C0005id.products_recycler_view);
        AnonymousClass0a4.A06(findViewById);
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.A09 = recyclerView;
        recyclerView.A0w(this.A0D);
        this.A09.setAdapter(this.A03.A01);
        RecyclerView recyclerView2 = this.A09;
        C31321Xp r2 = new C31321Xp();
        r2.A0J();
        recyclerView2.setItemAnimator(r2);
        this.A02 = new CSP(requireContext(), this, this.A0G, this.A0K, this.A0I);
        View findViewById2 = view.findViewById(C0003R.C0005id.collections_recycler_view);
        AnonymousClass0a4.A06(findViewById2);
        RecyclerView recyclerView3 = (RecyclerView) findViewById2;
        this.A08 = recyclerView3;
        recyclerView3.A0w(this.A0D);
        this.A08.setAdapter(this.A02.A01);
        RecyclerView recyclerView4 = this.A08;
        C31321Xp r22 = new C31321Xp();
        r22.A0J();
        recyclerView4.setItemAnimator(r22);
        View findViewById3 = view.findViewById(C0003R.C0005id.search_box);
        AnonymousClass0a4.A06(findViewById3);
        InlineSearchBox inlineSearchBox = (InlineSearchBox) findViewById3;
        this.A00 = inlineSearchBox;
        inlineSearchBox.setListener(this.A0E);
        inlineSearchBox.setImeOptions(6);
        InlineSearchBox inlineSearchBox2 = this.A00;
        boolean z = this.A0C;
        int i = C0003R.string.search_added_products;
        if (z) {
            i = C0003R.string.search;
        }
        inlineSearchBox2.setHint(i);
        View findViewById4 = view.findViewById(C0003R.C0005id.search_type_tab);
        AnonymousClass0a4.A06(findViewById4);
        IgSegmentedTabLayout igSegmentedTabLayout = (IgSegmentedTabLayout) findViewById4;
        this.A0A = igSegmentedTabLayout;
        int i2 = 8;
        if (this.A0C) {
            i2 = 0;
        }
        igSegmentedTabLayout.setVisibility(i2);
        this.A0A.A01(new C220559et(C0003R.string.shop_management_tab_collections, (String) null, false), new CTD(this));
        this.A0A.A01(new C220559et(C0003R.string.shop_management_tab_products, (String) null, false), new CTE(this));
        CS8 cs8 = this.A06;
        C29621Qp r4 = C29621Qp.PRODUCT;
        RecyclerView recyclerView5 = this.A09;
        recyclerView5.A0w(new C61622m6(cs8, r4, recyclerView5.A0L));
        CSB csb = this.A05;
        RecyclerView recyclerView6 = this.A08;
        recyclerView6.A0w(new C61622m6(csb, r4, recyclerView6.A0L));
        CS8 cs82 = this.A06;
        CS9 cs9 = this.A0L;
        cs82.A01 = cs9;
        if (cs9 != null) {
            cs9.A00(cs82.A00);
        }
        CSB csb2 = this.A05;
        CSC csc = this.A0M;
        csb2.A01 = csc;
        if (csc != null) {
            csc.A00(csb2.A00);
        }
        if (this.A0C) {
            num = Constants.ZERO;
        } else {
            num = Constants.ONE;
        }
        A01(this, num);
        A02(this, "");
    }

    public static void A00(CSA csa, int i, int i2, DialogInterface.OnClickListener onClickListener) {
        AnonymousClass2OA r2 = new AnonymousClass2OA(csa.requireContext());
        r2.A07(i);
        r2.A06(i2);
        r2.A0A(C0003R.string.hide_from_shop_nux_hide, onClickListener);
        r2.A08(C0003R.string.learn_more, new CTA(csa));
        r2.A09(C0003R.string.cancel, (DialogInterface.OnClickListener) null);
        r2.A0U(true);
        r2.A0V(true);
        r2.A03().show();
    }

    public static void A02(CSA csa, String str) {
        String str2;
        if (str == null) {
            str = "";
        }
        Integer num = csa.A0B;
        int intValue = num.intValue();
        switch (intValue) {
            case 0:
                CSB csb = csa.A05;
                C13150hy.A02(str, "query");
                CSB.A00(csb, new CT0(str));
                csb.A04.A04(str);
                return;
            case 1:
                CS8 cs8 = csa.A06;
                C13150hy.A02(str, "query");
                CS8.A00(cs8, new CT1(str));
                cs8.A04.A04(str);
                return;
            default:
                if (num == null) {
                    str2 = "null";
                } else if (1 - intValue != 0) {
                    str2 = "COLLECTIONS";
                } else {
                    str2 = "PRODUCTS";
                }
                throw new IllegalStateException(AnonymousClass000.A0E("Tab is not supported for searching: ", str2));
        }
    }

    public static void A03(CSA csa, boolean z) {
        String str;
        CTH cth = csa.A04;
        boolean z2 = !z;
        CTM ctm = new CTM(cth.A02.A02("instagram_shopping_shop_manager_add_collections_entry_tap"));
        if (ctm.A0B()) {
            ctm.A08("waterfall_id", cth.A04);
            ctm.A08("prior_module", cth.A03);
            if (z2) {
                str = cth.A01;
            } else {
                str = null;
            }
            ctm.A08("submodule", str);
            ctm.A01();
        }
        C17510qM.A00.A0n(csa, csa.A01, csa.A07, csa.getModuleName());
    }

    public final String getModuleName() {
        if (this.A0C) {
            return "shop_manager_edit_shop";
        }
        return "shop_manager_edit_products";
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:4:0x000d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0016  */
    public static void A01(CSA csa, Integer num) {
        CTH cth;
        String str;
        int i;
        int intValue = num.intValue();
        boolean z = true;
        switch (intValue) {
            case 0:
                cth = csa.A04;
                str = "collections";
                break;
            case 1:
                cth = csa.A04;
                str = "products";
                break;
            default:
                int i2 = 0;
                if (csa.A0B == num) {
                    z = false;
                }
                csa.A0B = num;
                IgSegmentedTabLayout igSegmentedTabLayout = csa.A0A;
                if (1 - intValue == 0) {
                    i = 0;
                } else {
                    i = 1;
                }
                igSegmentedTabLayout.setSelectedIndex(i);
                RecyclerView recyclerView = csa.A09;
                int i3 = 8;
                if (num == Constants.ONE) {
                    i3 = 0;
                }
                recyclerView.setVisibility(i3);
                RecyclerView recyclerView2 = csa.A08;
                if (num != Constants.ZERO) {
                    i2 = 8;
                }
                recyclerView2.setVisibility(i2);
                if (!z) {
                    A02(csa, csa.A00.getSearchString());
                    return;
                }
                return;
        }
        cth.A01 = str;
        int i22 = 0;
        if (csa.A0B == num) {
        }
        csa.A0B = num;
        IgSegmentedTabLayout igSegmentedTabLayout2 = csa.A0A;
        if (1 - intValue == 0) {
        }
        igSegmentedTabLayout2.setSelectedIndex(i);
        RecyclerView recyclerView3 = csa.A09;
        int i32 = 8;
        if (num == Constants.ONE) {
        }
        recyclerView3.setVisibility(i32);
        RecyclerView recyclerView22 = csa.A08;
        if (num != Constants.ZERO) {
        }
        recyclerView22.setVisibility(i22);
        if (!z) {
        }
    }

    public final void configureActionBar(AnonymousClass1EX r3) {
        r3.BlI(C0003R.string.edit_shop_title);
        if (this.A0C) {
            r3.Bo6(true);
            r3.A4H(C0003R.string.shop_management_add, new CS5(this));
            return;
        }
        r3.A4H(C0003R.string.done, new AnonymousClass70Z(this));
    }

    public final C06590Pq getSession() {
        return this.A01;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10 && i2 == 1002) {
            CS8 cs8 = this.A06;
            cs8.A04.A01();
            String str = cs8.A00.A00;
            C13150hy.A02(str, "query");
            CS8.A00(cs8, new CT1(str));
            cs8.A04.A04(str);
            CS8.A00(cs8, C27831CSx.A00);
            if (this.A0C) {
                CSB csb = this.A05;
                csb.A04.A01();
                String str2 = csb.A00.A00;
                C13150hy.A02(str2, "query");
                CSB.A00(csb, new CT0(str2));
                csb.A04.A04(str2);
                CSB.A00(csb, C27830CSw.A00);
            }
            requireActivity().setResult(1002);
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-1673677545);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        AnonymousClass0a4.A06(bundle2);
        AnonymousClass0C1 A062 = AnonymousClass0J1.A06(bundle2);
        this.A01 = A062;
        C13380iR r2 = A062.A06.A08;
        boolean z = false;
        if (r2 == C13380iR.ADD_HIDE_COLLECTIONS) {
            z = true;
        }
        this.A0C = z;
        String string = requireArguments().getString("waterfall_id");
        AnonymousClass0a4.A06(string);
        this.A07 = string;
        String string2 = requireArguments().getString("prior_module");
        AnonymousClass0a4.A06(string2);
        AnonymousClass0C1 r4 = this.A01;
        this.A04 = new CTH(r4, this, this.A07, string2);
        this.A06 = new CS8(r4, requireContext(), AnonymousClass1L8.A00(this), this.A04);
        this.A05 = new CSB(this.A01, this.A04);
        AnonymousClass0Z0.A09(98150368, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-1819194717);
        View inflate = layoutInflater.inflate(C0003R.layout.shop_management_edit_fragment, viewGroup, false);
        AnonymousClass0Z0.A09(-779510713, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(-52466949);
        super.onDestroyView();
        this.A06.A01 = null;
        this.A05.A01 = null;
        AnonymousClass0Z0.A09(-1615385456, A022);
    }
}
