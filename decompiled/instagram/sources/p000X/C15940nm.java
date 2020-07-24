package p000X;

import android.content.Context;

/* renamed from: X.0nm  reason: invalid class name and case insensitive filesystem */
public abstract class C15940nm {
    public static C15940nm A00;

    public abstract C53752Ue A03();

    public abstract void A04(Context context, C06590Pq r2, boolean z, boolean z2, boolean z3, C134605oq r6);

    public abstract void A05(Context context, C06590Pq r2, boolean z, boolean z2, boolean z3, C134605oq r6, Integer num);

    public abstract void A06(Context context, AnonymousClass0C1 r2);

    public abstract void A07(Context context, AnonymousClass0C1 r2, C134605oq r3, C135345q4 r4);

    public abstract void A08(Context context, AnonymousClass0C1 r2, C134605oq r3, Integer num, C135345q4 r5, Integer num2);

    public static synchronized C15940nm A02() {
        C15940nm r0;
        synchronized (C15940nm.class) {
            r0 = A00;
        }
        return r0;
    }
}
