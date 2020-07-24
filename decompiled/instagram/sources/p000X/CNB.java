package p000X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.C0003R;
import com.instagram.igds.components.search.InlineSearchBox;
import com.instagram.model.shopping.ProductSource;
import com.instagram.model.shopping.ProductTag;
import com.instagram.p009ui.widget.refresh.RefreshableNestedScrollingParent;
import com.instagram.shopping.model.productsource.ProductSourceOverrideState;
import com.instagram.shopping.model.productsource.ProductSourceOverrideStatus;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* renamed from: X.CNB */
public final class CNB extends C27341Hl implements C27371Ho, AnonymousClass1HK, AnonymousClass1HM {
    public int A00;
    public InlineSearchBox A01;
    public AnonymousClass0C1 A02;
    public CP8 A03;
    public CNJ A04;
    public CNN A05;
    public C27726COu A06;
    public C27671CMp A07;
    public ProductSourceOverrideState A08;
    public AnonymousClass9J3 A09;
    public RefreshableNestedScrollingParent A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I = true;
    public RecyclerView A0J;
    public C27679CMy A0K;
    public List A0L;
    public List A0M;
    public Set A0N;
    public final C256319p A0O = new CNK(this);
    public final AnonymousClass662 A0P = new CNH(this);
    public final C27729COx A0Q = new CND(this);
    public final CNC A0R = new CNC(this);
    public final CN0 A0S = new CNA(this);

    public final boolean Ago() {
        return true;
    }

    public final boolean Ahq() {
        return false;
    }

    public final void configureActionBar(AnonymousClass1EX r2) {
        r2.Bnz(false);
    }

    public final String getModuleName() {
        return "product_search";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    private String A00() {
        List list = this.A0L;
        if (list == null) {
            list = this.A0M;
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        return ((ProductTag) list.get(0)).A01.A02.A02;
    }

    public static void A01(CNB cnb, ProductSource productSource) {
        if (productSource != null) {
            cnb.A06.A03(productSource);
        }
        C27679CMy cMy = cnb.A0K;
        if (cMy != null) {
            cMy.A00(productSource);
            if (!A02(cnb)) {
                cnb.A0K.A01(false);
            }
        }
        cnb.A04.A00 = productSource;
    }

    public static boolean A02(CNB cnb) {
        if (cnb.A08.A01 == ProductSourceOverrideStatus.A05) {
            return true;
        }
        if (!((Boolean) AnonymousClass0L6.A03(cnb.A02, AnonymousClass0L7.SHOPPING_ANDROID_SFC_CATALOG_SEGMENTS_PRODUCT_TAGGING, "enabled", false, (AnonymousClass04H) null)).booleanValue() || cnb.A08.A01 != ProductSourceOverrideStatus.ALREADY_TAGGED) {
            return false;
        }
        return true;
    }

    public static boolean A03(CNB cnb) {
        List list = cnb.A0L;
        if (list == null) {
            list = cnb.A0M;
        }
        if (list == null || list.isEmpty()) {
            return false;
        }
        return ((ProductTag) list.get(0)).A01.A02.A02.equals(cnb.A02.A04());
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1001 && i2 == -1) {
            ProductSource A012 = C27665CMj.A01(this.A02);
            if (A012 == null) {
                return;
            }
            if (A012.A00 == C53502Ta.CATALOG || !A012.equals(this.A08.A00)) {
                A01(this, A012);
                ProductSourceOverrideState productSourceOverrideState = this.A08;
                this.A08 = new ProductSourceOverrideState(productSourceOverrideState.A01, productSourceOverrideState.A02, A012);
                this.A06.A01();
                CP8 cp8 = this.A03;
                cp8.A00 = Constants.ZERO;
                cp8.A03.clear();
                cp8.notifyDataSetChanged();
                this.A06.A06(true);
                return;
            }
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    public final boolean onBackPressed() {
        if (!this.A0I) {
            return false;
        }
        C23300zv.A00(this.A02).BXT(new CNQ(this.A07, this.A0D));
        CNJ cnj = this.A04;
        CNJ.A01(cnj.A01, CNJ.A00(cnj, "instagram_shopping_product_tagging_cancel"));
        return false;
    }

    public final C06590Pq getSession() {
        return this.A02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0137, code lost:
        if (r11.A02.A04().equals(r3) != false) goto L_0x0139;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0161, code lost:
        if (r11.A02.A04().equals(A00()) != false) goto L_0x0163;
     */
    public final void onCreate(Bundle bundle) {
        boolean z;
        boolean z2;
        boolean z3;
        int A022 = AnonymousClass0Z0.A02(-1264610852);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        AnonymousClass0a4.A06(bundle2);
        this.A02 = AnonymousClass0J1.A06(bundle2);
        Serializable serializable = bundle2.getSerializable("entrypoint");
        AnonymousClass0a4.A06(serializable);
        this.A07 = (C27671CMp) serializable;
        this.A03 = new CP8(this.A0R);
        this.A06 = new CN1(this.A02, this.A0Q);
        String string = bundle2.getString("prior_module");
        AnonymousClass0a4.A06(string);
        String string2 = bundle2.getString("prior_submodule");
        AnonymousClass0a4.A06(string2);
        String string3 = bundle2.getString("waterfall_id", UUID.randomUUID().toString());
        this.A0E = string3;
        C17510qM r5 = C17510qM.A00;
        AnonymousClass0C1 r6 = this.A02;
        this.A04 = r5.A06(r6, this, string3, string, string2);
        this.A05 = new CNN(this, r6, string);
        this.A0D = bundle2.getString("tagging_info_id");
        this.A0H = bundle2.getBoolean("should_return_result");
        this.A0F = bundle2.getBoolean(AnonymousClass0C5.$const$string(28));
        this.A0B = bundle2.getString("tagged_business_partner");
        this.A0C = bundle2.getString("tagged_merchant_id");
        ArrayList parcelableArrayList = bundle2.getParcelableArrayList("product_tags");
        this.A0M = parcelableArrayList;
        if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
            this.A0N = new HashSet(this.A0M.size());
            for (ProductTag A032 : this.A0M) {
                this.A0N.add(A032.A03());
            }
        }
        this.A0L = bundle2.getParcelableArrayList(AnonymousClass40t.$const$string(18));
        ArrayList<String> stringArrayList = bundle2.getStringArrayList("suggested_product_ids");
        if (stringArrayList != null) {
            this.A06.A05(stringArrayList);
        }
        this.A09 = new AnonymousClass9J3(getActivity(), this.A02);
        String str = this.A0B;
        boolean z4 = false;
        if (str != null) {
            z4 = true;
        }
        if (z4) {
            this.A08 = new ProductSourceOverrideState(ProductSourceOverrideStatus.BUSINESS_PARTNER, str, new ProductSource(str, C53502Ta.BRAND));
        } else {
            String str2 = this.A0C;
            if (str2 != null) {
                z = true;
            }
            z = false;
            if (z) {
                this.A08 = new ProductSourceOverrideState(ProductSourceOverrideStatus.ALREADY_TAGGED, str2, C27665CMj.A01(this.A02));
            } else {
                if (A00() != null) {
                    z2 = true;
                }
                z2 = false;
                if (z2) {
                    this.A08 = new ProductSourceOverrideState(ProductSourceOverrideStatus.ALREADY_TAGGED, A00(), new ProductSource(A00(), C53502Ta.BRAND));
                } else {
                    String str3 = this.A0C;
                    if ((str3 == null || !this.A02.A04().equals(str3)) && (A00() == null || !this.A02.A04().equals(A00()))) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (z3 || !this.A0F) {
                        ProductSourceOverrideStatus productSourceOverrideStatus = ProductSourceOverrideStatus.A05;
                        String A042 = this.A02.A04();
                        this.A08 = new ProductSourceOverrideState(productSourceOverrideStatus, A042, new ProductSource(A042, C53502Ta.CATALOG));
                    } else {
                        this.A08 = new ProductSourceOverrideState(ProductSourceOverrideStatus.A05, (String) null, C27665CMj.A01(this.A02));
                    }
                }
            }
        }
        A01(this, this.A08.A00);
        CNJ cnj = this.A04;
        CNJ.A01(cnj.A01, CNJ.A00(cnj, "instagram_shopping_product_tagging_opened"));
        AnonymousClass0Z0.A09(-578630301, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(454473633);
        View inflate = layoutInflater.inflate(C0003R.layout.product_picker, viewGroup, false);
        AnonymousClass0Z0.A09(-1238109883, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0Z0.A02(-280017539);
        super.onDestroy();
        InlineSearchBox inlineSearchBox = this.A01;
        if (inlineSearchBox != null) {
            inlineSearchBox.A04();
        }
        AnonymousClass0Z0.A09(-102199492, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A0A = (RefreshableNestedScrollingParent) view.findViewById(C0003R.C0005id.refreshable_recycler_view_container);
        if (this.A07 != C27671CMp.A01 || !((Boolean) AnonymousClass0L6.A02(this.A02, AnonymousClass0L7.PULL_TO_REFRESH_SEARCH_SHOPPING_PRODUCT_TAGS, "can_pull_to_refresh", false, (AnonymousClass04H) null)).booleanValue()) {
            this.A0A.setEnabled(false);
        } else {
            this.A0A.setListener(new CNI(this));
        }
        RecyclerView recyclerView = (RecyclerView) this.A0A.findViewById(C0003R.C0005id.recycler_view);
        this.A0J = recyclerView;
        recyclerView.setAdapter(this.A03);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        this.A0J.setLayoutManager(linearLayoutManager);
        this.A0J.A0w(this.A0O);
        this.A0J.A0w(new C61622m6(this.A06, C29621Qp.PRODUCT, linearLayoutManager));
        InlineSearchBox inlineSearchBox = (InlineSearchBox) view.findViewById(C0003R.C0005id.search_box);
        this.A01 = inlineSearchBox;
        inlineSearchBox.setListener(this.A0P);
        inlineSearchBox.setImeOptions(6);
        this.A01.A02();
        this.A0K = new C27679CMy(this.A0S, view);
        this.A06.A06(true);
    }
}
