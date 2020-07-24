package p000X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.AGT */
public final class AGT implements C23232ADv {
    public final void A6S(Context context, Object obj, Object obj2, Object obj3) {
        RecyclerView recyclerView = (RecyclerView) obj;
        AnonymousClass1YW r0 = ((AGQ) obj2).A04;
        if (r0 != null) {
            recyclerView.A0r(r0);
        }
    }

    public final boolean Bng(Object obj, Object obj2, Object obj3, Object obj4) {
        AnonymousClass1YW r1 = ((AGQ) obj).A04;
        AnonymousClass1YW r0 = ((AGQ) obj2).A04;
        if (r1 == r0) {
            return false;
        }
        if (r1 == null || !r1.equals(r0)) {
            return true;
        }
        return false;
    }

    public final void Bs0(Context context, Object obj, Object obj2, Object obj3) {
        RecyclerView recyclerView = (RecyclerView) obj;
        AnonymousClass1YW r0 = ((AGQ) obj2).A04;
        if (r0 != null) {
            recyclerView.A0s(r0);
        }
    }
}
