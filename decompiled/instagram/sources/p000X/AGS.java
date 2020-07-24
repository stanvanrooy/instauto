package p000X;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.AGS */
public final class AGS implements C23232ADv {
    public final void A6S(Context context, Object obj, Object obj2, Object obj3) {
        ((RecyclerView) obj).setLayoutManager(new LinearLayoutManager(((AGQ) obj2).A01, false));
    }

    public final boolean Bng(Object obj, Object obj2, Object obj3, Object obj4) {
        if (((AGQ) obj).A01 != ((AGQ) obj2).A01) {
            return true;
        }
        return false;
    }

    public final void Bs0(Context context, Object obj, Object obj2, Object obj3) {
        ((RecyclerView) obj).setLayoutManager((C31391Ya) null);
    }
}
