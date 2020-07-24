package p000X;

import android.content.Context;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.AGP */
public final class AGP implements C23232ADv {
    public final void A6S(Context context, Object obj, Object obj2, Object obj3) {
        Parcelable parcelable;
        RecyclerView recyclerView = (RecyclerView) obj;
        AGQ agq = (AGQ) obj2;
        recyclerView.setAdapter(agq.A07);
        recyclerView.setItemAnimator((C31341Xr) null);
        AGY agy = agq.A06;
        if (agy != null && (parcelable = agy.A00) != null) {
            recyclerView.A0L.A1O(parcelable);
        }
    }

    public final boolean Bng(Object obj, Object obj2, Object obj3, Object obj4) {
        if (((AGQ) obj).A07 != ((AGQ) obj2).A07) {
            return true;
        }
        return false;
    }

    public final void Bs0(Context context, Object obj, Object obj2, Object obj3) {
        RecyclerView recyclerView = (RecyclerView) obj;
        AGY agy = ((AGQ) obj2).A06;
        if (agy != null) {
            agy.A00 = recyclerView.A0L.A1D();
        }
        recyclerView.setAdapter((AnonymousClass1PH) null);
    }
}
