package p000X;

import android.os.Bundle;
import com.instagram.discovery.filters.analytics.FiltersLoggingInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.0rp  reason: invalid class name and case insensitive filesystem */
public final class C18420rp extends C18430rq {
    public final AnonymousClass1HD A00(AnonymousClass0C1 r4, C219579dJ r5, AnonymousClass7AM r6, FiltersLoggingInfo filtersLoggingInfo, Map map) {
        C219649dQ A00 = C219649dQ.A00(r4);
        A00.A00.put(r5.A05, r5);
        if (r5.A04()) {
            Map map2 = A00.A01;
            String str = r5.A05;
            map2.put(str, (List) r6.A00.get(str));
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("SearchableListFilterFragment.LOGGING_INFO", filtersLoggingInfo);
        bundle.putString("SearchableListFilterFragment.ARGUMENT_FILTER", r5.A05);
        if (map != null) {
            bundle.putStringArrayList("SearchableListFilterFragment.ARGUMENT_API_MODIFIERS", C219509dB.A00(map));
        }
        C220129eC r0 = new C220129eC();
        r0.setArguments(bundle);
        return r0;
    }

    public final AnonymousClass1HD A01(AnonymousClass0C1 r11, List list, AnonymousClass7AM r13, FiltersLoggingInfo filtersLoggingInfo, Map map) {
        if (!list.isEmpty()) {
            AnonymousClass0C1 r5 = r11;
            Map map2 = map;
            FiltersLoggingInfo filtersLoggingInfo2 = filtersLoggingInfo;
            if (list.size() == 1 && ((C219579dJ) list.get(0)).A01 == C219739dZ.LIST) {
                AnonymousClass1HD A00 = A00(r5, (C219579dJ) list.get(0), r13, filtersLoggingInfo2, map2);
                A00.mArguments.putBoolean("SearchableListFilterFragment.ARGUMENT_SHOULD_SHOW_APPLY_BUTTON", true);
                return A00;
            }
            Bundle bundle = new Bundle();
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((C219579dJ) it.next()).clone());
            }
            ArrayList A01 = C219649dQ.A00(r11).A01(arrayList);
            C219609dM r2 = new C219609dM();
            bundle.putParcelable("FiltersListFragment.ARGUMENT_LOGGING_INFO", filtersLoggingInfo);
            bundle.putStringArrayList("FiltersListFragment.ARGUMENT_FILTERS", A01);
            if (map != null) {
                bundle.putStringArrayList("FiltersListFragment.ARGUMENT_API_MODIFIERS", C219509dB.A00(map));
            }
            r2.setArguments(bundle);
            return r2;
        }
        throw new IllegalArgumentException("Cannot launch view with no filters");
    }
}
