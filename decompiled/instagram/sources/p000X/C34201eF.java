package p000X;

import android.util.SparseArray;

/* renamed from: X.1eF  reason: invalid class name and case insensitive filesystem */
public enum C34201eF {
    NOT_SHARED(0),
    SHARING(1),
    UNSHARING(2),
    SHARED(3);
    
    public static final SparseArray A01 = null;
    public final int A00;

    /* access modifiers changed from: public */
    static {
        int i;
        A01 = new SparseArray();
        for (C34201eF r2 : values()) {
            A01.put(r2.A00, r2);
        }
    }

    /* access modifiers changed from: public */
    C34201eF(int i) {
        this.A00 = i;
    }
}
