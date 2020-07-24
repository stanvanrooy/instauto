package p000X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.C93 */
public enum C93 {
    RICH_TEXT(1, "RICH_TEXT"),
    PHOTO(2, "PHOTO"),
    VIDEO(3, "VIDEO"),
    HEADER(4, "HEADER"),
    BUTTON(6, "BUTTON"),
    SLIDESHOW(7, "SLIDESHOW"),
    SWIPE_TO_OPEN(8, "SWIPE_TO_OPEN"),
    INSTAGRAM_PRODUCT(9, "INSTAGRAM_PRODUCT");
    
    public static final Map A02 = null;
    public static final Map A03 = null;
    public final int A00;
    public final String A01;

    /* access modifiers changed from: public */
    static {
        int i;
        A02 = new HashMap();
        A03 = new HashMap();
        for (C93 c93 : values()) {
            A02.put(Integer.valueOf(c93.A00), c93);
            A03.put(c93.A01, c93);
        }
    }

    /* access modifiers changed from: public */
    C93(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }
}
