package p000X;

import android.content.Context;
import com.facebook.C0003R;

/* renamed from: X.CZE */
public final class CZE implements C52042Ne {
    public final /* synthetic */ CZ3 A00;

    public CZE(CZ3 cz3) {
        this.A00 = cz3;
    }

    public final void B6j(AnonymousClass1NJ r8, Integer num) {
        if (num == Constants.A0u) {
            CZ3 cz3 = this.A00;
            Context context = cz3.A0D;
            AnonymousClass5F9.A03(context, context.getString(C0003R.string.sfplt_hide_posts_from_account_action_confirmation, new Object[]{cz3.A05.A0c(cz3.A0M).AZn()}), 1);
        }
        CZ3.A05(this.A00, false);
    }
}
