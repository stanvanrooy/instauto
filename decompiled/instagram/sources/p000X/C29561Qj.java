package p000X;

import android.content.Context;
import android.widget.Adapter;

/* renamed from: X.1Qj  reason: invalid class name and case insensitive filesystem */
public final class C29561Qj extends C29571Qk {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C29551Qi A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29561Qj(C29551Qi r2, Context context) {
        super(3);
        this.A01 = r2;
        this.A00 = context;
    }

    public final void A03(Adapter adapter, int i) {
        AnonymousClass1ZD r1;
        C29551Qi r12 = this.A01;
        Context context = this.A00;
        Object item = adapter.getItem(i);
        if (item instanceof AnonymousClass1NJ) {
            AnonymousClass1NJ r2 = (AnonymousClass1NJ) item;
            if (r2.A1Q() && (r1 = r12.A00) != null) {
                r1.A01(r2.A0S(context));
            }
        }
    }

    public final boolean A04(Adapter adapter, int i) {
        Object item = adapter.getItem(i);
        if (item instanceof AnonymousClass1NJ) {
            return ((AnonymousClass1NJ) item).A1Q();
        }
        return false;
    }
}
