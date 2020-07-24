package p000X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.CY9 */
public enum CY9 {
    BUTTON_OUTLINE("BUTTON_OUTLINE");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        A01 = new HashMap();
        for (CY9 cy9 : values()) {
            A01.put(cy9.A00, cy9);
        }
    }

    /* access modifiers changed from: public */
    CY9(String str) {
        this.A00 = str;
    }
}
