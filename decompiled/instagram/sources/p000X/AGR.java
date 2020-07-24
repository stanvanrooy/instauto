package p000X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.AGR */
public final class AGR implements C23232ADv {
    public final void A6S(Context context, Object obj, Object obj2, Object obj3) {
        RecyclerView recyclerView = (RecyclerView) obj;
        List list = ((AGQ) obj2).A09;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                recyclerView.A0w((C256319p) list.get(i));
            }
        }
    }

    public final boolean Bng(Object obj, Object obj2, Object obj3, Object obj4) {
        List list = ((AGQ) obj).A09;
        List list2 = ((AGQ) obj2).A09;
        if (list != list2) {
            if (!(list == null || list2 == null || list.size() != list2.size())) {
                int i = 0;
                while (i < list.size()) {
                    if (((C256319p) list.get(i)).equals(list2.get(i))) {
                        i++;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void Bs0(Context context, Object obj, Object obj2, Object obj3) {
        RecyclerView recyclerView = (RecyclerView) obj;
        List list = ((AGQ) obj2).A09;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                recyclerView.A0x((C256319p) list.get(i));
            }
        }
    }
}
