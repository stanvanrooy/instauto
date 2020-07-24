package com.facebook.browser.lite.extensions.autofill.instagram;

import android.content.Context;
import com.facebook.browser.lite.extensions.autofill.base.AutofillOptOutCallbackHandler;
import java.util.Map;
import p000X.AQ8;
import p000X.AS5;
import p000X.AnonymousClass0Z0;
import p000X.C24079Aha;
import p000X.C24087Ahl;
import p000X.C24089Aho;

public final class AutofillController$InstagramAutofillOptOutCallbackHandler extends AutofillOptOutCallbackHandler {
    public AutofillController$InstagramAutofillOptOutCallbackHandler(Context context, C24079Aha aha, AQ8 aq8, Map map, boolean z) {
        super(context, aha, aq8, map, z);
        AnonymousClass0Z0.A0A(2031910769, AnonymousClass0Z0.A03(2019492565));
    }

    public final void AuG(String str, boolean z) {
        int A03 = AnonymousClass0Z0.A03(-1443480586);
        this.A04.put(str, Boolean.valueOf(z));
        if (this.A03) {
            AS5.A00(new C24089Aho(this, z));
        }
        if (!z) {
            AS5.A00(new C24087Ahl(this, str));
        }
        AnonymousClass0Z0.A0A(-250285624, A03);
    }
}
