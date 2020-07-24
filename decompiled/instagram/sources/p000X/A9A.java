package p000X;

import android.content.Context;

/* renamed from: X.A9A */
public final class A9A {
    public C225909nz A00;
    public final Context A01;
    public final Object A02;

    public final C225909nz A00() {
        C225909nz r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        throw new IllegalStateException("Trying to access the LayoutCache from outside a layout call");
    }

    public A9A(Context context, Object obj, C225909nz r3) {
        this.A01 = context;
        this.A00 = r3;
        this.A02 = obj;
    }
}
