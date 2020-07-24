package p000X;

import android.content.Context;
import com.facebook.C0003R;

/* renamed from: X.C72 */
public final class C72 {
    public static String A00(AnonymousClass0C1 r4, Context context) {
        if (C71.A00(r4).booleanValue()) {
            return (String) AnonymousClass0L6.A02(r4, AnonymousClass0L7.SELLER_INSIGHTS_CONTENT, "interactions_highlighted_metric", "Actions taken from this product", (AnonymousClass04H) null);
        }
        return context.getString(C0003R.string.product_interactions_description);
    }
}
