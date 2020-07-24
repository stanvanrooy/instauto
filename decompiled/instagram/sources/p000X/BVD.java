package p000X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.C0003R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.BVD */
public final class BVD extends C27341Hl implements AnonymousClass1HM {
    public C25632BSq A00;
    public BWT A01;
    public AnonymousClass0C1 A02;

    public final void configureActionBar(AnonymousClass1EX r5) {
        String str;
        r5.Bo6(true);
        C25632BSq bSq = this.A00;
        if (bSq != null) {
            str = bSq.A00.name();
        } else {
            str = "Slot";
        }
        r5.setTitle(getString(C0003R.string.dev_qp_slot_details_title, str));
    }

    public final String getModuleName() {
        return "quick_promotion_item";
    }

    public final boolean isToolbarEnabled() {
        return false;
    }

    public final C06590Pq getSession() {
        return this.A02;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(280954916);
        super.onCreate(bundle);
        this.A02 = AnonymousClass0J1.A06(this.mArguments);
        AnonymousClass0Z0.A09(378528926, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0Z0.A02(1044080801);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(C0003R.layout.quick_promotion_slot_details_fragment, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C0003R.C0005id.qp_slot_details_rv);
        C25632BSq bSq = this.A00;
        ArrayList arrayList = new ArrayList();
        Map map = bSq.A02;
        Map map2 = bSq.A03;
        for (Map.Entry entry : map.entrySet()) {
            List<AnonymousClass2BW> list = (List) entry.getValue();
            C37731k8 r7 = (C37731k8) entry.getKey();
            if (list != null && !list.isEmpty()) {
                for (AnonymousClass2BW r2 : list) {
                    Object obj = map2.get(r2.A02.A05);
                    AnonymousClass0a4.A06(obj);
                    arrayList.add(new BVE(r2, r7, (AnonymousClass2C5) obj));
                }
            }
        }
        this.A01 = new BWT(arrayList, this);
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.A0r(new AnonymousClass3IP(getContext(), 1));
        recyclerView.setAdapter(this.A01);
        schedule(new C25631BSp(this));
        AnonymousClass0Z0.A09(533966296, A022);
        return inflate;
    }
}
