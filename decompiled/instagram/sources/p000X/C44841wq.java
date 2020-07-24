package p000X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1wq  reason: invalid class name and case insensitive filesystem */
public enum C44841wq {
    NONE(NetInfoModule.CONNECTION_TYPE_NONE),
    MULTI_ITEM_CHECKOUT("multi_item_checkout");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        A01 = new HashMap();
        for (C44841wq r2 : values()) {
            A01.put(r2.A00, r2);
        }
    }

    /* access modifiers changed from: public */
    C44841wq(String str) {
        this.A00 = str;
    }
}
