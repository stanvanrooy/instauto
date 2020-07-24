package p000X;

import java.util.EnumSet;

/* renamed from: X.14i  reason: invalid class name and case insensitive filesystem */
public enum C243714i {
    NETWORK(false),
    USER_REQUEST(true),
    BACKOFF(false),
    NEVER(true),
    NOT_NOW(false);
    
    public final boolean A00;

    public static EnumSet A00(C195328Xo r2) {
        EnumSet<E> noneOf = EnumSet.noneOf(C243714i.class);
        if (r2.equals(C195328Xo.A06)) {
            noneOf.add(NETWORK);
            return noneOf;
        }
        if (r2.A03) {
            noneOf.add(NETWORK);
        }
        if (!r2.A04) {
            noneOf.add(BACKOFF);
        }
        if (r2.A05 && !r2.A02) {
            noneOf.add(USER_REQUEST);
        }
        if (!r2.A05 && !r2.A02) {
            noneOf.add(NEVER);
        }
        return noneOf;
    }

    /* access modifiers changed from: public */
    C243714i(boolean z) {
        this.A00 = z;
    }
}
