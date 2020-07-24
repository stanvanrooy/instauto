package p000X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.AGX */
public final class AGX implements C23232ADv {
    public final void A6S(Context context, Object obj, Object obj2, Object obj3) {
        ((RecyclerView) obj).setOverScrollMode(((AGQ) obj2).A02);
    }

    public final boolean Bng(Object obj, Object obj2, Object obj3, Object obj4) {
        if (((AGQ) obj).A02 != ((AGQ) obj2).A02) {
            return true;
        }
        return false;
    }

    public final void Bs0(Context context, Object obj, Object obj2, Object obj3) {
    }
}
