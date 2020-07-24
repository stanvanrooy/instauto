package p000X;

import android.content.Context;
import com.facebook.C0003R;

/* renamed from: X.CQZ */
public final class CQZ {
    public final C27774CQs A00;
    public final Context A01;

    public CQZ(Context context, CS3 cs3, CS4 cs4) {
        C13150hy.A02(context, "context");
        C13150hy.A02(cs3, "itemDelegate");
        C13150hy.A02(cs4, "groupDelegate");
        this.A01 = context;
        this.A00 = new C27774CQs(context, cs3, cs4, new AnonymousClass96E(C0003R.string.publishing_product_action_button_added, C0003R.string.publishing_product_action_button_remove_description, C0003R.string.publishing_product_action_button_removed_description, C0003R.string.publishing_product_action_button_add, C0003R.string.publishing_product_action_button_add_description, C0003R.string.publishing_product_action_button_added_description));
    }
}
