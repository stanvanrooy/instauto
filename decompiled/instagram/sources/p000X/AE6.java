package p000X;

import android.content.Context;
import android.widget.LinearLayout;
import com.instagram.igds.components.search.InlineSearchBox;

/* renamed from: X.AE6 */
public final class AE6 implements C23232ADv {
    public final /* bridge */ /* synthetic */ void A6S(Context context, Object obj, Object obj2, Object obj3) {
        ((InlineSearchBox) ((LinearLayout) obj).getChildAt(0)).setListener(new AE7(this, (C23236ADz) obj2));
    }

    public final void Bs0(Context context, Object obj, Object obj2, Object obj3) {
        ((InlineSearchBox) ((LinearLayout) obj).getChildAt(0)).setListener((AnonymousClass662) null);
    }

    public final boolean Bng(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }
}
