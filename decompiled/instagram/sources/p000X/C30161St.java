package p000X;

import android.util.SparseArray;

/* renamed from: X.1St  reason: invalid class name and case insensitive filesystem */
public enum C30161St {
    DEFAULT(0),
    BAR(1),
    PILL(2),
    UNKNOWN(100);
    
    public static final SparseArray A01 = null;
    public final int A00;

    /* access modifiers changed from: public */
    static {
        int i;
        A01 = new SparseArray();
        for (C30161St r2 : values()) {
            A01.put(r2.A00, r2);
        }
    }

    /* access modifiers changed from: public */
    C30161St(int i) {
        this.A00 = i;
    }
}
