package p000X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.1bb  reason: invalid class name and case insensitive filesystem */
public enum C32641bb {
    ADS("ads"),
    USER("user"),
    SINGLE_MEDIA("single_media"),
    CHAINING("chaining"),
    SEARCH_MEDIA_CHAINING("searchmediachaining"),
    SERIES("series"),
    EMPTY_PLACEHOLDER("empty_placeholder"),
    SAVED("saved"),
    NONE(NetInfoModule.CONNECTION_TYPE_NONE),
    UNRECOGNIZED("unrecognized");
    
    public static final C32651bc A01 = null;
    public static final Map A02 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        A01 = new C32651bc();
        int A002 = C13360iP.A00(r3);
        if (A002 < 16) {
            A002 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A002);
        for (C32641bb r1 : values()) {
            linkedHashMap.put(r1.A00, r1);
        }
        A02 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    C32641bb(String str) {
        this.A00 = str;
    }
}
