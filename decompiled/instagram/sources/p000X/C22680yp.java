package p000X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0yp  reason: invalid class name and case insensitive filesystem */
public enum C22680yp {
    ;
    
    public static final Map A02 = null;
    public static final Map A03 = null;
    public final Class A00;
    public final String A01;

    public abstract Object A00(String str);

    /* access modifiers changed from: public */
    static {
        int i;
        A03 = new HashMap();
        A02 = new HashMap();
        for (C22680yp r2 : values()) {
            A03.put(r2.A01, r2);
            A02.put(r2.A00, r2);
        }
    }

    /* access modifiers changed from: public */
    C22680yp(Class cls, String str) {
        this.A01 = str;
        this.A00 = cls;
    }
}
