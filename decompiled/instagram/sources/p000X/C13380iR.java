package p000X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0iR  reason: invalid class name and case insensitive filesystem */
public enum C13380iR {
    ADD("add"),
    ADD_HIDE("add_hide"),
    ADD_HIDE_COLLECTIONS("add_hide_collections"),
    NONE(NetInfoModule.CONNECTION_TYPE_NONE);
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        A01 = new HashMap();
        for (C13380iR r2 : values()) {
            A01.put(r2.A00, r2);
        }
    }

    /* access modifiers changed from: public */
    C13380iR(String str) {
        this.A00 = str;
    }
}
