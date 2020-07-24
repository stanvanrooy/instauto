package p000X;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: X.0hK  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C12750hK implements AnonymousClass0IT {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ SharedPreferences A01;

    public /* synthetic */ C12750hK(Context context, SharedPreferences sharedPreferences) {
        this.A00 = context;
        this.A01 = sharedPreferences;
    }

    public final Object get() {
        Context context = this.A00;
        C71853Ck r1 = new C71853Ck("stale_removal", this.A01);
        if (C191158Fa.A02 == null) {
            C191158Fa.A02 = new C191158Fa(context, r1);
        }
        return C191158Fa.A02;
    }
}
