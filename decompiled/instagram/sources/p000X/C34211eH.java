package p000X;

import android.util.SparseArray;

/* renamed from: X.1eH  reason: invalid class name and case insensitive filesystem */
public enum C34211eH {
    NOT_SHARED(0);
    
    public static final SparseArray A01 = null;
    public final int A00;

    /* access modifiers changed from: public */
    static {
        int i;
        A01 = new SparseArray();
        for (C34211eH r2 : values()) {
            A01.put(r2.A00, r2);
        }
    }

    /* access modifiers changed from: public */
    C34211eH(int i) {
        this.A00 = i;
    }
}
