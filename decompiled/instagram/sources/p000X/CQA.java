package p000X;

import android.content.Context;
import android.content.DialogInterface;
import com.facebook.C0003R;
import com.facebook.react.modules.dialog.DialogModule;

/* renamed from: X.CQA */
public final class CQA {
    public static final void A00(Context context, String str) {
        C13150hy.A02(context, "$this$showTaggedBusinessPartnerDifferentFromSelectedMerchantDialog");
        C13150hy.A02(str, "taggedBusinessPartnerUsername");
        String string = context.getString(C0003R.string.f69x8ec7411e, new Object[]{str});
        C13150hy.A01(string, "getString(\n            R…dBusinessPartnerUsername)");
        String string2 = context.getString(C0003R.string.f68x80d1854d);
        C13150hy.A01(string2, "getString(R.string.brand…ollection_dialog_message)");
        A03(context, string, string2);
    }

    public static final void A01(Context context, String str) {
        C13150hy.A02(context, "$this$showTaggedMerchantDifferentFromSelectedMerchantDialog");
        C13150hy.A02(str, "taggedMerchantUsername");
        String string = context.getString(C0003R.string.brand_change_disabled_collection_dialog_title, new Object[]{str});
        C13150hy.A01(string, "getString(R.string.brand…, taggedMerchantUsername)");
        String string2 = context.getString(C0003R.string.brand_change_disabled_collection_dialog_message);
        C13150hy.A01(string2, "getString(R.string.brand…ollection_dialog_message)");
        A03(context, string, string2);
    }

    public static final void A02(Context context, String str, String str2) {
        C13150hy.A02(context, "$this$showCollectionDisabledReasonDialog");
        C13150hy.A02(str, DialogModule.KEY_TITLE);
        C13150hy.A02(str2, "description");
        A03(context, str, str2);
    }

    public static final void A03(Context context, String str, String str2) {
        AnonymousClass2OA r2 = new AnonymousClass2OA(context);
        r2.A03 = str;
        r2.A0M(str2);
        r2.A0A(C0003R.string.f118ok, (DialogInterface.OnClickListener) null);
        r2.A03().show();
    }
}
