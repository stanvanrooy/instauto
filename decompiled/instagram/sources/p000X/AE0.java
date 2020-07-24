package p000X;

import android.content.Context;
import android.os.Parcelable;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.AE0 */
public final class AE0 implements C23232ADv {
    public final void A6S(Context context, Object obj, Object obj2, Object obj3) {
        C23236ADz aDz = (C23236ADz) obj2;
        RecyclerView recyclerView = (RecyclerView) ((LinearLayout) obj).getChildAt(1);
        recyclerView.setAdapter(aDz.A02);
        Parcelable parcelable = aDz.A01.A00;
        if (parcelable != null) {
            C31391Ya r0 = recyclerView.A0L;
            if (r0 != null) {
                r0.A1O(parcelable);
                return;
            }
            throw new IllegalStateException("LayoutManager for the RecyclerView was null by the time the SaveInstanceState binder was invoked");
        }
    }

    public final boolean Bng(Object obj, Object obj2, Object obj3, Object obj4) {
        if (((C23236ADz) obj).A02 != ((C23236ADz) obj2).A02) {
            return true;
        }
        return false;
    }

    public final void Bs0(Context context, Object obj, Object obj2, Object obj3) {
        C23236ADz aDz = (C23236ADz) obj2;
        RecyclerView recyclerView = (RecyclerView) ((LinearLayout) obj).getChildAt(1);
        C31391Ya r0 = recyclerView.A0L;
        if (r0 != null) {
            aDz.A01.A00 = r0.A1D();
            recyclerView.setAdapter((AnonymousClass1PH) null);
            return;
        }
        throw new IllegalStateException("LayoutManager for the RecyclerView was null by the time the SaveInstanceState binder was invoked");
    }
}
