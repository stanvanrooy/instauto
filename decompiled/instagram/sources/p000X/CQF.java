package p000X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.C0003R;
import com.instagram.igds.components.search.InlineSearchBox;
import com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout;
import com.instagram.model.shopping.ProductSource;

/* renamed from: X.CQF */
public final class CQF extends C27341Hl implements C27371Ho, C60962kt {
    public static final C27762CQg A0T = new C27762CQg();
    public C11200ea A00;
    public AnonymousClass7LG A01;
    public InlineSearchBox A02;
    public AnonymousClass0C1 A03;
    public C27773CQr A04;
    public CQZ A05;
    public C27763CQh A06;
    public CQG A07;
    public C27679CMy A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public int A0C = -1;
    public View A0D;
    public RecyclerView A0E;
    public RecyclerView A0F;
    public IgSegmentedTabLayout A0G;
    public Integer A0H = Constants.ZERO;
    public String A0I;
    public boolean A0J = true;
    public boolean A0K = true;
    public final C18750sM A0L = C29041Oj.A00(new AnonymousClass7LJ(this));
    public final AnonymousClass662 A0M = new C27760CQe(this);
    public final CS4 A0N = new CQI(this);
    public final CRB A0O = new CQT(this);
    public final CS3 A0P = new CQU(this);
    public final C27767CQl A0Q = new CQB(this);
    public final CQM A0R = new CQM(this);
    public final CN0 A0S = new CQH(this);

    public final boolean A55() {
        return false;
    }

    public final int AIh() {
        return -1;
    }

    public final float AdY() {
        return 1.0f;
    }

    public final boolean AeS() {
        return true;
    }

    public final boolean Ago() {
        return true;
    }

    public final boolean Ahq() {
        return false;
    }

    public final float Aol() {
        return 1.0f;
    }

    public final void AtV() {
    }

    public final void AtY(int i, int i2) {
    }

    public final void B8h() {
    }

    public final void B8j(int i) {
    }

    public final boolean BmS() {
        return true;
    }

    public final String getModuleName() {
        return "multi_product_search";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C13150hy.A02(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(C0003R.C0005id.drag_handle);
        C13150hy.A01(findViewById, "view.findViewById(R.id.drag_handle)");
        this.A0D = findViewById;
        Context requireContext = requireContext();
        C13150hy.A01(requireContext, "requireContext()");
        this.A05 = new CQZ(requireContext, this.A0P, this.A0N);
        CQQ cqq = new CQQ(this);
        View findViewById2 = view.findViewById(C0003R.C0005id.products_recycler_view);
        if (findViewById2 != null) {
            RecyclerView recyclerView = (RecyclerView) findViewById2;
            recyclerView.A0w(cqq);
            CQZ cqz = this.A05;
            if (cqz == null) {
                C13150hy.A03("productsAdapterWrapper");
            }
            recyclerView.setAdapter(cqz.A00.A00);
            this.A0F = recyclerView;
            C31321Xp r0 = new C31321Xp();
            r0.A0J();
            if (recyclerView == null) {
                C13150hy.A03("productsRecyclerView");
            }
            recyclerView.setItemAnimator(r0);
            CQG cqg = this.A07;
            if (cqg == null) {
                C13150hy.A03("productsStateManager");
            }
            C29621Qp r1 = C29621Qp.PRODUCT;
            RecyclerView recyclerView2 = this.A0F;
            if (recyclerView2 == null) {
                C13150hy.A03("productsRecyclerView");
            }
            C61622m6 r10 = new C61622m6(cqg, r1, recyclerView2.A0L);
            RecyclerView recyclerView3 = this.A0F;
            if (recyclerView3 == null) {
                C13150hy.A03("productsRecyclerView");
            }
            recyclerView3.A0w(r10);
            CRB crb = this.A0O;
            Context requireContext2 = requireContext();
            C13150hy.A01(requireContext2, "requireContext()");
            this.A04 = new C27773CQr(this, crb, requireContext2);
            View findViewById3 = view.findViewById(C0003R.C0005id.collections_recycler_view);
            if (findViewById3 != null) {
                RecyclerView recyclerView4 = (RecyclerView) findViewById3;
                recyclerView4.A0w(cqq);
                C27773CQr cQr = this.A04;
                if (cQr == null) {
                    C13150hy.A03("collectionAdapterWrapper");
                }
                recyclerView4.setAdapter(cQr.A00);
                this.A0E = recyclerView4;
                View findViewById4 = view.findViewById(C0003R.C0005id.search_box);
                if (findViewById4 != null) {
                    InlineSearchBox inlineSearchBox = (InlineSearchBox) findViewById4;
                    inlineSearchBox.setListener(this.A0M);
                    inlineSearchBox.setImeOptions(6);
                    inlineSearchBox.setHint((int) C0003R.string.search);
                    this.A02 = inlineSearchBox;
                    View findViewById5 = view.findViewById(C0003R.C0005id.done_button);
                    if (findViewById5 != null) {
                        findViewById5.setOnClickListener(new AnonymousClass7LN(this));
                        View findViewById6 = view.findViewById(C0003R.C0005id.search_type_tab);
                        if (findViewById6 != null) {
                            IgSegmentedTabLayout igSegmentedTabLayout = (IgSegmentedTabLayout) findViewById6;
                            if (!this.A0J) {
                                igSegmentedTabLayout.setVisibility(8);
                            } else {
                                igSegmentedTabLayout.setVisibility(0);
                                igSegmentedTabLayout.A01(new C220559et(C0003R.string.tab_products, (String) null, false), new AnonymousClass7LQ(this));
                                igSegmentedTabLayout.A01(new C220559et(C0003R.string.tab_collections, (String) null, false), new AnonymousClass7LR(this));
                            }
                            this.A0G = igSegmentedTabLayout;
                            C27679CMy cMy = new C27679CMy(this.A0S, view);
                            CQG cqg2 = this.A07;
                            if (cqg2 == null) {
                                C13150hy.A03("productsStateManager");
                            }
                            cMy.A00(cqg2.A02);
                            this.A08 = cMy;
                            CQG cqg3 = this.A07;
                            if (cqg3 == null) {
                                C13150hy.A03("productsStateManager");
                            }
                            CQM cqm = this.A0R;
                            cqg3.A01 = cqm;
                            if (cqm != null) {
                                cqm.A00(cqg3.A00);
                            }
                            C27763CQh cQh = this.A06;
                            if (cQh == null) {
                                C13150hy.A03("collectionStateManager");
                            }
                            C27767CQl cQl = this.A0Q;
                            cQh.A01 = cQl;
                            if (cQl != null) {
                                cQl.BOq(cQh.A00);
                                return;
                            }
                            return;
                        }
                        throw new C183227s6("null cannot be cast to non-null type com.instagram.igds.components.segmentedtabs.IgSegmentedTabLayout");
                    }
                    throw new C183227s6("null cannot be cast to non-null type android.view.View");
                }
                throw new C183227s6("null cannot be cast to non-null type com.instagram.igds.components.search.InlineSearchBox");
            }
        }
        throw new C183227s6("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
    }

    private final RecyclerView A00() {
        RecyclerView recyclerView;
        String str;
        int i = C27757CQb.A01[this.A0H.intValue()];
        if (i == 1) {
            recyclerView = this.A0F;
            if (recyclerView == null) {
                str = "productsRecyclerView";
            }
            return recyclerView;
        } else if (i == 2) {
            recyclerView = this.A0E;
            if (recyclerView == null) {
                str = "collectionsRecyclerView";
            }
            return recyclerView;
        } else {
            throw new C191608Hd();
        }
        C13150hy.A03(str);
        return recyclerView;
    }

    public static final /* synthetic */ AnonymousClass0C1 A01(CQF cqf) {
        AnonymousClass0C1 r1 = cqf.A03;
        if (r1 == null) {
            C13150hy.A03("userSession");
        }
        return r1;
    }

    public static final /* synthetic */ CQG A02(CQF cqf) {
        CQG cqg = cqf.A07;
        if (cqg == null) {
            C13150hy.A03("productsStateManager");
        }
        return cqg;
    }

    public static final void A03(CQF cqf, Integer num) {
        if (cqf.A0H != num) {
            cqf.A0H = num;
            IgSegmentedTabLayout igSegmentedTabLayout = cqf.A0G;
            if (igSegmentedTabLayout == null) {
                C13150hy.A03("tabLayout");
            }
            igSegmentedTabLayout.setSelectedIndex(num.intValue());
            RecyclerView recyclerView = cqf.A0F;
            if (recyclerView == null) {
                C13150hy.A03("productsRecyclerView");
            }
            int i = 0;
            int i2 = 8;
            if (num == Constants.ZERO) {
                i2 = 0;
            }
            recyclerView.setVisibility(i2);
            RecyclerView recyclerView2 = cqf.A0E;
            if (recyclerView2 == null) {
                C13150hy.A03("collectionsRecyclerView");
            }
            if (num != Constants.ONE) {
                i = 8;
            }
            recyclerView2.setVisibility(i);
            InlineSearchBox inlineSearchBox = cqf.A02;
            if (inlineSearchBox == null) {
                C13150hy.A03("inlineSearchBox");
            }
            A04(cqf, inlineSearchBox.getSearchString());
        }
    }

    public static final void A04(CQF cqf, String str) {
        int i = C27757CQb.A00[cqf.A0H.intValue()];
        if (i == 1) {
            CQG cqg = cqf.A07;
            if (cqg == null) {
                C13150hy.A03("productsStateManager");
            }
            if (str == null) {
                str = "";
            }
            C13150hy.A02(str, "query");
            CQG.A00(cqg, new CQW(str));
            cqg.A03.A04(str);
        } else if (i == 2) {
            C27763CQh cQh = cqf.A06;
            if (cQh == null) {
                C13150hy.A03("collectionStateManager");
            }
            if (str == null) {
                str = "";
            }
            cQh.A02(str);
        }
    }

    private final boolean A05() {
        C53502Ta r2;
        AnonymousClass0C1 r1 = this.A03;
        if (r1 == null) {
            C13150hy.A03("userSession");
        }
        if (!C52952Qw.A0E(r1)) {
            CQG cqg = this.A07;
            if (cqg == null) {
                C13150hy.A03("productsStateManager");
            }
            ProductSource productSource = cqg.A00.A00;
            if (productSource != null) {
                r2 = productSource.A00;
            } else {
                r2 = null;
            }
            if (r2 == C53502Ta.BRAND) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final C06590Pq getSession() {
        AnonymousClass0C1 r1 = this.A03;
        if (r1 == null) {
            C13150hy.A03("userSession");
        }
        return r1;
    }

    public final int AGx(Context context) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        C13150hy.A01(viewConfiguration, C193418Ps.$const$string(71));
        return viewConfiguration.getScaledTouchSlop();
    }

    public final View AXo() {
        return this.mView;
    }

    public final int AYd() {
        return A00().getTop();
    }

    public final boolean AhU() {
        RecyclerView A002 = A00();
        if (A002.getChildCount() == 0 || A002.computeVerticalScrollOffset() == 0) {
            return true;
        }
        return false;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 1001) {
            return;
        }
        if (i2 == -1) {
            AnonymousClass0C1 r0 = this.A03;
            if (r0 == null) {
                C13150hy.A03("userSession");
            }
            ProductSource A012 = C27665CMj.A01(r0);
            CQG cqg = this.A07;
            if (cqg == null) {
                C13150hy.A03("productsStateManager");
            }
            if (A012 != null && (A012.A00 == C53502Ta.CATALOG || (!C13150hy.A05(A012, cqg.A00.A00)))) {
                CQG.A00(cqg, new CQV(A012));
                cqg.A03.A03(A012);
                cqg.A03.A01();
            }
            C27679CMy cMy = this.A08;
            if (cMy == null) {
                C13150hy.A03("productSourceRowController");
            }
            cMy.A00(A012);
            InlineSearchBox inlineSearchBox = this.A02;
            if (inlineSearchBox == null) {
                C13150hy.A03("inlineSearchBox");
            }
            inlineSearchBox.A02();
            AnonymousClass7LA r2 = (AnonymousClass7LA) this.A0L.getValue();
            CQG cqg2 = this.A07;
            if (cqg2 == null) {
                C13150hy.A03("productsStateManager");
            }
            AnonymousClass0C1 r02 = this.A03;
            if (r02 == null) {
                C13150hy.A03("userSession");
            }
            String A022 = cqg2.A02(r02);
            C13150hy.A02(A022, "merchantId");
            C27758CQc cQc = new C27758CQc(r2.A00.A02("instagram_shopping_live_change_product_source"));
            C13150hy.A01(cQc, "event");
            if (cQc.A0B()) {
                cQc.A08("waterfall_id", r2.A01);
                cQc.A07("merchant_id", AnonymousClass5AS.A01(A022).A00);
                cQc.A01();
            }
        } else if (!A05()) {
            requireActivity().onBackPressed();
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-806703923);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null) {
            C13150hy.A00();
        }
        AnonymousClass0C1 A062 = AnonymousClass0J1.A06(bundle2);
        C13150hy.A01(A062, AnonymousClass40t.$const$string(13));
        this.A03 = A062;
        Bundle bundle3 = this.mArguments;
        if (bundle3 == null) {
            C13150hy.A00();
        }
        String string = bundle3.getString("prior_module");
        if (string == null) {
            C13150hy.A00();
        }
        this.A0I = string;
        Bundle bundle4 = this.mArguments;
        if (bundle4 == null) {
            C13150hy.A00();
        }
        this.A0A = bundle4.getBoolean(AnonymousClass0C5.$const$string(28));
        Bundle bundle5 = this.mArguments;
        if (bundle5 == null) {
            C13150hy.A00();
        }
        String string2 = bundle5.getString("waterfall_id");
        if (string2 == null) {
            C13150hy.A00();
        }
        this.A09 = string2;
        Bundle bundle6 = this.mArguments;
        if (bundle6 == null) {
            C13150hy.A00();
        }
        this.A0J = bundle6.getBoolean(C193418Ps.$const$string(115));
        Bundle bundle7 = this.mArguments;
        if (bundle7 == null) {
            C13150hy.A00();
        }
        this.A0C = bundle7.getInt(C193418Ps.$const$string(126));
        AnonymousClass0C1 r7 = this.A03;
        if (r7 == null) {
            C13150hy.A03("userSession");
        }
        C219359cu r8 = C219359cu.A00;
        AnonymousClass0C1 r0 = this.A03;
        if (r0 == null) {
            C13150hy.A03("userSession");
        }
        ProductSource A012 = C27665CMj.A01(r0);
        if (A012 == null) {
            AnonymousClass0C1 r02 = this.A03;
            if (r02 == null) {
                C13150hy.A03("userSession");
            }
            A012 = new ProductSource(r02.A04(), C53502Ta.CATALOG);
        }
        CQG cqg = new CQG(r7, r8, A012, this.A0C, Constants.ONE);
        C13150hy.A02("", "query");
        CQG.A00(cqg, new CQW(""));
        cqg.A03.A04("");
        this.A07 = cqg;
        AnonymousClass0C1 r4 = this.A03;
        if (r4 == null) {
            C13150hy.A03("userSession");
        }
        String str = this.A0I;
        if (str == null) {
            C13150hy.A03("priorModule");
        }
        CQD cqd = new CQD(r4, this, str);
        AnonymousClass0C1 r72 = this.A03;
        if (r72 == null) {
            C13150hy.A03("userSession");
        }
        String str2 = null;
        this.A06 = new C27763CQh(r72, cqd, str2, str2, str2, str2);
        this.A0H = Constants.ZERO;
        AnonymousClass0Z0.A09(843290739, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(794483696);
        C13150hy.A02(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C0003R.layout.multi_product_picker, viewGroup, false);
        AnonymousClass0Z0.A09(-2041393119, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0Z0.A02(-1103081822);
        super.onDestroy();
        InlineSearchBox inlineSearchBox = this.A02;
        if (inlineSearchBox == null) {
            C13150hy.A03("inlineSearchBox");
        }
        inlineSearchBox.A04();
        AnonymousClass0Z0.A09(-1174480256, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0Z0.A02(-951364108);
        super.onDestroyView();
        CQG cqg = this.A07;
        if (cqg == null) {
            C13150hy.A03("productsStateManager");
        }
        cqg.A01 = null;
        C27763CQh cQh = this.A06;
        if (cQh == null) {
            C13150hy.A03("collectionStateManager");
        }
        cQh.A01 = null;
        this.A0K = true;
        AnonymousClass0Z0.A09(1403202783, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0Z0.A02(1238210959);
        super.onResume();
        if (!A05() && this.A0K) {
            this.A0S.BG3();
        }
        this.A0K = false;
        AnonymousClass0Z0.A09(597807443, A022);
    }

    public final void onStart() {
        int A022 = AnonymousClass0Z0.A02(1303394391);
        super.onStart();
        FragmentActivity requireActivity = requireActivity();
        C13150hy.A01(requireActivity, C193418Ps.$const$string(141));
        AnonymousClass0C1 r5 = this.A03;
        if (r5 == null) {
            C13150hy.A03("userSession");
        }
        C13150hy.A02(requireActivity, AnonymousClass0C5.$const$string(233));
        C13150hy.A02(r5, "userSession");
        if (!C27665CMj.A00(r5).getBoolean("has_shown_live_shopping_creation_nux", false)) {
            AnonymousClass2OA r4 = new AnonymousClass2OA(requireActivity);
            r4.A0H(C019000b.A03(requireActivity, C0003R.C0004drawable.instagram_shopping_signup_assets_shopping_icon));
            r4.A03 = requireActivity.getString(C0003R.string.live_shopping_creation_nux_title);
            r4.A0M(requireActivity.getString(C0003R.string.live_shopping_creation_nux_checkout_message));
            r4.A0A(C0003R.string.f118ok, (DialogInterface.OnClickListener) null);
            r4.A03().show();
            C27665CMj.A00(r5).edit().putBoolean("has_shown_live_shopping_creation_nux", true).apply();
        }
        AnonymousClass0Z0.A09(-734548056, A022);
    }

    public final void onStop() {
        AnonymousClass7LG r4;
        int A022 = AnonymousClass0Z0.A02(-445280947);
        super.onStop();
        if (this.A00 != null) {
            AnonymousClass0C1 r1 = this.A03;
            if (r1 == null) {
                C13150hy.A03("userSession");
            }
            C23300zv.A00(r1).A03(C213669Jf.class, this.A00);
        }
        if (!this.A0B && (r4 = this.A01) != null) {
            CQG cqg = this.A07;
            if (cqg == null) {
                C13150hy.A03("productsStateManager");
            }
            AnonymousClass0C1 r12 = this.A03;
            if (r12 == null) {
                C13150hy.A03("userSession");
            }
            String A023 = cqg.A02(r12);
            CQG cqg2 = this.A07;
            if (cqg2 == null) {
                C13150hy.A03("productsStateManager");
            }
            r4.A00(A023, AnonymousClass10N.A0A(cqg2.A00.A04), (String) null);
        }
        this.A0B = false;
        AnonymousClass0Z0.A09(174817148, A022);
    }
}
