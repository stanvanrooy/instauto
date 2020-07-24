package p000X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.AGU */
public final class AGU implements C23232ADv {
    public final void A6S(Context context, Object obj, Object obj2, Object obj3) {
        RecyclerView recyclerView = (RecyclerView) obj;
        AnonymousClass7K9 r0 = ((AGQ) obj2).A05;
        if (r0 != null) {
            r0.A08(recyclerView);
        }
    }

    public final boolean Bng(Object obj, Object obj2, Object obj3, Object obj4) {
        AnonymousClass7K9 r1 = ((AGQ) obj).A05;
        AnonymousClass7K9 r0 = ((AGQ) obj2).A05;
        if (r1 == r0) {
            return false;
        }
        if (r1 == null || !r1.equals(r0)) {
            return true;
        }
        return false;
    }

    public final void Bs0(Context context, Object obj, Object obj2, Object obj3) {
        AnonymousClass7K9 r1 = ((AGQ) obj2).A05;
        if (r1 != null) {
            r1.A08((RecyclerView) null);
        }
    }
}
