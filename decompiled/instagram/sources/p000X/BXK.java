package p000X;

import android.content.Context;

/* renamed from: X.BXK */
public final class BXK implements BXU {
    public Context A00;

    public final boolean BWt(C25731BXb bXb, BXX bxx) {
        Context context = this.A00;
        if (context.getSharedPreferences(context.getPackageName(), 0).getInt(AnonymousClass0C5.$const$string(42), 0) <= 1) {
            return false;
        }
        return true;
    }

    public BXK(Context context) {
        this.A00 = context;
    }
}
