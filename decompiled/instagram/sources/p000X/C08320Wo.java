package p000X;

import android.content.Context;
import android.content.Intent;

/* renamed from: X.0Wo  reason: invalid class name and case insensitive filesystem */
public abstract class C08320Wo {
    public C10980eE A00;
    public AnonymousClass0UR A01;
    public Context A02;

    public abstract void A00(Intent intent);

    public abstract void A01(String str);

    public abstract void A02(String str, boolean z);

    public C08320Wo(Context context) {
        this.A02 = context;
        this.A01 = new AnonymousClass0UR(context);
        this.A00 = new C10960eC(context).A00(Constants.A03);
    }
}
