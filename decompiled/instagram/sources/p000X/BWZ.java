package p000X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.C0003R;
import com.instagram.p009ui.widget.refresh.RefreshableListView;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.BWZ */
public final class BWZ extends AnonymousClass2NN implements AnonymousClass1HM {
    public BWQ A00;
    public C28951Nz A01;
    public AnonymousClass1OG A02;
    public AnonymousClass0C1 A03;
    public RefreshableListView A04;
    public final Set A05 = new HashSet();

    public final void configureActionBar(AnonymousClass1EX r2) {
        r2.Bo6(true);
        r2.setTitle(getString(C0003R.string.dev_qp_slot_list_title));
    }

    public final String getModuleName() {
        return "qp_debug_list";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public final void A00() {
        int i;
        if (this.A05.isEmpty()) {
            for (QuickPromotionSlot quickPromotionSlot : QuickPromotionSlot.values()) {
                if (!this.A05.contains(quickPromotionSlot) && QuickPromotionSlot.SURVEY != quickPromotionSlot) {
                    this.A05.add(quickPromotionSlot);
                    File file = new File(getContext().getCacheDir() + "/" + quickPromotionSlot.name() + ".json");
                    Context context = getContext();
                    if (context != null) {
                        i = (int) Math.ceil((double) context.getResources().getDisplayMetrics().density);
                    } else {
                        i = 1;
                    }
                    C17850qu A012 = C37951kU.A01(this.A03, i, quickPromotionSlot, Constants.ONE);
                    A012.A00 = new BWY(this, quickPromotionSlot, file);
                    schedule(A012);
                }
            }
        }
    }

    public final C06590Pq getSession() {
        return this.A03;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(-140694980);
        super.onCreate(bundle);
        this.A03 = AnonymousClass0J1.A06(this.mArguments);
        this.A01 = new C28951Nz();
        this.A02 = new AnonymousClass1OG();
        AnonymousClass0Z0.A09(-67619032, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(1925060376);
        View inflate = layoutInflater.inflate(C0003R.layout.layout_refreshablelistview, viewGroup, false);
        AnonymousClass0Z0.A09(-1943228566, A022);
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        BWQ bwq = new BWQ(getContext());
        this.A00 = bwq;
        setListAdapter(bwq);
        RefreshableListView refreshableListView = (RefreshableListView) getListView();
        this.A04 = refreshableListView;
        refreshableListView.setOnItemClickListener(new C25705BWa(this));
        this.A04.setupAndEnableRefresh(new C25716BWm(this));
        A00();
    }
}
