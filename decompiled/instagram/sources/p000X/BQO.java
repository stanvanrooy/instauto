package p000X;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: X.BQO */
public final class BQO implements BR9 {
    public SharedPreferences A00;
    public AnonymousClass0C1 A01;
    public Context A02;

    public final void BtQ(Object obj) {
        try {
            this.A01 = (AnonymousClass0C1) obj;
        } catch (ClassCastException e) {
            C54802Yz.A00(e);
        }
    }

    public BQO(AnonymousClass0C1 r2, Context context) {
        this.A01 = r2;
        this.A02 = context;
        this.A00 = C05790Ly.A01(context, "IG_BD_SC_COLLECTION");
    }
}
