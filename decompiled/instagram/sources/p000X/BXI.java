package p000X;

import android.content.Context;

/* renamed from: X.BXI */
public final class BXI implements BXU {
    public Context A00;

    public final boolean BWt(C25731BXb bXb, BXX bxx) {
        Context context = this.A00;
        return !context.getSharedPreferences(context.getPackageName(), 0).getBoolean(C193418Ps.$const$string(22), false);
    }

    public BXI(Context context) {
        this.A00 = context;
    }
}
