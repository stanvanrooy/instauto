package com.facebook.browser.lite.extensions.autofill.base;

import android.content.Context;
import com.facebook.browser.lite.ipc.AutofillOptOutCallback;
import java.util.Map;
import p000X.AQ8;
import p000X.AnonymousClass0Z0;
import p000X.C24075AhV;

public abstract class AutofillOptOutCallbackHandler extends AutofillOptOutCallback.Stub {
    public final Context A00;
    public final C24075AhV A01;
    public final AQ8 A02;
    public final boolean A03;
    public final Map A04;

    public AutofillOptOutCallbackHandler(Context context, C24075AhV ahV, AQ8 aq8, Map map, boolean z) {
        int A032 = AnonymousClass0Z0.A03(1865864625);
        this.A00 = context;
        this.A01 = ahV;
        this.A03 = z;
        this.A02 = aq8;
        this.A04 = map;
        AnonymousClass0Z0.A0A(-590519486, A032);
    }
}
