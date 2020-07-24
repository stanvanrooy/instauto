package p000X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.AGV */
public final class AGV implements C23232ADv {
    public final void A6S(Context context, Object obj, Object obj2, Object obj3) {
        ((RecyclerView) obj).setItemAnimator(((AGQ) obj2).A03);
    }

    public final boolean Bng(Object obj, Object obj2, Object obj3, Object obj4) {
        if (((AGQ) obj).A03 != ((AGQ) obj2).A03) {
            return true;
        }
        return false;
    }

    public final void Bs0(Context context, Object obj, Object obj2, Object obj3) {
        ((RecyclerView) obj).setItemAnimator((C31341Xr) null);
    }
}
