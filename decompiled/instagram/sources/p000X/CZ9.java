package p000X;

import android.content.Context;
import android.view.View;
import com.facebook.C0003R;

/* renamed from: X.CZ9 */
public final class CZ9 implements View.OnClickListener {
    public final /* synthetic */ CZN A00;

    public CZ9(CZN czn) {
        this.A00 = czn;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(427788793);
        CZN czn = this.A00;
        if (((Boolean) AnonymousClass0L6.A02(czn.A00.A0M, AnonymousClass0L7.NOT_INTERESTED_SECONDARY_OPTIONS, "is_enabled", false, AnonymousClass0LY.A03)).booleanValue()) {
            CZ3 cz3 = czn.A00;
            AnonymousClass0C1 r3 = cz3.A0M;
            Context context = cz3.A0D;
            C52042Ne r5 = cz3.A0G;
            AnonymousClass1NJ r7 = cz3.A05;
            C06270Ok BYO = cz3.BYO(r7);
            CZ3 cz32 = czn.A00;
            AnonymousClass6GH.A00(r3, context, r5, cz3, r7, BYO, cz32.A01, cz32.A0N);
        } else {
            CZ3 cz33 = czn.A00;
            AnonymousClass1I6 r2 = cz33.A0N;
            if (r2 != null) {
                AnonymousClass0C1 r4 = cz33.A0M;
                AnonymousClass1NJ r6 = cz33.A05;
                String AVo = r2.AVo();
                CZ3 cz34 = czn.A00;
                AnonymousClass5BD.A01(r4, cz33, r6, AVo, (String) null, cz34.BYO(cz34.A05), czn.A00.A01);
            }
            AnonymousClass5F9.A01(czn.A00.A0D, C0003R.string.see_fewer_posts_like_this_toast, 1);
            CZ3.A05(czn.A00, false);
        }
        CZ3.A01(czn.A00);
        AnonymousClass0Z0.A0C(1252753, A05);
    }
}
