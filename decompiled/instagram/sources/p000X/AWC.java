package p000X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.AWC */
public enum AWC {
    DEFAULT(0);
    
    public static final Map A01 = null;
    public int A00;

    /* access modifiers changed from: public */
    static {
        int i;
        A01 = new HashMap();
        for (AWC awc : values()) {
            A01.put(Integer.valueOf(awc.A00), awc);
        }
    }

    /* access modifiers changed from: public */
    AWC(int i) {
        this.A00 = i;
    }
}
