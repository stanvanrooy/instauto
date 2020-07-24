package p000X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.instagram.business.promote.activity.PromoteActivity;

/* renamed from: X.0ri  reason: invalid class name and case insensitive filesystem */
public final class C18350ri extends C18360rj {
    public static void A00(AnonymousClass0C1 r5, String str, String str2, Bundle bundle) {
        String string = bundle.getString("instagram_media_id");
        String string2 = bundle.getString("entryPoint");
        if (bundle.getBoolean("isSubflow")) {
            return;
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            AnonymousClass2VW.A03(r5, string2, C14100jl.A01(r5), string);
            return;
        }
        String A01 = C14100jl.A01(r5);
        AnonymousClass0P4 A00 = AnonymousClass2VV.A00(Constants.ZERO);
        A00.A0G("entry_point", string2);
        A00.A0G("fb_user_id", A01);
        A00.A0G("m_pk", string);
        A00.A0G("id", str);
        A00.A0G("tracking_token", str2);
        AnonymousClass2VW.A00(A00, r5);
        AnonymousClass0WN.A01(r5).BcG(A00);
    }

    public final AnonymousClass2VK A01(String str, String str2, AnonymousClass0C1 r9, Context context) {
        return new AnonymousClass2VK(str, str2, r9, context, (C18360rj) this);
    }

    public final AnonymousClass2VK A02(String str, String str2, AnonymousClass0C1 r9, AnonymousClass1HD r10) {
        return new AnonymousClass2VK(str, str2, r9, r10, (C18360rj) this);
    }

    public final void A03(Context context, AnonymousClass0C1 r4, Bundle bundle) {
        String A00 = C14100jl.A00(r4);
        AnonymousClass0a4.A06(A00);
        bundle.putString("access_token", A00);
        bundle.putString("fb_user_id", C14100jl.A01(r4));
        Intent intent = new Intent(context, PromoteActivity.class);
        intent.putExtras(bundle);
        AnonymousClass1BH.A03(intent, context);
    }

    public final void A04(Context context, AnonymousClass0C1 r4, String str, String str2, Bundle bundle) {
        A00(r4, str, str2, bundle);
        Intent intent = new Intent(context, PromoteActivity.class);
        intent.putExtras(bundle);
        AnonymousClass1BH.A03(intent, context);
    }

    public final void A05(AnonymousClass1HD r4, AnonymousClass0C1 r5, String str, String str2, Bundle bundle) {
        A00(r5, str, str2, bundle);
        Intent intent = new Intent(r4.requireContext(), PromoteActivity.class);
        intent.putExtras(bundle);
        AnonymousClass1BH.A0B(intent, 17, r4);
    }
}
