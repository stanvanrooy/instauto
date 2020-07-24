package p000X;

import java.util.EnumSet;
import java.util.Set;

/* renamed from: X.14s  reason: invalid class name and case insensitive filesystem */
public final class C244714s implements C244814t {
    public final C22550yc A00;
    public final C22550yc A01;
    public final C245014v A02;
    public final C243214d A03;
    public final C244414p A04;
    public final C15780nW A05;

    public static AnonymousClass4YE A00(C244714s r7, AnonymousClass4WK r8, AnonymousClass15G r9, C106364iO r10) {
        Set set;
        long j;
        EnumSet<E> copyOf;
        if (r10 == null) {
            set = r9.ANY();
            if (r8 != null) {
                j = r8.A04;
            } else {
                j = System.currentTimeMillis();
            }
        } else {
            set = r10.A04;
            j = r10.A00;
        }
        if (set.isEmpty()) {
            copyOf = EnumSet.noneOf(C243714i.class);
        } else {
            copyOf = EnumSet.copyOf(set);
        }
        if (!copyOf.remove(C243714i.BACKOFF)) {
            return new AnonymousClass4YE(j, copyOf, r9.getTypeName());
        }
        Object apply = r7.A01.apply(r8.A07);
        AnonymousClass0a4.A06(apply);
        return new AnonymousClass4YE(j + ((C105734hL) apply).AGe(r8, r9, r7.A03), copyOf, r9.getTypeName());
    }

    public final boolean A7S(C105814hT r3, AnonymousClass15G r4, C106364iO r5, boolean z) {
        AnonymousClass4YE A002 = A00(this, this.A04.AQF(r3.A04), r4, r5);
        if (z) {
            return !A002.A02.contains(C243714i.NEVER);
        }
        C15780nW r0 = this.A05;
        r0.A01();
        return A002.A00(r0);
    }

    public C244714s(C244414p r2, C243214d r3, C15780nW r4, C22550yc r5, C22550yc r6) {
        this.A04 = r2;
        this.A03 = r3;
        this.A05 = r4;
        this.A01 = r5;
        this.A02 = new C245014v(r3);
        this.A00 = r6;
    }
}
