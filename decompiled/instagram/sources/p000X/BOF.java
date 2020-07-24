package p000X;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* renamed from: X.BOF */
public final class BOF extends BOA {
    public final Context A00;
    public final ApplicationInfo A01;
    public final BQH A02;
    public final B9l A03;

    public BOF(Context context, BQH bqh) {
        super(context, bqh);
        this.A01 = context.getApplicationInfo();
        this.A00 = context;
        this.A02 = bqh;
        if (B9l.A01 == null) {
            B9l.A01 = new B9l(context);
        }
        this.A03 = B9l.A01;
    }
}
